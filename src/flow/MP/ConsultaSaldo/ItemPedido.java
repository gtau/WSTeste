
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-item-pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sku" type="{http://ebo.multiplusfidelidade.com.br/v1}Sku" minOccurs="0"/>
 *         &lt;element name="quantidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preco-unitario" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-unitario-cheio" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="indicador-entregavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="destinatario-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="produto-resgatado" type="{http://ebo.multiplusfidelidade.com.br/v1}ProdutoResgatado" minOccurs="0"/>
 *         &lt;element name="pedido-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}PedidoParceiro" minOccurs="0"/>
 *         &lt;element name="resgate-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Resgate" minOccurs="0"/>
 *         &lt;element name="situacao-item-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="pedido-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Pedido" minOccurs="0"/>
 *         &lt;element name="acumulo-gerado" type="{http://ebo.multiplusfidelidade.com.br/v1}Acumulo" minOccurs="0"/>
 *         &lt;element name="preco-unitario-lista" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-unitario-venda" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-unitario-final" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-frete" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="codigo-externo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}Promocao" minOccurs="0"/>
 *         &lt;element name="promocoes" type="{http://ebo.multiplusfidelidade.com.br/v1}PromocaoList" minOccurs="0"/>
 *         &lt;element name="item-pedido-aereo" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedidoAereo" minOccurs="0"/>
 *         &lt;element name="item-pedido-transferencia" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedidoTransferencia" minOccurs="0"/>
 *         &lt;element name="item-pedido-locacao-veiculo" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedidoLocacaoVeiculo" minOccurs="0"/>
 *         &lt;element name="preco-unitario-efetivo" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-frete-efetivo" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-impostos-efetivo" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="combo-itens-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedidoList" minOccurs="0"/>
 *         &lt;element name="rastreamento-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoEntrega" minOccurs="0"/>
 *         &lt;element name="inconsistencias" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="indicador-bypass-antifraude" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="beneficiario-pf" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPedido", propOrder = {
    "idItemPedido",
    "descricao",
    "sku",
    "quantidade",
    "precoUnitario",
    "precoUnitarioCheio",
    "indicadorEntregavel",
    "destinatarioEntrega",
    "produtoResgatado",
    "pedidoParceiro",
    "resgatePagamento",
    "situacaoItemPedido",
    "pedidoReferencia",
    "acumuloGerado",
    "precoUnitarioLista",
    "precoUnitarioVenda",
    "precoUnitarioFinal",
    "precoFrete",
    "codigoExterno",
    "promocao",
    "promocoes",
    "itemPedidoAereo",
    "itemPedidoTransferencia",
    "itemPedidoLocacaoVeiculo",
    "precoUnitarioEfetivo",
    "precoFreteEfetivo",
    "precoImpostosEfetivo",
    "comboItensPedido",
    "rastreamentoEntrega",
    "inconsistencias",
    "indicadorBypassAntifraude",
    "beneficiarioPf"
})
public class ItemPedido {

