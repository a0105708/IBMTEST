
package wss;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deletePurchaseHistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletePurchaseHistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletePurchaseHistory", propOrder = {
    "purchaseId"
})
public class DeletePurchaseHistory {

    protected Long purchaseId;

    /**
     * Gets the value of the purchaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPurchaseId() {
        return purchaseId;
    }

    /**
     * Sets the value of the purchaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPurchaseId(Long value) {
        this.purchaseId = value;
    }

}
