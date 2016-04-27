
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma campanha de marketing apenas informativa.
 * 
 * <p>Java class for CampanhaInformativa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampanhaInformativa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensagens" type="{http://ebo.multiplusfidelidade.com.br/v1}MensagemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanhaInformativa", propOrder = {
    "mensagens"
})
public class CampanhaInformativa {

    protected MensagemList mensagens;

    /**
     * Gets the value of the mensagens property.
     * 
     * @return
     *     possible object is
     *     {@link MensagemList }
     *     
     */
    public MensagemList getMensagens() {
        return mensagens;
    }

    /**
     * Sets the value of the mensagens property.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagemList }
     *     
     */
    public void setMensagens(MensagemList value) {
        this.mensagens = value;
    }

}
