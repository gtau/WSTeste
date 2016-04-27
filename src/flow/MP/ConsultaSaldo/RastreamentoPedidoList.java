
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RastreamentoPedidoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RastreamentoPedidoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rastreamento-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoPedido" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RastreamentoPedidoList", propOrder = {
    "rastreamentoPedido"
})
public class RastreamentoPedidoList {

    @XmlElement(name = "rastreamento-pedido")
    protected List<RastreamentoPedido> rastreamentoPedido;

    /**
     * Gets the value of the rastreamentoPedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rastreamentoPedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRastreamentoPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RastreamentoPedido }
     * 
     * 
     */
    public List<RastreamentoPedido> getRastreamentoPedido() {
        if (rastreamentoPedido == null) {
            rastreamentoPedido = new ArrayList<RastreamentoPedido>();
        }
        return this.rastreamentoPedido;
    }

}
