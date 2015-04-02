
package wss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "EnquiryWebService", targetNamespace = "http://WSS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EnquiryWebService {


    /**
     * 
     * @param accountId
     * @param content
     * @throws AccountNotFoundException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "submitEnquery", targetNamespace = "http://WSS/", className = "wss.SubmitEnquery")
    @ResponseWrapper(localName = "submitEnqueryResponse", targetNamespace = "http://WSS/", className = "wss.SubmitEnqueryResponse")
    @Action(input = "http://WSS/EnquiryWebService/submitEnqueryRequest", output = "http://WSS/EnquiryWebService/submitEnqueryResponse", fault = {
        @FaultAction(className = AccountNotFoundException_Exception.class, value = "http://WSS/EnquiryWebService/submitEnquery/Fault/AccountNotFoundException")
    })
    public void submitEnquery(
        @WebParam(name = "accountId", targetNamespace = "")
        Long accountId,
        @WebParam(name = "content", targetNamespace = "")
        String content)
        throws AccountNotFoundException_Exception
    ;

    /**
     * 
     * @param adminId
     * @return
     *     returns java.lang.String
     * @throws AdminNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewAllEnquiry", targetNamespace = "http://WSS/", className = "wss.ViewAllEnquiry")
    @ResponseWrapper(localName = "viewAllEnquiryResponse", targetNamespace = "http://WSS/", className = "wss.ViewAllEnquiryResponse")
    @Action(input = "http://WSS/EnquiryWebService/viewAllEnquiryRequest", output = "http://WSS/EnquiryWebService/viewAllEnquiryResponse", fault = {
        @FaultAction(className = AdminNotFoundException_Exception.class, value = "http://WSS/EnquiryWebService/viewAllEnquiry/Fault/AdminNotFoundException")
    })
    public String viewAllEnquiry(
        @WebParam(name = "adminId", targetNamespace = "")
        Long adminId)
        throws AdminNotFoundException_Exception
    ;

    /**
     * 
     * @param adminId
     * @param enquiryId
     * @return
     *     returns wss.EnquiryEntity
     * @throws AdminNotFoundException_Exception
     * @throws EnquiryNotFoundException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "viewOneEnquiry", targetNamespace = "http://WSS/", className = "wss.ViewOneEnquiry")
    @ResponseWrapper(localName = "viewOneEnquiryResponse", targetNamespace = "http://WSS/", className = "wss.ViewOneEnquiryResponse")
    @Action(input = "http://WSS/EnquiryWebService/viewOneEnquiryRequest", output = "http://WSS/EnquiryWebService/viewOneEnquiryResponse", fault = {
        @FaultAction(className = AdminNotFoundException_Exception.class, value = "http://WSS/EnquiryWebService/viewOneEnquiry/Fault/AdminNotFoundException"),
        @FaultAction(className = EnquiryNotFoundException_Exception.class, value = "http://WSS/EnquiryWebService/viewOneEnquiry/Fault/EnquiryNotFoundException")
    })
    public EnquiryEntity viewOneEnquiry(
        @WebParam(name = "adminId", targetNamespace = "")
        Long adminId,
        @WebParam(name = "enquiryId", targetNamespace = "")
        Long enquiryId)
        throws AdminNotFoundException_Exception, EnquiryNotFoundException_Exception
    ;

    /**
     * 
     * @param adminId
     * @param enquiryId
     * @param replyContent
     * @throws AdminNotFoundException_Exception
     * @throws EnquiryNotFoundException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "processEnquiry", targetNamespace = "http://WSS/", className = "wss.ProcessEnquiry")
    @ResponseWrapper(localName = "processEnquiryResponse", targetNamespace = "http://WSS/", className = "wss.ProcessEnquiryResponse")
    @Action(input = "http://WSS/EnquiryWebService/processEnquiryRequest", output = "http://WSS/EnquiryWebService/processEnquiryResponse", fault = {
        @FaultAction(className = AdminNotFoundException_Exception.class, value = "http://WSS/EnquiryWebService/processEnquiry/Fault/AdminNotFoundException"),
        @FaultAction(className = EnquiryNotFoundException_Exception.class, value = "http://WSS/EnquiryWebService/processEnquiry/Fault/EnquiryNotFoundException")
    })
    public void processEnquiry(
        @WebParam(name = "adminId", targetNamespace = "")
        Long adminId,
        @WebParam(name = "enquiryId", targetNamespace = "")
        Long enquiryId,
        @WebParam(name = "replyContent", targetNamespace = "")
        String replyContent)
        throws AdminNotFoundException_Exception, EnquiryNotFoundException_Exception
    ;

}
