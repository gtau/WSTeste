
package flow.MP.RedefineSenha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Telefone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Telefone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-telefone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero-telefone" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroTelefone" minOccurs="0"/>
 *         &lt;element name="codigo-pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-area" type="{http://ebo.multiplusfidelidade.com.br/v1}CodigoArea" minOccurs="0"/>
 *         &lt;element name="numero-local" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroTelefone" minOccurs="0"/>
 *         &lt;element name="numero-internacional" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroTelefone" minOccurs="0"/>
 *         &lt;element name="numero-especial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ramal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-telefone" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="indicador-principal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-hora-efetivacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-hora-expiracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nome-operadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-enriquecido-bureau" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indicador-telefone-movel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Telefone", propOrder = {
    "idTelefone",
    "numeroTelefone",
    "codigoPais",
    "codigoArea",
    "numeroLocal",
    "numeroInternacional",
    "numeroEspecial",
    "ramal",
    "tipoTelefone",
    "indicadorPrincipal",
    "dataHoraEfetivacao",
    "dataHoraExpiracao",
    "nomeOperadora",
    "indicadorEnriquecidoBureau",
    "indicadorTelefoneMovel"
})
public class Telefone {

    @XmlElement(name = "id-telefone")
    protected String idTelefone;
    @XmlElement(name = "numero-telefone")
    protected String numeroTelefone;
    @XmlElement(name = "codigo-pais")
    protected String codigoPais;
    @XmlElement(name = "codigo-area")
    protected String codigoArea;
    @XmlElement(name = "numero-local")
    protected String numeroLocal;
    @XmlElement(name = "numero-internacional")
    protected String numeroInternacional;
    @XmlElement(name = "numero-especial")
    protected String numeroEspecial;
    protected String ramal;
    @XmlElement(name = "tipo-telefone")
    protected TipoReferencia tipoTelefone;
    @XmlElement(name = "indicador-principal")
    protected Boolean indicadorPrincipal;
    @XmlElement(name = "data-hora-efetivacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraEfetivacao;
    @XmlElement(name = "data-hora-expiracao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraExpiracao;
    @XmlElement(name = "nome-operadora")
    protected String nomeOperadora;
    @XmlElement(name = "indicador-enriquecido-bureau")
    protected Boolean indicadorEnriquecidoBureau;
    @XmlElement(name = "indicador-telefone-movel")
    protected Boolean indicadorTelefoneMovel;

    /**
     * Gets the value of the idTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTelefone() {
        return idTelefone;
    }

    /**
     * Sets the value of the idTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTelefone(String value) {
        this.idTelefone = value;
    }

    /**
     * Gets the value of the numeroTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    /**
     * Sets the value of the numeroTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTelefone(String value) {
        this.numeroTelefone = value;
    }

    /**
     * Gets the value of the codigoPais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPais() {
        return codigoPais;
    }

    /**
     * Sets the value of the codigoPais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPais(String value) {
        this.codigoPais = value;
    }

    /**
     * Gets the value of the codigoArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoArea() {
        return codigoArea;
    }

    /**
     * Sets the value of the codigoArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoArea(String value) {
        this.codigoArea = value;
    }

    /**
     * Gets the value of the numeroLocal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLocal() {
        return numeroLocal;
    }

    /**
     * Sets the value of the numeroLocal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLocal(String value) {
        this.numeroLocal = value;
    }

    /**
     * Gets the value of the numeroInternacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroInternacional() {
        return numeroInternacional;
    }

    /**
     * Sets the value of the numeroInternacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroInternacional(String value) {
        this.numeroInternacional = value;
    }

    /**
     * Gets the value of the numeroEspecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEspecial() {
        return numeroEspecial;
    }

    /**
     * Sets the value of the numeroEspecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEspecial(String value) {
        this.numeroEspecial = value;
    }

    /**
     * Gets the value of the ramal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRamal() {
        return ramal;
    }

    /**
     * Sets the value of the ramal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRamal(String value) {
        this.ramal = value;
    }

    /**
     * Gets the value of the tipoTelefone property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoTelefone() {
        return tipoTelefone;
    }

    /**
     * Sets the value of the tipoTelefone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoTelefone(TipoReferencia value) {
        this.tipoTelefone = value;
    }

    /**
     * Gets the value of the indicadorPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorPrincipal() {
        return indicadorPrincipal;
    }

    /**
     * Sets the value of the indicadorPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorPrincipal(Boolean value) {
        this.indicadorPrincipal = value;
    }

    /**
     * Gets the value of the dataHoraEfetivacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraEfetivacao() {
        return dataHoraEfetivacao;
    }

    /**
     * Sets the value of the dataHoraEfetivacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraEfetivacao(XMLGregorianCalendar value) {
        this.dataHoraEfetivacao = value;
    }

    /**
     * Gets the value of the dataHoraExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraExpiracao() {
        return dataHoraExpiracao;
    }

    /**
     * Sets the value of the dataHoraExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraExpiracao(XMLGregorianCalendar value) {
        this.dataHoraExpiracao = value;
    }

    /**
     * Gets the value of the nomeOperadora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOperadora() {
        return nomeOperadora;
    }

    /**
     * Sets the value of the nomeOperadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOperadora(String value) {
        this.nomeOperadora = value;
    }

    /**
     * Gets the value of the indicadorEnriquecidoBureau property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorEnriquecidoBureau() {
        return indicadorEnriquecidoBureau;
    }

    /**
     * Sets the value of the indicadorEnriquecidoBureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorEnriquecidoBureau(Boolean value) {
        this.indicadorEnriquecidoBureau = value;
    }

    /**
     * Gets the value of the indicadorTelefoneMovel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorTelefoneMovel() {
        return indicadorTelefoneMovel;
    }

    /**
     * Sets the value of the indicadorTelefoneMovel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorTelefoneMovel(Boolean value) {
        this.indicadorTelefoneMovel = value;
    }

}
