package Entity.ProductMgt;

import Entity.ProductMgt.CategoryEntity;
import Entity.ProductMgt.CommentEntity;
import Entity.ProductMgt.ItemPurchasedEntity;
import Entity.ProductMgt.RegionEntity;
import Entity.ProductMgt.WineryEntity;
import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:08:42")
@StaticMetamodel(ItemEntity.class)
public class ItemEntity_ { 

    public static volatile ListAttribute<ItemEntity, CommentEntity> commentList;
    public static volatile SingularAttribute<ItemEntity, String> itemName;
    public static volatile SingularAttribute<ItemEntity, ItemPurchasedEntity> itemPurchased;
    public static volatile SingularAttribute<ItemEntity, String> vitage;
    public static volatile SingularAttribute<ItemEntity, Calendar> expiringDate;
    public static volatile SingularAttribute<ItemEntity, String> tastingNote;
    public static volatile SingularAttribute<ItemEntity, Long> id;
    public static volatile SingularAttribute<ItemEntity, WineryEntity> winery;
    public static volatile SingularAttribute<ItemEntity, CategoryEntity> category;
    public static volatile SingularAttribute<ItemEntity, RegionEntity> region;

}