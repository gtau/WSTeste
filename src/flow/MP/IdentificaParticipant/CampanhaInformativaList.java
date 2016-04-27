
package flow.MP.IdentificaParticipant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades CampanhaInformativa.
 * 
 * <p>Java class for CampanhaInformativaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CampanhaInformativaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="campanha-informativa" type="{http://ebo.multiplusfidelidade.com.br/v1}CampanhaInformativa" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CampanhaInformativaList", propOrder = {
    "campanhaInformativa"
})
public class CampanhaInformativaList {

    @XmlElement(name = "campanha-informativa")
    protected List<CampanhaInformativa> campanhaInformativa;

    /**
     * Gets the value of the campanhaInformativa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the campanhaInformativa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCampanhaInformativa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CampanhaInformativa }
     * 
     * 
     */
    public List<CampanhaInformativa> getCampanhaInformativa() {
        if (campanhaInformativa == null) {
            campanhaInformativa = new ArrayList<CampanhaInformativa>();
        }
        return this.campanhaInformativa;
    }

}
