
package flow.MP.SolicitaExtrato;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SolicitarExtratoParticipantev1_PortType", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SolicitarExtratoParticipantev1PortType {


    /**
     * 
     * @param solicitarExtratoParticipanteInput
     * @return
     *     returns flow.MP.SolicitaExtrato.SolicitarExtratoParticipanteOutput
     * @throws ErroTecnicoFaultMsg
     * @throws SolicitarExtratoParticipanteFaultMsg
     */
    @WebMethod(action = "solicitarExtratoParticipante")
    @WebResult(name = "SolicitarExtratoParticipanteOutput", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", partName = "SolicitarExtratoParticipanteOutput")
    public SolicitarExtratoParticipanteOutput solicitarExtratoParticipante(
        @WebParam(name = "SolicitarExtratoParticipanteInput", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", partName = "SolicitarExtratoParticipanteInput")
        SolicitarExtratoParticipanteInput solicitarExtratoParticipanteInput)
        throws ErroTecnicoFaultMsg, SolicitarExtratoParticipanteFaultMsg
    ;

}
