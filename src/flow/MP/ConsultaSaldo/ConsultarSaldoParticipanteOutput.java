
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
 *         &lt;element name="pontos-proxima-expiracao" type="{http://ebo.multiplusfidelidade.com.br/v1}Pontos" minOccurs="0"/>
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
    "pontosProximaExpiracao"
})
@XmlRootElement(name = "ConsultarSaldoParticipanteOutput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class ConsultarSaldoParticipanteOutput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Participante participante;
    @XmlElement(name = "pontos-proxima-expiracao", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Pontos pontosProximaExpiracao;

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
     * Gets the value of the pontosProximaExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link Pontos }
     *     
     */
    public Pontos getPontosProximaExpiracao() {
        return pontosProximaExpiracao;
    }

    /**
     * Sets the value of the pontosProximaExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pontos }
     *     
     */
    public void setPontosProximaExpiracao(Pontos value) {
        this.pontosProximaExpiracao = value;
    }

}
