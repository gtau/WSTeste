
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um item de um demonstrativo de acúmulo, referente a uma unidade da composição.
 * 
 * <p>Java class for ItemDemonstrativoAcumulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDemonstrativoAcumulo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valor-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDemonstrativoAcumulo", propOrder = {
    "valorAcumulo",
    "descricao"
})
public class ItemDemonstrativoAcumulo {

    @XmlElement(name = "valor-acumulo")
    protected Preco valorAcumulo;
    protected String descricao;

    /**
     * Gets the value of the valorAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getValorAcumulo() {
        return valorAcumulo;
    }

    /**
     * Sets the value of the valorAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setValorAcumulo(Preco value) {
        this.valorAcumulo = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

}
