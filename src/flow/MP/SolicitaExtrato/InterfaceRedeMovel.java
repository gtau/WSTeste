
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma interface de rede de telefonia móvel, que pode estar instalada em um dispositivo móvel.
 * 
 * <p>Java class for InterfaceRedeMovel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterfaceRedeMovel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefone" type="{http://ebo.multiplusfidelidade.com.br/v1}Telefone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterfaceRedeMovel", propOrder = {
    "imei",
    "telefone"
})
public class InterfaceRedeMovel {

    protected String imei;
    protected Telefone telefone;

    /**
     * Gets the value of the imei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Sets the value of the imei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

    /**
     * Gets the value of the telefone property.
     * 
     * @return
     *     possible object is
     *     {@link Telefone }
     *     
     */
    public Telefone getTelefone() {
        return telefone;
    }

    /**
     * Sets the value of the telefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefone }
     *     
     */
    public void setTelefone(Telefone value) {
        this.telefone = value;
    }

}
