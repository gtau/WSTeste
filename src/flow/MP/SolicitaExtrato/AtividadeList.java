
package flow.MP.SolicitaExtrato;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtividadeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtividadeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atividade" type="{http://ebo.multiplusfidelidade.com.br/v1}Atividade" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtividadeList", propOrder = {
    "atividade"
})
public class AtividadeList {

    protected List<Atividade> atividade;

    /**
     * Gets the value of the atividade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atividade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtividade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Atividade }
     * 
     * 
     */
    public List<Atividade> getAtividade() {
        if (atividade == null) {
            atividade = new ArrayList<Atividade>();
        }
        return this.atividade;
    }

}
