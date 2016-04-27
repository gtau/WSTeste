
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrupamentoItensPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrupamentoItensPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agrupamentos-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}AgrupamentoEntregaItensPedidoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrupamentoItensPedido", propOrder = {
    "agrupamentosEntrega"
})
public class AgrupamentoItensPedido {

    @XmlElement(name = "agrupamentos-entrega")
    protected AgrupamentoEntregaItensPedidoList agrupamentosEntrega;

    /**
     * Gets the value of the agrupamentosEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link AgrupamentoEntregaItensPedidoList }
     *     
     */
    public AgrupamentoEntregaItensPedidoList getAgrupamentosEntrega() {
        return agrupamentosEntrega;
    }

    /**
     * Sets the value of the agrupamentosEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgrupamentoEntregaItensPedidoList }
     *     
     */
    public void setAgrupamentosEntrega(AgrupamentoEntregaItensPedidoList value) {
        this.agrupamentosEntrega = value;
    }

}
