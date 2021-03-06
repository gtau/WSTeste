
package flow.MP.VerificaPermissao;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "VerificarPermissaoAlteracaoCadastralFault", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class VerificarPermissaoAlteracaoCadastralFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private VerificarPermissaoAlteracaoCadastralFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public VerificarPermissaoAlteracaoCadastralFaultMsg(String message, VerificarPermissaoAlteracaoCadastralFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public VerificarPermissaoAlteracaoCadastralFaultMsg(String message, VerificarPermissaoAlteracaoCadastralFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: flow.MP.VerificaPermissao.VerificarPermissaoAlteracaoCadastralFault
     */
    public VerificarPermissaoAlteracaoCadastralFault getFaultInfo() {
        return faultInfo;
    }

}
