
package flow.MP.VerificaPermissao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegulamentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulamentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regulamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Regulamento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulamentoList", propOrder = {
    "regulamento"
})
public class RegulamentoList {

    protected List<Regulamento> regulamento;

    /**
     * Gets the value of the regulamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regulamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegulamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Regulamento }
     * 
     * 
     */
    public List<Regulamento> getRegulamento() {
        if (regulamento == null) {
            regulamento = new ArrayList<Regulamento>();
        }
        return this.regulamento;
    }

}
