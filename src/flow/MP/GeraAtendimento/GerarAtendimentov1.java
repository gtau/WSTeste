
package flow.MP.GeraAtendimento;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GerarAtendimentov1", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", wsdlLocation = "http://localhost:9999/GerarAtendimentov1_Mock?WSDL")
public class GerarAtendimentov1
    extends Service
{

    private final static URL GERARATENDIMENTOV1_WSDL_LOCATION;
    private final static WebServiceException GERARATENDIMENTOV1_EXCEPTION;
    private final static QName GERARATENDIMENTOV1_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "GerarAtendimentov1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/GerarAtendimentov1_Mock?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GERARATENDIMENTOV1_WSDL_LOCATION = url;
        GERARATENDIMENTOV1_EXCEPTION = e;
    }

    public GerarAtendimentov1() {
        super(__getWsdlLocation(), GERARATENDIMENTOV1_QNAME);
    }

    public GerarAtendimentov1(WebServiceFeature... features) {
        super(__getWsdlLocation(), GERARATENDIMENTOV1_QNAME, features);
    }

    public GerarAtendimentov1(URL wsdlLocation) {
        super(wsdlLocation, GERARATENDIMENTOV1_QNAME);
    }

    public GerarAtendimentov1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GERARATENDIMENTOV1_QNAME, features);
    }

    public GerarAtendimentov1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GerarAtendimentov1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GerarAtendimentov1PortType
     */
    @WebEndpoint(name = "GerarAtendimentov1")
    public GerarAtendimentov1PortType getGerarAtendimentov1() {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "GerarAtendimentov1"), GerarAtendimentov1PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GerarAtendimentov1PortType
     */
    @WebEndpoint(name = "GerarAtendimentov1")
    public GerarAtendimentov1PortType getGerarAtendimentov1(WebServiceFeature... features) {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "GerarAtendimentov1"), GerarAtendimentov1PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GERARATENDIMENTOV1_EXCEPTION!= null) {
            throw GERARATENDIMENTOV1_EXCEPTION;
        }
        return GERARATENDIMENTOV1_WSDL_LOCATION;
    }

}