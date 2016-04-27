
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPedidoAereo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPedidoAereo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bilhete-eletronico" type="{http://ebo.multiplusfidelidade.com.br/v1}BilheteEletronico" minOccurs="0"/>
 *         &lt;element name="taxa-embarque" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="taxa-emissao" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="valor-parcela-monetaria" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="preco-custo-resgate" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPedidoAereo", propOrder = {
    "bilheteEletronico",
    "taxaEmbarque",
    "taxaEmissao",
    "valorParcelaMonetaria",
    "precoCustoResgate"
})
public class ItemPedidoAereo {

    @XmlElement(name = "bilhete-eletronico")
    protected BilheteEletronico bilheteEletronico;
    @XmlElement(name = "taxa-embarque")
    protected ValorMonetario taxaEmbarque;
    @XmlElement(name = "taxa-emissao")
    protected ValorMonetario taxaEmissao;
    @XmlElement(name = "valor-parcela-monetaria")
    protected ValorMonetario valorParcelaMonetaria;
    @XmlElement(name = "preco-custo-resgate")
    protected ValorMonetario precoCustoResgate;

    /**
     * Gets the value of the bilheteEletronico property.
     * 
     * @return
     *     possible object is
     *     {@link BilheteEletronico }
     *     
     */
    public BilheteEletronico getBilheteEletronico() {
        return bilheteEletronico;
    }

    /**
     * Sets the value of the bilheteEletronico property.
     * 
     * @param value
     *     allowed object is
     *     {@link BilheteEletronico }
     *     
     */
    public void setBilheteEletronico(BilheteEletronico value) {
        this.bilheteEletronico = value;
    }

    /**
     * Gets the value of the taxaEmbarque property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getTaxaEmbarque() {
        return taxaEmbarque;
    }

    /**
     * Sets the value of the taxaEmbarque property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setTaxaEmbarque(ValorMonetario value) {
        this.taxaEmbarque = value;
    }

    /**
     * Gets the value of the taxaEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getTaxaEmissao() {
        return taxaEmissao;
    }

    /**
     * Sets the value of the taxaEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setTaxaEmissao(ValorMonetario value) {
        this.taxaEmissao = value;
    }

    /**
     * Gets the value of the valorParcelaMonetaria property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorParcelaMonetaria() {
        return valorParcelaMonetaria;
    }

    /**
     * Sets the value of the valorParcelaMonetaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorParcelaMonetaria(ValorMonetario value) {
        this.valorParcelaMonetaria = value;
    }

    /**
     * Gets the value of the precoCustoResgate property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getPrecoCustoResgate() {
        return precoCustoResgate;
    }

    /**
     * Sets the value of the precoCustoResgate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setPrecoCustoResgate(ValorMonetario value) {
        this.precoCustoResgate = value;
    }

}
