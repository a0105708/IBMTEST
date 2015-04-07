package Entity.AccountMgt;

import Entity.AccountMgt.EnquiryEntity;
import Entity.AccountMgt.PurchaseEntity;
import Entity.AccountMgt.TransactionEntity;
import Entity.ProductMgt.CommentEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T19:21:56")
@StaticMetamodel(AccountEntity.class)
public class AccountEntity_ { 

    public static volatile SingularAttribute<AccountEntity, Long> shoppingcartId;
    public static volatile ListAttribute<AccountEntity, CommentEntity> commentList;
    public static volatile SingularAttribute<AccountEntity, String> address;
    public static volatile SingularAttribute<AccountEntity, String> gender;
    public static volatile SingularAttribute<AccountEntity, Boolean> isBlocked;
    public static volatile ListAttribute<AccountEntity, PurchaseEntity> purchase;
    public static volatile ListAttribute<AccountEntity, EnquiryEntity> enquiryList;
    public static volatile SingularAttribute<AccountEntity, Boolean> isMember;
    public static volatile ListAttribute<AccountEntity, TransactionEntity> transactions;
    public static volatile SingularAttribute<AccountEntity, String> password;
    public static volatile SingularAttribute<AccountEntity, Boolean> isDeleted;
    public static volatile SingularAttribute<AccountEntity, String> name;
    public static volatile SingularAttribute<AccountEntity, String> contactNumber;
    public static volatile SingularAttribute<AccountEntity, Long> id;
    public static volatile SingularAttribute<AccountEntity, String> activationCode;
    public static volatile SingularAttribute<AccountEntity, String> email;

}