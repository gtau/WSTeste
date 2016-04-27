
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoRastreamentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituacaoRastreamentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoRastreamento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoRastreamentoList", propOrder = {
    "situacao"
})
public class SituacaoRastreamentoList {

    protected List<SituacaoRastreamento> situacao;

    /**
     * Gets the value of the situacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituacaoRastreamento }
     * 
     * 
     */
    public List<SituacaoRastreamento> getSituacao() {
        if (situacao == null) {
            situacao = new ArrayList<SituacaoRastreamento>();
        }
        return this.situacao;
    }

}
