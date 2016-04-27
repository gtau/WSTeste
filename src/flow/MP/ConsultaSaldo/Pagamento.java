
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Pagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-transacao-integrador-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-pagamento-gateway" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *         &lt;element name="id-transacao-adquirente" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *         &lt;element name="id-sessao-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="analise-antifraude" type="{http://ebo.multiplusfidelidade.com.br/v1}AnaliseAntiFraude" minOccurs="0"/>
 *         &lt;element name="codigo-autorizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comprovante-venda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pedido-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Pedido" minOccurs="0"/>
 *         &lt;element name="dados-titular" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *         &lt;element name="contato-titular" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="pais-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="valor-total" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-taxa-servico" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="numero-parcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="meio-pagamento-utilizado" type="{http://ebo.multiplusfidelidade.com.br/v1}MeioPagamento" minOccurs="0"/>
 *         &lt;element name="dados-cartao" type="{http://ebo.multiplusfidelidade.com.br/v1}CartaoImpresso" minOccurs="0"/>
 *         &lt;element name="contexto-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="canal" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="data-criacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="situacao-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="numero-tentativa-pagamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="bonus-recorrente" type="{http://ebo.multiplusfidelidade.com.br/v1}Bonus" minOccurs="0"/>
 *         &lt;element name="transacao-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pagamento", propOrder = {
    "idPagamento",
    "idTransacaoIntegradorPagamento",
    "idPagamentoGateway",
    "idTransacaoAdquirente",
    "idSessaoPagamento",
    "analiseAntifraude",
    "codigoAutorizacao",
    "comprovanteVenda",
    "pedidoReferencia",
    "dadosTitular",
    "contatoTitular",
    "paisOrigem",
    "valorTotal",
    "valorTaxaServico",
    "numeroParcelas",
    "meioPagamentoUtilizado",
    "dadosCartao",
    "contextoPagamento",
    "canal",
    "dataCriacao",
    "situacaoPagamento",
    "numeroTentativaPagamento",
    "bonusRecorrente",
    "transacaoAcumulo"
})
public class Pagamento {

