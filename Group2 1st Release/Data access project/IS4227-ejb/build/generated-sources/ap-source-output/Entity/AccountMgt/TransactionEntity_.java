package Entity.AccountMgt;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:08:42")
@StaticMetamodel(TransactionEntity.class)
public class TransactionEntity_ { 

    public static volatile SingularAttribute<TransactionEntity, Long> accountId;
    public static volatile SingularAttribute<TransactionEntity, String> creditCardNo;
    public static volatile SingularAttribute<TransactionEntity, Double> totalPrice;
    public static volatile SingularAttribute<TransactionEntity, Boolean> paid;
    public static volatile SingularAttribute<TransactionEntity, String> shippingAddress;
    public static volatile SingularAttribute<TransactionEntity, Long> id;
    public static volatile SingularAttribute<TransactionEntity, Calendar> transactionDate;

}