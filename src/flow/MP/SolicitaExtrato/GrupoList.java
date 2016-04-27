
package flow.MP.SolicitaExtrato;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades Grupo.
 * 
 * <p>Java class for GrupoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrupoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grupo" type="{http://ebo.multiplusfidelidade.com.br/v1}Grupo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GrupoList", propOrder = {
    "grupo"
})
public class GrupoList {

    protected List<Grupo> grupo;

    /**
     * Gets the value of the grupo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Grupo }
     * 
     * 
     */
    public List<Grupo> getGrupo() {
        if (grupo == null) {
            grupo = new ArrayList<Grupo>();
        }
        return this.grupo;
    }

}
