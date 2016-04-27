
package flow.MP.GeraAtendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramaFidelidadeParticipanteList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramaFidelidadeParticipanteList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programa-fidelidade-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}ProgramaFidelidadeParticipante" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramaFidelidadeParticipanteList", propOrder = {
    "programaFidelidadeParticipante"
})
public class ProgramaFidelidadeParticipanteList {

    @XmlElement(name = "programa-fidelidade-participante")
    protected List<ProgramaFidelidadeParticipante> programaFidelidadeParticipante;

    /**
     * Gets the value of the programaFidelidadeParticipante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programaFidelidadeParticipante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramaFidelidadeParticipante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramaFidelidadeParticipante }
     * 
     * 
     */
    public List<ProgramaFidelidadeParticipante> getProgramaFidelidadeParticipante() {
        if (programaFidelidadeParticipante == null) {
            programaFidelidadeParticipante = new ArrayList<ProgramaFidelidadeParticipante>();
        }
        return this.programaFidelidadeParticipante;
    }

}
