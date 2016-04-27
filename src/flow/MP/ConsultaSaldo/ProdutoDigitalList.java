
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoDigitalList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoDigitalList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produto-digital" type="{http://ebo.multiplusfidelidade.com.br/v1}ProdutoDigital" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoDigitalList", propOrder = {
    "produtoDigital"
})
public class ProdutoDigitalList {

    @XmlElement(name = "produto-digital")
    protected List<ProdutoDigital> produtoDigital;

    /**
     * Gets the value of the produtoDigital property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produtoDigital property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdutoDigital().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdutoDigital }
     * 
     * 
     */
    public List<ProdutoDigital> getProdutoDigital() {
        if (produtoDigital == null) {
            produtoDigital = new ArrayList<ProdutoDigital>();
        }
        return this.produtoDigital;
    }

}
