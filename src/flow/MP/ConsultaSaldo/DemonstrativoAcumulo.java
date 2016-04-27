
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um demonstrativo detalhado com todos os valores parciais dos quais é composto
 * 				um acúmulo.
 * 
 * <p>Java class for DemonstrativoAcumulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemonstrativoAcumulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itens-demonstrativo" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemDemonstrativoAcumuloList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemonstrativoAcumulo", propOrder = {
    "itensDemonstrativo"
})
public class DemonstrativoAcumulo {

    @XmlElement(name = "itens-demonstrativo")
    protected ItemDemonstrativoAcumuloList itensDemonstrativo;

    /**
     * Gets the value of the itensDemonstrativo property.
     * 
     * @return
     *     possible object is
     *     {@link ItemDemonstrativoAcumuloList }
     *     
     */
    public ItemDemonstrativoAcumuloList getItensDemonstrativo() {
        return itensDemonstrativo;
    }

    /**
     * Sets the value of the itensDemonstrativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemDemonstrativoAcumuloList }
     *     
     */
    public void setItensDemonstrativo(ItemDemonstrativoAcumuloList value) {
        this.itensDemonstrativo = value;
    }

}
