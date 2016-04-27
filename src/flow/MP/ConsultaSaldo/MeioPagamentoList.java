
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista.
 * 
 * <p>Java class for MeioPagamentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeioPagamentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meio-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}MeioPagamento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeioPagamentoList", propOrder = {
    "meioPagamento"
})
public class MeioPagamentoList {

    @XmlElement(name = "meio-pagamento")
    protected List<MeioPagamento> meioPagamento;

    /**
     * Gets the value of the meioPagamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meioPagamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeioPagamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeioPagamento }
     * 
     * 
     */
    public List<MeioPagamento> getMeioPagamento() {
        if (meioPagamento == null) {
            meioPagamento = new ArrayList<MeioPagamento>();
        }
        return this.meioPagamento;
    }

}
