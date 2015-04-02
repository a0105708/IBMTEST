/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package WSS;

import SessionBean.AdditionalFeatureBean;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Administrator
 */
@WebService(serviceName = "AdditionalFeatureWS")
@Stateless()
public class AdditionalFeatureWS {
    @EJB
    private AdditionalFeatureBean ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "FBandGPsignin")
    public String FBandGPsignin(@WebParam(name = "email") String email, @WebParam(name = "name") String name, @WebParam(name = "id") String id) {
        System.out.println("FB/GPemail: "+email);
        return ejbRef.FBandGPsignin(email, name, id);
    }
    
}
