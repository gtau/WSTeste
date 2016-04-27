
package flow.MP.GeraAtendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InstrucaoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstrucaoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instrucao" type="{http://ebo.multiplusfidelidade.com.br/v1}Instrucao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrucaoList", propOrder = {
    "instrucao"
})
public class InstrucaoList {

    protected List<Instrucao> instrucao;

    /**
     * Gets the value of the instrucao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrucao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrucao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instrucao }
     * 
     * 
     */
    public List<Instrucao> getInstrucao() {
        if (instrucao == null) {
            instrucao = new ArrayList<Instrucao>();
        }
        return this.instrucao;
    }

}
