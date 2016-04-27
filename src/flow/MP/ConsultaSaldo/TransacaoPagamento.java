
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TransacaoPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransacaoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-transacao-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-notificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-criacao-codigo-pagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-criacao-transacao-pagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="valor-total-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-extra-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-desconto-forma-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-taxas-broker" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-liquido-transacao" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="data-pagamento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="metodo-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}MetodoPagamento" minOccurs="0"/>
 *         &lt;element name="configuracao-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}MetodoPagamentoList" minOccurs="0"/>
 *         &lt;element name="pedido-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Pedido" minOccurs="0"/>
 *         &lt;element name="dados-titular-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *         &lt;element name="contato-titular-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="situacao-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="situacao-pagamento-broker" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="url-redirecionamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url-notificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtd-maxima-uso-codigo-pagamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="expiracao-codigo-pagamento-seg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="contexto-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="data-liberacao-saque" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransacaoPagamento", propOrder = {
    "idTransacaoPagamento",
    "codigoPagamento",
    "idNotificacao",
    "dataCriacaoCodigoPagamento",
    "dataCriacaoTransacaoPagamento",
    "valorTotalPagamento",
    "valorExtraPagamento",
    "valorDescontoFormaPagamento",
    "valorTaxasBroker",
    "valorLiquidoTransacao",
    "dataPagamento",
    "metodoPagamento",
    "configuracaoPagamento",
    "pedidoReferencia",
    "dadosTitularPagamento",
    "contatoTitularPagamento",
    "situacaoPagamento",
    "situacaoPagamentoBroker",
    "urlRedirecionamento",
    "urlNotificacao",
    "qtdMaximaUsoCodigoPagamento",
    "expiracaoCodigoPagamentoSeg",
    "contextoPagamento",
    "dataLiberacaoSaque"
})
public class TransacaoPagamento {

