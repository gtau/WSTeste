
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representação de um número sequencial circular, em que a sequência do número é reiniciada ao 
 * 				atingir o limite superior (ex.: 999999 para números com 6 dígitos é reiniciada para 000000)
 * 
 * <p>Java class for NumeroSequencialCircular complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumeroSequencialCircular">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-sequencial" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroSequencial" minOccurs="0"/>
 *         &lt;element name="deduplicador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroSequencialCircular", propOrder = {
    "numeroSequencial",
    "deduplicador"
})
public class NumeroSequencialCircular {

    @XmlElement(name = "numero-sequencial")
    protected String numeroSequencial;
    protected String deduplicador;

    /**
     * Gets the value of the numeroSequencial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSequencial() {
        return numeroSequencial;
    }

    /**
     * Sets the value of the numeroSequencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSequencial(String value) {
        this.numeroSequencial = value;
    }

    /**
     * Gets the value of the deduplicador property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeduplicador() {
        return deduplicador;
    }

    /**
     * Sets the value of the deduplicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeduplicador(String value) {
        this.deduplicador = value;
    }

}
