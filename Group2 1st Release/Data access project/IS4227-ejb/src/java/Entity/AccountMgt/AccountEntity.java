package Entity.AccountMgt;


import Entity.ProductMgt.CommentEntity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
@Entity
public class AccountEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
       
    private String email;
    private String password;
    private String name;
    private String gender;
    private Boolean isMember;
    private Boolean isDeleted;

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }
    
    /************************/
    //NEW ATTRIBUTES
    private boolean isBlocked;
    private String activationCode;
    /************************/
    
    private String address;
    private String contactNumber;
    
    //account -- pruchase : 1 --> M
    @OneToMany
    private List<PurchaseEntity> purchase;

    //account -- transaction: 1-->M
    @OneToMany
    private List<TransactionEntity> transactions;

    //account -- shoppingcart : 1 --->1
    private Long shoppingcartId;

    @OneToMany
    private List<EnquiryEntity> enquiryList;
    
    @OneToMany
    private List<CommentEntity> commentList;
    
    public  AccountEntity(){
    
    }
    
    public AccountEntity (String email, String password, String name, String gender){
        this.email=email;
        this.password=password;
        this.name=name;
        this.gender=gender;
        isMember=false;
        this.address="";
        this.contactNumber="";
        /************************/
        //NEW ATTRIBUTE
        isBlocked=false;
        isDeleted = false;
        /************************/
        

        purchase=new ArrayList<PurchaseEntity>();

    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /************************/
    //TYPO Passwrod-->Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    /************************/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIsMember() {
        return isMember;
    }

    public void setIsMember(Boolean isMember) {
        this.isMember = isMember;
    }

    public List<PurchaseEntity> getPurchase() {
        return purchase;
    }

    public void setPurchase(List<PurchaseEntity> purchase) {

        this.purchase = purchase;
    }

    public Long getShoppingcartId() {
        return shoppingcartId;
    }

    public void setShoppingcartId(Long shoppingcartId) {
        this.shoppingcartId = shoppingcartId;
    }

     /**
     * @return **********************/
    // NEW ATTRIBUTES
    public boolean getIsBlocked() {
        return isBlocked;
    }

    public void setIsBlocked(boolean isBlocked) {
        this.isBlocked = isBlocked;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;

    }   

    public List<TransactionEntity> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionEntity> transactions) {
        this.transactions = transactions;

    } 
    
     public List<CommentEntity> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<CommentEntity> commentList) {
        this.commentList = commentList;

    }

    public List<EnquiryEntity> getEnquiryList() {
        return enquiryList;
    }

    public void setEnquiryList(List<EnquiryEntity> enquiryList) {
        this.enquiryList = enquiryList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    /************************/
    
}
