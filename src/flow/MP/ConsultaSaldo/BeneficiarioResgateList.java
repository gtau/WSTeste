
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeneficiarioResgateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BeneficiarioResgateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="beneficiario-resgate" type="{http://ebo.multiplusfidelidade.com.br/v1}BeneficiarioResgate" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeneficiarioResgateList", propOrder = {
    "beneficiarioResgate"
})
public class BeneficiarioResgateList {

    @XmlElement(name = "beneficiario-resgate")
    protected List<BeneficiarioResgate> beneficiarioResgate;

    /**
     * Gets the value of the beneficiarioResgate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiarioResgate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiarioResgate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BeneficiarioResgate }
     * 
     * 
     */
    public List<BeneficiarioResgate> getBeneficiarioResgate() {
        if (beneficiarioResgate == null) {
            beneficiarioResgate = new ArrayList<BeneficiarioResgate>();
        }
        return this.beneficiarioResgate;
    }

}
