
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades DemonstrativoAcumulo.
 * 
 * <p>Java class for DemonstrativoAcumuloList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemonstrativoAcumuloList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="demonstrativo-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}DemonstrativoAcumulo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemonstrativoAcumuloList", propOrder = {
    "demonstrativoAcumulo"
})
public class DemonstrativoAcumuloList {

    @XmlElement(name = "demonstrativo-acumulo")
    protected List<DemonstrativoAcumulo> demonstrativoAcumulo;

    /**
     * Gets the value of the demonstrativoAcumulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demonstrativoAcumulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemonstrativoAcumulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DemonstrativoAcumulo }
     * 
     * 
     */
    public List<DemonstrativoAcumulo> getDemonstrativoAcumulo() {
        if (demonstrativoAcumulo == null) {
            demonstrativoAcumulo = new ArrayList<DemonstrativoAcumulo>();
        }
        return this.demonstrativoAcumulo;
    }

}
