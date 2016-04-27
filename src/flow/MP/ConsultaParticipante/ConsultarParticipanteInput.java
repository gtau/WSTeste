
package flow.MP.ConsultaParticipante;

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
 *         &lt;element name="idioma-dados-retorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idiomaDadosRetorno",
    "propriedadesExecucao"
})
@XmlRootElement(name = "ConsultarParticipanteInput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class ConsultarParticipanteInput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Participante participante;
    @XmlElement(name = "idioma-dados-retorno", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected String idiomaDadosRetorno;
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
     * Gets the value of the idiomaDadosRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdiomaDadosRetorno() {
        return idiomaDadosRetorno;
    }

    /**
     * Sets the value of the idiomaDadosRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdiomaDadosRetorno(String value) {
        this.idiomaDadosRetorno = value;
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
