package Entity.ProductMgt;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-07T19:21:56")
@StaticMetamodel(CommentEntity.class)
public class CommentEntity_ { 

    public static volatile SingularAttribute<CommentEntity, Long> accountId;
    public static volatile SingularAttribute<CommentEntity, Long> itemId;
    public static volatile SingularAttribute<CommentEntity, String> contents;
    public static volatile SingularAttribute<CommentEntity, Double> rating;
    public static volatile SingularAttribute<CommentEntity, Long> id;

}