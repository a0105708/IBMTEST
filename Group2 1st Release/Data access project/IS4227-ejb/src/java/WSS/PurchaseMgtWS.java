/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.AccountMgt.OrderEntity;
import Entity.AccountMgt.PurchaseEntity;
import SessionBean.PurchaseMgt.ShoppingCartMgtSessionBeanLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HanXiangyu
 */
@WebService(serviceName = "PurchaseMgtWS")
@Stateless()
public class PurchaseMgtWS {
    @EJB
    private ShoppingCartMgtSessionBeanLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addItems")
    @Oneway
    public void addItems(@WebParam(name = "accountId") Long accountId, @WebParam(name = "itemId") Long itemId, @WebParam(name = "quantity") int quantity) {
        ejbRef.addItems(accountId, itemId, quantity);
    }

    @WebMethod(operationName = "viewShoppingCart")
    public List<OrderEntity> viewShoppingCart(@WebParam(name = "accountId") Long accountId) {
        return ejbRef.viewShoppingCart(accountId);
    }

    @WebMethod(operationName = "checkOutItem")
    public Double checkOutItem(@WebParam(name = "accountId") Long accountId) {
        return ejbRef.checkOutItem(accountId);
    }

    @WebMethod(operationName = "addPaymentInfo")
    public Long addPaymentInfo(@WebParam(name = "accountId") Long accountId, @WebParam(name = "address") String address, @WebParam(name = "creditCard") String creditCard, @WebParam(name = "totalPrice") Double totalPrice) {
        return ejbRef.addPaymentInfo(accountId, address, creditCard, totalPrice);
    }

    /**
     * Web service operation
     * @param accountId
     * @param itemId
     */
    @WebMethod(operationName = "removeItemFromCart")
    @Oneway
    public void removeItemFromCart(@WebParam(name = "accountId") Long accountId, @WebParam(name = "itemId") Long itemId) {
        ejbRef.removeItemFromCart(accountId, itemId);
    }

    /**
     * Web service operation
     * @param accountId
     * @param transId
     */
    @WebMethod(operationName = "payShoppingCart")
    @Oneway
    public void payShoppingCart(@WebParam(name = "accountId") Long accountId, @WebParam(name = "transId") Long transId) {
        ejbRef.payShoppingCart(accountId, transId);
    }    

    /**
     * Web service operation
     * @param accountId
     * @return 
     */
    @WebMethod(operationName = "viewPurchaseHistory")
    public List<PurchaseEntity> viewPurchaseHistory(@WebParam(name = "accountId") Long accountId) {
        //TODO write your implementation code here:
        return ejbRef.viewPurchaseHistory(accountId);
    }

    /**
     * Web service operation
     * @param OrderId
     * @return 
     */
    @WebMethod(operationName = "viewOrderById")
    public OrderEntity viewOrderById(@WebParam(name = "OrderId") Long OrderId) {
        //TODO write your implementation code here:
        return ejbRef.viewOrderById(OrderId);
    }
}
