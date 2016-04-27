
package flow.MP.GeraAtendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarioList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarioList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="calendario" type="{http://ebo.multiplusfidelidade.com.br/v1}Calendario" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarioList", propOrder = {
    "calendario"
})
public class CalendarioList {

    protected List<Calendario> calendario;

    /**
     * Gets the value of the calendario property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calendario property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalendario().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Calendario }
     * 
     * 
     */
    public List<Calendario> getCalendario() {
        if (calendario == null) {
            calendario = new ArrayList<Calendario>();
        }
        return this.calendario;
    }

}
