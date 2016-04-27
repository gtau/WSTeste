
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representação de um endereço de correspondência, de acordo com o padrão dos Correios
 * 
 * <p>Java class for Endereco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Endereco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefixo-logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logradouro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bairro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caixa-postal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uf" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-endereco" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="coordenada-geografica-x" type="{http://ebo.multiplusfidelidade.com.br/v1}CoordenadaGeografica" minOccurs="0"/>
 *         &lt;element name="coordenada-geografica-y" type="{http://ebo.multiplusfidelidade.com.br/v1}CoordenadaGeografica" minOccurs="0"/>
 *         &lt;element name="indicador-principal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="geolocalizacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Geolocalizacao" minOccurs="0"/>
 *         &lt;element name="bairro-cep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ponto-de-referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Endereco", propOrder = {
    "idEndereco",
    "prefixoLogradouro",
    "logradouro",
    "numero",
    "complemento",
    "bairro",
    "caixaPostal",
    "cidade",
    "uf",
    "cep",
    "pais",
    "tipoEndereco",
    "coordenadaGeograficaX",
    "coordenadaGeograficaY",
    "indicadorPrincipal",
    "geolocalizacao",
    "bairroCep",
    "pontoDeReferencia"
})
public class Endereco {

    @XmlElement(name = "id-endereco")
    protected String idEndereco;
    @XmlElement(name = "prefixo-logradouro")
    protected String prefixoLogradouro;
    protected String logradouro;
    protected String numero;
    protected String complemento;
    protected String bairro;
    @XmlElement(name = "caixa-postal")
    protected String caixaPostal;
    protected String cidade;
    protected String uf;
    protected String cep;
    protected String pais;
    @XmlElement(name = "tipo-endereco")
    protected TipoReferencia tipoEndereco;
    @XmlElement(name = "coordenada-geografica-x")
    protected Double coordenadaGeograficaX;
    @XmlElement(name = "coordenada-geografica-y")
    protected Double coordenadaGeograficaY;
    @XmlElement(name = "indicador-principal")
    protected Boolean indicadorPrincipal;
    protected Geolocalizacao geolocalizacao;
    @XmlElement(name = "bairro-cep")
    protected String bairroCep;
    @XmlElement(name = "ponto-de-referencia")
    protected String pontoDeReferencia;

    /**
     * Gets the value of the idEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEndereco() {
        return idEndereco;
    }

    /**
     * Sets the value of the idEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEndereco(String value) {
        this.idEndereco = value;
    }

    /**
     * Gets the value of the prefixoLogradouro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixoLogradouro() {
        return prefixoLogradouro;
    }

    /**
     * Sets the value of the prefixoLogradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixoLogradouro(String value) {
        this.prefixoLogradouro = value;
    }

    /**
     * Gets the value of the logradouro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Sets the value of the logradouro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogradouro(String value) {
        this.logradouro = value;
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
     * Gets the value of the complemento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Sets the value of the complemento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplemento(String value) {
        this.complemento = value;
    }

    /**
     * Gets the value of the bairro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Sets the value of the bairro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairro(String value) {
        this.bairro = value;
    }

    /**
     * Gets the value of the caixaPostal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaixaPostal() {
        return caixaPostal;
    }

    /**
     * Sets the value of the caixaPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaixaPostal(String value) {
        this.caixaPostal = value;
    }

    /**
     * Gets the value of the cidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Sets the value of the cidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidade(String value) {
        this.cidade = value;
    }

    /**
     * Gets the value of the uf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUf() {
        return uf;
    }

    /**
     * Sets the value of the uf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUf(String value) {
        this.uf = value;
    }

    /**
     * Gets the value of the cep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCep() {
        return cep;
    }

    /**
     * Sets the value of the cep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCep(String value) {
        this.cep = value;
    }

    /**
     * Gets the value of the pais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPais() {
        return pais;
    }

    /**
     * Sets the value of the pais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPais(String value) {
        this.pais = value;
    }

    /**
     * Gets the value of the tipoEndereco property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoEndereco() {
        return tipoEndereco;
    }

    /**
     * Sets the value of the tipoEndereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoEndereco(TipoReferencia value) {
        this.tipoEndereco = value;
    }

    /**
     * Gets the value of the coordenadaGeograficaX property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordenadaGeograficaX() {
        return coordenadaGeograficaX;
    }

    /**
     * Sets the value of the coordenadaGeograficaX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordenadaGeograficaX(Double value) {
        this.coordenadaGeograficaX = value;
    }

    /**
     * Gets the value of the coordenadaGeograficaY property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCoordenadaGeograficaY() {
        return coordenadaGeograficaY;
    }

    /**
     * Sets the value of the coordenadaGeograficaY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCoordenadaGeograficaY(Double value) {
        this.coordenadaGeograficaY = value;
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
     * Gets the value of the geolocalizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Geolocalizacao }
     *     
     */
    public Geolocalizacao getGeolocalizacao() {
        return geolocalizacao;
    }

    /**
     * Sets the value of the geolocalizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Geolocalizacao }
     *     
     */
    public void setGeolocalizacao(Geolocalizacao value) {
        this.geolocalizacao = value;
    }

    /**
     * Gets the value of the bairroCep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBairroCep() {
        return bairroCep;
    }

    /**
     * Sets the value of the bairroCep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBairroCep(String value) {
        this.bairroCep = value;
    }

    /**
     * Gets the value of the pontoDeReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    /**
     * Sets the value of the pontoDeReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPontoDeReferencia(String value) {
        this.pontoDeReferencia = value;
    }

}