    @XmlElement(name = "id-transacao-pagamento")
    protected String idTransacaoPagamento;
    @XmlElement(name = "codigo-pagamento")
    protected String codigoPagamento;
    @XmlElement(name = "id-notificacao")
    protected String idNotificacao;
    @XmlElement(name = "data-criacao-codigo-pagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacaoCodigoPagamento;
    @XmlElement(name = "data-criacao-transacao-pagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacaoTransacaoPagamento;
    @XmlElement(name = "valor-total-pagamento")
    protected ValorMonetario valorTotalPagamento;
    @XmlElement(name = "valor-extra-pagamento")
    protected ValorMonetario valorExtraPagamento;
    @XmlElement(name = "valor-desconto-forma-pagamento")
    protected ValorMonetario valorDescontoFormaPagamento;
    @XmlElement(name = "valor-taxas-broker")
    protected ValorMonetario valorTaxasBroker;
    @XmlElement(name = "valor-liquido-transacao")
    protected ValorMonetario valorLiquidoTransacao;
    @XmlElement(name = "data-pagamento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataPagamento;
    @XmlElement(name = "metodo-pagamento")
    protected MetodoPagamento metodoPagamento;
    @XmlElement(name = "configuracao-pagamento")
    protected MetodoPagamentoList configuracaoPagamento;
    @XmlElement(name = "pedido-referencia")
    protected Pedido pedidoReferencia;
    @XmlElement(name = "dados-titular-pagamento")
    protected DadosCadastraisPF dadosTitularPagamento;
    @XmlElement(name = "contato-titular-pagamento")
    protected Contato contatoTitularPagamento;
    @XmlElement(name = "situacao-pagamento")
    protected Situacao situacaoPagamento;
    @XmlElement(name = "situacao-pagamento-broker")
    protected Situacao situacaoPagamentoBroker;
    @XmlElement(name = "url-redirecionamento")
    protected String urlRedirecionamento;
    @XmlElement(name = "url-notificacao")
    protected String urlNotificacao;
    @XmlElement(name = "qtd-maxima-uso-codigo-pagamento")
    protected Integer qtdMaximaUsoCodigoPagamento;
    @XmlElement(name = "expiracao-codigo-pagamento-seg")
    protected Integer expiracaoCodigoPagamentoSeg;
    @XmlElement(name = "contexto-pagamento")
    protected AtributoList contextoPagamento;
    @XmlElement(name = "data-liberacao-saque")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataLiberacaoSaque;

    /**
     * Gets the value of the idTransacaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacaoPagamento() {
        return idTransacaoPagamento;
    }

    /**
     * Sets the value of the idTransacaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacaoPagamento(String value) {
        this.idTransacaoPagamento = value;
    }

    /**
     * Gets the value of the codigoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPagamento() {
        return codigoPagamento;
    }

    /**
     * Sets the value of the codigoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPagamento(String value) {
        this.codigoPagamento = value;
    }

    /**
     * Gets the value of the idNotificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNotificacao() {
        return idNotificacao;
    }

    /**
     * Sets the value of the idNotificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNotificacao(String value) {
        this.idNotificacao = value;
    }

    /**
     * Gets the value of the dataCriacaoCodigoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacaoCodigoPagamento() {
        return dataCriacaoCodigoPagamento;
    }

    /**
     * Sets the value of the dataCriacaoCodigoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacaoCodigoPagamento(XMLGregorianCalendar value) {
        this.dataCriacaoCodigoPagamento = value;
    }

    /**
     * Gets the value of the dataCriacaoTransacaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacaoTransacaoPagamento() {
        return dataCriacaoTransacaoPagamento;
    }

    /**
     * Sets the value of the dataCriacaoTransacaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacaoTransacaoPagamento(XMLGregorianCalendar value) {
        this.dataCriacaoTransacaoPagamento = value;
    }

    /**
     * Gets the value of the valorTotalPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorTotalPagamento() {
        return valorTotalPagamento;
    }

    /**
     * Sets the value of the valorTotalPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorTotalPagamento(ValorMonetario value) {
        this.valorTotalPagamento = value;
    }

    /**
     * Gets the value of the valorExtraPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorExtraPagamento() {
        return valorExtraPagamento;
    }

    /**
     * Sets the value of the valorExtraPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorExtraPagamento(ValorMonetario value) {
        this.valorExtraPagamento = value;
    }

    /**
     * Gets the value of the valorDescontoFormaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorDescontoFormaPagamento() {
        return valorDescontoFormaPagamento;
    }

    /**
     * Sets the value of the valorDescontoFormaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorDescontoFormaPagamento(ValorMonetario value) {
        this.valorDescontoFormaPagamento = value;
    }

    /**
     * Gets the value of the valorTaxasBroker property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorTaxasBroker() {
        return valorTaxasBroker;
    }

    /**
     * Sets the value of the valorTaxasBroker property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorTaxasBroker(ValorMonetario value) {
        this.valorTaxasBroker = value;
    }

    /**
     * Gets the value of the valorLiquidoTransacao property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorLiquidoTransacao() {
        return valorLiquidoTransacao;
    }

    /**
     * Sets the value of the valorLiquidoTransacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorLiquidoTransacao(ValorMonetario value) {
        this.valorLiquidoTransacao = value;
    }

    /**
     * Gets the value of the dataPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPagamento() {
        return dataPagamento;
    }

    /**
     * Sets the value of the dataPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPagamento(XMLGregorianCalendar value) {
        this.dataPagamento = value;
    }

    /**
     * Gets the value of the metodoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link MetodoPagamento }
     *     
     */
    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    /**
     * Sets the value of the metodoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetodoPagamento }
     *     
     */
    public void setMetodoPagamento(MetodoPagamento value) {
        this.metodoPagamento = value;
    }

    /**
     * Gets the value of the configuracaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link MetodoPagamentoList }
     *     
     */
    public MetodoPagamentoList getConfiguracaoPagamento() {
        return configuracaoPagamento;
    }

    /**
     * Sets the value of the configuracaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link MetodoPagamentoList }
     *     
     */
    public void setConfiguracaoPagamento(MetodoPagamentoList value) {
        this.configuracaoPagamento = value;
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
     * Gets the value of the dadosTitularPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getDadosTitularPagamento() {
        return dadosTitularPagamento;
    }

    /**
     * Sets the value of the dadosTitularPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setDadosTitularPagamento(DadosCadastraisPF value) {
        this.dadosTitularPagamento = value;
    }

    /**
     * Gets the value of the contatoTitularPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContatoTitularPagamento() {
        return contatoTitularPagamento;
    }

    /**
     * Sets the value of the contatoTitularPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContatoTitularPagamento(Contato value) {
        this.contatoTitularPagamento = value;
    }

    /**
     * Gets the value of the situacaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoPagamento() {
        return situacaoPagamento;
    }

    /**
     * Sets the value of the situacaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoPagamento(Situacao value) {
        this.situacaoPagamento = value;
    }

    /**
     * Gets the value of the situacaoPagamentoBroker property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoPagamentoBroker() {
        return situacaoPagamentoBroker;
    }

    /**
     * Sets the value of the situacaoPagamentoBroker property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoPagamentoBroker(Situacao value) {
        this.situacaoPagamentoBroker = value;
    }

    /**
     * Gets the value of the urlRedirecionamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlRedirecionamento() {
        return urlRedirecionamento;
    }

    /**
     * Sets the value of the urlRedirecionamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlRedirecionamento(String value) {
        this.urlRedirecionamento = value;
    }

    /**
     * Gets the value of the urlNotificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlNotificacao() {
        return urlNotificacao;
    }

    /**
     * Sets the value of the urlNotificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlNotificacao(String value) {
        this.urlNotificacao = value;
    }

    /**
     * Gets the value of the qtdMaximaUsoCodigoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQtdMaximaUsoCodigoPagamento() {
        return qtdMaximaUsoCodigoPagamento;
    }

    /**
     * Sets the value of the qtdMaximaUsoCodigoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQtdMaximaUsoCodigoPagamento(Integer value) {
        this.qtdMaximaUsoCodigoPagamento = value;
    }

    /**
     * Gets the value of the expiracaoCodigoPagamentoSeg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExpiracaoCodigoPagamentoSeg() {
        return expiracaoCodigoPagamentoSeg;
    }

    /**
     * Sets the value of the expiracaoCodigoPagamentoSeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExpiracaoCodigoPagamentoSeg(Integer value) {
        this.expiracaoCodigoPagamentoSeg = value;
    }

    /**
     * Gets the value of the contextoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getContextoPagamento() {
        return contextoPagamento;
    }

    /**
     * Sets the value of the contextoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setContextoPagamento(AtributoList value) {
        this.contextoPagamento = value;
    }

    /**
     * Gets the value of the dataLiberacaoSaque property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataLiberacaoSaque() {
        return dataLiberacaoSaque;
    }

    /**
     * Sets the value of the dataLiberacaoSaque property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataLiberacaoSaque(XMLGregorianCalendar value) {
        this.dataLiberacaoSaque = value;
    }

}
