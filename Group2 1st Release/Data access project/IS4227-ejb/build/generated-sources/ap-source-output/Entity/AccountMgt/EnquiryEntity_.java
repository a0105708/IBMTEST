package Entity.AccountMgt;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-04-02T20:59:43")
@StaticMetamodel(EnquiryEntity.class)
public class EnquiryEntity_ { 

    public static volatile SingularAttribute<EnquiryEntity, Calendar> date;
    public static volatile SingularAttribute<EnquiryEntity, Long> accountId;
    public static volatile SingularAttribute<EnquiryEntity, Boolean> replied;
    public static volatile SingularAttribute<EnquiryEntity, Long> id;
    public static volatile SingularAttribute<EnquiryEntity, String> content;

}