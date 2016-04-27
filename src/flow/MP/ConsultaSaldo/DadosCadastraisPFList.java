
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCadastraisPFList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCadastraisPFList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados-cadastrais-pf" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCadastraisPFList", propOrder = {
    "dadosCadastraisPf"
})
public class DadosCadastraisPFList {

    @XmlElement(name = "dados-cadastrais-pf")
    protected List<DadosCadastraisPF> dadosCadastraisPf;

    /**
     * Gets the value of the dadosCadastraisPf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosCadastraisPf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosCadastraisPf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosCadastraisPF }
     * 
     * 
     */
    public List<DadosCadastraisPF> getDadosCadastraisPf() {
        if (dadosCadastraisPf == null) {
            dadosCadastraisPf = new ArrayList<DadosCadastraisPF>();
        }
        return this.dadosCadastraisPf;
    }

}