    @XmlElement(name = "id-item-pedido")
    protected String idItemPedido;
    protected String descricao;
    protected Sku sku;
    protected Long quantidade;
    @XmlElement(name = "preco-unitario")
    protected Preco precoUnitario;
    @XmlElement(name = "preco-unitario-cheio")
    protected Preco precoUnitarioCheio;
    @XmlElement(name = "indicador-entregavel")
    protected Boolean indicadorEntregavel;
    @XmlElement(name = "destinatario-entrega")
    protected Contato destinatarioEntrega;
    @XmlElement(name = "produto-resgatado")
    protected ProdutoResgatado produtoResgatado;
    @XmlElement(name = "pedido-parceiro")
    protected PedidoParceiro pedidoParceiro;
    @XmlElement(name = "resgate-pagamento")
    protected Resgate resgatePagamento;
    @XmlElement(name = "situacao-item-pedido")
    protected Situacao situacaoItemPedido;
    @XmlElement(name = "pedido-referencia")
    protected Pedido pedidoReferencia;
    @XmlElement(name = "acumulo-gerado")
    protected Acumulo acumuloGerado;
    @XmlElement(name = "preco-unitario-lista")
    protected Preco precoUnitarioLista;
    @XmlElement(name = "preco-unitario-venda")
    protected Preco precoUnitarioVenda;
    @XmlElement(name = "preco-unitario-final")
    protected Preco precoUnitarioFinal;
    @XmlElement(name = "preco-frete")
    protected Preco precoFrete;
    @XmlElement(name = "codigo-externo")
    protected String codigoExterno;
    protected Promocao promocao;
    protected PromocaoList promocoes;
    @XmlElement(name = "item-pedido-aereo")
    protected ItemPedidoAereo itemPedidoAereo;
    @XmlElement(name = "item-pedido-transferencia")
    protected ItemPedidoTransferencia itemPedidoTransferencia;
    @XmlElement(name = "item-pedido-locacao-veiculo")
    protected ItemPedidoLocacaoVeiculo itemPedidoLocacaoVeiculo;
    @XmlElement(name = "preco-unitario-efetivo")
    protected Preco precoUnitarioEfetivo;
    @XmlElement(name = "preco-frete-efetivo")
    protected Preco precoFreteEfetivo;
    @XmlElement(name = "preco-impostos-efetivo")
    protected Preco precoImpostosEfetivo;
    @XmlElement(name = "combo-itens-pedido")
    protected ItemPedidoList comboItensPedido;
    @XmlElement(name = "rastreamento-entrega")
    protected RastreamentoEntrega rastreamentoEntrega;
    protected TipoReferenciaList inconsistencias;
    @XmlElement(name = "indicador-bypass-antifraude")
    protected Boolean indicadorBypassAntifraude;
    @XmlElement(name = "beneficiario-pf")
    protected DadosCadastraisPF beneficiarioPf;

    /**
     * Gets the value of the idItemPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdItemPedido() {
        return idItemPedido;
    }

    /**
     * Sets the value of the idItemPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdItemPedido(String value) {
        this.idItemPedido = value;
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
     * Gets the value of the sku property.
     * 
     * @return
     *     possible object is
     *     {@link Sku }
     *     
     */
    public Sku getSku() {
        return sku;
    }

    /**
     * Sets the value of the sku property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sku }
     *     
     */
    public void setSku(Sku value) {
        this.sku = value;
    }

    /**
     * Gets the value of the quantidade property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidade() {
        return quantidade;
    }

    /**
     * Sets the value of the quantidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidade(Long value) {
        this.quantidade = value;
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

    /**
     * Gets the value of the precoUnitarioCheio property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoUnitarioCheio() {
        return precoUnitarioCheio;
    }

    /**
     * Sets the value of the precoUnitarioCheio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoUnitarioCheio(Preco value) {
        this.precoUnitarioCheio = value;
    }

    /**
     * Gets the value of the indicadorEntregavel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorEntregavel() {
        return indicadorEntregavel;
    }

    /**
     * Sets the value of the indicadorEntregavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorEntregavel(Boolean value) {
        this.indicadorEntregavel = value;
    }

    /**
     * Gets the value of the destinatarioEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getDestinatarioEntrega() {
        return destinatarioEntrega;
    }

    /**
     * Sets the value of the destinatarioEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setDestinatarioEntrega(Contato value) {
        this.destinatarioEntrega = value;
    }

    /**
     * Gets the value of the produtoResgatado property.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoResgatado }
     *     
     */
    public ProdutoResgatado getProdutoResgatado() {
        return produtoResgatado;
    }

    /**
     * Sets the value of the produtoResgatado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoResgatado }
     *     
     */
    public void setProdutoResgatado(ProdutoResgatado value) {
        this.produtoResgatado = value;
    }

