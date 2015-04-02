package Entity.AccountMgt;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2015-04-02T22:08:42")
@StaticMetamodel(EnquiryEntity.class)
public class EnquiryEntity_ { 

    public static volatile SingularAttribute<EnquiryEntity, Calendar> date;
    public static volatile SingularAttribute<EnquiryEntity, Long> accountId;
    public static volatile SingularAttribute<EnquiryEntity, Boolean> replied;
    public static volatile SingularAttribute<EnquiryEntity, Long> id;
    public static volatile SingularAttribute<EnquiryEntity, String> content;

}