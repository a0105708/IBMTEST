/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.PurchaseMgt;

import Entity.AccountMgt.OrderEntity;
import Entity.AccountMgt.PurchaseEntity;
import Entity.AccountMgt.ShoppingCartEntity;
import Entity.AccountMgt.TransactionEntity;
import Entity.ProductMgt.ItemEntity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author HanXiangyu
 */
@Stateless
public class ShoppingCartMgtSessionBean implements ShoppingCartMgtSessionBeanLocal {

    @PersistenceContext
    private EntityManager em;
    
    @Override
    public void addItems(Long accountId, Long itemId, int quantity){
        ShoppingCartEntity sc;
        Query q;
        q = em.createQuery("select i from ShoppingCartEntity i where i.accountId=?1");
        q.setParameter(1, accountId);
        if(q.getResultList().isEmpty()){
            sc = new ShoppingCartEntity();
            sc.setAccountId(accountId);
            sc.setOrderList(new ArrayList<>());
        }else{
            sc = (ShoppingCartEntity) q.getResultList().get(0);
        }
        List<OrderEntity> order = sc.getOrderList();
        if (!order.isEmpty()) {
            Boolean contains = false;
            for(OrderEntity o: order){
                if(o.getItemId().equals(itemId)){
                    o.setQuantity(o.getQuantity() + quantity);
                    contains = true;
                    break;
                }
            } 
            if(!contains){
                OrderEntity oe = new OrderEntity();
                oe.setItemId(itemId);
                oe.setQuantity(quantity);
                oe.setDate(Calendar.getInstance());
                order.add(oe);               
                em.persist(oe);
            }
            
        }else{
            ArrayList<OrderEntity> orderList = new ArrayList<>();
            
            OrderEntity oe = new OrderEntity();
            oe.setItemId(itemId);
            oe.setQuantity(quantity);
            oe.setDate(Calendar.getInstance());
            orderList.add(oe);
            
            sc.setOrderList(orderList);           
            em.persist(oe);           
        }
        em.persist(sc);
    }
    
    @Override
    public List<OrderEntity> viewShoppingCart(Long accountId){
        Query q;
        q = em.createQuery("select i from ShoppingCartEntity i where i.accountId=?1");
        q.setParameter(1, accountId);      
        ShoppingCartEntity sc = (ShoppingCartEntity) q.getResultList().get(0);
        
        return sc.getOrderList();
    }
    
    @Override
    public void removeItemFromCart(Long accountId, Long itemId){
        Query q;
        q = em.createQuery("select i from ShoppingCartEntity i where i.accountId=?1");
        q.setParameter(1, accountId);      
        ShoppingCartEntity sc = (ShoppingCartEntity) q.getResultList().get(0);
        List<OrderEntity> order = sc.getOrderList();
        for (OrderEntity o: order){
            if (o.getItemId().equals(itemId)){
                order.remove(o);
                break;                        
            }
        }
    }
    
    @Override
    public Double checkOutItem(Long accountId){
        Query q;
        q = em.createQuery("select i from ShoppingCartEntity i where i.accountId=?1");
        q.setParameter(1, accountId);      
        ShoppingCartEntity sc = (ShoppingCartEntity) q.getResultList().get(0);
        List<OrderEntity> order = sc.getOrderList();
        Double total = 0.0;
        Double totalOfItem;
        Long itemId, orderId;
        ItemEntity item;
        PurchaseEntity pe;
        
        //order in shopping cart change to purchase entity
        for (OrderEntity o: order){
            orderId = o.getId();
            itemId = o.getItemId();
            item = em.find(ItemEntity.class, itemId);
            totalOfItem = (Double.parseDouble(item.getTastingNote()) * o.getQuantity());

            pe = new PurchaseEntity();
            pe.setAccounId(accountId);
            pe.setTotalPrice(totalOfItem);
            pe.setStatus(true);
            pe.setPurchasedDate(Calendar.getInstance());
            pe.setOrderId(orderId);
            pe.setQuantity(o.getQuantity());    
            o.setPurchaseId(pe.getId());
            em.persist(pe);
            
            total += totalOfItem;
        }
        //sc.setOrderList(new ArrayList<>());
        em.persist(sc);
        return total;
    }
    
    @Override
    public Long addPaymentInfo(Long accountId, String address, String creditCard, Double totalPrice){                              
        TransactionEntity te = new TransactionEntity();
        //shipping address
        te.setShippingAddress(address);
        te.setTransactionDate(Calendar.getInstance());
        //credit card information
        te.setCreditCardNo(creditCard);
        //generate transaction, with paid = false
        te.setPaid(Boolean.FALSE);
        te.setTotalPrice(totalPrice);
        te.setAccountId(accountId);
        em.persist(te);
        
        //used to pass to payShoppingCart
        return te.getId();
    }

    @Override
    public void payShoppingCart(Long accountId, Long transId){
        //transaction status = true
        TransactionEntity te = em.find(TransactionEntity.class, transId);
        te.setPaid(Boolean.TRUE);

        Query q;
        q = em.createQuery("select i from ShoppingCartEntity i where i.accountId=?1");
        q.setParameter(1, accountId);      
        ShoppingCartEntity sc = (ShoppingCartEntity) q.getResultList().get(0);

        sc.setOrderList(new ArrayList<>());       
    }
    
    @Override
    public List<PurchaseEntity> viewPurchaseHistory(Long accountId){
        Query q;
        q = em.createQuery("select i from PurchaseEntity i where i.accounId=?1");
        q.setParameter(1, accountId);      
        return (List<PurchaseEntity>) q.getResultList();
    }
    
    @Override
    public OrderEntity viewOrderById(Long orderId){
        return em.find(OrderEntity.class, orderId);
    }
}