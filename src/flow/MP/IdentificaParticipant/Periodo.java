
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Periodo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Periodo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data-inicio" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-fim" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-hora-inicio" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-hora-fim" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="periodo-dias" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipo-periodo" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="periodo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="calendario" type="{http://ebo.multiplusfidelidade.com.br/v1}Calendario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Periodo", propOrder = {
    "dataInicio",
    "dataFim",
    "dataHoraInicio",
    "dataHoraFim",
    "periodoDias",
    "tipoPeriodo",
    "periodo",
    "calendario"
})
public class Periodo {

    @XmlElement(name = "data-inicio")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicio;
    @XmlElement(name = "data-fim")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFim;
    @XmlElement(name = "data-hora-inicio")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraInicio;
    @XmlElement(name = "data-hora-fim")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraFim;
    @XmlElement(name = "periodo-dias")
    protected Long periodoDias;
    @XmlElement(name = "tipo-periodo")
    protected TipoReferencia tipoPeriodo;
    protected Long periodo;
    protected Calendario calendario;

    /**
     * Gets the value of the dataInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicio() {
        return dataInicio;
    }

    /**
     * Sets the value of the dataInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicio(XMLGregorianCalendar value) {
        this.dataInicio = value;
    }

    /**
     * Gets the value of the dataFim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFim() {
        return dataFim;
    }

    /**
     * Sets the value of the dataFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFim(XMLGregorianCalendar value) {
        this.dataFim = value;
    }

    /**
     * Gets the value of the dataHoraInicio property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraInicio() {
        return dataHoraInicio;
    }

    /**
     * Sets the value of the dataHoraInicio property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraInicio(XMLGregorianCalendar value) {
        this.dataHoraInicio = value;
    }

    /**
     * Gets the value of the dataHoraFim property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraFim() {
        return dataHoraFim;
    }

    /**
     * Sets the value of the dataHoraFim property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraFim(XMLGregorianCalendar value) {
        this.dataHoraFim = value;
    }

    /**
     * Gets the value of the periodoDias property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodoDias() {
        return periodoDias;
    }

    /**
     * Sets the value of the periodoDias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodoDias(Long value) {
        this.periodoDias = value;
    }

    /**
     * Gets the value of the tipoPeriodo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoPeriodo() {
        return tipoPeriodo;
    }

    /**
     * Sets the value of the tipoPeriodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoPeriodo(TipoReferencia value) {
        this.tipoPeriodo = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodo(Long value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the calendario property.
     * 
     * @return
     *     possible object is
     *     {@link Calendario }
     *     
     */
    public Calendario getCalendario() {
        return calendario;
    }

    /**
     * Sets the value of the calendario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Calendario }
     *     
     */
    public void setCalendario(Calendario value) {
        this.calendario = value;
    }

}
