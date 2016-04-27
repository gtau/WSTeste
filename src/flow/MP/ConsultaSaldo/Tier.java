
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Tier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="level" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="regras-tier" type="{http://ebo.multiplusfidelidade.com.br/v1}RegraTierList" minOccurs="0"/>
 *         &lt;element name="data-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tier", propOrder = {
    "level",
    "regrasTier",
    "dataValidade"
})
public class Tier {

    protected TipoReferencia level;
    @XmlElement(name = "regras-tier")
    protected RegraTierList regrasTier;
    @XmlElement(name = "data-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataValidade;

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setLevel(TipoReferencia value) {
        this.level = value;
    }

    /**
     * Gets the value of the regrasTier property.
     * 
     * @return
     *     possible object is
     *     {@link RegraTierList }
     *     
     */
    public RegraTierList getRegrasTier() {
        return regrasTier;
    }

    /**
     * Sets the value of the regrasTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegraTierList }
     *     
     */
    public void setRegrasTier(RegraTierList value) {
        this.regrasTier = value;
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidade(XMLGregorianCalendar value) {
        this.dataValidade = value;
    }

}
