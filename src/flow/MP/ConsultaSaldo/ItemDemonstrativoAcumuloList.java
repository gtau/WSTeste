
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades ItemDemonstrativoAcumulo.
 * 
 * <p>Java class for ItemDemonstrativoAcumuloList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDemonstrativoAcumuloList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item-demonstrativo-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemDemonstrativoAcumulo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDemonstrativoAcumuloList", propOrder = {
    "itemDemonstrativoAcumulo"
})
public class ItemDemonstrativoAcumuloList {

    @XmlElement(name = "item-demonstrativo-acumulo")
    protected List<ItemDemonstrativoAcumulo> itemDemonstrativoAcumulo;

    /**
     * Gets the value of the itemDemonstrativoAcumulo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemDemonstrativoAcumulo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDemonstrativoAcumulo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDemonstrativoAcumulo }
     * 
     * 
     */
    public List<ItemDemonstrativoAcumulo> getItemDemonstrativoAcumulo() {
        if (itemDemonstrativoAcumulo == null) {
            itemDemonstrativoAcumulo = new ArrayList<ItemDemonstrativoAcumulo>();
        }
        return this.itemDemonstrativoAcumulo;
    }

}
