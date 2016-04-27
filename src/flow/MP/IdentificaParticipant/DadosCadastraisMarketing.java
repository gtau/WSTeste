
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCadastraisMarketing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCadastraisMarketing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador-optin-email" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indicador-optin-sms" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCadastraisMarketing", propOrder = {
    "indicadorOptinEmail",
    "indicadorOptinSms"
})
public class DadosCadastraisMarketing {

    @XmlElement(name = "indicador-optin-email")
    protected Boolean indicadorOptinEmail;
    @XmlElement(name = "indicador-optin-sms")
    protected Boolean indicadorOptinSms;

    /**
     * Gets the value of the indicadorOptinEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorOptinEmail() {
        return indicadorOptinEmail;
    }

    /**
     * Sets the value of the indicadorOptinEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorOptinEmail(Boolean value) {
        this.indicadorOptinEmail = value;
    }

    /**
     * Gets the value of the indicadorOptinSms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorOptinSms() {
        return indicadorOptinSms;
    }

    /**
     * Sets the value of the indicadorOptinSms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorOptinSms(Boolean value) {
        this.indicadorOptinSms = value;
    }

}
