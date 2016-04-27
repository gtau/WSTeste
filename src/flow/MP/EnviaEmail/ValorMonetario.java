
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ValorMonetario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValorMonetario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantia" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codigo-moeda-iso-4217" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[0-9]{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValorMonetario", propOrder = {
    "quantia",
    "codigoMoedaIso4217"
})
public class ValorMonetario {

    protected Double quantia;
    @XmlElement(name = "codigo-moeda-iso-4217")
    protected String codigoMoedaIso4217;

    /**
     * Gets the value of the quantia property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantia() {
        return quantia;
    }

    /**
     * Sets the value of the quantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantia(Double value) {
        this.quantia = value;
    }

    /**
     * Gets the value of the codigoMoedaIso4217 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoMoedaIso4217() {
        return codigoMoedaIso4217;
    }

    /**
     * Sets the value of the codigoMoedaIso4217 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoMoedaIso4217(String value) {
        this.codigoMoedaIso4217 = value;
    }

}
