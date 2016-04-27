
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReciboEntrega complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReciboEntrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-recibo-entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistema" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReciboEntrega", propOrder = {
    "idReciboEntrega",
    "sistema"
})
public class ReciboEntrega {

    @XmlElement(name = "id-recibo-entrega")
    protected String idReciboEntrega;
    protected Sistema sistema;

    /**
     * Gets the value of the idReciboEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReciboEntrega() {
        return idReciboEntrega;
    }

    /**
     * Sets the value of the idReciboEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReciboEntrega(String value) {
        this.idReciboEntrega = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistema(Sistema value) {
        this.sistema = value;
    }

}
