
package flow.MP.ConsultaParticipante;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CanalList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canal" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanalList", propOrder = {
    "canal"
})
public class CanalList {

    protected List<Canal> canal;

    /**
     * Gets the value of the canal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the canal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCanal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Canal }
     * 
     * 
     */
    public List<Canal> getCanal() {
        if (canal == null) {
            canal = new ArrayList<Canal>();
        }
        return this.canal;
    }

}
