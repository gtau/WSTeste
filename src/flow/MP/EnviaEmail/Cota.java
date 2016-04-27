
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Cota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cota-acumulo-pontos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="cota-resgate-pontos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cota", propOrder = {
    "cotaAcumuloPontos",
    "cotaResgatePontos"
})
public class Cota {

    @XmlElement(name = "cota-acumulo-pontos")
    protected Long cotaAcumuloPontos;
    @XmlElement(name = "cota-resgate-pontos")
    protected Long cotaResgatePontos;

    /**
     * Gets the value of the cotaAcumuloPontos property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCotaAcumuloPontos() {
        return cotaAcumuloPontos;
    }

    /**
     * Sets the value of the cotaAcumuloPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCotaAcumuloPontos(Long value) {
        this.cotaAcumuloPontos = value;
    }

    /**
     * Gets the value of the cotaResgatePontos property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCotaResgatePontos() {
        return cotaResgatePontos;
    }

    /**
     * Sets the value of the cotaResgatePontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCotaResgatePontos(Long value) {
        this.cotaResgatePontos = value;
    }

}
