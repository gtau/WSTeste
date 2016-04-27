
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramaFidelidadeParticipante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramaFidelidadeParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programa-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}ProgramaFidelidade" minOccurs="0"/>
 *         &lt;element name="codigo-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramaFidelidadeParticipante", propOrder = {
    "programaFidelidade",
    "codigoProgramaFidelidade",
    "participante"
})
public class ProgramaFidelidadeParticipante {

    @XmlElement(name = "programa-fidelidade")
    protected ProgramaFidelidade programaFidelidade;
    @XmlElement(name = "codigo-programa-fidelidade")
    protected String codigoProgramaFidelidade;
    protected Participante participante;

    /**
     * Gets the value of the programaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramaFidelidade }
     *     
     */
    public ProgramaFidelidade getProgramaFidelidade() {
        return programaFidelidade;
    }

    /**
     * Sets the value of the programaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramaFidelidade }
     *     
     */
    public void setProgramaFidelidade(ProgramaFidelidade value) {
        this.programaFidelidade = value;
    }

    /**
     * Gets the value of the codigoProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProgramaFidelidade() {
        return codigoProgramaFidelidade;
    }

    /**
     * Sets the value of the codigoProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProgramaFidelidade(String value) {
        this.codigoProgramaFidelidade = value;
    }

    /**
     * Gets the value of the participante property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * Sets the value of the participante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipante(Participante value) {
        this.participante = value;
    }

}
