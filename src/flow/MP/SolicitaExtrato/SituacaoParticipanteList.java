
package flow.MP.SolicitaExtrato;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoParticipanteList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituacaoParticipanteList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoParticipante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoParticipanteList", propOrder = {
    "situacaoParticipante"
})
public class SituacaoParticipanteList {

    @XmlElement(name = "situacao-participante")
    protected List<SituacaoParticipante> situacaoParticipante;

    /**
     * Gets the value of the situacaoParticipante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situacaoParticipante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituacaoParticipante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituacaoParticipante }
     * 
     * 
     */
    public List<SituacaoParticipante> getSituacaoParticipante() {
        if (situacaoParticipante == null) {
            situacaoParticipante = new ArrayList<SituacaoParticipante>();
        }
        return this.situacaoParticipante;
    }

}
