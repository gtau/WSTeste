
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representação de uma operação de Acumulo na Multiplus; seus campos básicos devem ser
 * 				representados através do atributo transacao-acumulo:Transacao
 * 
 * <p>Java class for Acumulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acumulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transacao-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *         &lt;element name="transacao-resgate-relacionada" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *         &lt;element name="produto-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}Produto" minOccurs="0"/>
 *         &lt;element name="demonstrativo-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}DemonstrativoAcumulo" minOccurs="0"/>
 *         &lt;element name="item-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedido" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acumulo", propOrder = {
    "transacaoAcumulo",
    "transacaoResgateRelacionada",
    "produtoAcumulo",
    "demonstrativoAcumulo",
    "itemPedido"
})
public class Acumulo {

    @XmlElement(name = "transacao-acumulo")
    protected Transacao transacaoAcumulo;
    @XmlElement(name = "transacao-resgate-relacionada")
    protected Transacao transacaoResgateRelacionada;
    @XmlElement(name = "produto-acumulo")
    protected Produto produtoAcumulo;
    @XmlElement(name = "demonstrativo-acumulo")
    protected DemonstrativoAcumulo demonstrativoAcumulo;
    @XmlElement(name = "item-pedido")
    protected ItemPedido itemPedido;

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

    /**
     * Gets the value of the transacaoResgateRelacionada property.
     * 
     * @return
     *     possible object is
     *     {@link Transacao }
     *     
     */
    public Transacao getTransacaoResgateRelacionada() {
        return transacaoResgateRelacionada;
    }

    /**
     * Sets the value of the transacaoResgateRelacionada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transacao }
     *     
     */
    public void setTransacaoResgateRelacionada(Transacao value) {
        this.transacaoResgateRelacionada = value;
    }

    /**
     * Gets the value of the produtoAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProdutoAcumulo() {
        return produtoAcumulo;
    }

    /**
     * Sets the value of the produtoAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProdutoAcumulo(Produto value) {
        this.produtoAcumulo = value;
    }

    /**
     * Gets the value of the demonstrativoAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link DemonstrativoAcumulo }
     *     
     */
    public DemonstrativoAcumulo getDemonstrativoAcumulo() {
        return demonstrativoAcumulo;
    }

    /**
     * Sets the value of the demonstrativoAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemonstrativoAcumulo }
     *     
     */
    public void setDemonstrativoAcumulo(DemonstrativoAcumulo value) {
        this.demonstrativoAcumulo = value;
    }

    /**
     * Gets the value of the itemPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedido }
     *     
     */
    public ItemPedido getItemPedido() {
        return itemPedido;
    }

    /**
     * Sets the value of the itemPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedido }
     *     
     */
    public void setItemPedido(ItemPedido value) {
        this.itemPedido = value;
    }

}
