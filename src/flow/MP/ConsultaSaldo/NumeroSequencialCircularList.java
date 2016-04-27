
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de numeros.
 * 
 * <p>Java class for NumeroSequencialCircularList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NumeroSequencialCircularList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nsc" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroSequencialCircular" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroSequencialCircularList", propOrder = {
    "nsc"
})
public class NumeroSequencialCircularList {

    protected List<NumeroSequencialCircular> nsc;

    /**
     * Gets the value of the nsc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nsc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNsc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumeroSequencialCircular }
     * 
     * 
     */
    public List<NumeroSequencialCircular> getNsc() {
        if (nsc == null) {
            nsc = new ArrayList<NumeroSequencialCircular>();
        }
        return this.nsc;
    }

}
