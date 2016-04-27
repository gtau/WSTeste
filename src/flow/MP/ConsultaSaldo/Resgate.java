
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa��o de uma opera��o de Resgate na Multiplus; enquanto o participante est� negociando um resgate,
 * 				as informa��es negociadas, os itens de um carrinho de compra, etc., s�o representados atrav�s das entidades Pedido e ItemPedido;
 * 				ap�s a confirma��o de um pedido e efetiva��o do resgate, as informa��es resultantes do resgate s�o representadas
 * 				a partir desta entidade;
 * 
 * 				Como a Multiplus permite a negocia��o de um pedido com diversos itens, em que cada item pode ser de um parceiro diferente, e
 * 				m�ltiplas unidades do mesmo item podem ser solicitadas no mesmo pedido, cada item do pedido pode resultar num Resgate
 * 				diferentes;
 * 
 * 				Esta entidade possui refer�ncia para o participante que realizou o resgate, para o item que foi resgatado (sku, produto, quantidade),
 * 				al�m das informa��es do benefici�rio do resgate (quem recebeu o produto/servi�o)
 * 
 * 				Seus campos b�sicos devem ser representados atrav�s do atributo transacao-resgate:Transacao
 * 
 * <p>Java class for Resgate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Resgate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transacao-resgate" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *         &lt;element name="item-resgate" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedido" minOccurs="0"/>
 *         &lt;element name="beneficiario-resgate" type="{http://ebo.multiplusfidelidade.com.br/v1}BeneficiarioResgate" minOccurs="0"/>
 *         &lt;element name="opcao-resgate-monetizado" type="{http://ebo.multiplusfidelidade.com.br/v1}OpcaoResgateMonetizado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Resgate", propOrder = {
    "transacaoResgate",
    "itemResgate",
    "beneficiarioResgate",
    "opcaoResgateMonetizado"
})
public class Resgate {

    @XmlElement(name = "transacao-resgate")
    protected Transacao transacaoResgate;
    @XmlElement(name = "item-resgate")
    protected ItemPedido itemResgate;
    @XmlElement(name = "beneficiario-resgate")
    protected BeneficiarioResgate beneficiarioResgate;
    @XmlElement(name = "opcao-resgate-monetizado")
    protected OpcaoResgateMonetizado opcaoResgateMonetizado;

    /**
     * Gets the value of the transacaoResgate property.
     * 
     * @return
     *     possible object is
     *     {@link Transacao }
     *     
     */
    public Transacao getTransacaoResgate() {
        return transacaoResgate;
    }

    /**
     * Sets the value of the transacaoResgate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transacao }
     *     
     */
    public void setTransacaoResgate(Transacao value) {
        this.transacaoResgate = value;
    }

    /**
     * Gets the value of the itemResgate property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedido }
     *     
     */
    public ItemPedido getItemResgate() {
        return itemResgate;
    }

    /**
     * Sets the value of the itemResgate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedido }
     *     
     */
    public void setItemResgate(ItemPedido value) {
        this.itemResgate = value;
    }

    /**
     * Gets the value of the beneficiarioResgate property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiarioResgate }
     *     
     */
    public BeneficiarioResgate getBeneficiarioResgate() {
        return beneficiarioResgate;
    }

    /**
     * Sets the value of the beneficiarioResgate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiarioResgate }
     *     
     */
    public void setBeneficiarioResgate(BeneficiarioResgate value) {
        this.beneficiarioResgate = value;
    }

    /**
     * Gets the value of the opcaoResgateMonetizado property.
     * 
     * @return
     *     possible object is
     *     {@link OpcaoResgateMonetizado }
     *     
     */
    public OpcaoResgateMonetizado getOpcaoResgateMonetizado() {
        return opcaoResgateMonetizado;
    }

    /**
     * Sets the value of the opcaoResgateMonetizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpcaoResgateMonetizado }
     *     
     */
    public void setOpcaoResgateMonetizado(OpcaoResgateMonetizado value) {
        this.opcaoResgateMonetizado = value;
    }

}
