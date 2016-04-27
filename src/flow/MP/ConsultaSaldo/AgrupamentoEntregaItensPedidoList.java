
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrupamentoEntregaItensPedidoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrupamentoEntregaItensPedidoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="agrupamento-entrega-itens-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}AgrupamentoEntregaItensPedido" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrupamentoEntregaItensPedidoList", propOrder = {
    "agrupamentoEntregaItensPedido"
})
public class AgrupamentoEntregaItensPedidoList {

    @XmlElement(name = "agrupamento-entrega-itens-pedido")
    protected List<AgrupamentoEntregaItensPedido> agrupamentoEntregaItensPedido;

    /**
     * Gets the value of the agrupamentoEntregaItensPedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agrupamentoEntregaItensPedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgrupamentoEntregaItensPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgrupamentoEntregaItensPedido }
     * 
     * 
     */
    public List<AgrupamentoEntregaItensPedido> getAgrupamentoEntregaItensPedido() {
        if (agrupamentoEntregaItensPedido == null) {
            agrupamentoEntregaItensPedido = new ArrayList<AgrupamentoEntregaItensPedido>();
        }
        return this.agrupamentoEntregaItensPedido;
    }

}
