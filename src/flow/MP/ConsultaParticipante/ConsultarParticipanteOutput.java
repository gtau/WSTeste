
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
 *         &lt;element name="score-qualidade-cadastro" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "scoreQualidadeCadastro"
})
@XmlRootElement(name = "ConsultarParticipanteOutput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class ConsultarParticipanteOutput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Participante participante;
    @XmlElement(name = "score-qualidade-cadastro", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Long scoreQualidadeCadastro;

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
     * Gets the value of the scoreQualidadeCadastro property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getScoreQualidadeCadastro() {
        return scoreQualidadeCadastro;
    }

    /**
     * Sets the value of the scoreQualidadeCadastro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setScoreQualidadeCadastro(Long value) {
        this.scoreQualidadeCadastro = value;
    }

}
