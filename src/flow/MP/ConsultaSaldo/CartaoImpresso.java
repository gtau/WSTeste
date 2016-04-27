
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CartaoImpresso complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CartaoImpresso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-cartao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="nome-titular-impresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bandeira" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-verificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes-expiracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ano-expiracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-adesao-compra-um-clique" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-ultima-utilizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="pais-emissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituicao-emissora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria-cartao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CartaoImpresso", propOrder = {
    "idCartao",
    "tipoCartao",
    "nomeTitularImpresso",
    "bandeira",
    "numero",
    "codigoVerificacao",
    "mesExpiracao",
    "anoExpiracao",
    "indicadorAdesaoCompraUmClique",
    "dataUltimaUtilizacao",
    "paisEmissao",
    "instituicaoEmissora",
    "categoriaCartao"
})
public class CartaoImpresso {

    @XmlElement(name = "id-cartao")
    protected String idCartao;
    @XmlElement(name = "tipo-cartao")
    protected TipoReferencia tipoCartao;
    @XmlElement(name = "nome-titular-impresso")
    protected String nomeTitularImpresso;
    protected TipoReferencia bandeira;
    protected String numero;
    @XmlElement(name = "codigo-verificacao")
    protected String codigoVerificacao;
    @XmlElement(name = "mes-expiracao")
    protected String mesExpiracao;
    @XmlElement(name = "ano-expiracao")
    protected String anoExpiracao;
    @XmlElement(name = "indicador-adesao-compra-um-clique")
    protected Boolean indicadorAdesaoCompraUmClique;
    @XmlElement(name = "data-ultima-utilizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltimaUtilizacao;
    @XmlElement(name = "pais-emissao")
    protected String paisEmissao;
    @XmlElement(name = "instituicao-emissora")
    protected String instituicaoEmissora;
    @XmlElement(name = "categoria-cartao")
    protected String categoriaCartao;

    /**
     * Gets the value of the idCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCartao() {
        return idCartao;
    }

    /**
     * Sets the value of the idCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCartao(String value) {
        this.idCartao = value;
    }

    /**
     * Gets the value of the tipoCartao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoCartao() {
        return tipoCartao;
    }

    /**
     * Sets the value of the tipoCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoCartao(TipoReferencia value) {
        this.tipoCartao = value;
    }

    /**
     * Gets the value of the nomeTitularImpresso property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeTitularImpresso() {
        return nomeTitularImpresso;
    }

    /**
     * Sets the value of the nomeTitularImpresso property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeTitularImpresso(String value) {
        this.nomeTitularImpresso = value;
    }

    /**
     * Gets the value of the bandeira property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getBandeira() {
        return bandeira;
    }

    /**
     * Sets the value of the bandeira property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setBandeira(TipoReferencia value) {
        this.bandeira = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
    }

    /**
     * Gets the value of the codigoVerificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    /**
     * Sets the value of the codigoVerificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoVerificacao(String value) {
        this.codigoVerificacao = value;
    }

    /**
     * Gets the value of the mesExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesExpiracao() {
        return mesExpiracao;
    }

    /**
     * Sets the value of the mesExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesExpiracao(String value) {
        this.mesExpiracao = value;
    }

    /**
     * Gets the value of the anoExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnoExpiracao() {
        return anoExpiracao;
    }

    /**
     * Sets the value of the anoExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnoExpiracao(String value) {
        this.anoExpiracao = value;
    }

    /**
     * Gets the value of the indicadorAdesaoCompraUmClique property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAdesaoCompraUmClique() {
        return indicadorAdesaoCompraUmClique;
    }

    /**
     * Sets the value of the indicadorAdesaoCompraUmClique property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAdesaoCompraUmClique(Boolean value) {
        this.indicadorAdesaoCompraUmClique = value;
    }

    /**
     * Gets the value of the dataUltimaUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaUtilizacao() {
        return dataUltimaUtilizacao;
    }

    /**
     * Sets the value of the dataUltimaUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaUtilizacao(XMLGregorianCalendar value) {
        this.dataUltimaUtilizacao = value;
    }

    /**
     * Gets the value of the paisEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaisEmissao() {
        return paisEmissao;
    }

    /**
     * Sets the value of the paisEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaisEmissao(String value) {
        this.paisEmissao = value;
    }

    /**
     * Gets the value of the instituicaoEmissora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituicaoEmissora() {
        return instituicaoEmissora;
    }

    /**
     * Sets the value of the instituicaoEmissora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituicaoEmissora(String value) {
        this.instituicaoEmissora = value;
    }

    /**
     * Gets the value of the categoriaCartao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoriaCartao() {
        return categoriaCartao;
    }

    /**
     * Sets the value of the categoriaCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoriaCartao(String value) {
        this.categoriaCartao = value;
    }

}
