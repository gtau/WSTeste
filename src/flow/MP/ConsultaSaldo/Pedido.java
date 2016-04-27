
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-pedido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-fulfillment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="itens-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedidoList" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="participante-favorecido" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="contexto-parceiro-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}ContextoParceiro" minOccurs="0"/>
 *         &lt;element name="total-pontos-pedido" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="situacao-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoPedido" minOccurs="0"/>
 *         &lt;element name="data-hora-situacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="canal-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="data-criacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="email-alternativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}Promocao" minOccurs="0"/>
 *         &lt;element name="promocoes" type="{http://ebo.multiplusfidelidade.com.br/v1}PromocaoList" minOccurs="0"/>
 *         &lt;element name="transacao-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}TransacaoPagamento" minOccurs="0"/>
 *         &lt;element name="pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Pagamento" minOccurs="0"/>
 *         &lt;element name="reserva-cota-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}CotaPontos" minOccurs="0"/>
 *         &lt;element name="reserva-cota-pontos-favorecido" type="{http://ebo.multiplusfidelidade.com.br/v1}CotaPontos" minOccurs="0"/>
 *         &lt;element name="data-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuario-ultima-atualizacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="contato-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="pedido-aereo" type="{http://ebo.multiplusfidelidade.com.br/v1}PedidoAereo" minOccurs="0"/>
 *         &lt;element name="id-pedido-externo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistema-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *         &lt;element name="agrupamento-itens-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}AgrupamentoItensPedido" minOccurs="0"/>
 *         &lt;element name="inconsistencias" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="assinatura" type="{http://ebo.multiplusfidelidade.com.br/v1}AssinaturaParticipante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pedido", propOrder = {
    "idPedido",
    "idFulfillment",
    "tipoPedido",
    "itensPedido",
    "parceiro",
    "participante",
    "participanteFavorecido",
    "contextoParceiroPedido",
    "totalPontosPedido",
    "situacaoPedido",
    "dataHoraSituacao",
    "canalOrigem",
    "dataCriacao",
    "emailAlternativo",
    "promocao",
    "promocoes",
    "transacaoPagamento",
    "pagamento",
    "reservaCotaPontos",
    "reservaCotaPontosFavorecido",
    "dataUltimaAtualizacao",
    "usuarioUltimaAtualizacao",
    "contatoEntrega",
    "pedidoAereo",
    "idPedidoExterno",
    "sistemaOrigem",
    "agrupamentoItensPedido",
    "inconsistencias",
    "assinatura"
})
public class Pedido {

