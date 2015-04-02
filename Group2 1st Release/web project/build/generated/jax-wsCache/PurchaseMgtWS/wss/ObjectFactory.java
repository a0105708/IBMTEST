
package wss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckOutItem_QNAME = new QName("http://WSS/", "checkOutItem");
    private final static QName _ViewPurchaseHistory_QNAME = new QName("http://WSS/", "viewPurchaseHistory");
    private final static QName _ViewShoppingCartResponse_QNAME = new QName("http://WSS/", "viewShoppingCartResponse");
    private final static QName _AddItems_QNAME = new QName("http://WSS/", "addItems");
    private final static QName _ViewShoppingCart_QNAME = new QName("http://WSS/", "viewShoppingCart");
    private final static QName _CheckOutItemResponse_QNAME = new QName("http://WSS/", "checkOutItemResponse");
    private final static QName _ViewOrderById_QNAME = new QName("http://WSS/", "viewOrderById");
    private final static QName _AddPaymentInfoResponse_QNAME = new QName("http://WSS/", "addPaymentInfoResponse");
    private final static QName _ViewPurchaseHistoryResponse_QNAME = new QName("http://WSS/", "viewPurchaseHistoryResponse");
    private final static QName _RemoveItemFromCart_QNAME = new QName("http://WSS/", "removeItemFromCart");
    private final static QName _ViewOrderByIdResponse_QNAME = new QName("http://WSS/", "viewOrderByIdResponse");
    private final static QName _PayShoppingCart_QNAME = new QName("http://WSS/", "payShoppingCart");
    private final static QName _AddPaymentInfo_QNAME = new QName("http://WSS/", "addPaymentInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewOrderByIdResponse }
     * 
     */
    public ViewOrderByIdResponse createViewOrderByIdResponse() {
        return new ViewOrderByIdResponse();
    }

    /**
     * Create an instance of {@link PayShoppingCart }
     * 
     */
    public PayShoppingCart createPayShoppingCart() {
        return new PayShoppingCart();
    }

    /**
     * Create an instance of {@link AddPaymentInfo }
     * 
     */
    public AddPaymentInfo createAddPaymentInfo() {
        return new AddPaymentInfo();
    }

    /**
     * Create an instance of {@link ViewOrderById }
     * 
     */
    public ViewOrderById createViewOrderById() {
        return new ViewOrderById();
    }

    /**
     * Create an instance of {@link AddPaymentInfoResponse }
     * 
     */
    public AddPaymentInfoResponse createAddPaymentInfoResponse() {
        return new AddPaymentInfoResponse();
    }

    /**
     * Create an instance of {@link ViewPurchaseHistoryResponse }
     * 
     */
    public ViewPurchaseHistoryResponse createViewPurchaseHistoryResponse() {
        return new ViewPurchaseHistoryResponse();
    }

    /**
     * Create an instance of {@link RemoveItemFromCart }
     * 
     */
    public RemoveItemFromCart createRemoveItemFromCart() {
        return new RemoveItemFromCart();
    }

    /**
     * Create an instance of {@link ViewShoppingCart }
     * 
     */
    public ViewShoppingCart createViewShoppingCart() {
        return new ViewShoppingCart();
    }

    /**
     * Create an instance of {@link CheckOutItemResponse }
     * 
     */
    public CheckOutItemResponse createCheckOutItemResponse() {
        return new CheckOutItemResponse();
    }

    /**
     * Create an instance of {@link CheckOutItem }
     * 
     */
    public CheckOutItem createCheckOutItem() {
        return new CheckOutItem();
    }

    /**
     * Create an instance of {@link ViewPurchaseHistory }
     * 
     */
    public ViewPurchaseHistory createViewPurchaseHistory() {
        return new ViewPurchaseHistory();
    }

    /**
     * Create an instance of {@link ViewShoppingCartResponse }
     * 
     */
    public ViewShoppingCartResponse createViewShoppingCartResponse() {
        return new ViewShoppingCartResponse();
    }

    /**
     * Create an instance of {@link AddItems }
     * 
     */
    public AddItems createAddItems() {
        return new AddItems();
    }

    /**
     * Create an instance of {@link OrderEntity }
     * 
     */
    public OrderEntity createOrderEntity() {
        return new OrderEntity();
    }

    /**
     * Create an instance of {@link PurchaseEntity }
     * 
     */
    public PurchaseEntity createPurchaseEntity() {
        return new PurchaseEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkOutItem")
    public JAXBElement<CheckOutItem> createCheckOutItem(CheckOutItem value) {
        return new JAXBElement<CheckOutItem>(_CheckOutItem_QNAME, CheckOutItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPurchaseHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewPurchaseHistory")
    public JAXBElement<ViewPurchaseHistory> createViewPurchaseHistory(ViewPurchaseHistory value) {
        return new JAXBElement<ViewPurchaseHistory>(_ViewPurchaseHistory_QNAME, ViewPurchaseHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewShoppingCartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewShoppingCartResponse")
    public JAXBElement<ViewShoppingCartResponse> createViewShoppingCartResponse(ViewShoppingCartResponse value) {
        return new JAXBElement<ViewShoppingCartResponse>(_ViewShoppingCartResponse_QNAME, ViewShoppingCartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addItems")
    public JAXBElement<AddItems> createAddItems(AddItems value) {
        return new JAXBElement<AddItems>(_AddItems_QNAME, AddItems.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewShoppingCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewShoppingCart")
    public JAXBElement<ViewShoppingCart> createViewShoppingCart(ViewShoppingCart value) {
        return new JAXBElement<ViewShoppingCart>(_ViewShoppingCart_QNAME, ViewShoppingCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckOutItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "checkOutItemResponse")
    public JAXBElement<CheckOutItemResponse> createCheckOutItemResponse(CheckOutItemResponse value) {
        return new JAXBElement<CheckOutItemResponse>(_CheckOutItemResponse_QNAME, CheckOutItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOrderById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewOrderById")
    public JAXBElement<ViewOrderById> createViewOrderById(ViewOrderById value) {
        return new JAXBElement<ViewOrderById>(_ViewOrderById_QNAME, ViewOrderById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaymentInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addPaymentInfoResponse")
    public JAXBElement<AddPaymentInfoResponse> createAddPaymentInfoResponse(AddPaymentInfoResponse value) {
        return new JAXBElement<AddPaymentInfoResponse>(_AddPaymentInfoResponse_QNAME, AddPaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewPurchaseHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewPurchaseHistoryResponse")
    public JAXBElement<ViewPurchaseHistoryResponse> createViewPurchaseHistoryResponse(ViewPurchaseHistoryResponse value) {
        return new JAXBElement<ViewPurchaseHistoryResponse>(_ViewPurchaseHistoryResponse_QNAME, ViewPurchaseHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItemFromCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeItemFromCart")
    public JAXBElement<RemoveItemFromCart> createRemoveItemFromCart(RemoveItemFromCart value) {
        return new JAXBElement<RemoveItemFromCart>(_RemoveItemFromCart_QNAME, RemoveItemFromCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewOrderByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "viewOrderByIdResponse")
    public JAXBElement<ViewOrderByIdResponse> createViewOrderByIdResponse(ViewOrderByIdResponse value) {
        return new JAXBElement<ViewOrderByIdResponse>(_ViewOrderByIdResponse_QNAME, ViewOrderByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PayShoppingCart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "payShoppingCart")
    public JAXBElement<PayShoppingCart> createPayShoppingCart(PayShoppingCart value) {
        return new JAXBElement<PayShoppingCart>(_PayShoppingCart_QNAME, PayShoppingCart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPaymentInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addPaymentInfo")
    public JAXBElement<AddPaymentInfo> createAddPaymentInfo(AddPaymentInfo value) {
        return new JAXBElement<AddPaymentInfo>(_AddPaymentInfo_QNAME, AddPaymentInfo.class, null, value);
    }

}
