
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RastreamentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RastreamentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rastreamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Rastreamento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RastreamentoList", propOrder = {
    "rastreamento"
})
public class RastreamentoList {

    protected List<Rastreamento> rastreamento;

    /**
     * Gets the value of the rastreamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rastreamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRastreamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rastreamento }
     * 
     * 
     */
    public List<Rastreamento> getRastreamento() {
        if (rastreamento == null) {
            rastreamento = new ArrayList<Rastreamento>();
        }
        return this.rastreamento;
    }

}
