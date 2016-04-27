
package flow.MP.EnviaEmail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de recibo-entrega
 * 
 * <p>Java class for ReciboEntregaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReciboEntregaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recibo-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}ReciboEntrega" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReciboEntregaList", propOrder = {
    "reciboEntrega"
})
public class ReciboEntregaList {

    @XmlElement(name = "recibo-entrega")
    protected List<ReciboEntrega> reciboEntrega;

    /**
     * Gets the value of the reciboEntrega property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reciboEntrega property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReciboEntrega().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReciboEntrega }
     * 
     * 
     */
    public List<ReciboEntrega> getReciboEntrega() {
        if (reciboEntrega == null) {
            reciboEntrega = new ArrayList<ReciboEntrega>();
        }
        return this.reciboEntrega;
    }

}
