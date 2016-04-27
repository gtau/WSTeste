
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidoParceiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoParceiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-pedido-parceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao-atual" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoPedido" minOccurs="0"/>
 *         &lt;element name="historico-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoPedidoList" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="catalogo" type="{http://ebo.multiplusfidelidade.com.br/v1}Catalogo" minOccurs="0"/>
 *         &lt;element name="pedido-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Pedido" minOccurs="0"/>
 *         &lt;element name="pedido-rastreavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="rastreamentos" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoList" minOccurs="0"/>
 *         &lt;element name="rastreamentos-entregas-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoPedidoList" minOccurs="0"/>
 *         &lt;element name="rastreamento-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoEntrega" minOccurs="0"/>
 *         &lt;element name="pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}Pedido" minOccurs="0"/>
 *         &lt;element name="contato-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="inconsistencias" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="tipo-integracao-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoParceiro", propOrder = {
    "idPedidoParceiro",
    "situacaoAtual",
    "historicoPedido",
    "parceiro",
    "catalogo",
    "pedidoReferencia",
    "pedidoRastreavel",
    "rastreamentos",
    "rastreamentosEntregasPedido",
    "rastreamentoEntrega",
    "pedido",
    "contatoEntrega",
    "inconsistencias",
    "tipoIntegracaoParceiro"
})
public class PedidoParceiro {

    @XmlElement(name = "id-pedido-parceiro")
    protected String idPedidoParceiro;
    @XmlElement(name = "situacao-atual")
    protected SituacaoPedido situacaoAtual;
    @XmlElement(name = "historico-pedido")
    protected SituacaoPedidoList historicoPedido;
    protected Parceiro parceiro;
    protected Catalogo catalogo;
    @XmlElement(name = "pedido-referencia")
    protected Pedido pedidoReferencia;
    @XmlElement(name = "pedido-rastreavel")
    protected Boolean pedidoRastreavel;
    protected RastreamentoList rastreamentos;
    @XmlElement(name = "rastreamentos-entregas-pedido")
    protected RastreamentoPedidoList rastreamentosEntregasPedido;
    @XmlElement(name = "rastreamento-entrega")
    protected RastreamentoEntrega rastreamentoEntrega;
    protected Pedido pedido;
    @XmlElement(name = "contato-entrega")
    protected Contato contatoEntrega;
    protected TipoReferenciaList inconsistencias;
    @XmlElement(name = "tipo-integracao-parceiro")
    protected TipoReferencia tipoIntegracaoParceiro;

    /**
     * Gets the value of the idPedidoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPedidoParceiro() {
        return idPedidoParceiro;
    }

    /**
     * Sets the value of the idPedidoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPedidoParceiro(String value) {
        this.idPedidoParceiro = value;
    }

    /**
     * Gets the value of the situacaoAtual property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoPedido }
     *     
     */
    public SituacaoPedido getSituacaoAtual() {
        return situacaoAtual;
    }

    /**
     * Sets the value of the situacaoAtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoPedido }
     *     
     */
    public void setSituacaoAtual(SituacaoPedido value) {
        this.situacaoAtual = value;
    }

    /**
     * Gets the value of the historicoPedido property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoPedidoList }
     *     
     */
    public SituacaoPedidoList getHistoricoPedido() {
        return historicoPedido;
    }

    /**
     * Sets the value of the historicoPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoPedidoList }
     *     
     */
    public void setHistoricoPedido(SituacaoPedidoList value) {
        this.historicoPedido = value;
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
     * Gets the value of the pedidoRastreavel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPedidoRastreavel() {
        return pedidoRastreavel;
    }

    /**
     * Sets the value of the pedidoRastreavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPedidoRastreavel(Boolean value) {
        this.pedidoRastreavel = value;
    }

    /**
     * Gets the value of the rastreamentos property.
     * 
     * @return
     *     possible object is
     *     {@link RastreamentoList }
     *     
     */
    public RastreamentoList getRastreamentos() {
        return rastreamentos;
    }

    /**
     * Sets the value of the rastreamentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link RastreamentoList }
     *     
     */
    public void setRastreamentos(RastreamentoList value) {
        this.rastreamentos = value;
    }

    /**
     * Gets the value of the rastreamentosEntregasPedido property.
     * 
     * @return
     *     possible object is
     *     {@link RastreamentoPedidoList }
     *     
     */
    public RastreamentoPedidoList getRastreamentosEntregasPedido() {
        return rastreamentosEntregasPedido;
    }

    /**
     * Sets the value of the rastreamentosEntregasPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link RastreamentoPedidoList }
     *     
     */
    public void setRastreamentosEntregasPedido(RastreamentoPedidoList value) {
        this.rastreamentosEntregasPedido = value;
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
     * Gets the value of the pedido property.
     * 
     * @return
     *     possible object is
     *     {@link Pedido }
     *     
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * Sets the value of the pedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedido }
     *     
     */
    public void setPedido(Pedido value) {
        this.pedido = value;
    }

    /**
     * Gets the value of the contatoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContatoEntrega() {
        return contatoEntrega;
    }

    /**
     * Sets the value of the contatoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContatoEntrega(Contato value) {
        this.contatoEntrega = value;
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
     * Gets the value of the tipoIntegracaoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoIntegracaoParceiro() {
        return tipoIntegracaoParceiro;
    }

    /**
     * Sets the value of the tipoIntegracaoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoIntegracaoParceiro(TipoReferencia value) {
        this.tipoIntegracaoParceiro = value;
    }

}
