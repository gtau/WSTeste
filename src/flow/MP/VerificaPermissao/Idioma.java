
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Idioma complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Idioma">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo-desnormalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-idioma-iso-639" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-zA-Z]{0,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codigo-pais-iso-3166" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[a-zA-Z]{0,2}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Idioma", propOrder = {
    "codigoDesnormalizado",
    "codigoIdiomaIso639",
    "codigoPaisIso3166",
    "descricao"
})
public class Idioma {

    @XmlElement(name = "codigo-desnormalizado")
    protected String codigoDesnormalizado;
    @XmlElement(name = "codigo-idioma-iso-639")
    protected String codigoIdiomaIso639;
    @XmlElement(name = "codigo-pais-iso-3166")
    protected String codigoPaisIso3166;
    protected String descricao;

    /**
     * Gets the value of the codigoDesnormalizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDesnormalizado() {
        return codigoDesnormalizado;
    }

    /**
     * Sets the value of the codigoDesnormalizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDesnormalizado(String value) {
        this.codigoDesnormalizado = value;
    }

    /**
     * Gets the value of the codigoIdiomaIso639 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoIdiomaIso639() {
        return codigoIdiomaIso639;
    }

    /**
     * Sets the value of the codigoIdiomaIso639 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoIdiomaIso639(String value) {
        this.codigoIdiomaIso639 = value;
    }

    /**
     * Gets the value of the codigoPaisIso3166 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPaisIso3166() {
        return codigoPaisIso3166;
    }

    /**
     * Sets the value of the codigoPaisIso3166 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPaisIso3166(String value) {
        this.codigoPaisIso3166 = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

}
