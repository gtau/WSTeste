
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="indicador-retornar-proxima-expiracao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="identificacao-participante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="propriedades-execucao" type="{http://ebo.multiplusfidelidade.com.br/v1}PropriedadesExecucao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "participante",
    "indicadorRetornarProximaExpiracao",
    "identificacaoParticipante",
    "propriedadesExecucao"
})
@XmlRootElement(name = "ConsultarSaldoParticipanteInput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class ConsultarSaldoParticipanteInput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Participante participante;
    @XmlElement(name = "indicador-retornar-proxima-expiracao", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Boolean indicadorRetornarProximaExpiracao;
    @XmlElement(name = "identificacao-participante", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected String identificacaoParticipante;
    @XmlElement(name = "propriedades-execucao", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected PropriedadesExecucao propriedadesExecucao;

    /**
     * Gets the value of the participante property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * Sets the value of the participante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipante(Participante value) {
        this.participante = value;
    }

    /**
     * Gets the value of the indicadorRetornarProximaExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorRetornarProximaExpiracao() {
        return indicadorRetornarProximaExpiracao;
    }

    /**
     * Sets the value of the indicadorRetornarProximaExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorRetornarProximaExpiracao(Boolean value) {
        this.indicadorRetornarProximaExpiracao = value;
    }

    /**
     * Gets the value of the identificacaoParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacaoParticipante() {
        return identificacaoParticipante;
    }

    /**
     * Sets the value of the identificacaoParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacaoParticipante(String value) {
        this.identificacaoParticipante = value;
    }

    /**
     * Gets the value of the propriedadesExecucao property.
     * 
     * @return
     *     possible object is
     *     {@link PropriedadesExecucao }
     *     
     */
    public PropriedadesExecucao getPropriedadesExecucao() {
        return propriedadesExecucao;
    }

    /**
     * Sets the value of the propriedadesExecucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropriedadesExecucao }
     *     
     */
    public void setPropriedadesExecucao(PropriedadesExecucao value) {
        this.propriedadesExecucao = value;
    }

}
