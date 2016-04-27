
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCadastraisPJList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCadastraisPJList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados-cadastrais-pj" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPJ" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCadastraisPJList", propOrder = {
    "dadosCadastraisPj"
})
public class DadosCadastraisPJList {

    @XmlElement(name = "dados-cadastrais-pj")
    protected List<DadosCadastraisPJ> dadosCadastraisPj;

    /**
     * Gets the value of the dadosCadastraisPj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosCadastraisPj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosCadastraisPj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosCadastraisPJ }
     * 
     * 
     */
    public List<DadosCadastraisPJ> getDadosCadastraisPj() {
        if (dadosCadastraisPj == null) {
            dadosCadastraisPj = new ArrayList<DadosCadastraisPJ>();
        }
        return this.dadosCadastraisPj;
    }

}
