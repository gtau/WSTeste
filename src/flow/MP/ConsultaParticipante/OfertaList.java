
package flow.MP.ConsultaParticipante;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OfertaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfertaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="oferta" type="{http://ebo.multiplusfidelidade.com.br/v1}Oferta" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfertaList", propOrder = {
    "oferta"
})
public class OfertaList {

    protected List<Oferta> oferta;

    /**
     * Gets the value of the oferta property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oferta property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOferta().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Oferta }
     * 
     * 
     */
    public List<Oferta> getOferta() {
        if (oferta == null) {
            oferta = new ArrayList<Oferta>();
        }
        return this.oferta;
    }

}
