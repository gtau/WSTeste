
package flow.MP.RedefineSenha;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de máquinas.
 * 
 * <p>Java class for MaquinaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaquinaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maquina" type="{http://ebo.multiplusfidelidade.com.br/v1}Maquina" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaquinaList", propOrder = {
    "maquina"
})
public class MaquinaList {

    protected List<Maquina> maquina;

    /**
     * Gets the value of the maquina property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maquina property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaquina().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Maquina }
     * 
     * 
     */
    public List<Maquina> getMaquina() {
        if (maquina == null) {
            maquina = new ArrayList<Maquina>();
        }
        return this.maquina;
    }

}
