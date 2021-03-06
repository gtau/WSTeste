
package flow.MP.GeraAtendimento;

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
@WebService(name = "GerarAtendimentov1_PortType", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GerarAtendimentov1PortType {


    /**
     * 
     * @param gerarAtendimentoInput
     * @return
     *     returns flow.MP.GeraAtendimento.GerarAtendimentoOutput
     * @throws GerarAtendimentoFaultMsg
     * @throws ErroTecnicoFaultMsg
     */
    @WebMethod(action = "gerarAtendimento")
    @WebResult(name = "GerarAtendimentoOutput", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", partName = "GerarAtendimentoOutput")
    public GerarAtendimentoOutput gerarAtendimento(
        @WebParam(name = "GerarAtendimentoInput", targetNamespace = "http://ebs.multiplusfidelidade.com.br/v1", partName = "GerarAtendimentoInput")
        GerarAtendimentoInput gerarAtendimentoInput)
        throws ErroTecnicoFaultMsg, GerarAtendimentoFaultMsg
    ;

}
