
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadeOrganizacionalList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadeOrganizacionalList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unidade-organizacional" type="{http://ebo.multiplusfidelidade.com.br/v1}UnidadeOrganizacional" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadeOrganizacionalList", propOrder = {
    "unidadeOrganizacional"
})
public class UnidadeOrganizacionalList {

    @XmlElement(name = "unidade-organizacional")
    protected List<UnidadeOrganizacional> unidadeOrganizacional;

    /**
     * Gets the value of the unidadeOrganizacional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unidadeOrganizacional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnidadeOrganizacional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnidadeOrganizacional }
     * 
     * 
     */
    public List<UnidadeOrganizacional> getUnidadeOrganizacional() {
        if (unidadeOrganizacional == null) {
            unidadeOrganizacional = new ArrayList<UnidadeOrganizacional>();
        }
        return this.unidadeOrganizacional;
    }

}
