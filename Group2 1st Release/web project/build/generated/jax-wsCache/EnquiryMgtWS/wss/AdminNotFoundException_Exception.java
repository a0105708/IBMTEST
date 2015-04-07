
package wss;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AdminNotFoundException", targetNamespace = "http://WSS/")
public class AdminNotFoundException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AdminNotFoundException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AdminNotFoundException_Exception(String message, AdminNotFoundException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AdminNotFoundException_Exception(String message, AdminNotFoundException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: wss.AdminNotFoundException
     */
    public AdminNotFoundException getFaultInfo() {
        return faultInfo;
    }

}
