/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Entity.ProductMgt.ReportEntity;
import SessionBean.ReportMgt.ReportMgtBean;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "ReportMgtWS")
@Stateless()
public class ReportMgtWS {
    @EJB
    private ReportMgtBean ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "createMonthlyReport")
    @Oneway
    public void createMonthlyReport(@WebParam(name = "startYear") Integer startYear,@WebParam(name = "startMonth") Integer startMonth,@WebParam(name = "endYear") Integer endYear,@WebParam(name = "endMonth") Integer endMonth) {
        ejbRef.createMonthlyReport(startYear,startMonth,endYear,endMonth);
    }
    
        @WebMethod(operationName = "createProductReport")
    @Oneway
    public void createProductReport(@WebParam(name = "productId") long prodcutId,@WebParam(name = "startYear") Integer startYear,@WebParam(name = "startMonth") Integer startMonth,@WebParam(name = "endYear") Integer endYear,@WebParam(name = "endMonth") Integer endMonth) {
        ejbRef.createProductReport(prodcutId,startYear,startMonth,endYear,endMonth);
    }
    
     @WebMethod(operationName = "listReport")
    public List<ReportEntity> listReport(@WebParam(name = "type") String type) {
        return ejbRef.listReport(type);
    }
    
}
