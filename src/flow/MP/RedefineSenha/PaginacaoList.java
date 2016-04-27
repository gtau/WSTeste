
package flow.MP.RedefineSenha;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de informações de paginação
 * 
 * <p>Java class for PaginacaoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaginacaoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sistema" type="{http://ebo.multiplusfidelidade.com.br/v1}Paginacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaginacaoList", propOrder = {
    "sistema"
})
public class PaginacaoList {

    protected List<Paginacao> sistema;

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
     * {@link Paginacao }
     * 
     * 
     */
    public List<Paginacao> getSistema() {
        if (sistema == null) {
            sistema = new ArrayList<Paginacao>();
        }
        return this.sistema;
    }

}
