
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ENTIDADE DEPRECIADA EM PROL DE "RastreamentoPedido"
 * 
 * <p>Java class for Rastreamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rastreamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produtos" type="{http://ebo.multiplusfidelidade.com.br/v1}SkuList" minOccurs="0"/>
 *         &lt;element name="situacao-atual" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoRastreamento" minOccurs="0"/>
 *         &lt;element name="situacao-original" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoRastreamento" minOccurs="0"/>
 *         &lt;element name="historico-situacao-original" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoRastreamentoList" minOccurs="0"/>
 *         &lt;element name="rastreamento-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoEntrega" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rastreamento", propOrder = {
    "produtos",
    "situacaoAtual",
    "situacaoOriginal",
    "historicoSituacaoOriginal",
    "rastreamentoEntrega"
})
public class Rastreamento {

    protected SkuList produtos;
    @XmlElement(name = "situacao-atual")
    protected SituacaoRastreamento situacaoAtual;
    @XmlElement(name = "situacao-original")
    protected SituacaoRastreamento situacaoOriginal;
    @XmlElement(name = "historico-situacao-original")
    protected SituacaoRastreamentoList historicoSituacaoOriginal;
    @XmlElement(name = "rastreamento-entrega")
    protected RastreamentoEntrega rastreamentoEntrega;

    /**
     * Gets the value of the produtos property.
     * 
     * @return
     *     possible object is
     *     {@link SkuList }
     *     
     */
    public SkuList getProdutos() {
        return produtos;
    }

    /**
     * Sets the value of the produtos property.
     * 
     * @param value
     *     allowed object is
     *     {@link SkuList }
     *     
     */
    public void setProdutos(SkuList value) {
        this.produtos = value;
    }

    /**
     * Gets the value of the situacaoAtual property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoRastreamento }
     *     
     */
    public SituacaoRastreamento getSituacaoAtual() {
        return situacaoAtual;
    }

    /**
     * Sets the value of the situacaoAtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoRastreamento }
     *     
     */
    public void setSituacaoAtual(SituacaoRastreamento value) {
        this.situacaoAtual = value;
    }

    /**
     * Gets the value of the situacaoOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoRastreamento }
     *     
     */
    public SituacaoRastreamento getSituacaoOriginal() {
        return situacaoOriginal;
    }

    /**
     * Sets the value of the situacaoOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoRastreamento }
     *     
     */
    public void setSituacaoOriginal(SituacaoRastreamento value) {
        this.situacaoOriginal = value;
    }

    /**
     * Gets the value of the historicoSituacaoOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoRastreamentoList }
     *     
     */
    public SituacaoRastreamentoList getHistoricoSituacaoOriginal() {
        return historicoSituacaoOriginal;
    }

    /**
     * Sets the value of the historicoSituacaoOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoRastreamentoList }
     *     
     */
    public void setHistoricoSituacaoOriginal(SituacaoRastreamentoList value) {
        this.historicoSituacaoOriginal = value;
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

}
