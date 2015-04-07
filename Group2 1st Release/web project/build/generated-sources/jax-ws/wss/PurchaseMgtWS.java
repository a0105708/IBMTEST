
package wss;

import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PurchaseMgtWS", targetNamespace = "http://WSS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PurchaseMgtWS {


    /**
     * 
     * @param accountId
     * @return
     *     returns java.util.List<wss.OrderEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewShoppingCart", targetNamespace = "http://WSS/", className = "wss.ViewShoppingCart")
    @ResponseWrapper(localName = "viewShoppingCartResponse", targetNamespace = "http://WSS/", className = "wss.ViewShoppingCartResponse")
    @Action(input = "http://WSS/PurchaseMgtWS/viewShoppingCartRequest", output = "http://WSS/PurchaseMgtWS/viewShoppingCartResponse")
    public List<OrderEntity> viewShoppingCart(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId);

    /**
     * 
     * @param accountId
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkOutItem", targetNamespace = "http://WSS/", className = "wss.CheckOutItem")
    @ResponseWrapper(localName = "checkOutItemResponse", targetNamespace = "http://WSS/", className = "wss.CheckOutItemResponse")
    @Action(input = "http://WSS/PurchaseMgtWS/checkOutItemRequest", output = "http://WSS/PurchaseMgtWS/checkOutItemResponse")
    public Double checkOutItem(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId);

    /**
     * 
     * @param accountId
     * @param address
     * @param totalPrice
     * @param creditCard
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addPaymentInfo", targetNamespace = "http://WSS/", className = "wss.AddPaymentInfo")
    @ResponseWrapper(localName = "addPaymentInfoResponse", targetNamespace = "http://WSS/", className = "wss.AddPaymentInfoResponse")
    @Action(input = "http://WSS/PurchaseMgtWS/addPaymentInfoRequest", output = "http://WSS/PurchaseMgtWS/addPaymentInfoResponse")
    public Long addPaymentInfo(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId,
        @WebParam(name = "address", targetNamespace = "")
        String address,
        @WebParam(name = "creditCard", targetNamespace = "")
        String creditCard,
        @WebParam(name = "totalPrice", targetNamespace = "")
        Double totalPrice);

    /**
     * 
     * @param accountId
     * @param transId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "payShoppingCart", targetNamespace = "http://WSS/", className = "wss.PayShoppingCart")
    @Action(input = "http://WSS/PurchaseMgtWS/payShoppingCart")
    public void payShoppingCart(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId,
        @WebParam(name = "transId", targetNamespace = "")
        Long transId);

    /**
     * 
     * @param accountId
     * @param itemId
     * @param quantity
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "addItems", targetNamespace = "http://WSS/", className = "wss.AddItems")
    @Action(input = "http://WSS/PurchaseMgtWS/addItems")
    public void addItems(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId,
        @WebParam(name = "itemId", targetNamespace = "")
        Long itemId,
        @WebParam(name = "quantity", targetNamespace = "")
        int quantity);

    /**
     * 
     * @param accountId
     * @param itemId
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "removeItemFromCart", targetNamespace = "http://WSS/", className = "wss.RemoveItemFromCart")
    @Action(input = "http://WSS/PurchaseMgtWS/removeItemFromCart")
    public void removeItemFromCart(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId,
        @WebParam(name = "itemId", targetNamespace = "")
        Long itemId);

    /**
     * 
     * @param accountId
     * @return
     *     returns java.util.List<wss.PurchaseEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewPurchaseHistory", targetNamespace = "http://WSS/", className = "wss.ViewPurchaseHistory")
    @ResponseWrapper(localName = "viewPurchaseHistoryResponse", targetNamespace = "http://WSS/", className = "wss.ViewPurchaseHistoryResponse")
    @Action(input = "http://WSS/PurchaseMgtWS/viewPurchaseHistoryRequest", output = "http://WSS/PurchaseMgtWS/viewPurchaseHistoryResponse")
    public List<PurchaseEntity> viewPurchaseHistory(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId);

    /**
     * 
     * @param orderId
     * @return
     *     returns wss.OrderEntity
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewOrderById", targetNamespace = "http://WSS/", className = "wss.ViewOrderById")
    @ResponseWrapper(localName = "viewOrderByIdResponse", targetNamespace = "http://WSS/", className = "wss.ViewOrderByIdResponse")
    @Action(input = "http://WSS/PurchaseMgtWS/viewOrderByIdRequest", output = "http://WSS/PurchaseMgtWS/viewOrderByIdResponse")
    public OrderEntity viewOrderById(
        @WebParam(name = "OrderId", targetNamespace = "")
        Long orderId);

}
