
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Catalogo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Catalogo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-catalogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-catalogo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Catalogo", propOrder = {
    "idCatalogo",
    "codigoCatalogo",
    "parceiro"
})
public class Catalogo {

    @XmlElement(name = "id-catalogo")
    protected String idCatalogo;
    @XmlElement(name = "codigo-catalogo")
    protected String codigoCatalogo;
    protected Parceiro parceiro;

    /**
     * Gets the value of the idCatalogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCatalogo() {
        return idCatalogo;
    }

    /**
     * Sets the value of the idCatalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCatalogo(String value) {
        this.idCatalogo = value;
    }

    /**
     * Gets the value of the codigoCatalogo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCatalogo() {
        return codigoCatalogo;
    }

    /**
     * Sets the value of the codigoCatalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCatalogo(String value) {
        this.codigoCatalogo = value;
    }

    /**
     * Gets the value of the parceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Parceiro }
     *     
     */
    public Parceiro getParceiro() {
        return parceiro;
    }

    /**
     * Sets the value of the parceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parceiro }
     *     
     */
    public void setParceiro(Parceiro value) {
        this.parceiro = value;
    }

}
