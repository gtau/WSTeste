
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de acúmulos.
 * 
 * <p>Java class for AcumuloList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcumuloList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}Acumulo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcumuloList", propOrder = {
    "acumulo"
})
public class AcumuloList {

    protected List<Acumulo> acumulo;

    /**
     * Gets the value of the acumulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acumulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcumulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Acumulo }
     * 
     * 
     */
    public List<Acumulo> getAcumulo() {
        if (acumulo == null) {
            acumulo = new ArrayList<Acumulo>();
        }
        return this.acumulo;
    }

}
