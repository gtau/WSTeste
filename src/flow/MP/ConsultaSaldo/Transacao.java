
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Transacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Transacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-transacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero-transacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero-documento" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroSequencialCircular" minOccurs="0"/>
 *         &lt;element name="tipo-transacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="total-transacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="situacao-transacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-hora-situacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="motivo-situacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-hora-criacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-hora-processamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-hora-origem-transacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descricao-transacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promocao-relacionada" type="{http://ebo.multiplusfidelidade.com.br/v1}Promocao" minOccurs="0"/>
 *         &lt;element name="transacao-originadora" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="produto-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}Produto" minOccurs="0"/>
 *         &lt;element name="itens-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}PontosList" minOccurs="0"/>
 *         &lt;element name="contexto-parceiro-transacao" type="{http://ebo.multiplusfidelidade.com.br/v1}ContextoParceiro" minOccurs="0"/>
 *         &lt;element name="sistema-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *         &lt;element name="canal-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="item-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedido" minOccurs="0"/>
 *         &lt;element name="indicador-item-ponto-expirado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="motivo-cancelamento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="indicador-bloquear-transacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pedido-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Pedido" minOccurs="0"/>
 *         &lt;element name="tipo-bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transacao", propOrder = {
    "idTransacao",
    "numeroTransacao",
    "numeroDocumento",
    "tipoTransacao",
    "totalTransacao",
    "situacaoTransacao",
    "dataHoraSituacao",
    "motivoSituacao",
    "dataHoraCriacao",
    "dataHoraProcessamento",
    "dataHoraOrigemTransacao",
    "descricaoTransacao",
    "promocaoRelacionada",
    "transacaoOriginadora",
    "parceiro",
    "participante",
    "produtoFidelidade",
    "itensPontos",
    "contextoParceiroTransacao",
    "sistemaOrigem",
    "canalOrigem",
    "itemPedido",
    "indicadorItemPontoExpirado",
    "motivoCancelamento",
    "indicadorBloquearTransacao",
    "pedidoParceiro",
    "tipoBonus"
})
public class Transacao {

