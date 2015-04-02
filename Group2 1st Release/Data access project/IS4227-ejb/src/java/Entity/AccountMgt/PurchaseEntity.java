/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity.AccountMgt;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Administrator
 */
@Entity
public class PurchaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar purchasedDate = Calendar.getInstance();
    private Integer quantity;
    private Double totalPrice;
    private boolean status;
    
    //purchase -- order :  1 -->1
    private Long orderId;
    
    //purchase -- transaction : M --> 1
    private Long transactionId;
    
    private Long accounId;

    public PurchaseEntity(){
    }

    
    public PurchaseEntity(Calendar date, Integer quantity, Double totalPrice,Long order,Long transactionId){
        this.quantity=quantity;
        this.purchasedDate=date;
        this.totalPrice=totalPrice;
        this.orderId=order;
        this.transactionId=transactionId;
        this.status=true;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getPurchasedDate() {
        return purchasedDate;
    }

    public void setPurchasedDate(Calendar purchasedDate) {
        this.purchasedDate = purchasedDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Long getAccounId() {
        return accounId;
    }

    public void setAccounId(Long accounId) {
        this.accounId = accounId;
    }

}
