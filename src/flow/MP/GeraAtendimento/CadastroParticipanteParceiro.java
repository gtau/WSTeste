
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Informações cadastrais do participante no parceiro, como ID no parceiro, data de cadastro, situação, etc.
 * 
 * <p>Java class for CadastroParticipanteParceiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CadastroParticipanteParceiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
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
@XmlType(name = "CadastroParticipanteParceiro", propOrder = {
    "idParticipante",
    "parceiro",
    "atributos"
})
public class CadastroParticipanteParceiro {

    @XmlElement(name = "id-participante")
    protected Identificador idParticipante;
    protected Parceiro parceiro;
    protected AtributoList atributos;

    /**
     * Gets the value of the idParticipante property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getIdParticipante() {
        return idParticipante;
    }

    /**
     * Sets the value of the idParticipante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setIdParticipante(Identificador value) {
        this.idParticipante = value;
    }

    /**
     * Gets the value of the parceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Parceiro }
     *     
     */
    public Parceiro getParceiro() {
        return parceiro;
    }

    /**
     * Sets the value of the parceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parceiro }
     *     
     */
    public void setParceiro(Parceiro value) {
        this.parceiro = value;
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
