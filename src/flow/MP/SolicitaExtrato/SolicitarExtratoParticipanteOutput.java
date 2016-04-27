
package flow.MP.SolicitaExtrato;

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
 *         &lt;element name="recibo-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}ReciboEntrega" minOccurs="0"/>
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
    "reciboEntrega"
})
@XmlRootElement(name = "SolicitarExtratoParticipanteOutput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class SolicitarExtratoParticipanteOutput {

    @XmlElement(name = "recibo-entrega", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected ReciboEntrega reciboEntrega;

    /**
     * Gets the value of the reciboEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link ReciboEntrega }
     *     
     */
    public ReciboEntrega getReciboEntrega() {
        return reciboEntrega;
    }

    /**
     * Sets the value of the reciboEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReciboEntrega }
     *     
     */
    public void setReciboEntrega(ReciboEntrega value) {
        this.reciboEntrega = value;
    }

}