    @XmlElement(name = "id-pagamento")
    protected String idPagamento;
    @XmlElement(name = "id-transacao-integrador-pagamento")
    protected String idTransacaoIntegradorPagamento;
    @XmlElement(name = "id-pagamento-gateway")
    protected Identificador idPagamentoGateway;
    @XmlElement(name = "id-transacao-adquirente")
    protected Identificador idTransacaoAdquirente;
    @XmlElement(name = "id-sessao-pagamento")
    protected String idSessaoPagamento;
    @XmlElement(name = "analise-antifraude")
    protected AnaliseAntiFraude analiseAntifraude;
    @XmlElement(name = "codigo-autorizacao")
    protected String codigoAutorizacao;
    @XmlElement(name = "comprovante-venda")
    protected String comprovanteVenda;
    @XmlElement(name = "pedido-referencia")
    protected Pedido pedidoReferencia;
    @XmlElement(name = "dados-titular")
    protected DadosCadastraisPF dadosTitular;
    @XmlElement(name = "contato-titular")
    protected Contato contatoTitular;
    @XmlElement(name = "pais-origem")
    protected TipoReferencia paisOrigem;
    @XmlElement(name = "valor-total")
    protected ValorMonetario valorTotal;
    @XmlElement(name = "valor-taxa-servico")
    protected ValorMonetario valorTaxaServico;
    @XmlElement(name = "numero-parcelas")
    protected Integer numeroParcelas;
    @XmlElement(name = "meio-pagamento-utilizado")
    protected MeioPagamento meioPagamentoUtilizado;
    @XmlElement(name = "dados-cartao")
    protected CartaoImpresso dadosCartao;
    @XmlElement(name = "contexto-pagamento")
    protected AtributoList contextoPagamento;
    protected Canal canal;
    @XmlElement(name = "data-criacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlElement(name = "situacao-pagamento")
    protected Situacao situacaoPagamento;
    @XmlElement(name = "numero-tentativa-pagamento")
    protected Integer numeroTentativaPagamento;
    @XmlElement(name = "bonus-recorrente")
    protected Bonus bonusRecorrente;
    @XmlElement(name = "transacao-acumulo")
    protected Transacao transacaoAcumulo;

    /**
     * Gets the value of the idPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPagamento() {
        return idPagamento;
    }

    /**
     * Sets the value of the idPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPagamento(String value) {
        this.idPagamento = value;
    }

    /**
     * Gets the value of the idTransacaoIntegradorPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacaoIntegradorPagamento() {
        return idTransacaoIntegradorPagamento;
    }

    /**
     * Sets the value of the idTransacaoIntegradorPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacaoIntegradorPagamento(String value) {
        this.idTransacaoIntegradorPagamento = value;
    }

    /**
     * Gets the value of the idPagamentoGateway property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getIdPagamentoGateway() {
        return idPagamentoGateway;
    }

    /**
     * Sets the value of the idPagamentoGateway property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setIdPagamentoGateway(Identificador value) {
        this.idPagamentoGateway = value;
    }

    /**
     * Gets the value of the idTransacaoAdquirente property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getIdTransacaoAdquirente() {
        return idTransacaoAdquirente;
    }

    /**
     * Sets the value of the idTransacaoAdquirente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setIdTransacaoAdquirente(Identificador value) {
        this.idTransacaoAdquirente = value;
    }

    /**
     * Gets the value of the idSessaoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSessaoPagamento() {
        return idSessaoPagamento;
    }

    /**
     * Sets the value of the idSessaoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSessaoPagamento(String value) {
        this.idSessaoPagamento = value;
    }

    /**
     * Gets the value of the analiseAntifraude property.
     * 
     * @return
     *     possible object is
     *     {@link AnaliseAntiFraude }
     *     
     */
    public AnaliseAntiFraude getAnaliseAntifraude() {
        return analiseAntifraude;
    }

    /**
     * Sets the value of the analiseAntifraude property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnaliseAntiFraude }
     *     
     */
    public void setAnaliseAntifraude(AnaliseAntiFraude value) {
        this.analiseAntifraude = value;
    }

    /**
     * Gets the value of the codigoAutorizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAutorizacao() {
        return codigoAutorizacao;
    }

    /**
     * Sets the value of the codigoAutorizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAutorizacao(String value) {
        this.codigoAutorizacao = value;
    }

    /**
     * Gets the value of the comprovanteVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComprovanteVenda() {
        return comprovanteVenda;
    }

    /**
     * Sets the value of the comprovanteVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComprovanteVenda(String value) {
        this.comprovanteVenda = value;
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
     * Gets the value of the dadosTitular property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getDadosTitular() {
        return dadosTitular;
    }

    /**
     * Sets the value of the dadosTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setDadosTitular(DadosCadastraisPF value) {
        this.dadosTitular = value;
    }

    /**
     * Gets the value of the contatoTitular property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContatoTitular() {
        return contatoTitular;
    }

    /**
     * Sets the value of the contatoTitular property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContatoTitular(Contato value) {
        this.contatoTitular = value;
    }

    /**
     * Gets the value of the paisOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getPaisOrigem() {
        return paisOrigem;
    }

    /**
     * Sets the value of the paisOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setPaisOrigem(TipoReferencia value) {
        this.paisOrigem = value;
    }

    /**
     * Gets the value of the valorTotal property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorTotal() {
        return valorTotal;
    }

    /**
     * Sets the value of the valorTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorTotal(ValorMonetario value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the valorTaxaServico property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorTaxaServico() {
        return valorTaxaServico;
    }

    /**
     * Sets the value of the valorTaxaServico property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorTaxaServico(ValorMonetario value) {
        this.valorTaxaServico = value;
    }

    /**
     * Gets the value of the numeroParcelas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * Sets the value of the numeroParcelas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroParcelas(Integer value) {
        this.numeroParcelas = value;
    }

    /**
     * Gets the value of the meioPagamentoUtilizado property.
     * 
     * @return
     *     possible object is
     *     {@link MeioPagamento }
     *     
     */
    public MeioPagamento getMeioPagamentoUtilizado() {
        return meioPagamentoUtilizado;
    }

    /**
     * Sets the value of the meioPagamentoUtilizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeioPagamento }
     *     
     */
    public void setMeioPagamentoUtilizado(MeioPagamento value) {
        this.meioPagamentoUtilizado = value;
    }

    /**
     * Gets the value of the dadosCartao property.
     * 
     * @return
     *     possible object is
     *     {@link CartaoImpresso }
     *     
     */
    public CartaoImpresso getDadosCartao() {
        return dadosCartao;
    }

    /**
     * Sets the value of the dadosCartao property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaoImpresso }
     *     
     */
    public void setDadosCartao(CartaoImpresso value) {
        this.dadosCartao = value;
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
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanal(Canal value) {
        this.canal = value;
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
     * Gets the value of the numeroTentativaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroTentativaPagamento() {
        return numeroTentativaPagamento;
    }

    /**
     * Sets the value of the numeroTentativaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroTentativaPagamento(Integer value) {
        this.numeroTentativaPagamento = value;
    }

    /**
     * Gets the value of the bonusRecorrente property.
     * 
     * @return
     *     possible object is
     *     {@link Bonus }
     *     
     */
    public Bonus getBonusRecorrente() {
        return bonusRecorrente;
    }

    /**
     * Sets the value of the bonusRecorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bonus }
     *     
     */
    public void setBonusRecorrente(Bonus value) {
        this.bonusRecorrente = value;
    }

    /**
     * Gets the value of the transacaoAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Transacao }
     *     
     */
    public Transacao getTransacaoAcumulo() {
        return transacaoAcumulo;
    }

    /**
     * Sets the value of the transacaoAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transacao }
     *     
     */
    public void setTransacaoAcumulo(Transacao value) {
        this.transacaoAcumulo = value;
    }

}
