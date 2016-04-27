
package flow.MP.ConsultaSaldo;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ConsultarSaldoParticipanteFault", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class ConsultarSaldoParticipanteFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ConsultarSaldoParticipanteFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public ConsultarSaldoParticipanteFaultMsg(String message, ConsultarSaldoParticipanteFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public ConsultarSaldoParticipanteFaultMsg(String message, ConsultarSaldoParticipanteFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: flow.MP.ConsultaSaldo.ConsultarSaldoParticipanteFault
     */
    public ConsultarSaldoParticipanteFault getFaultInfo() {
        return faultInfo;
    }

}
