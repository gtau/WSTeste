
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssinaturaParticipanteList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssinaturaParticipanteList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assinatura-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}AssinaturaParticipante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssinaturaParticipanteList", propOrder = {
    "assinaturaParticipante"
})
public class AssinaturaParticipanteList {

    @XmlElement(name = "assinatura-participante")
    protected List<AssinaturaParticipante> assinaturaParticipante;

    /**
     * Gets the value of the assinaturaParticipante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assinaturaParticipante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssinaturaParticipante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssinaturaParticipante }
     * 
     * 
     */
    public List<AssinaturaParticipante> getAssinaturaParticipante() {
        if (assinaturaParticipante == null) {
            assinaturaParticipante = new ArrayList<AssinaturaParticipante>();
        }
        return this.assinaturaParticipante;
    }

}
