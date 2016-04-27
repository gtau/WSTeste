
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma mensagem textual.
 * 
 * <p>Java class for Mensagem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Mensagem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="texto-mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Mensagem", propOrder = {
    "textoMensagem"
})
public class Mensagem {

    @XmlElement(name = "texto-mensagem")
    protected String textoMensagem;

    /**
     * Gets the value of the textoMensagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextoMensagem() {
        return textoMensagem;
    }

    /**
     * Sets the value of the textoMensagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextoMensagem(String value) {
        this.textoMensagem = value;
    }

}
