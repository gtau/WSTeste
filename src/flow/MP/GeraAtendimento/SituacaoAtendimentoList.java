
package flow.MP.GeraAtendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoAtendimentoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituacaoAtendimentoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoAtendimento" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoAtendimentoList", propOrder = {
    "situacaoPedido"
})
public class SituacaoAtendimentoList {

    @XmlElement(name = "situacao-pedido")
    protected List<SituacaoAtendimento> situacaoPedido;

    /**
     * Gets the value of the situacaoPedido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the situacaoPedido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSituacaoPedido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SituacaoAtendimento }
     * 
     * 
     */
    public List<SituacaoAtendimento> getSituacaoPedido() {
        if (situacaoPedido == null) {
            situacaoPedido = new ArrayList<SituacaoAtendimento>();
        }
        return this.situacaoPedido;
    }

}
