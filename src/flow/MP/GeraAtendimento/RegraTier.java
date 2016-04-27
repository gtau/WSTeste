
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegraTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegraTier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="atributos" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="data-meta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegraTier", propOrder = {
    "tipo",
    "atributos",
    "dataMeta"
})
public class RegraTier {

    protected String tipo;
    protected AtributoList atributos;
    @XmlElement(name = "data-meta")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataMeta;

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the atributos property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getAtributos() {
        return atributos;
    }

    /**
     * Sets the value of the atributos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setAtributos(AtributoList value) {
        this.atributos = value;
    }

    /**
     * Gets the value of the dataMeta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataMeta() {
        return dataMeta;
    }

    /**
     * Sets the value of the dataMeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataMeta(XMLGregorianCalendar value) {
        this.dataMeta = value;
    }

}