    /**
     * Gets the value of the pedidoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link PedidoParceiro }
     *     
     */
    public PedidoParceiro getPedidoParceiro() {
        return pedidoParceiro;
    }

    /**
     * Sets the value of the pedidoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidoParceiro }
     *     
     */
    public void setPedidoParceiro(PedidoParceiro value) {
        this.pedidoParceiro = value;
    }

    /**
     * Gets the value of the resgatePagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Resgate }
     *     
     */
    public Resgate getResgatePagamento() {
        return resgatePagamento;
    }

    /**
     * Sets the value of the resgatePagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resgate }
     *     
     */
    public void setResgatePagamento(Resgate value) {
        this.resgatePagamento = value;
    }

    /**
     * Gets the value of the situacaoItemPedido property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoItemPedido() {
        return situacaoItemPedido;
    }

    /**
     * Sets the value of the situacaoItemPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoItemPedido(Situacao value) {
        this.situacaoItemPedido = value;
    }

    /**
     * Gets the value of the pedidoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Pedido }
     *     
     */
    public Pedido getPedidoReferencia() {
        return pedidoReferencia;
    }

    /**
     * Sets the value of the pedidoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedido }
     *     
     */
    public void setPedidoReferencia(Pedido value) {
        this.pedidoReferencia = value;
    }

    /**
     * Gets the value of the acumuloGerado property.
     * 
     * @return
     *     possible object is
     *     {@link Acumulo }
     *     
     */
    public Acumulo getAcumuloGerado() {
        return acumuloGerado;
    }

    /**
     * Sets the value of the acumuloGerado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Acumulo }
     *     
     */
    public void setAcumuloGerado(Acumulo value) {
        this.acumuloGerado = value;
    }

    /**
     * Gets the value of the precoUnitarioLista property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoUnitarioLista() {
        return precoUnitarioLista;
    }

    /**
     * Sets the value of the precoUnitarioLista property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoUnitarioLista(Preco value) {
        this.precoUnitarioLista = value;
    }

    /**
     * Gets the value of the precoUnitarioVenda property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoUnitarioVenda() {
        return precoUnitarioVenda;
    }

    /**
     * Sets the value of the precoUnitarioVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoUnitarioVenda(Preco value) {
        this.precoUnitarioVenda = value;
    }

    /**
     * Gets the value of the precoUnitarioFinal property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoUnitarioFinal() {
        return precoUnitarioFinal;
    }

    /**
     * Sets the value of the precoUnitarioFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoUnitarioFinal(Preco value) {
        this.precoUnitarioFinal = value;
    }

    /**
     * Gets the value of the precoFrete property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoFrete() {
        return precoFrete;
    }

    /**
     * Sets the value of the precoFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoFrete(Preco value) {
        this.precoFrete = value;
    }

    /**
     * Gets the value of the codigoExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * Sets the value of the codigoExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExterno(String value) {
        this.codigoExterno = value;
    }

    /**
     * Gets the value of the promocao property.
     * 
     * @return
     *     possible object is
     *     {@link Promocao }
     *     
     */
    public Promocao getPromocao() {
        return promocao;
    }

    /**
     * Sets the value of the promocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promocao }
     *     
     */
    public void setPromocao(Promocao value) {
        this.promocao = value;
    }

    /**
     * Gets the value of the promocoes property.
     * 
     * @return
     *     possible object is
     *     {@link PromocaoList }
     *     
     */
    public PromocaoList getPromocoes() {
        return promocoes;
    }

    /**
     * Sets the value of the promocoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromocaoList }
     *     
     */
    public void setPromocoes(PromocaoList value) {
        this.promocoes = value;
    }

    /**
     * Gets the value of the itemPedidoAereo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedidoAereo }
     *     
     */
    public ItemPedidoAereo getItemPedidoAereo() {
        return itemPedidoAereo;
    }

