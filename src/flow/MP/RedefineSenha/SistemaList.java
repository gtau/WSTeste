
package flow.MP.RedefineSenha;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SistemaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SistemaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistema" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SistemaList", propOrder = {
    "sistema"
})
public class SistemaList {

    protected List<Sistema> sistema;

    /**
     * Gets the value of the sistema property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sistema property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSistema().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sistema }
     * 
     * 
     */
    public List<Sistema> getSistema() {
        if (sistema == null) {
            sistema = new ArrayList<Sistema>();
        }
        return this.sistema;
    }

}
