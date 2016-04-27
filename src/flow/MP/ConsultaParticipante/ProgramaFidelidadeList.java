
package flow.MP.ConsultaParticipante;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramaFidelidadeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramaFidelidadeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programa-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}ProgramaFidelidade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramaFidelidadeList", propOrder = {
    "programaFidelidade"
})
public class ProgramaFidelidadeList {

    @XmlElement(name = "programa-fidelidade")
    protected List<ProgramaFidelidade> programaFidelidade;

    /**
     * Gets the value of the programaFidelidade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programaFidelidade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramaFidelidade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramaFidelidade }
     * 
     * 
     */
    public List<ProgramaFidelidade> getProgramaFidelidade() {
        if (programaFidelidade == null) {
            programaFidelidade = new ArrayList<ProgramaFidelidade>();
        }
        return this.programaFidelidade;
    }

}
