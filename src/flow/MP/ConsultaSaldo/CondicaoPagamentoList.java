
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades.
 * 
 * <p>Java class for CondicaoPagamentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CondicaoPagamentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="condicao-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}CondicaoPagamento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CondicaoPagamentoList", propOrder = {
    "condicaoPagamento"
})
public class CondicaoPagamentoList {

    @XmlElement(name = "condicao-pagamento")
    protected List<CondicaoPagamento> condicaoPagamento;

    /**
     * Gets the value of the condicaoPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condicaoPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondicaoPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CondicaoPagamento }
     * 
     * 
     */
    public List<CondicaoPagamento> getCondicaoPagamento() {
        if (condicaoPagamento == null) {
            condicaoPagamento = new ArrayList<CondicaoPagamento>();
        }
        return this.condicaoPagamento;
    }

}
