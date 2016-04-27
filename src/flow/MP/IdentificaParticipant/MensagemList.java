
package flow.MP.IdentificaParticipant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades Mensagem.
 * 
 * <p>Java class for MensagemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MensagemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mensagem" type="{http://ebo.multiplusfidelidade.com.br/v1}Mensagem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MensagemList", propOrder = {
    "mensagem"
})
public class MensagemList {

    protected List<Mensagem> mensagem;

    /**
     * Gets the value of the mensagem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mensagem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensagem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mensagem }
     * 
     * 
     */
    public List<Mensagem> getMensagem() {
        if (mensagem == null) {
            mensagem = new ArrayList<Mensagem>();
        }
        return this.mensagem;
    }

}
