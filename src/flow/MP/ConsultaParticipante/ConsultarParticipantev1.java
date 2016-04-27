
package flow.MP.ConsultaParticipante;

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
@WebServiceClient(name = "ConsultarParticipantev1", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", wsdlLocation = "http://localhost:9999/ConsultarParticipantev1_Mock?WSDL")
public class ConsultarParticipantev1
    extends Service
{

    private final static URL CONSULTARPARTICIPANTEV1_WSDL_LOCATION;
    private final static WebServiceException CONSULTARPARTICIPANTEV1_EXCEPTION;
    private final static QName CONSULTARPARTICIPANTEV1_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "ConsultarParticipantev1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/ConsultarParticipantev1_Mock?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONSULTARPARTICIPANTEV1_WSDL_LOCATION = url;
        CONSULTARPARTICIPANTEV1_EXCEPTION = e;
    }

    public ConsultarParticipantev1() {
        super(__getWsdlLocation(), CONSULTARPARTICIPANTEV1_QNAME);
    }

    public ConsultarParticipantev1(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONSULTARPARTICIPANTEV1_QNAME, features);
    }

    public ConsultarParticipantev1(URL wsdlLocation) {
        super(wsdlLocation, CONSULTARPARTICIPANTEV1_QNAME);
    }

    public ConsultarParticipantev1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONSULTARPARTICIPANTEV1_QNAME, features);
    }

    public ConsultarParticipantev1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarParticipantev1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ConsultarParticipantev1PortType
     */
    @WebEndpoint(name = "ConsultarParticipantev1")
    public ConsultarParticipantev1PortType getConsultarParticipantev1() {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "ConsultarParticipantev1"), ConsultarParticipantev1PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarParticipantev1PortType
     */
    @WebEndpoint(name = "ConsultarParticipantev1")
    public ConsultarParticipantev1PortType getConsultarParticipantev1(WebServiceFeature... features) {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "ConsultarParticipantev1"), ConsultarParticipantev1PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONSULTARPARTICIPANTEV1_EXCEPTION!= null) {
            throw CONSULTARPARTICIPANTEV1_EXCEPTION;
        }
        return CONSULTARPARTICIPANTEV1_WSDL_LOCATION;
    }

}
