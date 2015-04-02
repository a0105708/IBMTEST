/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.PurchaseMgt;

import Entity.AccountMgt.OrderEntity;
import Entity.AccountMgt.PurchaseEntity;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author HanXiangyu
 */
@Local
public interface ShoppingCartMgtSessionBeanLocal {

    public void addItems(Long accountId, Long itemId, int quantity);

    public List<OrderEntity> viewShoppingCart(Long accountId);

    public void removeItemFromCart(Long accountId, Long itemId);

    public Double checkOutItem(Long accountId);

    public Long addPaymentInfo(Long accountId, String address, String creditCard, Double totalPrice);

    public void payShoppingCart(Long accountId,Long transId);

    public List<PurchaseEntity> viewPurchaseHistory(Long accountId);

    public OrderEntity viewOrderById(Long orderId);
    
}
