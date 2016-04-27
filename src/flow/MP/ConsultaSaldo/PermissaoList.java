
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades Usuario.
 * 
 * <p>Java class for PermissaoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissaoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="permissao" type="{http://ebo.multiplusfidelidade.com.br/v1}Permissao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissaoList", propOrder = {
    "permissao"
})
public class PermissaoList {

    protected List<Permissao> permissao;

    /**
     * Gets the value of the permissao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permissao }
     * 
     * 
     */
    public List<Permissao> getPermissao() {
        if (permissao == null) {
            permissao = new ArrayList<Permissao>();
        }
        return this.permissao;
    }

}
