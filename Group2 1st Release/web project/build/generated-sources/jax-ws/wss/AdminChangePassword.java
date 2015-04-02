
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adminChangePassword complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adminChangePassword">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adminId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="oldEncryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newEncryptedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adminChangePassword", propOrder = {
    "adminId",
    "oldEncryptedPassword",
    "newEncryptedPassword"
})
public class AdminChangePassword {

    protected String adminId;
    protected String oldEncryptedPassword;
    protected String newEncryptedPassword;

    /**
     * Gets the value of the adminId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdminId() {
        return adminId;
    }

    /**
     * Sets the value of the adminId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdminId(String value) {
        this.adminId = value;
    }

    /**
     * Gets the value of the oldEncryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldEncryptedPassword() {
        return oldEncryptedPassword;
    }

    /**
     * Sets the value of the oldEncryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldEncryptedPassword(String value) {
        this.oldEncryptedPassword = value;
    }

    /**
     * Gets the value of the newEncryptedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEncryptedPassword() {
        return newEncryptedPassword;
    }

    /**
     * Sets the value of the newEncryptedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEncryptedPassword(String value) {
        this.newEncryptedPassword = value;
    }

}
