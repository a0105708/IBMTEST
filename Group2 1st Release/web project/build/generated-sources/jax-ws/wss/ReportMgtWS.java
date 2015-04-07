
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
@WebService(name = "ReportMgtWS", targetNamespace = "http://WSS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReportMgtWS {


    /**
     * 
     * @param startMonth
     * @param startYear
     * @param endMonth
     * @param endYear
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createMonthlyReport", targetNamespace = "http://WSS/", className = "wss.CreateMonthlyReport")
    @Action(input = "http://WSS/ReportMgtWS/createMonthlyReport")
    public void createMonthlyReport(
        @WebParam(name = "startYear", targetNamespace = "")
        Integer startYear,
        @WebParam(name = "startMonth", targetNamespace = "")
        Integer startMonth,
        @WebParam(name = "endYear", targetNamespace = "")
        Integer endYear,
        @WebParam(name = "endMonth", targetNamespace = "")
        Integer endMonth);

    /**
     * 
     * @param productId
     * @param startMonth
     * @param startYear
     * @param endMonth
     * @param endYear
     */
    @WebMethod
    @Oneway
    @RequestWrapper(localName = "createProductReport", targetNamespace = "http://WSS/", className = "wss.CreateProductReport")
    @Action(input = "http://WSS/ReportMgtWS/createProductReport")
    public void createProductReport(
        @WebParam(name = "productId", targetNamespace = "")
        long productId,
        @WebParam(name = "startYear", targetNamespace = "")
        Integer startYear,
        @WebParam(name = "startMonth", targetNamespace = "")
        Integer startMonth,
        @WebParam(name = "endYear", targetNamespace = "")
        Integer endYear,
        @WebParam(name = "endMonth", targetNamespace = "")
        Integer endMonth);

    /**
     * 
     * @param type
     * @return
     *     returns java.util.List<wss.ReportEntity>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listReport", targetNamespace = "http://WSS/", className = "wss.ListReport")
    @ResponseWrapper(localName = "listReportResponse", targetNamespace = "http://WSS/", className = "wss.ListReportResponse")
    @Action(input = "http://WSS/ReportMgtWS/listReportRequest", output = "http://WSS/ReportMgtWS/listReportResponse")
    public List<ReportEntity> listReport(
        @WebParam(name = "type", targetNamespace = "")
        String type);

}