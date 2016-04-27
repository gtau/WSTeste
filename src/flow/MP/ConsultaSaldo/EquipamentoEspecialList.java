
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista da entidade.
 * 
 * <p>Java class for EquipamentoEspecialList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipamentoEspecialList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipamento-especial" type="{http://ebo.multiplusfidelidade.com.br/v1}EquipamentoEspecial" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipamentoEspecialList", propOrder = {
    "equipamentoEspecial"
})
public class EquipamentoEspecialList {

    @XmlElement(name = "equipamento-especial")
    protected List<EquipamentoEspecial> equipamentoEspecial;

    /**
     * Gets the value of the equipamentoEspecial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equipamentoEspecial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquipamentoEspecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquipamentoEspecial }
     * 
     * 
     */
    public List<EquipamentoEspecial> getEquipamentoEspecial() {
        if (equipamentoEspecial == null) {
            equipamentoEspecial = new ArrayList<EquipamentoEspecial>();
        }
        return this.equipamentoEspecial;
    }

}
