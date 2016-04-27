
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um contexto de pagamento.
 * 
 * <p>Java class for ContextoPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContextoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-total-compra" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContextoPagamento", propOrder = {
    "valorPagamento",
    "valorTotalCompra"
})
public class ContextoPagamento {

    @XmlElement(name = "valor-pagamento")
    protected ValorMonetario valorPagamento;
    @XmlElement(name = "valor-total-compra")
    protected ValorMonetario valorTotalCompra;

    /**
     * Gets the value of the valorPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorPagamento() {
        return valorPagamento;
    }

    /**
     * Sets the value of the valorPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorPagamento(ValorMonetario value) {
        this.valorPagamento = value;
    }

    /**
     * Gets the value of the valorTotalCompra property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorTotalCompra() {
        return valorTotalCompra;
    }

    /**
     * Sets the value of the valorTotalCompra property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorTotalCompra(ValorMonetario value) {
        this.valorTotalCompra = value;
    }

}
