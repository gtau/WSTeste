
package flow.MP.IdentificaParticipant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegraTierList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegraTierList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regra-tier" type="{http://ebo.multiplusfidelidade.com.br/v1}RegraTier" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegraTierList", propOrder = {
    "regraTier"
})
public class RegraTierList {

    @XmlElement(name = "regra-tier")
    protected List<RegraTier> regraTier;

    /**
     * Gets the value of the regraTier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regraTier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegraTier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegraTier }
     * 
     * 
     */
    public List<RegraTier> getRegraTier() {
        if (regraTier == null) {
            regraTier = new ArrayList<RegraTier>();
        }
        return this.regraTier;
    }

}
