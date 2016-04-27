
package flow.MP.ConsultaParticipante;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampanhaParticipanteList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampanhaParticipanteList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campanha-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}CampanhaParticipante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanhaParticipanteList", propOrder = {
    "campanhaParticipante"
})
public class CampanhaParticipanteList {

    @XmlElement(name = "campanha-participante")
    protected List<CampanhaParticipante> campanhaParticipante;

    /**
     * Gets the value of the campanhaParticipante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campanhaParticipante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampanhaParticipante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampanhaParticipante }
     * 
     * 
     */
    public List<CampanhaParticipante> getCampanhaParticipante() {
        if (campanhaParticipante == null) {
            campanhaParticipante = new ArrayList<CampanhaParticipante>();
        }
        return this.campanhaParticipante;
    }

}
