
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramaFidelidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramaFidelidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramaFidelidade", propOrder = {
    "idProgramaFidelidade",
    "nomeProgramaFidelidade",
    "descricaoProgramaFidelidade",
    "parceiro"
})
public class ProgramaFidelidade {

    @XmlElement(name = "id-programa-fidelidade")
    protected String idProgramaFidelidade;
    @XmlElement(name = "nome-programa-fidelidade")
    protected String nomeProgramaFidelidade;
    @XmlElement(name = "descricao-programa-fidelidade")
    protected String descricaoProgramaFidelidade;
    protected Parceiro parceiro;

    /**
     * Gets the value of the idProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProgramaFidelidade() {
        return idProgramaFidelidade;
    }

    /**
     * Sets the value of the idProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProgramaFidelidade(String value) {
        this.idProgramaFidelidade = value;
    }

    /**
     * Gets the value of the nomeProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeProgramaFidelidade() {
        return nomeProgramaFidelidade;
    }

    /**
     * Sets the value of the nomeProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeProgramaFidelidade(String value) {
        this.nomeProgramaFidelidade = value;
    }

    /**
     * Gets the value of the descricaoProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoProgramaFidelidade() {
        return descricaoProgramaFidelidade;
    }

    /**
     * Sets the value of the descricaoProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoProgramaFidelidade(String value) {
        this.descricaoProgramaFidelidade = value;
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

}
