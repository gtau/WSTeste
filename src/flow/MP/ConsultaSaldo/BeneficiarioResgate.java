
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiarioResgate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiarioResgate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador-participante" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="terceiro-pf" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiarioResgate", propOrder = {
    "indicadorParticipante",
    "terceiroPf"
})
public class BeneficiarioResgate {

    @XmlElement(name = "indicador-participante")
    protected Boolean indicadorParticipante;
    @XmlElement(name = "terceiro-pf")
    protected DadosCadastraisPF terceiroPf;

    /**
     * Gets the value of the indicadorParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorParticipante() {
        return indicadorParticipante;
    }

    /**
     * Sets the value of the indicadorParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorParticipante(Boolean value) {
        this.indicadorParticipante = value;
    }

    /**
     * Gets the value of the terceiroPf property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getTerceiroPf() {
        return terceiroPf;
    }

    /**
     * Sets the value of the terceiroPf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setTerceiroPf(DadosCadastraisPF value) {
        this.terceiroPf = value;
    }

}