    @XmlElement(name = "id-transacao")
    protected String idTransacao;
    @XmlElement(name = "numero-transacao")
    protected String numeroTransacao;
    @XmlElement(name = "numero-documento")
    protected NumeroSequencialCircular numeroDocumento;
    @XmlElement(name = "tipo-transacao")
    protected TipoReferencia tipoTransacao;
    @XmlElement(name = "total-transacao")
    protected Preco totalTransacao;
    @XmlElement(name = "situacao-transacao")
    protected TipoReferencia situacaoTransacao;
    @XmlElement(name = "data-hora-situacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraSituacao;
    @XmlElement(name = "motivo-situacao")
    protected String motivoSituacao;
    @XmlElement(name = "data-hora-criacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraCriacao;
    @XmlElement(name = "data-hora-processamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraProcessamento;
    @XmlElement(name = "data-hora-origem-transacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraOrigemTransacao;
    @XmlElement(name = "descricao-transacao")
    protected String descricaoTransacao;
    @XmlElement(name = "promocao-relacionada")
    protected Promocao promocaoRelacionada;
    @XmlElement(name = "transacao-originadora")
    protected Transacao transacaoOriginadora;
    protected Parceiro parceiro;
    protected Participante participante;
    @XmlElement(name = "produto-fidelidade")
    protected Produto produtoFidelidade;
    @XmlElement(name = "itens-pontos")
    protected PontosList itensPontos;
    @XmlElement(name = "contexto-parceiro-transacao")
    protected ContextoParceiro contextoParceiroTransacao;
    @XmlElement(name = "sistema-origem")
    protected Sistema sistemaOrigem;
    @XmlElement(name = "canal-origem")
    protected Canal canalOrigem;
    @XmlElement(name = "item-pedido")
    protected ItemPedido itemPedido;
    @XmlElement(name = "indicador-item-ponto-expirado")
    protected Boolean indicadorItemPontoExpirado;
    @XmlElement(name = "motivo-cancelamento")
    protected TipoReferencia motivoCancelamento;
    @XmlElement(name = "indicador-bloquear-transacao")
    protected Boolean indicadorBloquearTransacao;
    @XmlElement(name = "pedido-parceiro")
    protected Pedido pedidoParceiro;
    @XmlElement(name = "tipo-bonus")
    protected String tipoBonus;

    /**
     * Gets the value of the idTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacao() {
        return idTransacao;
    }

    /**
     * Sets the value of the idTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacao(String value) {
        this.idTransacao = value;
    }

    /**
     * Gets the value of the numeroTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTransacao() {
        return numeroTransacao;
    }

    /**
     * Sets the value of the numeroTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTransacao(String value) {
        this.numeroTransacao = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link NumeroSequencialCircular }
     *     
     */
    public NumeroSequencialCircular getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroSequencialCircular }
     *     
     */
    public void setNumeroDocumento(NumeroSequencialCircular value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the tipoTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoTransacao() {
        return tipoTransacao;
    }

    /**
     * Sets the value of the tipoTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoTransacao(TipoReferencia value) {
        this.tipoTransacao = value;
    }

    /**
     * Gets the value of the totalTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getTotalTransacao() {
        return totalTransacao;
    }

    /**
     * Sets the value of the totalTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setTotalTransacao(Preco value) {
        this.totalTransacao = value;
    }

    /**
     * Gets the value of the situacaoTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoTransacao() {
        return situacaoTransacao;
    }

    /**
     * Sets the value of the situacaoTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoTransacao(TipoReferencia value) {
        this.situacaoTransacao = value;
    }

    /**
     * Gets the value of the dataHoraSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraSituacao() {
        return dataHoraSituacao;
    }

    /**
     * Sets the value of the dataHoraSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraSituacao(XMLGregorianCalendar value) {
        this.dataHoraSituacao = value;
    }

    /**
     * Gets the value of the motivoSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoSituacao() {
        return motivoSituacao;
    }

    /**
     * Sets the value of the motivoSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoSituacao(String value) {
        this.motivoSituacao = value;
    }

    /**
     * Gets the value of the dataHoraCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    /**
     * Sets the value of the dataHoraCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraCriacao(XMLGregorianCalendar value) {
        this.dataHoraCriacao = value;
    }

    /**
     * Gets the value of the dataHoraProcessamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraProcessamento() {
        return dataHoraProcessamento;
    }

    /**
     * Sets the value of the dataHoraProcessamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraProcessamento(XMLGregorianCalendar value) {
        this.dataHoraProcessamento = value;
    }

    /**
     * Gets the value of the dataHoraOrigemTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraOrigemTransacao() {
        return dataHoraOrigemTransacao;
    }

    /**
     * Sets the value of the dataHoraOrigemTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraOrigemTransacao(XMLGregorianCalendar value) {
        this.dataHoraOrigemTransacao = value;
    }

    /**
     * Gets the value of the descricaoTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoTransacao() {
        return descricaoTransacao;
    }

    /**
     * Sets the value of the descricaoTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoTransacao(String value) {
        this.descricaoTransacao = value;
    }

    /**
     * Gets the value of the promocaoRelacionada property.
     * 
     * @return
     *     possible object is
     *     {@link Promocao }
     *     
     */
    public Promocao getPromocaoRelacionada() {
        return promocaoRelacionada;
    }

    /**
     * Sets the value of the promocaoRelacionada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promocao }
     *     
     */
    public void setPromocaoRelacionada(Promocao value) {
        this.promocaoRelacionada = value;
    }

    /**
     * Gets the value of the transacaoOriginadora property.
     * 
     * @return
     *     possible object is
     *     {@link Transacao }
     *     
     */
    public Transacao getTransacaoOriginadora() {
        return transacaoOriginadora;
    }

    /**
     * Sets the value of the transacaoOriginadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transacao }
     *     
     */
    public void setTransacaoOriginadora(Transacao value) {
        this.transacaoOriginadora = value;
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
     * Gets the value of the participante property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * Sets the value of the participante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipante(Participante value) {
        this.participante = value;
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
     * Gets the value of the itensPontos property.
     * 
     * @return
     *     possible object is
     *     {@link PontosList }
     *     
     */
    public PontosList getItensPontos() {
        return itensPontos;
    }

    /**
     * Sets the value of the itensPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PontosList }
     *     
     */
    public void setItensPontos(PontosList value) {
        this.itensPontos = value;
    }

    /**
     * Gets the value of the contextoParceiroTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link ContextoParceiro }
     *     
     */
    public ContextoParceiro getContextoParceiroTransacao() {
        return contextoParceiroTransacao;
    }

    /**
     * Sets the value of the contextoParceiroTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextoParceiro }
     *     
     */
    public void setContextoParceiroTransacao(ContextoParceiro value) {
        this.contextoParceiroTransacao = value;
    }

    /**
     * Gets the value of the sistemaOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistemaOrigem() {
        return sistemaOrigem;
    }

    /**
     * Sets the value of the sistemaOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistemaOrigem(Sistema value) {
        this.sistemaOrigem = value;
    }

    /**
     * Gets the value of the canalOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalOrigem() {
        return canalOrigem;
    }

    /**
     * Sets the value of the canalOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalOrigem(Canal value) {
        this.canalOrigem = value;
    }

    /**
     * Gets the value of the itemPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedido }
     *     
     */
    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    /**
     * Sets the value of the itemPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedido }
     *     
     */
    public void setItemPedido(ItemPedido value) {
        this.itemPedido = value;
    }

    /**
     * Gets the value of the indicadorItemPontoExpirado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorItemPontoExpirado() {
        return indicadorItemPontoExpirado;
    }

    /**
     * Sets the value of the indicadorItemPontoExpirado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorItemPontoExpirado(Boolean value) {
        this.indicadorItemPontoExpirado = value;
    }

    /**
     * Gets the value of the motivoCancelamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getMotivoCancelamento() {
        return motivoCancelamento;
    }

    /**
     * Sets the value of the motivoCancelamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setMotivoCancelamento(TipoReferencia value) {
        this.motivoCancelamento = value;
    }

    /**
     * Gets the value of the indicadorBloquearTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorBloquearTransacao() {
        return indicadorBloquearTransacao;
    }

    /**
     * Sets the value of the indicadorBloquearTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorBloquearTransacao(Boolean value) {
        this.indicadorBloquearTransacao = value;
    }

    /**
     * Gets the value of the pedidoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Pedido }
     *     
     */
    public Pedido getPedidoParceiro() {
        return pedidoParceiro;
    }

    /**
     * Sets the value of the pedidoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pedido }
     *     
     */
    public void setPedidoParceiro(Pedido value) {
        this.pedidoParceiro = value;
    }

    /**
     * Gets the value of the tipoBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoBonus() {
        return tipoBonus;
    }

    /**
     * Sets the value of the tipoBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoBonus(String value) {
        this.tipoBonus = value;
    }

}
