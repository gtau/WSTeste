
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Sku complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sku">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-sku" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-curta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco-de" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="estoque" type="{http://ebo.multiplusfidelidade.com.br/v1}Estoque" minOccurs="0"/>
 *         &lt;element name="caracteristicas-sku" type="{http://ebo.multiplusfidelidade.com.br/v1}ConfiguracaoList" minOccurs="0"/>
 *         &lt;element name="produto-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Produto" minOccurs="0"/>
 *         &lt;element name="sku-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Sku" minOccurs="0"/>
 *         &lt;element name="url-imagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagens" type="{http://ebo.multiplusfidelidade.com.br/v1}ImagemList" minOccurs="0"/>
 *         &lt;element name="produto-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}Produto" minOccurs="0"/>
 *         &lt;element name="indicador-ativo" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sku", propOrder = {
    "idSku",
    "nomeSku",
    "descricao",
    "descricaoCurta",
    "precoDe",
    "preco",
    "estoque",
    "caracteristicasSku",
    "produtoReferencia",
    "skuParceiro",
    "urlImagem",
    "imagens",
    "produtoFidelidade",
    "indicadorAtivo"
})
public class Sku {

    @XmlElement(name = "id-sku")
    protected String idSku;
    @XmlElement(name = "nome-sku")
    protected String nomeSku;
    protected String descricao;
    @XmlElement(name = "descricao-curta")
    protected String descricaoCurta;
    @XmlElement(name = "preco-de")
    protected Preco precoDe;
    protected Preco preco;
    protected Estoque estoque;
    @XmlElement(name = "caracteristicas-sku")
    protected ConfiguracaoList caracteristicasSku;
    @XmlElement(name = "produto-referencia")
    protected Produto produtoReferencia;
    @XmlElement(name = "sku-parceiro")
    protected Sku skuParceiro;
    @XmlElement(name = "url-imagem")
    protected String urlImagem;
    protected ImagemList imagens;
    @XmlElement(name = "produto-fidelidade")
    protected Produto produtoFidelidade;
    @XmlElement(name = "indicador-ativo")
    protected Boolean indicadorAtivo;

    /**
     * Gets the value of the idSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSku() {
        return idSku;
    }

    /**
     * Sets the value of the idSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSku(String value) {
        this.idSku = value;
    }

    /**
     * Gets the value of the nomeSku property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSku() {
        return nomeSku;
    }

    /**
     * Sets the value of the nomeSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSku(String value) {
        this.nomeSku = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the descricaoCurta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    /**
     * Sets the value of the descricaoCurta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCurta(String value) {
        this.descricaoCurta = value;
    }

    /**
     * Gets the value of the precoDe property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoDe() {
        return precoDe;
    }

    /**
     * Sets the value of the precoDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoDe(Preco value) {
        this.precoDe = value;
    }

    /**
     * Gets the value of the preco property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPreco() {
        return preco;
    }

    /**
     * Sets the value of the preco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPreco(Preco value) {
        this.preco = value;
    }

    /**
     * Gets the value of the estoque property.
     * 
     * @return
     *     possible object is
     *     {@link Estoque }
     *     
     */
    public Estoque getEstoque() {
        return estoque;
    }

    /**
     * Sets the value of the estoque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Estoque }
     *     
     */
    public void setEstoque(Estoque value) {
        this.estoque = value;
    }

    /**
     * Gets the value of the caracteristicasSku property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoList }
     *     
     */
    public ConfiguracaoList getCaracteristicasSku() {
        return caracteristicasSku;
    }

    /**
     * Sets the value of the caracteristicasSku property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoList }
     *     
     */
    public void setCaracteristicasSku(ConfiguracaoList value) {
        this.caracteristicasSku = value;
    }

    /**
     * Gets the value of the produtoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProdutoReferencia() {
        return produtoReferencia;
    }

    /**
     * Sets the value of the produtoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProdutoReferencia(Produto value) {
        this.produtoReferencia = value;
    }

    /**
     * Gets the value of the skuParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Sku }
     *     
     */
    public Sku getSkuParceiro() {
        return skuParceiro;
    }

    /**
     * Sets the value of the skuParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku }
     *     
     */
    public void setSkuParceiro(Sku value) {
        this.skuParceiro = value;
    }

    /**
     * Gets the value of the urlImagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Sets the value of the urlImagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

    /**
     * Gets the value of the imagens property.
     * 
     * @return
     *     possible object is
     *     {@link ImagemList }
     *     
     */
    public ImagemList getImagens() {
        return imagens;
    }

    /**
     * Sets the value of the imagens property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagemList }
     *     
     */
    public void setImagens(ImagemList value) {
        this.imagens = value;
    }

    /**
     * Gets the value of the produtoFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProdutoFidelidade() {
        return produtoFidelidade;
    }

    /**
     * Sets the value of the produtoFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProdutoFidelidade(Produto value) {
        this.produtoFidelidade = value;
    }

    /**
     * Gets the value of the indicadorAtivo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAtivo() {
        return indicadorAtivo;
    }

    /**
     * Sets the value of the indicadorAtivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAtivo(Boolean value) {
        this.indicadorAtivo = value;
    }

}
