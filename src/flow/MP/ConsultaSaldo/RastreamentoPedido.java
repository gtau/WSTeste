
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa um tracking de rastreamento de um pedido; utilizado principalmente
 * 			para rastrear o fulfillment de pedidos de commerce no parceiro, porem pode
 * 			ser utilizada para qualquer tipo de pedido.
 * 
 * <p>Java class for RastreamentoPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RastreamentoPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao-atual" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="historico-situacao" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoList" minOccurs="0"/>
 *         &lt;element name="nome-provedor-entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-rastreamento-provedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-pedido-entregue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-entrega" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-previsao-entrega" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="descricao-previsao-entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RastreamentoPedido", propOrder = {
    "situacaoAtual",
    "historicoSituacao",
    "nomeProvedorEntrega",
    "codigoRastreamentoProvedor",
    "indicadorPedidoEntregue",
    "dataEntrega",
    "dataPrevisaoEntrega",
    "descricaoPrevisaoEntrega"
})
public class RastreamentoPedido {

    @XmlElement(name = "situacao-atual")
    protected Situacao situacaoAtual;
    @XmlElement(name = "historico-situacao")
    protected SituacaoList historicoSituacao;
    @XmlElement(name = "nome-provedor-entrega")
    protected String nomeProvedorEntrega;
    @XmlElement(name = "codigo-rastreamento-provedor")
    protected String codigoRastreamentoProvedor;
    @XmlElement(name = "indicador-pedido-entregue")
    protected Boolean indicadorPedidoEntregue;
    @XmlElement(name = "data-entrega")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEntrega;
    @XmlElement(name = "data-previsao-entrega")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPrevisaoEntrega;
    @XmlElement(name = "descricao-previsao-entrega")
    protected String descricaoPrevisaoEntrega;

    /**
     * Gets the value of the situacaoAtual property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoAtual() {
        return situacaoAtual;
    }

    /**
     * Sets the value of the situacaoAtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoAtual(Situacao value) {
        this.situacaoAtual = value;
    }

    /**
     * Gets the value of the historicoSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoList }
     *     
     */
    public SituacaoList getHistoricoSituacao() {
        return historicoSituacao;
    }

    /**
     * Sets the value of the historicoSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoList }
     *     
     */
    public void setHistoricoSituacao(SituacaoList value) {
        this.historicoSituacao = value;
    }

    /**
     * Gets the value of the nomeProvedorEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProvedorEntrega() {
        return nomeProvedorEntrega;
    }

    /**
     * Sets the value of the nomeProvedorEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProvedorEntrega(String value) {
        this.nomeProvedorEntrega = value;
    }

    /**
     * Gets the value of the codigoRastreamentoProvedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRastreamentoProvedor() {
        return codigoRastreamentoProvedor;
    }

    /**
     * Sets the value of the codigoRastreamentoProvedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRastreamentoProvedor(String value) {
        this.codigoRastreamentoProvedor = value;
    }

    /**
     * Gets the value of the indicadorPedidoEntregue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorPedidoEntregue() {
        return indicadorPedidoEntregue;
    }

    /**
     * Sets the value of the indicadorPedidoEntregue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorPedidoEntregue(Boolean value) {
        this.indicadorPedidoEntregue = value;
    }

    /**
     * Gets the value of the dataEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEntrega() {
        return dataEntrega;
    }

    /**
     * Sets the value of the dataEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEntrega(XMLGregorianCalendar value) {
        this.dataEntrega = value;
    }

    /**
     * Gets the value of the dataPrevisaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPrevisaoEntrega() {
        return dataPrevisaoEntrega;
    }

    /**
     * Sets the value of the dataPrevisaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPrevisaoEntrega(XMLGregorianCalendar value) {
        this.dataPrevisaoEntrega = value;
    }

    /**
     * Gets the value of the descricaoPrevisaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPrevisaoEntrega() {
        return descricaoPrevisaoEntrega;
    }

    /**
     * Sets the value of the descricaoPrevisaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPrevisaoEntrega(String value) {
        this.descricaoPrevisaoEntrega = value;
    }

}
