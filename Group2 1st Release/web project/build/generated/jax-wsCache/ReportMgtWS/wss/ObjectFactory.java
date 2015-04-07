
package wss;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wss package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListReport_QNAME = new QName("http://WSS/", "listReport");
    private final static QName _CreateMonthlyReport_QNAME = new QName("http://WSS/", "createMonthlyReport");
    private final static QName _CreateProductReport_QNAME = new QName("http://WSS/", "createProductReport");
    private final static QName _ListReportResponse_QNAME = new QName("http://WSS/", "listReportResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wss
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateProductReport }
     * 
     */
    public CreateProductReport createCreateProductReport() {
        return new CreateProductReport();
    }

    /**
     * Create an instance of {@link ListReportResponse }
     * 
     */
    public ListReportResponse createListReportResponse() {
        return new ListReportResponse();
    }

    /**
     * Create an instance of {@link ListReport }
     * 
     */
    public ListReport createListReport() {
        return new ListReport();
    }

    /**
     * Create an instance of {@link CreateMonthlyReport }
     * 
     */
    public CreateMonthlyReport createCreateMonthlyReport() {
        return new CreateMonthlyReport();
    }

    /**
     * Create an instance of {@link ReportEntity }
     * 
     */
    public ReportEntity createReportEntity() {
        return new ReportEntity();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "listReport")
    public JAXBElement<ListReport> createListReport(ListReport value) {
        return new JAXBElement<ListReport>(_ListReport_QNAME, ListReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMonthlyReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "createMonthlyReport")
    public JAXBElement<CreateMonthlyReport> createCreateMonthlyReport(CreateMonthlyReport value) {
        return new JAXBElement<CreateMonthlyReport>(_CreateMonthlyReport_QNAME, CreateMonthlyReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProductReport }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "createProductReport")
    public JAXBElement<CreateProductReport> createCreateProductReport(CreateProductReport value) {
        return new JAXBElement<CreateProductReport>(_CreateProductReport_QNAME, CreateProductReport.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReportResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WSS/", name = "listReportResponse")
    public JAXBElement<ListReportResponse> createListReportResponse(ListReportResponse value) {
        return new JAXBElement<ListReportResponse>(_ListReportResponse_QNAME, ListReportResponse.class, null, value);
    }

}
