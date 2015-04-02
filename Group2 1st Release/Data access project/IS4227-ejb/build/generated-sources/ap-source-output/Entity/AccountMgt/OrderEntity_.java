package Entity.AccountMgt;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:08:42")
@StaticMetamodel(OrderEntity.class)
public class OrderEntity_ { 

    public static volatile SingularAttribute<OrderEntity, Calendar> date;
    public static volatile SingularAttribute<OrderEntity, Long> itemId;
    public static volatile SingularAttribute<OrderEntity, Integer> quantity;
    public static volatile SingularAttribute<OrderEntity, Long> purchaseId;
    public static volatile SingularAttribute<OrderEntity, Long> id;

}