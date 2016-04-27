
package flow.MP.EnviaEmail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssuntoComunicacaoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssuntoComunicacaoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assunto-comunicacao" type="{http://ebo.multiplusfidelidade.com.br/v1}AssuntoComunicacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssuntoComunicacaoList", propOrder = {
    "assuntoComunicacao"
})
public class AssuntoComunicacaoList {

    @XmlElement(name = "assunto-comunicacao")
    protected List<AssuntoComunicacao> assuntoComunicacao;

    /**
     * Gets the value of the assuntoComunicacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assuntoComunicacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssuntoComunicacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssuntoComunicacao }
     * 
     * 
     */
    public List<AssuntoComunicacao> getAssuntoComunicacao() {
        if (assuntoComunicacao == null) {
            assuntoComunicacao = new ArrayList<AssuntoComunicacao>();
        }
        return this.assuntoComunicacao;
    }

}
