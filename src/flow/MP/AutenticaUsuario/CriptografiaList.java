
package flow.MP.AutenticaUsuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriptografiaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CriptografiaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criptografia" type="{http://ebo.multiplusfidelidade.com.br/v1}Criptografia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CriptografiaList", propOrder = {
    "criptografia"
})
public class CriptografiaList {

    protected List<Criptografia> criptografia;

    /**
     * Gets the value of the criptografia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criptografia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriptografia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Criptografia }
     * 
     * 
     */
    public List<Criptografia> getCriptografia() {
        if (criptografia == null) {
            criptografia = new ArrayList<Criptografia>();
        }
        return this.criptografia;
    }

}
