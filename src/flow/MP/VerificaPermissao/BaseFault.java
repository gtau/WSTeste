
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa e descreve uma falha ou problema
 * 				ocorrido na execução de um serviço. Todas as falhas devem extender
 * 				deste tipo
 * 
 * <p>Java class for BaseFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instrucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalhe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFault", propOrder = {
    "codigo",
    "mensagem",
    "instrucao",
    "detalhe"
})
@XmlSeeAlso({
    VerificarPermissaoAlteracaoCadastralFault.class,
    ErroTecnicoFault.class
})
public class BaseFault {

    @XmlElement(required = true)
    protected String codigo;
    @XmlElement(required = true)
    protected String mensagem;
    protected String instrucao;
    protected String detalhe;

    /**
     * Gets the value of the codigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Sets the value of the codigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Gets the value of the mensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Sets the value of the mensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Gets the value of the instrucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrucao() {
        return instrucao;
    }

    /**
     * Sets the value of the instrucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstrucao(String value) {
        this.instrucao = value;
    }

    /**
     * Gets the value of the detalhe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalhe() {
        return detalhe;
    }

    /**
     * Sets the value of the detalhe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalhe(String value) {
        this.detalhe = value;
    }

}
