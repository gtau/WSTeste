
package flow.MP.VerificaPermissao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TelefoneList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TelefoneList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="telefone" type="{http://ebo.multiplusfidelidade.com.br/v1}Telefone" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TelefoneList", propOrder = {
    "telefone"
})
public class TelefoneList {

    protected List<Telefone> telefone;

    /**
     * Gets the value of the telefone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Telefone }
     * 
     * 
     */
    public List<Telefone> getTelefone() {
        if (telefone == null) {
            telefone = new ArrayList<Telefone>();
        }
        return this.telefone;
    }

}
