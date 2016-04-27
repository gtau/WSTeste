
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação das informações de referência de um produto que pode ser resgatado na Multiplus.
 * 			As características variáveis de um mesmo produto, como cor, voltagem, acabamento, etc., são definidas
 * 			no contexto de uma entidade Sku, e Produto contém apenas as informações que são comuns a todos os Skus
 * 			de um produto
 * 
 * <p>Java class for Produto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Produto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lista-ids" type="{http://ebo.multiplusfidelidade.com.br/v1}IdentificadorList" minOccurs="0"/>
 *         &lt;element name="nome-produto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-curta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-produto" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="configuracoes-produto" type="{http://ebo.multiplusfidelidade.com.br/v1}ConfiguracaoList" minOccurs="0"/>
 *         &lt;element name="skus" type="{http://ebo.multiplusfidelidade.com.br/v1}SkuList" minOccurs="0"/>
 *         &lt;element name="categoria" type="{http://ebo.multiplusfidelidade.com.br/v1}Categoria" minOccurs="0"/>
 *         &lt;element name="produto-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Produto" minOccurs="0"/>
 *         &lt;element name="data-hora-efetivacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-hora-expiracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="url-imagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacoes-importantes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogo" type="{http://ebo.multiplusfidelidade.com.br/v1}Catalogo" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="imagens" type="{http://ebo.multiplusfidelidade.com.br/v1}ImagemList" minOccurs="0"/>
 *         &lt;element name="parametros-catalogo-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}ParametrosCatalogoFidelidade" minOccurs="0"/>
 *         &lt;element name="produto-voucher" type="{http://ebo.multiplusfidelidade.com.br/v1}Voucher" minOccurs="0"/>
 *         &lt;element name="listas-de-precos" type="{http://ebo.multiplusfidelidade.com.br/v1}ListaDePrecosList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Produto", propOrder = {
    "idProduto",
    "codigoProduto",
    "listaIds",
    "nomeProduto",
    "descricao",
    "descricaoCurta",
    "tipoProduto",
    "configuracoesProduto",
    "skus",
    "categoria",
    "produtoParceiro",
    "dataHoraEfetivacao",
    "dataHoraExpiracao",
    "urlImagem",
    "informacoesImportantes",
    "catalogo",
    "parceiro",
    "imagens",
    "parametrosCatalogoFidelidade",
    "produtoVoucher",
    "listasDePrecos"
})
public class Produto {

    @XmlElement(name = "id-produto")
    protected String idProduto;
    @XmlElement(name = "codigo-produto")
    protected String codigoProduto;
    @XmlElement(name = "lista-ids")
    protected IdentificadorList listaIds;
    @XmlElement(name = "nome-produto")
    protected String nomeProduto;
    protected String descricao;
    @XmlElement(name = "descricao-curta")
    protected String descricaoCurta;
    @XmlElement(name = "tipo-produto")
    protected TipoReferencia tipoProduto;
    @XmlElement(name = "configuracoes-produto")
    protected ConfiguracaoList configuracoesProduto;
    protected SkuList skus;
    protected Categoria categoria;
    @XmlElement(name = "produto-parceiro")
    protected Produto produtoParceiro;
    @XmlElement(name = "data-hora-efetivacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraEfetivacao;
    @XmlElement(name = "data-hora-expiracao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraExpiracao;
    @XmlElement(name = "url-imagem")
    protected String urlImagem;
    @XmlElement(name = "informacoes-importantes")
    protected String informacoesImportantes;
    protected Catalogo catalogo;
    protected Parceiro parceiro;
    protected ImagemList imagens;
    @XmlElement(name = "parametros-catalogo-fidelidade")
    protected ParametrosCatalogoFidelidade parametrosCatalogoFidelidade;
    @XmlElement(name = "produto-voucher")
    protected Voucher produtoVoucher;
    @XmlElement(name = "listas-de-precos")
    protected ListaDePrecosList listasDePrecos;

    /**
     * Gets the value of the idProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * Sets the value of the idProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProduto(String value) {
        this.idProduto = value;
    }

    /**
     * Gets the value of the codigoProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProduto() {
        return codigoProduto;
    }

    /**
     * Sets the value of the codigoProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProduto(String value) {
        this.codigoProduto = value;
    }

    /**
     * Gets the value of the listaIds property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorList }
     *     
     */
    public IdentificadorList getListaIds() {
        return listaIds;
    }

    /**
     * Sets the value of the listaIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorList }
     *     
     */
    public void setListaIds(IdentificadorList value) {
        this.listaIds = value;
    }

    /**
     * Gets the value of the nomeProduto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * Sets the value of the nomeProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProduto(String value) {
        this.nomeProduto = value;
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
     * Gets the value of the tipoProduto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoProduto() {
        return tipoProduto;
    }

    /**
     * Sets the value of the tipoProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoProduto(TipoReferencia value) {
        this.tipoProduto = value;
    }

    /**
     * Gets the value of the configuracoesProduto property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoList }
     *     
     */
    public ConfiguracaoList getConfiguracoesProduto() {
        return configuracoesProduto;
    }

    /**
     * Sets the value of the configuracoesProduto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoList }
     *     
     */
    public void setConfiguracoesProduto(ConfiguracaoList value) {
        this.configuracoesProduto = value;
    }

    /**
     * Gets the value of the skus property.
     * 
     * @return
     *     possible object is
     *     {@link SkuList }
     *     
     */
    public SkuList getSkus() {
        return skus;
    }

    /**
     * Sets the value of the skus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkuList }
     *     
     */
    public void setSkus(SkuList value) {
        this.skus = value;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * Sets the value of the categoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoria(Categoria value) {
        this.categoria = value;
    }

    /**
     * Gets the value of the produtoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProdutoParceiro() {
        return produtoParceiro;
    }

    /**
     * Sets the value of the produtoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProdutoParceiro(Produto value) {
        this.produtoParceiro = value;
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
     * Gets the value of the informacoesImportantes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacoesImportantes() {
        return informacoesImportantes;
    }

    /**
     * Sets the value of the informacoesImportantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacoesImportantes(String value) {
        this.informacoesImportantes = value;
    }

    /**
     * Gets the value of the catalogo property.
     * 
     * @return
     *     possible object is
     *     {@link Catalogo }
     *     
     */
    public Catalogo getCatalogo() {
        return catalogo;
    }

    /**
     * Sets the value of the catalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogo }
     *     
     */
    public void setCatalogo(Catalogo value) {
        this.catalogo = value;
    }

    /**
     * Gets the value of the parceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Parceiro }
     *     
     */
    public Parceiro getParceiro() {
        return parceiro;
    }

    /**
     * Sets the value of the parceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parceiro }
     *     
     */
    public void setParceiro(Parceiro value) {
        this.parceiro = value;
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
     * Gets the value of the parametrosCatalogoFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrosCatalogoFidelidade }
     *     
     */
    public ParametrosCatalogoFidelidade getParametrosCatalogoFidelidade() {
        return parametrosCatalogoFidelidade;
    }

    /**
     * Sets the value of the parametrosCatalogoFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrosCatalogoFidelidade }
     *     
     */
    public void setParametrosCatalogoFidelidade(ParametrosCatalogoFidelidade value) {
        this.parametrosCatalogoFidelidade = value;
    }

    /**
     * Gets the value of the produtoVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link Voucher }
     *     
     */
    public Voucher getProdutoVoucher() {
        return produtoVoucher;
    }

    /**
     * Sets the value of the produtoVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link Voucher }
     *     
     */
    public void setProdutoVoucher(Voucher value) {
        this.produtoVoucher = value;
    }

    /**
     * Gets the value of the listasDePrecos property.
     * 
     * @return
     *     possible object is
     *     {@link ListaDePrecosList }
     *     
     */
    public ListaDePrecosList getListasDePrecos() {
        return listasDePrecos;
    }

    /**
     * Sets the value of the listasDePrecos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaDePrecosList }
     *     
     */
    public void setListasDePrecos(ListaDePrecosList value) {
        this.listasDePrecos = value;
    }

}
