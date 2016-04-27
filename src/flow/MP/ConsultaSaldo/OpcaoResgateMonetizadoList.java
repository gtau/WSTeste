
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpcaoResgateMonetizadoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpcaoResgateMonetizadoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="opcao-resgate-monetizado" type="{http://ebo.multiplusfidelidade.com.br/v1}OpcaoResgateMonetizado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpcaoResgateMonetizadoList", propOrder = {
    "opcaoResgateMonetizado"
})
public class OpcaoResgateMonetizadoList {

    @XmlElement(name = "opcao-resgate-monetizado")
    protected List<OpcaoResgateMonetizado> opcaoResgateMonetizado;

    /**
     * Gets the value of the opcaoResgateMonetizado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opcaoResgateMonetizado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpcaoResgateMonetizado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpcaoResgateMonetizado }
     * 
     * 
     */
    public List<OpcaoResgateMonetizado> getOpcaoResgateMonetizado() {
        if (opcaoResgateMonetizado == null) {
            opcaoResgateMonetizado = new ArrayList<OpcaoResgateMonetizado>();
        }
        return this.opcaoResgateMonetizado;
    }

}
