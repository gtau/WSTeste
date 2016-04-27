
package flow.MP.GeraAtendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AtendimentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtendimentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}Atendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtendimentoList", propOrder = {
    "atendimento"
})
public class AtendimentoList {

    protected List<Atendimento> atendimento;

    /**
     * Gets the value of the atendimento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atendimento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtendimento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Atendimento }
     * 
     * 
     */
    public List<Atendimento> getAtendimento() {
        if (atendimento == null) {
            atendimento = new ArrayList<Atendimento>();
        }
        return this.atendimento;
    }

}
