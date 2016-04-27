
package flow.MP.AutenticaUsuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuario" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="atributos" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "usuario",
    "atributos"
})
@XmlRootElement(name = "AutenticarUsuarioOutput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class AutenticarUsuarioOutput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Usuario usuario;
    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected AtributoList atributos;

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the atributos property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getAtributos() {
        return atributos;
    }

    /**
     * Sets the value of the atributos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setAtributos(AtributoList value) {
        this.atributos = value;
    }

}
