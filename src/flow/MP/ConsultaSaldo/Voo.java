
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Voo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Voo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-voo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aeroporto-origem-voo" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-origem-voo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="aeroporto-destino-voo" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-chegada-voo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="classe-assento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="classe-tarifaria" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="trechos-voo" type="{http://ebo.multiplusfidelidade.com.br/v1}TrechoVooList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voo", propOrder = {
    "idVoo",
    "aeroportoOrigemVoo",
    "dataOrigemVoo",
    "aeroportoDestinoVoo",
    "dataChegadaVoo",
    "classeAssento",
    "classeTarifaria",
    "trechosVoo"
})
public class Voo {

    @XmlElement(name = "id-voo")
    protected String idVoo;
    @XmlElement(name = "aeroporto-origem-voo")
    protected TipoReferencia aeroportoOrigemVoo;
    @XmlElement(name = "data-origem-voo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOrigemVoo;
    @XmlElement(name = "aeroporto-destino-voo")
    protected TipoReferencia aeroportoDestinoVoo;
    @XmlElement(name = "data-chegada-voo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChegadaVoo;
    @XmlElement(name = "classe-assento")
    protected TipoReferencia classeAssento;
    @XmlElement(name = "classe-tarifaria")
    protected TipoReferencia classeTarifaria;
    @XmlElement(name = "trechos-voo")
    protected TrechoVooList trechosVoo;

    /**
     * Gets the value of the idVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdVoo() {
        return idVoo;
    }

    /**
     * Sets the value of the idVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdVoo(String value) {
        this.idVoo = value;
    }

    /**
     * Gets the value of the aeroportoOrigemVoo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getAeroportoOrigemVoo() {
        return aeroportoOrigemVoo;
    }

    /**
     * Sets the value of the aeroportoOrigemVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setAeroportoOrigemVoo(TipoReferencia value) {
        this.aeroportoOrigemVoo = value;
    }

    /**
     * Gets the value of the dataOrigemVoo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOrigemVoo() {
        return dataOrigemVoo;
    }

    /**
     * Sets the value of the dataOrigemVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOrigemVoo(XMLGregorianCalendar value) {
        this.dataOrigemVoo = value;
    }

    /**
     * Gets the value of the aeroportoDestinoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getAeroportoDestinoVoo() {
        return aeroportoDestinoVoo;
    }

    /**
     * Sets the value of the aeroportoDestinoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setAeroportoDestinoVoo(TipoReferencia value) {
        this.aeroportoDestinoVoo = value;
    }

    /**
     * Gets the value of the dataChegadaVoo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegadaVoo() {
        return dataChegadaVoo;
    }

    /**
     * Sets the value of the dataChegadaVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegadaVoo(XMLGregorianCalendar value) {
        this.dataChegadaVoo = value;
    }

    /**
     * Gets the value of the classeAssento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getClasseAssento() {
        return classeAssento;
    }

    /**
     * Sets the value of the classeAssento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setClasseAssento(TipoReferencia value) {
        this.classeAssento = value;
    }

    /**
     * Gets the value of the classeTarifaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getClasseTarifaria() {
        return classeTarifaria;
    }

    /**
     * Sets the value of the classeTarifaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setClasseTarifaria(TipoReferencia value) {
        this.classeTarifaria = value;
    }

    /**
     * Gets the value of the trechosVoo property.
     * 
     * @return
     *     possible object is
     *     {@link TrechoVooList }
     *     
     */
    public TrechoVooList getTrechosVoo() {
        return trechosVoo;
    }

    /**
     * Sets the value of the trechosVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrechoVooList }
     *     
     */
    public void setTrechosVoo(TrechoVooList value) {
        this.trechosVoo = value;
    }

}
