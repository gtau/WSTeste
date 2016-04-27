
package flow.MP.IdentificaParticipant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades Moeda.
 * 
 * <p>Java class for MoedaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoedaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moeda" type="{http://ebo.multiplusfidelidade.com.br/v1}Moeda" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoedaList", propOrder = {
    "moeda"
})
public class MoedaList {

    protected List<Moeda> moeda;

    /**
     * Gets the value of the moeda property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moeda property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoeda().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Moeda }
     * 
     * 
     */
    public List<Moeda> getMoeda() {
        if (moeda == null) {
            moeda = new ArrayList<Moeda>();
        }
        return this.moeda;
    }

}
