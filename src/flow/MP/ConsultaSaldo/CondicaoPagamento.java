
package flow.MP.ConsultaSaldo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CondicaoPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicaoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-parcelas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valor-primeira-parcela" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-demais-parcelas" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="taxa-juros-percentual" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoPagamento", propOrder = {
    "numeroParcelas",
    "valorPrimeiraParcela",
    "valorDemaisParcelas",
    "taxaJurosPercentual"
})
public class CondicaoPagamento {

    @XmlElement(name = "numero-parcelas")
    protected Integer numeroParcelas;
    @XmlElement(name = "valor-primeira-parcela")
    protected ValorMonetario valorPrimeiraParcela;
    @XmlElement(name = "valor-demais-parcelas")
    protected ValorMonetario valorDemaisParcelas;
    @XmlElement(name = "taxa-juros-percentual")
    protected BigDecimal taxaJurosPercentual;

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
     * Gets the value of the valorPrimeiraParcela property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorPrimeiraParcela() {
        return valorPrimeiraParcela;
    }

    /**
     * Sets the value of the valorPrimeiraParcela property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorPrimeiraParcela(ValorMonetario value) {
        this.valorPrimeiraParcela = value;
    }

    /**
     * Gets the value of the valorDemaisParcelas property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorDemaisParcelas() {
        return valorDemaisParcelas;
    }

    /**
     * Sets the value of the valorDemaisParcelas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorDemaisParcelas(ValorMonetario value) {
        this.valorDemaisParcelas = value;
    }

    /**
     * Gets the value of the taxaJurosPercentual property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxaJurosPercentual() {
        return taxaJurosPercentual;
    }

    /**
     * Sets the value of the taxaJurosPercentual property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxaJurosPercentual(BigDecimal value) {
        this.taxaJurosPercentual = value;
    }

}