    /**
     * Sets the value of the itemPedidoAereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedidoAereo }
     *     
     */
    public void setItemPedidoAereo(ItemPedidoAereo value) {
        this.itemPedidoAereo = value;
    }

    /**
     * Gets the value of the itemPedidoTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedidoTransferencia }
     *     
     */
    public ItemPedidoTransferencia getItemPedidoTransferencia() {
        return itemPedidoTransferencia;
    }

    /**
     * Sets the value of the itemPedidoTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedidoTransferencia }
     *     
     */
    public void setItemPedidoTransferencia(ItemPedidoTransferencia value) {
        this.itemPedidoTransferencia = value;
    }

    /**
     * Gets the value of the itemPedidoLocacaoVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedidoLocacaoVeiculo }
     *     
     */
    public ItemPedidoLocacaoVeiculo getItemPedidoLocacaoVeiculo() {
        return itemPedidoLocacaoVeiculo;
    }

    /**
     * Sets the value of the itemPedidoLocacaoVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedidoLocacaoVeiculo }
     *     
     */
    public void setItemPedidoLocacaoVeiculo(ItemPedidoLocacaoVeiculo value) {
        this.itemPedidoLocacaoVeiculo = value;
    }

    /**
     * Gets the value of the precoUnitarioEfetivo property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoUnitarioEfetivo() {
        return precoUnitarioEfetivo;
    }

    /**
     * Sets the value of the precoUnitarioEfetivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoUnitarioEfetivo(Preco value) {
        this.precoUnitarioEfetivo = value;
    }

    /**
     * Gets the value of the precoFreteEfetivo property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoFreteEfetivo() {
        return precoFreteEfetivo;
    }

    /**
     * Sets the value of the precoFreteEfetivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoFreteEfetivo(Preco value) {
        this.precoFreteEfetivo = value;
    }

    /**
     * Gets the value of the precoImpostosEfetivo property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoImpostosEfetivo() {
        return precoImpostosEfetivo;
    }

    /**
     * Sets the value of the precoImpostosEfetivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoImpostosEfetivo(Preco value) {
        this.precoImpostosEfetivo = value;
    }

    /**
     * Gets the value of the comboItensPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedidoList }
     *     
     */
    public ItemPedidoList getComboItensPedido() {
        return comboItensPedido;
    }

    /**
     * Sets the value of the comboItensPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedidoList }
     *     
     */
    public void setComboItensPedido(ItemPedidoList value) {
        this.comboItensPedido = value;
    }

    /**
     * Gets the value of the rastreamentoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link RastreamentoEntrega }
     *     
     */
    public RastreamentoEntrega getRastreamentoEntrega() {
        return rastreamentoEntrega;
    }

    /**
     * Sets the value of the rastreamentoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link RastreamentoEntrega }
     *     
     */
    public void setRastreamentoEntrega(RastreamentoEntrega value) {
        this.rastreamentoEntrega = value;
    }

    /**
     * Gets the value of the inconsistencias property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferenciaList }
     *     
     */
    public TipoReferenciaList getInconsistencias() {
        return inconsistencias;
    }

    /**
     * Sets the value of the inconsistencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferenciaList }
     *     
     */
    public void setInconsistencias(TipoReferenciaList value) {
        this.inconsistencias = value;
    }

    /**
     * Gets the value of the indicadorBypassAntifraude property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorBypassAntifraude() {
        return indicadorBypassAntifraude;
    }

    /**
     * Sets the value of the indicadorBypassAntifraude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorBypassAntifraude(Boolean value) {
        this.indicadorBypassAntifraude = value;
    }

    /**
     * Gets the value of the beneficiarioPf property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getBeneficiarioPf() {
        return beneficiarioPf;
    }

    /**
     * Sets the value of the beneficiarioPf property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setBeneficiarioPf(DadosCadastraisPF value) {
        this.beneficiarioPf = value;
    }

}
