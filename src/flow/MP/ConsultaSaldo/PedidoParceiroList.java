
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidoParceiroList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoParceiroList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedido-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}PedidoParceiro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoParceiroList", propOrder = {
    "pedidoParceiro"
})
public class PedidoParceiroList {

    @XmlElement(name = "pedido-parceiro")
    protected List<PedidoParceiro> pedidoParceiro;

    /**
     * Gets the value of the pedidoParceiro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedidoParceiro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedidoParceiro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PedidoParceiro }
     * 
     * 
     */
    public List<PedidoParceiro> getPedidoParceiro() {
        if (pedidoParceiro == null) {
            pedidoParceiro = new ArrayList<PedidoParceiro>();
        }
        return this.pedidoParceiro;
    }

}
