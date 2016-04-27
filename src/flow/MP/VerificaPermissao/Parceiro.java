
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Parceiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Parceiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-parceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-parceiro-cad" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *         &lt;element name="id-parceiro-faturamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *         &lt;element name="id-parceiro-site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-parceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-parceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dados-cadastrais-pj" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPJ" minOccurs="0"/>
 *         &lt;element name="url-logotipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistema" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *         &lt;element name="enderecos" type="{http://ebo.multiplusfidelidade.com.br/v1}EnderecoList" minOccurs="0"/>
 *         &lt;element name="cota-diaria-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}Cota" minOccurs="0"/>
 *         &lt;element name="cota-padrao-operador-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}Cota" minOccurs="0"/>
 *         &lt;element name="situacao" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoParceiro" minOccurs="0"/>
 *         &lt;element name="contatos" type="{http://ebo.multiplusfidelidade.com.br/v1}ContatoList" minOccurs="0"/>
 *         &lt;element name="url-site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caracteristicas-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="chave-publica-pgp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parceiro", propOrder = {
    "idParceiro",
    "idParceiroCad",
    "idParceiroFaturamento",
    "idParceiroSite",
    "codigoParceiro",
    "nomeParceiro",
    "dadosCadastraisPj",
    "urlLogotipo",
    "sistema",
    "enderecos",
    "cotaDiariaPontos",
    "cotaPadraoOperadorPontos",
    "situacao",
    "contatos",
    "urlSite",
    "caracteristicasParceiro",
    "chavePublicaPgp"
})
public class Parceiro {

    @XmlElement(name = "id-parceiro")
    protected String idParceiro;
    @XmlElement(name = "id-parceiro-cad")
    protected Identificador idParceiroCad;
    @XmlElement(name = "id-parceiro-faturamento")
    protected Identificador idParceiroFaturamento;
    @XmlElement(name = "id-parceiro-site")
    protected String idParceiroSite;
    @XmlElement(name = "codigo-parceiro")
    protected String codigoParceiro;
    @XmlElement(name = "nome-parceiro")
    protected String nomeParceiro;
    @XmlElement(name = "dados-cadastrais-pj")
    protected DadosCadastraisPJ dadosCadastraisPj;
    @XmlElement(name = "url-logotipo")
    protected String urlLogotipo;
    protected Sistema sistema;
    protected EnderecoList enderecos;
    @XmlElement(name = "cota-diaria-pontos")
    protected Cota cotaDiariaPontos;
    @XmlElement(name = "cota-padrao-operador-pontos")
    protected Cota cotaPadraoOperadorPontos;
    protected SituacaoParceiro situacao;
    protected ContatoList contatos;
    @XmlElement(name = "url-site")
    protected String urlSite;
    @XmlElement(name = "caracteristicas-parceiro")
    protected TipoReferenciaList caracteristicasParceiro;
    @XmlElement(name = "chave-publica-pgp")
    protected String chavePublicaPgp;

    /**
     * Gets the value of the idParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdParceiro() {
        return idParceiro;
    }

    /**
     * Sets the value of the idParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdParceiro(String value) {
        this.idParceiro = value;
    }

    /**
     * Gets the value of the idParceiroCad property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getIdParceiroCad() {
        return idParceiroCad;
    }

    /**
     * Sets the value of the idParceiroCad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setIdParceiroCad(Identificador value) {
        this.idParceiroCad = value;
    }

    /**
     * Gets the value of the idParceiroFaturamento property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getIdParceiroFaturamento() {
        return idParceiroFaturamento;
    }

    /**
     * Sets the value of the idParceiroFaturamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setIdParceiroFaturamento(Identificador value) {
        this.idParceiroFaturamento = value;
    }

    /**
     * Gets the value of the idParceiroSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdParceiroSite() {
        return idParceiroSite;
    }

    /**
     * Sets the value of the idParceiroSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdParceiroSite(String value) {
        this.idParceiroSite = value;
    }

    /**
     * Gets the value of the codigoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoParceiro() {
        return codigoParceiro;
    }

    /**
     * Sets the value of the codigoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoParceiro(String value) {
        this.codigoParceiro = value;
    }

    /**
     * Gets the value of the nomeParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeParceiro() {
        return nomeParceiro;
    }

    /**
     * Sets the value of the nomeParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeParceiro(String value) {
        this.nomeParceiro = value;
    }

    /**
     * Gets the value of the dadosCadastraisPj property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPJ }
     *     
     */
    public DadosCadastraisPJ getDadosCadastraisPj() {
        return dadosCadastraisPj;
    }

    /**
     * Sets the value of the dadosCadastraisPj property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPJ }
     *     
     */
    public void setDadosCadastraisPj(DadosCadastraisPJ value) {
        this.dadosCadastraisPj = value;
    }

    /**
     * Gets the value of the urlLogotipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLogotipo() {
        return urlLogotipo;
    }

    /**
     * Sets the value of the urlLogotipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLogotipo(String value) {
        this.urlLogotipo = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistema(Sistema value) {
        this.sistema = value;
    }

    /**
     * Gets the value of the enderecos property.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoList }
     *     
     */
    public EnderecoList getEnderecos() {
        return enderecos;
    }

    /**
     * Sets the value of the enderecos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoList }
     *     
     */
    public void setEnderecos(EnderecoList value) {
        this.enderecos = value;
    }

    /**
     * Gets the value of the cotaDiariaPontos property.
     * 
     * @return
     *     possible object is
     *     {@link Cota }
     *     
     */
    public Cota getCotaDiariaPontos() {
        return cotaDiariaPontos;
    }

    /**
     * Sets the value of the cotaDiariaPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cota }
     *     
     */
    public void setCotaDiariaPontos(Cota value) {
        this.cotaDiariaPontos = value;
    }

    /**
     * Gets the value of the cotaPadraoOperadorPontos property.
     * 
     * @return
     *     possible object is
     *     {@link Cota }
     *     
     */
    public Cota getCotaPadraoOperadorPontos() {
        return cotaPadraoOperadorPontos;
    }

    /**
     * Sets the value of the cotaPadraoOperadorPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cota }
     *     
     */
    public void setCotaPadraoOperadorPontos(Cota value) {
        this.cotaPadraoOperadorPontos = value;
    }

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoParceiro }
     *     
     */
    public SituacaoParceiro getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoParceiro }
     *     
     */
    public void setSituacao(SituacaoParceiro value) {
        this.situacao = value;
    }

    /**
     * Gets the value of the contatos property.
     * 
     * @return
     *     possible object is
     *     {@link ContatoList }
     *     
     */
    public ContatoList getContatos() {
        return contatos;
    }

    /**
     * Sets the value of the contatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContatoList }
     *     
     */
    public void setContatos(ContatoList value) {
        this.contatos = value;
    }

    /**
     * Gets the value of the urlSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlSite() {
        return urlSite;
    }

    /**
     * Sets the value of the urlSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlSite(String value) {
        this.urlSite = value;
    }

    /**
     * Gets the value of the caracteristicasParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferenciaList }
     *     
     */
    public TipoReferenciaList getCaracteristicasParceiro() {
        return caracteristicasParceiro;
    }

    /**
     * Sets the value of the caracteristicasParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferenciaList }
     *     
     */
    public void setCaracteristicasParceiro(TipoReferenciaList value) {
        this.caracteristicasParceiro = value;
    }

    /**
     * Gets the value of the chavePublicaPgp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChavePublicaPgp() {
        return chavePublicaPgp;
    }

    /**
     * Sets the value of the chavePublicaPgp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChavePublicaPgp(String value) {
        this.chavePublicaPgp = value;
    }

}
