package Entity.AccountMgt;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:08:42")
@StaticMetamodel(PurchaseEntity.class)
public class PurchaseEntity_ { 

    public static volatile SingularAttribute<PurchaseEntity, Integer> quantity;
    public static volatile SingularAttribute<PurchaseEntity, Double> totalPrice;
    public static volatile SingularAttribute<PurchaseEntity, Long> orderId;
    public static volatile SingularAttribute<PurchaseEntity, Calendar> purchasedDate;
    public static volatile SingularAttribute<PurchaseEntity, Long> id;
    public static volatile SingularAttribute<PurchaseEntity, Long> transactionId;
    public static volatile SingularAttribute<PurchaseEntity, Boolean> status;
    public static volatile SingularAttribute<PurchaseEntity, Long> accounId;

}