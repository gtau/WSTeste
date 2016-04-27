
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProdutoResgatadoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoResgatadoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produto-resgatado" type="{http://ebo.multiplusfidelidade.com.br/v1}ProdutoResgatado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoResgatadoList", propOrder = {
    "produtoResgatado"
})
public class ProdutoResgatadoList {

    @XmlElement(name = "produto-resgatado")
    protected List<ProdutoResgatado> produtoResgatado;

    /**
     * Gets the value of the produtoResgatado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the produtoResgatado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProdutoResgatado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProdutoResgatado }
     * 
     * 
     */
    public List<ProdutoResgatado> getProdutoResgatado() {
        if (produtoResgatado == null) {
            produtoResgatado = new ArrayList<ProdutoResgatado>();
        }
        return this.produtoResgatado;
    }

}
