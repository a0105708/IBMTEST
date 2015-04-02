
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

    private final static QName _GetItemById_QNAME = new QName("http://WSS/", "getItemById");
    private final static QName _UpdateCategoryResponse_QNAME = new QName("http://WSS/", "updateCategoryResponse");
    private final static QName _UpdateRegion_QNAME = new QName("http://WSS/", "updateRegion");
    private final static QName _GetCategoryByIdResponse_QNAME = new QName("http://WSS/", "getCategoryByIdResponse");
    private final static QName _GetAllItem_QNAME = new QName("http://WSS/", "getAllItem");
    private final static QName _GetRegionByName_QNAME = new QName("http://WSS/", "getRegionByName");
    private final static QName _ExistException_QNAME = new QName("http://WSS/", "ExistException");
    private final static QName _GetCategoryByName_QNAME = new QName("http://WSS/", "getCategoryByName");
    private final static QName _RemoveWinery_QNAME = new QName("http://WSS/", "removeWinery");
    private final static QName _GetRegionByNameResponse_QNAME = new QName("http://WSS/", "getRegionByNameResponse");
    private final static QName _AddItemResponse_QNAME = new QName("http://WSS/", "addItemResponse");
    private final static QName _GetItemByIdResponse_QNAME = new QName("http://WSS/", "getItemByIdResponse");
    private final static QName _RemoveCategory_QNAME = new QName("http://WSS/", "removeCategory");
    private final static QName _GetAllCategoryResponse_QNAME = new QName("http://WSS/", "getAllCategoryResponse");
    private final static QName _AddItem_QNAME = new QName("http://WSS/", "addItem");
    private final static QName _AddWinery_QNAME = new QName("http://WSS/", "addWinery");
    private final static QName _UpdateWineryResponse_QNAME = new QName("http://WSS/", "updateWineryResponse");
    private final static QName _RemoveRegionResponse_QNAME = new QName("http://WSS/", "removeRegionResponse");
    private final static QName _GetRegionById_QNAME = new QName("http://WSS/", "getRegionById");
    private final static QName _GetAllWineryResponse_QNAME = new QName("http://WSS/", "getAllWineryResponse");
    private final static QName _AddCategory_QNAME = new QName("http://WSS/", "addCategory");
    private final static QName _GetWineryByName_QNAME = new QName("http://WSS/", "getWineryByName");
    private final static QName _RemoveItem_QNAME = new QName("http://WSS/", "removeItem");
    private final static QName _GetItemByName_QNAME = new QName("http://WSS/", "getItemByName");
    private final static QName _GetAllCategory_QNAME = new QName("http://WSS/", "getAllCategory");
    private final static QName _GetCategoryByNameResponse_QNAME = new QName("http://WSS/", "getCategoryByNameResponse");
    private final static QName _GetWineryByIdResponse_QNAME = new QName("http://WSS/", "getWineryByIdResponse");
    private final static QName _RemoveWineryResponse_QNAME = new QName("http://WSS/", "removeWineryResponse");
    private final static QName _GetCategoryById_QNAME = new QName("http://WSS/", "getCategoryById");
    private final static QName _AddRegionResponse_QNAME = new QName("http://WSS/", "addRegionResponse");
    private final static QName _GetAllWinery_QNAME = new QName("http://WSS/", "getAllWinery");
    private final static QName _RemoveCategoryResponse_QNAME = new QName("http://WSS/", "removeCategoryResponse");
    private final static QName _AddWineryResponse_QNAME = new QName("http://WSS/", "addWineryResponse");
    private final static QName _GetAllItemResponse_QNAME = new QName("http://WSS/", "getAllItemResponse");
    private final static QName _UpdateItem_QNAME = new QName("http://WSS/", "updateItem");
    private final static QName _GetAllRegionResponse_QNAME = new QName("http://WSS/", "getAllRegionResponse");
    private final static QName _GetWineryById_QNAME = new QName("http://WSS/", "getWineryById");
    private final static QName _UpdateRegionResponse_QNAME = new QName("http://WSS/", "updateRegionResponse");
    private final static QName _GetRegionByIdResponse_QNAME = new QName("http://WSS/", "getRegionByIdResponse");
    private final static QName _UpdateItemResponse_QNAME = new QName("http://WSS/", "updateItemResponse");
    private final static QName _GetItemByNameResponse_QNAME = new QName("http://WSS/", "getItemByNameResponse");
    private final static QName _UpdateWinery_QNAME = new QName("http://WSS/", "updateWinery");
    private final static QName _GetAllRegion_QNAME = new QName("http://WSS/", "getAllRegion");
    private final static QName _AddCategoryResponse_QNAME = new QName("http://WSS/", "addCategoryResponse");
    private final static QName _GetWineryByNameResponse_QNAME = new QName("http://WSS/", "getWineryByNameResponse");
    private final static QName _AddRegion_QNAME = new QName("http://WSS/", "addRegion");
    private final static QName _RemoveRegion_QNAME = new QName("http://WSS/", "removeRegion");
    private final static QName _RemoveItemResponse_QNAME = new QName("http://WSS/", "removeItemResponse");
    private final static QName _UpdateCategory_QNAME = new QName("http://WSS/", "updateCategory");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveItemResponse }
     * 
     */
    public RemoveItemResponse createRemoveItemResponse() {
        return new RemoveItemResponse();
    }

    /**
     * Create an instance of {@link UpdateCategory }
     * 
     */
    public UpdateCategory createUpdateCategory() {
        return new UpdateCategory();
    }

    /**
     * Create an instance of {@link AddCategoryResponse }
     * 
     */
    public AddCategoryResponse createAddCategoryResponse() {
        return new AddCategoryResponse();
    }

    /**
     * Create an instance of {@link GetWineryByNameResponse }
     * 
     */
    public GetWineryByNameResponse createGetWineryByNameResponse() {
        return new GetWineryByNameResponse();
    }

    /**
     * Create an instance of {@link AddRegion }
     * 
     */
    public AddRegion createAddRegion() {
        return new AddRegion();
    }

    /**
     * Create an instance of {@link RemoveRegion }
     * 
     */
    public RemoveRegion createRemoveRegion() {
        return new RemoveRegion();
    }

    /**
     * Create an instance of {@link GetItemByNameResponse }
     * 
     */
    public GetItemByNameResponse createGetItemByNameResponse() {
        return new GetItemByNameResponse();
    }

    /**
     * Create an instance of {@link UpdateWinery }
     * 
     */
    public UpdateWinery createUpdateWinery() {
        return new UpdateWinery();
    }

    /**
     * Create an instance of {@link GetAllRegion }
     * 
     */
    public GetAllRegion createGetAllRegion() {
        return new GetAllRegion();
    }

    /**
     * Create an instance of {@link GetRegionByIdResponse }
     * 
     */
    public GetRegionByIdResponse createGetRegionByIdResponse() {
        return new GetRegionByIdResponse();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link GetAllRegionResponse }
     * 
     */
    public GetAllRegionResponse createGetAllRegionResponse() {
        return new GetAllRegionResponse();
    }

    /**
     * Create an instance of {@link GetWineryById }
     * 
     */
    public GetWineryById createGetWineryById() {
        return new GetWineryById();
    }

    /**
     * Create an instance of {@link UpdateRegionResponse }
     * 
     */
    public UpdateRegionResponse createUpdateRegionResponse() {
        return new UpdateRegionResponse();
    }

    /**
     * Create an instance of {@link AddWineryResponse }
     * 
     */
    public AddWineryResponse createAddWineryResponse() {
        return new AddWineryResponse();
    }

    /**
     * Create an instance of {@link GetAllItemResponse }
     * 
     */
    public GetAllItemResponse createGetAllItemResponse() {
        return new GetAllItemResponse();
    }

    /**
     * Create an instance of {@link UpdateItem }
     * 
     */
    public UpdateItem createUpdateItem() {
        return new UpdateItem();
    }

    /**
     * Create an instance of {@link GetCategoryByNameResponse }
     * 
     */
    public GetCategoryByNameResponse createGetCategoryByNameResponse() {
        return new GetCategoryByNameResponse();
    }

    /**
     * Create an instance of {@link GetWineryByIdResponse }
     * 
     */
    public GetWineryByIdResponse createGetWineryByIdResponse() {
        return new GetWineryByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveWineryResponse }
     * 
     */
    public RemoveWineryResponse createRemoveWineryResponse() {
        return new RemoveWineryResponse();
    }

    /**
     * Create an instance of {@link GetCategoryById }
     * 
     */
    public GetCategoryById createGetCategoryById() {
        return new GetCategoryById();
    }

    /**
     * Create an instance of {@link AddRegionResponse }
     * 
     */
    public AddRegionResponse createAddRegionResponse() {
        return new AddRegionResponse();
    }

    /**
     * Create an instance of {@link GetAllWinery }
     * 
     */
    public GetAllWinery createGetAllWinery() {
        return new GetAllWinery();
    }

    /**
     * Create an instance of {@link RemoveCategoryResponse }
     * 
     */
    public RemoveCategoryResponse createRemoveCategoryResponse() {
        return new RemoveCategoryResponse();
    }

    /**
     * Create an instance of {@link GetAllCategory }
     * 
     */
    public GetAllCategory createGetAllCategory() {
        return new GetAllCategory();
    }

    /**
     * Create an instance of {@link GetWineryByName }
     * 
     */
    public GetWineryByName createGetWineryByName() {
        return new GetWineryByName();
    }

    /**
     * Create an instance of {@link RemoveItem }
     * 
     */
    public RemoveItem createRemoveItem() {
        return new RemoveItem();
    }

    /**
     * Create an instance of {@link GetItemByName }
     * 
     */
    public GetItemByName createGetItemByName() {
        return new GetItemByName();
    }

    /**
     * Create an instance of {@link GetRegionById }
     * 
     */
    public GetRegionById createGetRegionById() {
        return new GetRegionById();
    }

    /**
     * Create an instance of {@link GetAllWineryResponse }
     * 
     */
    public GetAllWineryResponse createGetAllWineryResponse() {
        return new GetAllWineryResponse();
    }

    /**
     * Create an instance of {@link AddCategory }
     * 
     */
    public AddCategory createAddCategory() {
        return new AddCategory();
    }

    /**
     * Create an instance of {@link AddItem }
     * 
     */
    public AddItem createAddItem() {
        return new AddItem();
    }

    /**
     * Create an instance of {@link AddWinery }
     * 
     */
    public AddWinery createAddWinery() {
        return new AddWinery();
    }

    /**
     * Create an instance of {@link UpdateWineryResponse }
     * 
     */
    public UpdateWineryResponse createUpdateWineryResponse() {
        return new UpdateWineryResponse();
    }

    /**
     * Create an instance of {@link RemoveRegionResponse }
     * 
     */
    public RemoveRegionResponse createRemoveRegionResponse() {
        return new RemoveRegionResponse();
    }

    /**
     * Create an instance of {@link GetRegionByNameResponse }
     * 
     */
    public GetRegionByNameResponse createGetRegionByNameResponse() {
        return new GetRegionByNameResponse();
    }

    /**
     * Create an instance of {@link AddItemResponse }
     * 
     */
    public AddItemResponse createAddItemResponse() {
        return new AddItemResponse();
    }

    /**
     * Create an instance of {@link GetItemByIdResponse }
     * 
     */
    public GetItemByIdResponse createGetItemByIdResponse() {
        return new GetItemByIdResponse();
    }

    /**
     * Create an instance of {@link RemoveCategory }
     * 
     */
    public RemoveCategory createRemoveCategory() {
        return new RemoveCategory();
    }

    /**
     * Create an instance of {@link GetAllCategoryResponse }
     * 
     */
    public GetAllCategoryResponse createGetAllCategoryResponse() {
        return new GetAllCategoryResponse();
    }

    /**
     * Create an instance of {@link GetRegionByName }
     * 
     */
    public GetRegionByName createGetRegionByName() {
        return new GetRegionByName();
    }

    /**
     * Create an instance of {@link ExistException }
     * 
     */
    public ExistException createExistException() {
        return new ExistException();
    }

    /**
     * Create an instance of {@link GetCategoryByName }
     * 
     */
    public GetCategoryByName createGetCategoryByName() {
        return new GetCategoryByName();
    }

    /**
     * Create an instance of {@link RemoveWinery }
     * 
     */
    public RemoveWinery createRemoveWinery() {
        return new RemoveWinery();
    }

    /**
     * Create an instance of {@link GetAllItem }
     * 
     */
    public GetAllItem createGetAllItem() {
        return new GetAllItem();
    }

    /**
     * Create an instance of {@link GetItemById }
     * 
     */
    public GetItemById createGetItemById() {
        return new GetItemById();
    }

    /**
     * Create an instance of {@link UpdateCategoryResponse }
     * 
     */
    public UpdateCategoryResponse createUpdateCategoryResponse() {
        return new UpdateCategoryResponse();
    }

    /**
     * Create an instance of {@link UpdateRegion }
     * 
     */
    public UpdateRegion createUpdateRegion() {
        return new UpdateRegion();
    }

    /**
     * Create an instance of {@link GetCategoryByIdResponse }
     * 
     */
    public GetCategoryByIdResponse createGetCategoryByIdResponse() {
        return new GetCategoryByIdResponse();
    }

    /**
     * Create an instance of {@link WineryEntity }
     * 
     */
    public WineryEntity createWineryEntity() {
        return new WineryEntity();
    }

    /**
     * Create an instance of {@link CommentEntity }
     * 
     */
    public CommentEntity createCommentEntity() {
        return new CommentEntity();
    }

    /**
     * Create an instance of {@link ItemEntity }
     * 
     */
    public ItemEntity createItemEntity() {
        return new ItemEntity();
    }

    /**
     * Create an instance of {@link ItemPurchasedEntity }
     * 
     */
    public ItemPurchasedEntity createItemPurchasedEntity() {
        return new ItemPurchasedEntity();
    }

    /**
     * Create an instance of {@link RegionEntity }
     * 
     */
    public RegionEntity createRegionEntity() {
        return new RegionEntity();
    }

    /**
     * Create an instance of {@link CategoryEntity }
     * 
     */
    public CategoryEntity createCategoryEntity() {
        return new CategoryEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getItemById")
    public JAXBElement<GetItemById> createGetItemById(GetItemById value) {
        return new JAXBElement<GetItemById>(_GetItemById_QNAME, GetItemById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateCategoryResponse")
    public JAXBElement<UpdateCategoryResponse> createUpdateCategoryResponse(UpdateCategoryResponse value) {
        return new JAXBElement<UpdateCategoryResponse>(_UpdateCategoryResponse_QNAME, UpdateCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateRegion")
    public JAXBElement<UpdateRegion> createUpdateRegion(UpdateRegion value) {
        return new JAXBElement<UpdateRegion>(_UpdateRegion_QNAME, UpdateRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getCategoryByIdResponse")
    public JAXBElement<GetCategoryByIdResponse> createGetCategoryByIdResponse(GetCategoryByIdResponse value) {
        return new JAXBElement<GetCategoryByIdResponse>(_GetCategoryByIdResponse_QNAME, GetCategoryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllItem")
    public JAXBElement<GetAllItem> createGetAllItem(GetAllItem value) {
        return new JAXBElement<GetAllItem>(_GetAllItem_QNAME, GetAllItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getRegionByName")
    public JAXBElement<GetRegionByName> createGetRegionByName(GetRegionByName value) {
        return new JAXBElement<GetRegionByName>(_GetRegionByName_QNAME, GetRegionByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExistException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "ExistException")
    public JAXBElement<ExistException> createExistException(ExistException value) {
        return new JAXBElement<ExistException>(_ExistException_QNAME, ExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getCategoryByName")
    public JAXBElement<GetCategoryByName> createGetCategoryByName(GetCategoryByName value) {
        return new JAXBElement<GetCategoryByName>(_GetCategoryByName_QNAME, GetCategoryByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveWinery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeWinery")
    public JAXBElement<RemoveWinery> createRemoveWinery(RemoveWinery value) {
        return new JAXBElement<RemoveWinery>(_RemoveWinery_QNAME, RemoveWinery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getRegionByNameResponse")
    public JAXBElement<GetRegionByNameResponse> createGetRegionByNameResponse(GetRegionByNameResponse value) {
        return new JAXBElement<GetRegionByNameResponse>(_GetRegionByNameResponse_QNAME, GetRegionByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addItemResponse")
    public JAXBElement<AddItemResponse> createAddItemResponse(AddItemResponse value) {
        return new JAXBElement<AddItemResponse>(_AddItemResponse_QNAME, AddItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getItemByIdResponse")
    public JAXBElement<GetItemByIdResponse> createGetItemByIdResponse(GetItemByIdResponse value) {
        return new JAXBElement<GetItemByIdResponse>(_GetItemByIdResponse_QNAME, GetItemByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeCategory")
    public JAXBElement<RemoveCategory> createRemoveCategory(RemoveCategory value) {
        return new JAXBElement<RemoveCategory>(_RemoveCategory_QNAME, RemoveCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllCategoryResponse")
    public JAXBElement<GetAllCategoryResponse> createGetAllCategoryResponse(GetAllCategoryResponse value) {
        return new JAXBElement<GetAllCategoryResponse>(_GetAllCategoryResponse_QNAME, GetAllCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addItem")
    public JAXBElement<AddItem> createAddItem(AddItem value) {
        return new JAXBElement<AddItem>(_AddItem_QNAME, AddItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWinery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addWinery")
    public JAXBElement<AddWinery> createAddWinery(AddWinery value) {
        return new JAXBElement<AddWinery>(_AddWinery_QNAME, AddWinery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWineryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateWineryResponse")
    public JAXBElement<UpdateWineryResponse> createUpdateWineryResponse(UpdateWineryResponse value) {
        return new JAXBElement<UpdateWineryResponse>(_UpdateWineryResponse_QNAME, UpdateWineryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeRegionResponse")
    public JAXBElement<RemoveRegionResponse> createRemoveRegionResponse(RemoveRegionResponse value) {
        return new JAXBElement<RemoveRegionResponse>(_RemoveRegionResponse_QNAME, RemoveRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getRegionById")
    public JAXBElement<GetRegionById> createGetRegionById(GetRegionById value) {
        return new JAXBElement<GetRegionById>(_GetRegionById_QNAME, GetRegionById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWineryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllWineryResponse")
    public JAXBElement<GetAllWineryResponse> createGetAllWineryResponse(GetAllWineryResponse value) {
        return new JAXBElement<GetAllWineryResponse>(_GetAllWineryResponse_QNAME, GetAllWineryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addCategory")
    public JAXBElement<AddCategory> createAddCategory(AddCategory value) {
        return new JAXBElement<AddCategory>(_AddCategory_QNAME, AddCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWineryByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getWineryByName")
    public JAXBElement<GetWineryByName> createGetWineryByName(GetWineryByName value) {
        return new JAXBElement<GetWineryByName>(_GetWineryByName_QNAME, GetWineryByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeItem")
    public JAXBElement<RemoveItem> createRemoveItem(RemoveItem value) {
        return new JAXBElement<RemoveItem>(_RemoveItem_QNAME, RemoveItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getItemByName")
    public JAXBElement<GetItemByName> createGetItemByName(GetItemByName value) {
        return new JAXBElement<GetItemByName>(_GetItemByName_QNAME, GetItemByName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllCategory")
    public JAXBElement<GetAllCategory> createGetAllCategory(GetAllCategory value) {
        return new JAXBElement<GetAllCategory>(_GetAllCategory_QNAME, GetAllCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getCategoryByNameResponse")
    public JAXBElement<GetCategoryByNameResponse> createGetCategoryByNameResponse(GetCategoryByNameResponse value) {
        return new JAXBElement<GetCategoryByNameResponse>(_GetCategoryByNameResponse_QNAME, GetCategoryByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWineryByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getWineryByIdResponse")
    public JAXBElement<GetWineryByIdResponse> createGetWineryByIdResponse(GetWineryByIdResponse value) {
        return new JAXBElement<GetWineryByIdResponse>(_GetWineryByIdResponse_QNAME, GetWineryByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveWineryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeWineryResponse")
    public JAXBElement<RemoveWineryResponse> createRemoveWineryResponse(RemoveWineryResponse value) {
        return new JAXBElement<RemoveWineryResponse>(_RemoveWineryResponse_QNAME, RemoveWineryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getCategoryById")
    public JAXBElement<GetCategoryById> createGetCategoryById(GetCategoryById value) {
        return new JAXBElement<GetCategoryById>(_GetCategoryById_QNAME, GetCategoryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addRegionResponse")
    public JAXBElement<AddRegionResponse> createAddRegionResponse(AddRegionResponse value) {
        return new JAXBElement<AddRegionResponse>(_AddRegionResponse_QNAME, AddRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllWinery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllWinery")
    public JAXBElement<GetAllWinery> createGetAllWinery(GetAllWinery value) {
        return new JAXBElement<GetAllWinery>(_GetAllWinery_QNAME, GetAllWinery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeCategoryResponse")
    public JAXBElement<RemoveCategoryResponse> createRemoveCategoryResponse(RemoveCategoryResponse value) {
        return new JAXBElement<RemoveCategoryResponse>(_RemoveCategoryResponse_QNAME, RemoveCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddWineryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addWineryResponse")
    public JAXBElement<AddWineryResponse> createAddWineryResponse(AddWineryResponse value) {
        return new JAXBElement<AddWineryResponse>(_AddWineryResponse_QNAME, AddWineryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllItemResponse")
    public JAXBElement<GetAllItemResponse> createGetAllItemResponse(GetAllItemResponse value) {
        return new JAXBElement<GetAllItemResponse>(_GetAllItemResponse_QNAME, GetAllItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateItem")
    public JAXBElement<UpdateItem> createUpdateItem(UpdateItem value) {
        return new JAXBElement<UpdateItem>(_UpdateItem_QNAME, UpdateItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllRegionResponse")
    public JAXBElement<GetAllRegionResponse> createGetAllRegionResponse(GetAllRegionResponse value) {
        return new JAXBElement<GetAllRegionResponse>(_GetAllRegionResponse_QNAME, GetAllRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWineryById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getWineryById")
    public JAXBElement<GetWineryById> createGetWineryById(GetWineryById value) {
        return new JAXBElement<GetWineryById>(_GetWineryById_QNAME, GetWineryById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRegionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateRegionResponse")
    public JAXBElement<UpdateRegionResponse> createUpdateRegionResponse(UpdateRegionResponse value) {
        return new JAXBElement<UpdateRegionResponse>(_UpdateRegionResponse_QNAME, UpdateRegionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRegionByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getRegionByIdResponse")
    public JAXBElement<GetRegionByIdResponse> createGetRegionByIdResponse(GetRegionByIdResponse value) {
        return new JAXBElement<GetRegionByIdResponse>(_GetRegionByIdResponse_QNAME, GetRegionByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateItemResponse")
    public JAXBElement<UpdateItemResponse> createUpdateItemResponse(UpdateItemResponse value) {
        return new JAXBElement<UpdateItemResponse>(_UpdateItemResponse_QNAME, UpdateItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetItemByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getItemByNameResponse")
    public JAXBElement<GetItemByNameResponse> createGetItemByNameResponse(GetItemByNameResponse value) {
        return new JAXBElement<GetItemByNameResponse>(_GetItemByNameResponse_QNAME, GetItemByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWinery }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateWinery")
    public JAXBElement<UpdateWinery> createUpdateWinery(UpdateWinery value) {
        return new JAXBElement<UpdateWinery>(_UpdateWinery_QNAME, UpdateWinery.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getAllRegion")
    public JAXBElement<GetAllRegion> createGetAllRegion(GetAllRegion value) {
        return new JAXBElement<GetAllRegion>(_GetAllRegion_QNAME, GetAllRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddCategoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addCategoryResponse")
    public JAXBElement<AddCategoryResponse> createAddCategoryResponse(AddCategoryResponse value) {
        return new JAXBElement<AddCategoryResponse>(_AddCategoryResponse_QNAME, AddCategoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWineryByNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "getWineryByNameResponse")
    public JAXBElement<GetWineryByNameResponse> createGetWineryByNameResponse(GetWineryByNameResponse value) {
        return new JAXBElement<GetWineryByNameResponse>(_GetWineryByNameResponse_QNAME, GetWineryByNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "addRegion")
    public JAXBElement<AddRegion> createAddRegion(AddRegion value) {
        return new JAXBElement<AddRegion>(_AddRegion_QNAME, AddRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveRegion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeRegion")
    public JAXBElement<RemoveRegion> createRemoveRegion(RemoveRegion value) {
        return new JAXBElement<RemoveRegion>(_RemoveRegion_QNAME, RemoveRegion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveItemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "removeItemResponse")
    public JAXBElement<RemoveItemResponse> createRemoveItemResponse(RemoveItemResponse value) {
        return new JAXBElement<RemoveItemResponse>(_RemoveItemResponse_QNAME, RemoveItemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "updateCategory")
    public JAXBElement<UpdateCategory> createUpdateCategory(UpdateCategory value) {
        return new JAXBElement<UpdateCategory>(_UpdateCategory_QNAME, UpdateCategory.class, null, value);
    }

}
