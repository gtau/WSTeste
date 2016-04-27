
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MetodoPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetodoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="forma-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="detalhe-forma-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="numero-parcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetodoPagamento", propOrder = {
    "formaPagamento",
    "detalheFormaPagamento",
    "numeroParcelas"
})
public class MetodoPagamento {

    @XmlElement(name = "forma-pagamento")
    protected TipoReferencia formaPagamento;
    @XmlElement(name = "detalhe-forma-pagamento")
    protected TipoReferencia detalheFormaPagamento;
    @XmlElement(name = "numero-parcelas")
    protected Integer numeroParcelas;

    /**
     * Gets the value of the formaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Sets the value of the formaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setFormaPagamento(TipoReferencia value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the detalheFormaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getDetalheFormaPagamento() {
        return detalheFormaPagamento;
    }

    /**
     * Sets the value of the detalheFormaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setDetalheFormaPagamento(TipoReferencia value) {
        this.detalheFormaPagamento = value;
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

}
