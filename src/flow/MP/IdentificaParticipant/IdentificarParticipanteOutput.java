
package flow.MP.IdentificaParticipant;

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
 *         &lt;element name="indicador-participante-identificado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
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
    "indicadorParticipanteIdentificado",
    "participante"
})
@XmlRootElement(name = "IdentificarParticipanteOutput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class IdentificarParticipanteOutput {

    @XmlElement(name = "indicador-participante-identificado", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Boolean indicadorParticipanteIdentificado;
    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Participante participante;

    /**
     * Gets the value of the indicadorParticipanteIdentificado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorParticipanteIdentificado() {
        return indicadorParticipanteIdentificado;
    }

    /**
     * Sets the value of the indicadorParticipanteIdentificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorParticipanteIdentificado(Boolean value) {
        this.indicadorParticipanteIdentificado = value;
    }

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

}
