
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Rne complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rne">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgao-emissor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://ebo.multiplusfidelidade.com.br/v1}Uf" minOccurs="0"/>
 *         &lt;element name="data-emissao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-expiracao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rne", propOrder = {
    "numero",
    "orgaoEmissor",
    "uf",
    "dataEmissao",
    "dataExpiracao"
})
public class Rne {

    protected String numero;
    @XmlElement(name = "orgao-emissor")
    protected String orgaoEmissor;
    protected Uf uf;
    @XmlElement(name = "data-emissao")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "data-expiracao")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExpiracao;

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the orgaoEmissor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    /**
     * Sets the value of the orgaoEmissor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgaoEmissor(String value) {
        this.orgaoEmissor = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link Uf }
     *     
     */
    public Uf getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uf }
     *     
     */
    public void setUf(Uf value) {
        this.uf = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the dataExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExpiracao() {
        return dataExpiracao;
    }

    /**
     * Sets the value of the dataExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExpiracao(XMLGregorianCalendar value) {
        this.dataExpiracao = value;
    }

}
