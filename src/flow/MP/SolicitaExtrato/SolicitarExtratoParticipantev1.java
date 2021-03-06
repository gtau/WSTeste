
package flow.MP.SolicitaExtrato;

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
@WebServiceClient(name = "SolicitarExtratoParticipantev1", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", wsdlLocation = "http://localhost:9999/SolicitarExtratoParticipantev1_Mock?WSDL")
public class SolicitarExtratoParticipantev1
    extends Service
{

    private final static URL SOLICITAREXTRATOPARTICIPANTEV1_WSDL_LOCATION;
    private final static WebServiceException SOLICITAREXTRATOPARTICIPANTEV1_EXCEPTION;
    private final static QName SOLICITAREXTRATOPARTICIPANTEV1_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "SolicitarExtratoParticipantev1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/SolicitarExtratoParticipantev1_Mock?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SOLICITAREXTRATOPARTICIPANTEV1_WSDL_LOCATION = url;
        SOLICITAREXTRATOPARTICIPANTEV1_EXCEPTION = e;
    }

    public SolicitarExtratoParticipantev1() {
        super(__getWsdlLocation(), SOLICITAREXTRATOPARTICIPANTEV1_QNAME);
    }

    public SolicitarExtratoParticipantev1(WebServiceFeature... features) {
        super(__getWsdlLocation(), SOLICITAREXTRATOPARTICIPANTEV1_QNAME, features);
    }

    public SolicitarExtratoParticipantev1(URL wsdlLocation) {
        super(wsdlLocation, SOLICITAREXTRATOPARTICIPANTEV1_QNAME);
    }

    public SolicitarExtratoParticipantev1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SOLICITAREXTRATOPARTICIPANTEV1_QNAME, features);
    }

    public SolicitarExtratoParticipantev1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SolicitarExtratoParticipantev1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SolicitarExtratoParticipantev1PortType
     */
    @WebEndpoint(name = "SolicitarExtratoParticipantev1")
    public SolicitarExtratoParticipantev1PortType getSolicitarExtratoParticipantev1() {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "SolicitarExtratoParticipantev1"), SolicitarExtratoParticipantev1PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SolicitarExtratoParticipantev1PortType
     */
    @WebEndpoint(name = "SolicitarExtratoParticipantev1")
    public SolicitarExtratoParticipantev1PortType getSolicitarExtratoParticipantev1(WebServiceFeature... features) {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "SolicitarExtratoParticipantev1"), SolicitarExtratoParticipantev1PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SOLICITAREXTRATOPARTICIPANTEV1_EXCEPTION!= null) {
            throw SOLICITAREXTRATOPARTICIPANTEV1_EXCEPTION;
        }
        return SOLICITAREXTRATOPARTICIPANTEV1_WSDL_LOCATION;
    }

}
