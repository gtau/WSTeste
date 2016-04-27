
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista da entidade.
 * 
 * <p>Java class for CategoriaVeiculoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoriaVeiculoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="categoria-veiculo" type="{http://ebo.multiplusfidelidade.com.br/v1}CategoriaVeiculo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaVeiculoList", propOrder = {
    "categoriaVeiculo"
})
public class CategoriaVeiculoList {

    @XmlElement(name = "categoria-veiculo")
    protected List<CategoriaVeiculo> categoriaVeiculo;

    /**
     * Gets the value of the categoriaVeiculo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoriaVeiculo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoriaVeiculo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoriaVeiculo }
     * 
     * 
     */
    public List<CategoriaVeiculo> getCategoriaVeiculo() {
        if (categoriaVeiculo == null) {
            categoriaVeiculo = new ArrayList<CategoriaVeiculo>();
        }
        return this.categoriaVeiculo;
    }

}
