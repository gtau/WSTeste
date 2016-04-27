
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AssinaturaParticipante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssinaturaParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="id-assinatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-externo-assinatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-assinatura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao-assinatura" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="data-adesao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="dia-pagamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="periodo" type="{http://ebo.multiplusfidelidade.com.br/v1}Periodo" minOccurs="0"/>
 *         &lt;element name="dados-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Pagamento" minOccurs="0"/>
 *         &lt;element name="pagamentos-processados" type="{http://ebo.multiplusfidelidade.com.br/v1}PagamentoList" minOccurs="0"/>
 *         &lt;element name="plano-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}PlanoPontos" minOccurs="0"/>
 *         &lt;element name="promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}Promocao" minOccurs="0"/>
 *         &lt;element name="data-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssinaturaParticipante", propOrder = {
    "participante",
    "idAssinatura",
    "codigoExternoAssinatura",
    "descricaoAssinatura",
    "situacaoAssinatura",
    "dataAdesao",
    "diaPagamento",
    "periodo",
    "dadosPagamento",
    "pagamentosProcessados",
    "planoPontos",
    "promocao",
    "dataUltimaAtualizacao"
})
public class AssinaturaParticipante {

    protected Participante participante;
    @XmlElement(name = "id-assinatura")
    protected String idAssinatura;
    @XmlElement(name = "codigo-externo-assinatura")
    protected String codigoExternoAssinatura;
    @XmlElement(name = "descricao-assinatura")
    protected String descricaoAssinatura;
    @XmlElement(name = "situacao-assinatura")
    protected Situacao situacaoAssinatura;
    @XmlElement(name = "data-adesao")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAdesao;
    @XmlElement(name = "dia-pagamento")
    protected Integer diaPagamento;
    protected Periodo periodo;
    @XmlElement(name = "dados-pagamento")
    protected Pagamento dadosPagamento;
    @XmlElement(name = "pagamentos-processados")
    protected PagamentoList pagamentosProcessados;
    @XmlElement(name = "plano-pontos")
    protected PlanoPontos planoPontos;
    protected Promocao promocao;
    @XmlElement(name = "data-ultima-atualizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltimaAtualizacao;

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
     * Gets the value of the idAssinatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAssinatura() {
        return idAssinatura;
    }

    /**
     * Sets the value of the idAssinatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAssinatura(String value) {
        this.idAssinatura = value;
    }

    /**
     * Gets the value of the codigoExternoAssinatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExternoAssinatura() {
        return codigoExternoAssinatura;
    }

    /**
     * Sets the value of the codigoExternoAssinatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExternoAssinatura(String value) {
        this.codigoExternoAssinatura = value;
    }

    /**
     * Gets the value of the descricaoAssinatura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoAssinatura() {
        return descricaoAssinatura;
    }

    /**
     * Sets the value of the descricaoAssinatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoAssinatura(String value) {
        this.descricaoAssinatura = value;
    }

    /**
     * Gets the value of the situacaoAssinatura property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoAssinatura() {
        return situacaoAssinatura;
    }

    /**
     * Sets the value of the situacaoAssinatura property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoAssinatura(Situacao value) {
        this.situacaoAssinatura = value;
    }

    /**
     * Gets the value of the dataAdesao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAdesao() {
        return dataAdesao;
    }

    /**
     * Sets the value of the dataAdesao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAdesao(XMLGregorianCalendar value) {
        this.dataAdesao = value;
    }

    /**
     * Gets the value of the diaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDiaPagamento() {
        return diaPagamento;
    }

    /**
     * Sets the value of the diaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDiaPagamento(Integer value) {
        this.diaPagamento = value;
    }

    /**
     * Gets the value of the periodo property.
     * 
     * @return
     *     possible object is
     *     {@link Periodo }
     *     
     */
    public Periodo getPeriodo() {
        return periodo;
    }

    /**
     * Sets the value of the periodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodo }
     *     
     */
    public void setPeriodo(Periodo value) {
        this.periodo = value;
    }

    /**
     * Gets the value of the dadosPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link Pagamento }
     *     
     */
    public Pagamento getDadosPagamento() {
        return dadosPagamento;
    }

    /**
     * Sets the value of the dadosPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagamento }
     *     
     */
    public void setDadosPagamento(Pagamento value) {
        this.dadosPagamento = value;
    }

    /**
     * Gets the value of the pagamentosProcessados property.
     * 
     * @return
     *     possible object is
     *     {@link PagamentoList }
     *     
     */
    public PagamentoList getPagamentosProcessados() {
        return pagamentosProcessados;
    }

    /**
     * Sets the value of the pagamentosProcessados property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagamentoList }
     *     
     */
    public void setPagamentosProcessados(PagamentoList value) {
        this.pagamentosProcessados = value;
    }

    /**
     * Gets the value of the planoPontos property.
     * 
     * @return
     *     possible object is
     *     {@link PlanoPontos }
     *     
     */
    public PlanoPontos getPlanoPontos() {
        return planoPontos;
    }

    /**
     * Sets the value of the planoPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanoPontos }
     *     
     */
    public void setPlanoPontos(PlanoPontos value) {
        this.planoPontos = value;
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

}
