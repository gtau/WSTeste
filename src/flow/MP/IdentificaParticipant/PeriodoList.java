
package flow.MP.IdentificaParticipant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="periodo" type="{http://ebo.multiplusfidelidade.com.br/v1}Periodo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodoList", propOrder = {
    "periodo"
})
public class PeriodoList {

    protected List<Periodo> periodo;

    /**
     * Gets the value of the periodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Periodo }
     * 
     * 
     */
    public List<Periodo> getPeriodo() {
        if (periodo == null) {
            periodo = new ArrayList<Periodo>();
        }
        return this.periodo;
    }

}
