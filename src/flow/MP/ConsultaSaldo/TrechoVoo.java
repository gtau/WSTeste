
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TrechoVoo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrechoVoo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-trecho-voo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-trecho-voo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao-trecho-voo" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="aeroporto-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-saida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="aeroporto-destino" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-chegada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="companhia-aerea-operadora" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="classe-assento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="codigo-classe-tarifaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companhia-aerea-marketing" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="codigo-fare-basis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrechoVoo", propOrder = {
    "idTrechoVoo",
    "codigoTrechoVoo",
    "situacaoTrechoVoo",
    "aeroportoOrigem",
    "dataSaida",
    "aeroportoDestino",
    "dataChegada",
    "companhiaAereaOperadora",
    "classeAssento",
    "codigoClasseTarifaria",
    "companhiaAereaMarketing",
    "codigoFareBasis"
})
public class TrechoVoo {

    @XmlElement(name = "id-trecho-voo")
    protected String idTrechoVoo;
    @XmlElement(name = "codigo-trecho-voo")
    protected String codigoTrechoVoo;
    @XmlElement(name = "situacao-trecho-voo")
    protected Situacao situacaoTrechoVoo;
    @XmlElement(name = "aeroporto-origem")
    protected TipoReferencia aeroportoOrigem;
    @XmlElement(name = "data-saida")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    @XmlElement(name = "aeroporto-destino")
    protected TipoReferencia aeroportoDestino;
    @XmlElement(name = "data-chegada")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataChegada;
    @XmlElement(name = "companhia-aerea-operadora")
    protected TipoReferencia companhiaAereaOperadora;
    @XmlElement(name = "classe-assento")
    protected TipoReferencia classeAssento;
    @XmlElement(name = "codigo-classe-tarifaria")
    protected String codigoClasseTarifaria;
    @XmlElement(name = "companhia-aerea-marketing")
    protected TipoReferencia companhiaAereaMarketing;
    @XmlElement(name = "codigo-fare-basis")
    protected String codigoFareBasis;

    /**
     * Gets the value of the idTrechoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTrechoVoo() {
        return idTrechoVoo;
    }

    /**
     * Sets the value of the idTrechoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTrechoVoo(String value) {
        this.idTrechoVoo = value;
    }

    /**
     * Gets the value of the codigoTrechoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTrechoVoo() {
        return codigoTrechoVoo;
    }

    /**
     * Sets the value of the codigoTrechoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTrechoVoo(String value) {
        this.codigoTrechoVoo = value;
    }

    /**
     * Gets the value of the situacaoTrechoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoTrechoVoo() {
        return situacaoTrechoVoo;
    }

    /**
     * Sets the value of the situacaoTrechoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoTrechoVoo(Situacao value) {
        this.situacaoTrechoVoo = value;
    }

    /**
     * Gets the value of the aeroportoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    /**
     * Sets the value of the aeroportoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setAeroportoOrigem(TipoReferencia value) {
        this.aeroportoOrigem = value;
    }

    /**
     * Gets the value of the dataSaida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Sets the value of the dataSaida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Gets the value of the aeroportoDestino property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getAeroportoDestino() {
        return aeroportoDestino;
    }

    /**
     * Sets the value of the aeroportoDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setAeroportoDestino(TipoReferencia value) {
        this.aeroportoDestino = value;
    }

    /**
     * Gets the value of the dataChegada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataChegada() {
        return dataChegada;
    }

    /**
     * Sets the value of the dataChegada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataChegada(XMLGregorianCalendar value) {
        this.dataChegada = value;
    }

    /**
     * Gets the value of the companhiaAereaOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCompanhiaAereaOperadora() {
        return companhiaAereaOperadora;
    }

    /**
     * Sets the value of the companhiaAereaOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCompanhiaAereaOperadora(TipoReferencia value) {
        this.companhiaAereaOperadora = value;
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
     * Gets the value of the codigoClasseTarifaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoClasseTarifaria() {
        return codigoClasseTarifaria;
    }

    /**
     * Sets the value of the codigoClasseTarifaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoClasseTarifaria(String value) {
        this.codigoClasseTarifaria = value;
    }

    /**
     * Gets the value of the companhiaAereaMarketing property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCompanhiaAereaMarketing() {
        return companhiaAereaMarketing;
    }

    /**
     * Sets the value of the companhiaAereaMarketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCompanhiaAereaMarketing(TipoReferencia value) {
        this.companhiaAereaMarketing = value;
    }

    /**
     * Gets the value of the codigoFareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFareBasis() {
        return codigoFareBasis;
    }

    /**
     * Sets the value of the codigoFareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFareBasis(String value) {
        this.codigoFareBasis = value;
    }

}
