
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa o contexto do parceiro em uma integração com a Múltiplus.
 * 
 * <p>Java class for ContextoParceiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextoParceiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-transacao-parceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-transacao-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="contexto-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}ContextoPagamento" minOccurs="0"/>
 *         &lt;element name="cupom-fiscal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ponto-de-venda" type="{http://ebo.multiplusfidelidade.com.br/v1}PontoDeVenda" minOccurs="0"/>
 *         &lt;element name="canal-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="subcanal-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextoParceiro", propOrder = {
    "idTransacaoParceiro",
    "tipoTransacaoParceiro",
    "contextoPagamento",
    "cupomFiscal",
    "pontoDeVenda",
    "canalOrigem",
    "subcanalOrigem"
})
public class ContextoParceiro {

    @XmlElement(name = "id-transacao-parceiro")
    protected String idTransacaoParceiro;
    @XmlElement(name = "tipo-transacao-parceiro")
    protected TipoReferencia tipoTransacaoParceiro;
    @XmlElement(name = "contexto-pagamento")
    protected ContextoPagamento contextoPagamento;
    @XmlElement(name = "cupom-fiscal")
    protected String cupomFiscal;
    @XmlElement(name = "ponto-de-venda")
    protected PontoDeVenda pontoDeVenda;
    @XmlElement(name = "canal-origem")
    protected TipoReferencia canalOrigem;
    @XmlElement(name = "subcanal-origem")
    protected TipoReferencia subcanalOrigem;

    /**
     * Gets the value of the idTransacaoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacaoParceiro() {
        return idTransacaoParceiro;
    }

    /**
     * Sets the value of the idTransacaoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacaoParceiro(String value) {
        this.idTransacaoParceiro = value;
    }

    /**
     * Gets the value of the tipoTransacaoParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoTransacaoParceiro() {
        return tipoTransacaoParceiro;
    }

    /**
     * Sets the value of the tipoTransacaoParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoTransacaoParceiro(TipoReferencia value) {
        this.tipoTransacaoParceiro = value;
    }

    /**
     * Gets the value of the contextoPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ContextoPagamento }
     *     
     */
    public ContextoPagamento getContextoPagamento() {
        return contextoPagamento;
    }

    /**
     * Sets the value of the contextoPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContextoPagamento }
     *     
     */
    public void setContextoPagamento(ContextoPagamento value) {
        this.contextoPagamento = value;
    }

    /**
     * Gets the value of the cupomFiscal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCupomFiscal() {
        return cupomFiscal;
    }

    /**
     * Sets the value of the cupomFiscal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCupomFiscal(String value) {
        this.cupomFiscal = value;
    }

    /**
     * Gets the value of the pontoDeVenda property.
     * 
     * @return
     *     possible object is
     *     {@link PontoDeVenda }
     *     
     */
    public PontoDeVenda getPontoDeVenda() {
        return pontoDeVenda;
    }

    /**
     * Sets the value of the pontoDeVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link PontoDeVenda }
     *     
     */
    public void setPontoDeVenda(PontoDeVenda value) {
        this.pontoDeVenda = value;
    }

    /**
     * Gets the value of the canalOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCanalOrigem() {
        return canalOrigem;
    }

    /**
     * Sets the value of the canalOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCanalOrigem(TipoReferencia value) {
        this.canalOrigem = value;
    }

    /**
     * Gets the value of the subcanalOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSubcanalOrigem() {
        return subcanalOrigem;
    }

    /**
     * Sets the value of the subcanalOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSubcanalOrigem(TipoReferencia value) {
        this.subcanalOrigem = value;
    }

}
