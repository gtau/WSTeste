
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Entidade abstrata que representa uma permissão de acesso.
 * 
 * <p>Java class for Permissao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permissao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-permissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-permissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permissao", propOrder = {
    "idPermissao",
    "descricaoPermissao"
})
public class Permissao {

    @XmlElement(name = "id-permissao")
    protected String idPermissao;
    @XmlElement(name = "descricao-permissao")
    protected String descricaoPermissao;

    /**
     * Gets the value of the idPermissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPermissao() {
        return idPermissao;
    }

    /**
     * Sets the value of the idPermissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPermissao(String value) {
        this.idPermissao = value;
    }

    /**
     * Gets the value of the descricaoPermissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPermissao() {
        return descricaoPermissao;
    }

    /**
     * Sets the value of the descricaoPermissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPermissao(String value) {
        this.descricaoPermissao = value;
    }

}
