package Entity.ProductMgt;

import Entity.ProductMgt.ItemEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T19:21:56")
@StaticMetamodel(ItemPurchasedEntity.class)
public class ItemPurchasedEntity_ { 

    public static volatile SingularAttribute<ItemPurchasedEntity, ItemEntity> item;
    public static volatile SingularAttribute<ItemPurchasedEntity, Double> totalPrice;
    public static volatile SingularAttribute<ItemPurchasedEntity, Long> id;
    public static volatile SingularAttribute<ItemPurchasedEntity, Long> soldQuantity;

}