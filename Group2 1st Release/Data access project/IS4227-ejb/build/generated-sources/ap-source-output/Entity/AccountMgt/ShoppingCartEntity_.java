package Entity.AccountMgt;

import Entity.AccountMgt.OrderEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:56:55")
@StaticMetamodel(ShoppingCartEntity.class)
public class ShoppingCartEntity_ { 

    public static volatile SingularAttribute<ShoppingCartEntity, Long> accountId;
    public static volatile ListAttribute<ShoppingCartEntity, OrderEntity> orderList;
    public static volatile SingularAttribute<ShoppingCartEntity, Long> id;
    public static volatile SingularAttribute<ShoppingCartEntity, Boolean> checkout;

}