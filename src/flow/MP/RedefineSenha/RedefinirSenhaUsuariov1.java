
package flow.MP.RedefineSenha;

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
@WebServiceClient(name = "RedefinirSenhaUsuariov1", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", wsdlLocation = "http://localhost:9999/RedefinirSenhaUsuariov1_Mock?WSDL")
public class RedefinirSenhaUsuariov1
    extends Service
{

    private final static URL REDEFINIRSENHAUSUARIOV1_WSDL_LOCATION;
    private final static WebServiceException REDEFINIRSENHAUSUARIOV1_EXCEPTION;
    private final static QName REDEFINIRSENHAUSUARIOV1_QNAME = new QName("http://ebs.multiplusfidelidade.com.br/v1", "RedefinirSenhaUsuariov1");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9999/RedefinirSenhaUsuariov1_Mock?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REDEFINIRSENHAUSUARIOV1_WSDL_LOCATION = url;
        REDEFINIRSENHAUSUARIOV1_EXCEPTION = e;
    }

    public RedefinirSenhaUsuariov1() {
        super(__getWsdlLocation(), REDEFINIRSENHAUSUARIOV1_QNAME);
    }

    public RedefinirSenhaUsuariov1(WebServiceFeature... features) {
        super(__getWsdlLocation(), REDEFINIRSENHAUSUARIOV1_QNAME, features);
    }

    public RedefinirSenhaUsuariov1(URL wsdlLocation) {
        super(wsdlLocation, REDEFINIRSENHAUSUARIOV1_QNAME);
    }

    public RedefinirSenhaUsuariov1(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REDEFINIRSENHAUSUARIOV1_QNAME, features);
    }

    public RedefinirSenhaUsuariov1(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RedefinirSenhaUsuariov1(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RedefinirSenhaUsuariov1PortType
     */
    @WebEndpoint(name = "RedefinirSenhaUsuariov1")
    public RedefinirSenhaUsuariov1PortType getRedefinirSenhaUsuariov1() {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "RedefinirSenhaUsuariov1"), RedefinirSenhaUsuariov1PortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RedefinirSenhaUsuariov1PortType
     */
    @WebEndpoint(name = "RedefinirSenhaUsuariov1")
    public RedefinirSenhaUsuariov1PortType getRedefinirSenhaUsuariov1(WebServiceFeature... features) {
        return super.getPort(new QName("http://ebs.multiplusfidelidade.com.br/v1", "RedefinirSenhaUsuariov1"), RedefinirSenhaUsuariov1PortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REDEFINIRSENHAUSUARIOV1_EXCEPTION!= null) {
            throw REDEFINIRSENHAUSUARIOV1_EXCEPTION;
        }
        return REDEFINIRSENHAUSUARIOV1_WSDL_LOCATION;
    }

}
