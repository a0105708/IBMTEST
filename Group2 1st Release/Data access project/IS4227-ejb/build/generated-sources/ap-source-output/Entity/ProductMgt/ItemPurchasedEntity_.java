package Entity.ProductMgt;

import Entity.ProductMgt.ItemEntity;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:08:42")
@StaticMetamodel(ItemPurchasedEntity.class)
public class ItemPurchasedEntity_ { 

    public static volatile SingularAttribute<ItemPurchasedEntity, ItemEntity> item;
    public static volatile SingularAttribute<ItemPurchasedEntity, Double> totalPrice;
    public static volatile SingularAttribute<ItemPurchasedEntity, Long> id;
    public static volatile SingularAttribute<ItemPurchasedEntity, Long> soldQuantity;

}