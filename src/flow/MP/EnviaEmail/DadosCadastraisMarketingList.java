
package flow.MP.EnviaEmail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCadastraisMarketingList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCadastraisMarketingList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dados-cadastrais-marketing" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisMarketing" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCadastraisMarketingList", propOrder = {
    "dadosCadastraisMarketing"
})
public class DadosCadastraisMarketingList {

    @XmlElement(name = "dados-cadastrais-marketing")
    protected List<DadosCadastraisMarketing> dadosCadastraisMarketing;

    /**
     * Gets the value of the dadosCadastraisMarketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosCadastraisMarketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosCadastraisMarketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosCadastraisMarketing }
     * 
     * 
     */
    public List<DadosCadastraisMarketing> getDadosCadastraisMarketing() {
        if (dadosCadastraisMarketing == null) {
            dadosCadastraisMarketing = new ArrayList<DadosCadastraisMarketing>();
        }
        return this.dadosCadastraisMarketing;
    }

}
