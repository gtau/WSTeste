
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de uma campanha de marketing relacionada ao participante, ou seja, a campanha que o participante aderiu.
 * 
 * <p>Java class for CampanhaParticipante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampanhaParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-campanha-participante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="campanha" type="{http://ebo.multiplusfidelidade.com.br/v1}Campanha" minOccurs="0"/>
 *         &lt;element name="data-hora-adesao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="situacao-campanha-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="propriedades-adesao" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="canal" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanhaParticipante", propOrder = {
    "idCampanhaParticipante",
    "participante",
    "campanha",
    "dataHoraAdesao",
    "situacaoCampanhaParticipante",
    "propriedadesAdesao",
    "canal"
})
public class CampanhaParticipante {

    @XmlElement(name = "id-campanha-participante")
    protected String idCampanhaParticipante;
    protected Participante participante;
    protected Campanha campanha;
    @XmlElement(name = "data-hora-adesao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraAdesao;
    @XmlElement(name = "situacao-campanha-participante")
    protected TipoReferencia situacaoCampanhaParticipante;
    @XmlElement(name = "propriedades-adesao")
    protected AtributoList propriedadesAdesao;
    protected Canal canal;

    /**
     * Gets the value of the idCampanhaParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCampanhaParticipante() {
        return idCampanhaParticipante;
    }

    /**
     * Sets the value of the idCampanhaParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCampanhaParticipante(String value) {
        this.idCampanhaParticipante = value;
    }

    /**
     * Gets the value of the participante property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * Sets the value of the participante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipante(Participante value) {
        this.participante = value;
    }

    /**
     * Gets the value of the campanha property.
     * 
     * @return
     *     possible object is
     *     {@link Campanha }
     *     
     */
    public Campanha getCampanha() {
        return campanha;
    }

    /**
     * Sets the value of the campanha property.
     * 
     * @param value
     *     allowed object is
     *     {@link Campanha }
     *     
     */
    public void setCampanha(Campanha value) {
        this.campanha = value;
    }

    /**
     * Gets the value of the dataHoraAdesao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraAdesao() {
        return dataHoraAdesao;
    }

    /**
     * Sets the value of the dataHoraAdesao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraAdesao(XMLGregorianCalendar value) {
        this.dataHoraAdesao = value;
    }

    /**
     * Gets the value of the situacaoCampanhaParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoCampanhaParticipante() {
        return situacaoCampanhaParticipante;
    }

    /**
     * Sets the value of the situacaoCampanhaParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoCampanhaParticipante(TipoReferencia value) {
        this.situacaoCampanhaParticipante = value;
    }

    /**
     * Gets the value of the propriedadesAdesao property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getPropriedadesAdesao() {
        return propriedadesAdesao;
    }

    /**
     * Sets the value of the propriedadesAdesao property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setPropriedadesAdesao(AtributoList value) {
        this.propriedadesAdesao = value;
    }

    /**
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanal(Canal value) {
        this.canal = value;
    }

}
