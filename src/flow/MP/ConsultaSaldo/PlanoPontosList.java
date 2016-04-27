
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanoPontosList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanoPontosList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="plano-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}PlanoPontos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanoPontosList", propOrder = {
    "planoPontos"
})
public class PlanoPontosList {

    @XmlElement(name = "plano-pontos")
    protected List<PlanoPontos> planoPontos;

    /**
     * Gets the value of the planoPontos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planoPontos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanoPontos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanoPontos }
     * 
     * 
     */
    public List<PlanoPontos> getPlanoPontos() {
        if (planoPontos == null) {
            planoPontos = new ArrayList<PlanoPontos>();
        }
        return this.planoPontos;
    }

}