    @XmlElement(name = "id-pedido")
    protected String idPedido;
    @XmlElement(name = "id-fulfillment")
    protected String idFulfillment;
    @XmlElement(name = "tipo-pedido")
    protected TipoReferencia tipoPedido;
    @XmlElement(name = "itens-pedido")
    protected ItemPedidoList itensPedido;
    protected Parceiro parceiro;
    protected Participante participante;
    @XmlElement(name = "participante-favorecido")
    protected Participante participanteFavorecido;
    @XmlElement(name = "contexto-parceiro-pedido")
    protected ContextoParceiro contextoParceiroPedido;
    @XmlElement(name = "total-pontos-pedido")
    protected Long totalPontosPedido;
    @XmlElement(name = "situacao-pedido")
    protected SituacaoPedido situacaoPedido;
    @XmlElement(name = "data-hora-situacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraSituacao;
    @XmlElement(name = "canal-origem")
    protected Canal canalOrigem;
    @XmlElement(name = "data-criacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlElement(name = "email-alternativo")
    protected String emailAlternativo;
    protected Promocao promocao;
    protected PromocaoList promocoes;
    @XmlElement(name = "transacao-pagamento")
    protected TransacaoPagamento transacaoPagamento;
    protected Pagamento pagamento;
    @XmlElement(name = "reserva-cota-pontos")
    protected CotaPontos reservaCotaPontos;
    @XmlElement(name = "reserva-cota-pontos-favorecido")
    protected CotaPontos reservaCotaPontosFavorecido;
    @XmlElement(name = "data-ultima-atualizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltimaAtualizacao;
    @XmlElement(name = "usuario-ultima-atualizacao")
    protected Usuario usuarioUltimaAtualizacao;
    @XmlElement(name = "contato-entrega")
    protected Contato contatoEntrega;
    @XmlElement(name = "pedido-aereo")
    protected PedidoAereo pedidoAereo;
    @XmlElement(name = "id-pedido-externo")
    protected String idPedidoExterno;
    @XmlElement(name = "sistema-origem")
    protected Sistema sistemaOrigem;
    @XmlElement(name = "agrupamento-itens-pedido")
    protected AgrupamentoItensPedido agrupamentoItensPedido;
    protected TipoReferenciaList inconsistencias;
    protected AssinaturaParticipante assinatura;

    /**
     * Gets the value of the idPedido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * Sets the value of the idPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPedido(String value) {
        this.idPedido = value;
    }

    /**
     * Gets the value of the idFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFulfillment() {
        return idFulfillment;
    }

    /**
     * Sets the value of the idFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFulfillment(String value) {
        this.idFulfillment = value;
    }

    /**
     * Gets the value of the tipoPedido property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoPedido() {
        return tipoPedido;
    }

    /**
     * Sets the value of the tipoPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoPedido(TipoReferencia value) {
        this.tipoPedido = value;
    }

    /**
     * Gets the value of the itensPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedidoList }
     *     
     */
    public ItemPedidoList getItensPedido() {
        return itensPedido;
    }

    /**
     * Sets the value of the itensPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedidoList }
     *     
     */
    public void setItensPedido(ItemPedidoList value) {
        this.itensPedido = value;
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
     * Gets the value of the participanteFavorecido property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipanteFavorecido() {
        return participanteFavorecido;
    }

    /**
     * Sets the value of the participanteFavorecido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipanteFavorecido(Participante value) {
        this.participanteFavorecido = value;
    }

    /**
     * Gets the value of the contextoParceiroPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ContextoParceiro }
     *     
     */
    public ContextoParceiro getContextoParceiroPedido() {
        return contextoParceiroPedido;
    }

    /**
     * Sets the value of the contextoParceiroPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextoParceiro }
     *     
     */
    public void setContextoParceiroPedido(ContextoParceiro value) {
        this.contextoParceiroPedido = value;
    }

    /**
     * Gets the value of the totalPontosPedido property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalPontosPedido() {
        return totalPontosPedido;
    }

    /**
     * Sets the value of the totalPontosPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalPontosPedido(Long value) {
        this.totalPontosPedido = value;
    }

    /**
     * Gets the value of the situacaoPedido property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoPedido }
     *     
     */
    public SituacaoPedido getSituacaoPedido() {
        return situacaoPedido;
    }

    /**
     * Sets the value of the situacaoPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoPedido }
     *     
     */
    public void setSituacaoPedido(SituacaoPedido value) {
        this.situacaoPedido = value;
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
     * Gets the value of the dataCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Sets the value of the dataCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Gets the value of the emailAlternativo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAlternativo() {
        return emailAlternativo;
    }

    /**
     * Sets the value of the emailAlternativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAlternativo(String value) {
        this.emailAlternativo = value;
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
     * Gets the value of the transacaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link TransacaoPagamento }
     *     
     */
    public TransacaoPagamento getTransacaoPagamento() {
        return transacaoPagamento;
    }

    /**
     * Sets the value of the transacaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransacaoPagamento }
     *     
     */
    public void setTransacaoPagamento(TransacaoPagamento value) {
        this.transacaoPagamento = value;
    }

    /**
     * Gets the value of the pagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Pagamento }
     *     
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * Sets the value of the pagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagamento }
     *     
     */
    public void setPagamento(Pagamento value) {
        this.pagamento = value;
    }

    /**
     * Gets the value of the reservaCotaPontos property.
     * 
     * @return
     *     possible object is
     *     {@link CotaPontos }
     *     
     */
    public CotaPontos getReservaCotaPontos() {
        return reservaCotaPontos;
    }

    /**
     * Sets the value of the reservaCotaPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link CotaPontos }
     *     
     */
    public void setReservaCotaPontos(CotaPontos value) {
        this.reservaCotaPontos = value;
    }

    /**
     * Gets the value of the reservaCotaPontosFavorecido property.
     * 
     * @return
     *     possible object is
     *     {@link CotaPontos }
     *     
     */
    public CotaPontos getReservaCotaPontosFavorecido() {
        return reservaCotaPontosFavorecido;
    }

    /**
     * Sets the value of the reservaCotaPontosFavorecido property.
     * 
     * @param value
     *     allowed object is
     *     {@link CotaPontos }
     *     
     */
    public void setReservaCotaPontosFavorecido(CotaPontos value) {
        this.reservaCotaPontosFavorecido = value;
    }

    /**
     * Gets the value of the dataUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * Sets the value of the dataUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaAtualizacao(XMLGregorianCalendar value) {
        this.dataUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the usuarioUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuarioUltimaAtualizacao() {
        return usuarioUltimaAtualizacao;
    }

    /**
     * Sets the value of the usuarioUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuarioUltimaAtualizacao(Usuario value) {
        this.usuarioUltimaAtualizacao = value;
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
     * Gets the value of the pedidoAereo property.
     * 
     * @return
     *     possible object is
     *     {@link PedidoAereo }
     *     
     */
    public PedidoAereo getPedidoAereo() {
        return pedidoAereo;
    }

    /**
     * Sets the value of the pedidoAereo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PedidoAereo }
     *     
     */
    public void setPedidoAereo(PedidoAereo value) {
        this.pedidoAereo = value;
    }

    /**
     * Gets the value of the idPedidoExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPedidoExterno() {
        return idPedidoExterno;
    }

    /**
     * Sets the value of the idPedidoExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPedidoExterno(String value) {
        this.idPedidoExterno = value;
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
     * Gets the value of the agrupamentoItensPedido property.
     * 
     * @return
     *     possible object is
     *     {@link AgrupamentoItensPedido }
     *     
     */
    public AgrupamentoItensPedido getAgrupamentoItensPedido() {
        return agrupamentoItensPedido;
    }

    /**
     * Sets the value of the agrupamentoItensPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrupamentoItensPedido }
     *     
     */
    public void setAgrupamentoItensPedido(AgrupamentoItensPedido value) {
        this.agrupamentoItensPedido = value;
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
     * Gets the value of the assinatura property.
     * 
     * @return
     *     possible object is
     *     {@link AssinaturaParticipante }
     *     
     */
    public AssinaturaParticipante getAssinatura() {
        return assinatura;
    }

    /**
     * Sets the value of the assinatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssinaturaParticipante }
     *     
     */
    public void setAssinatura(AssinaturaParticipante value) {
        this.assinatura = value;
    }

}
