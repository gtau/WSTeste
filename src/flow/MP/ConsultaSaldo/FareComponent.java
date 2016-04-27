
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FareComponent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-fare-component" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-saida-cidade-origem" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="cidade-destino" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-saida-cidade-destino" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="companhia-aerea-emissora" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="codigo-fare-basis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-tarifa" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="codigo-bundle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cabine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-voo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tier-temporada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mercado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="distancia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versao-tabela-dominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versao-tabela-precos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco-unitario" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponent", propOrder = {
    "idFareComponent",
    "cidadeOrigem",
    "dataSaidaCidadeOrigem",
    "cidadeDestino",
    "dataSaidaCidadeDestino",
    "companhiaAereaEmissora",
    "codigoFareBasis",
    "tipoTarifa",
    "codigoBundle",
    "cabine",
    "tipoVoo",
    "tierTemporada",
    "mercado",
    "distancia",
    "versaoTabelaDominio",
    "versaoTabelaPrecos",
    "precoUnitario"
})
public class FareComponent {

    @XmlElement(name = "id-fare-component")
    protected String idFareComponent;
    @XmlElement(name = "cidade-origem")
    protected TipoReferencia cidadeOrigem;
    @XmlElement(name = "data-saida-cidade-origem")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaidaCidadeOrigem;
    @XmlElement(name = "cidade-destino")
    protected TipoReferencia cidadeDestino;
    @XmlElement(name = "data-saida-cidade-destino")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaidaCidadeDestino;
    @XmlElement(name = "companhia-aerea-emissora")
    protected TipoReferencia companhiaAereaEmissora;
    @XmlElement(name = "codigo-fare-basis")
    protected String codigoFareBasis;
    @XmlElement(name = "tipo-tarifa")
    protected TipoReferencia tipoTarifa;
    @XmlElement(name = "codigo-bundle")
    protected String codigoBundle;
    protected String cabine;
    @XmlElement(name = "tipo-voo")
    protected String tipoVoo;
    @XmlElement(name = "tier-temporada")
    protected String tierTemporada;
    protected String mercado;
    protected String distancia;
    @XmlElement(name = "versao-tabela-dominio")
    protected String versaoTabelaDominio;
    @XmlElement(name = "versao-tabela-precos")
    protected String versaoTabelaPrecos;
    @XmlElement(name = "preco-unitario")
    protected Preco precoUnitario;

    /**
     * Gets the value of the idFareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFareComponent() {
        return idFareComponent;
    }

    /**
     * Sets the value of the idFareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFareComponent(String value) {
        this.idFareComponent = value;
    }

    /**
     * Gets the value of the cidadeOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCidadeOrigem() {
        return cidadeOrigem;
    }

    /**
     * Sets the value of the cidadeOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCidadeOrigem(TipoReferencia value) {
        this.cidadeOrigem = value;
    }

    /**
     * Gets the value of the dataSaidaCidadeOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaidaCidadeOrigem() {
        return dataSaidaCidadeOrigem;
    }

    /**
     * Sets the value of the dataSaidaCidadeOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaidaCidadeOrigem(XMLGregorianCalendar value) {
        this.dataSaidaCidadeOrigem = value;
    }

    /**
     * Gets the value of the cidadeDestino property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCidadeDestino() {
        return cidadeDestino;
    }

    /**
     * Sets the value of the cidadeDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCidadeDestino(TipoReferencia value) {
        this.cidadeDestino = value;
    }

    /**
     * Gets the value of the dataSaidaCidadeDestino property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaidaCidadeDestino() {
        return dataSaidaCidadeDestino;
    }

    /**
     * Sets the value of the dataSaidaCidadeDestino property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaidaCidadeDestino(XMLGregorianCalendar value) {
        this.dataSaidaCidadeDestino = value;
    }

    /**
     * Gets the value of the companhiaAereaEmissora property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCompanhiaAereaEmissora() {
        return companhiaAereaEmissora;
    }

    /**
     * Sets the value of the companhiaAereaEmissora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCompanhiaAereaEmissora(TipoReferencia value) {
        this.companhiaAereaEmissora = value;
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

    /**
     * Gets the value of the tipoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoTarifa() {
        return tipoTarifa;
    }

    /**
     * Sets the value of the tipoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoTarifa(TipoReferencia value) {
        this.tipoTarifa = value;
    }

    /**
     * Gets the value of the codigoBundle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBundle() {
        return codigoBundle;
    }

    /**
     * Sets the value of the codigoBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBundle(String value) {
        this.codigoBundle = value;
    }

    /**
     * Gets the value of the cabine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabine() {
        return cabine;
    }

    /**
     * Sets the value of the cabine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabine(String value) {
        this.cabine = value;
    }

    /**
     * Gets the value of the tipoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoVoo() {
        return tipoVoo;
    }

    /**
     * Sets the value of the tipoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoVoo(String value) {
        this.tipoVoo = value;
    }

    /**
     * Gets the value of the tierTemporada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierTemporada() {
        return tierTemporada;
    }

    /**
     * Sets the value of the tierTemporada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierTemporada(String value) {
        this.tierTemporada = value;
    }

    /**
     * Gets the value of the mercado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMercado() {
        return mercado;
    }

    /**
     * Sets the value of the mercado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMercado(String value) {
        this.mercado = value;
    }

    /**
     * Gets the value of the distancia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistancia() {
        return distancia;
    }

    /**
     * Sets the value of the distancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistancia(String value) {
        this.distancia = value;
    }

    /**
     * Gets the value of the versaoTabelaDominio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoTabelaDominio() {
        return versaoTabelaDominio;
    }

    /**
     * Sets the value of the versaoTabelaDominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoTabelaDominio(String value) {
        this.versaoTabelaDominio = value;
    }

    /**
     * Gets the value of the versaoTabelaPrecos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoTabelaPrecos() {
        return versaoTabelaPrecos;
    }

    /**
     * Sets the value of the versaoTabelaPrecos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoTabelaPrecos(String value) {
        this.versaoTabelaPrecos = value;
    }

    /**
     * Gets the value of the precoUnitario property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Sets the value of the precoUnitario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoUnitario(Preco value) {
        this.precoUnitario = value;
    }

}
