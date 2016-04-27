
package flow.MP.GeraAtendimento;

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
 *         &lt;element name="atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}Atendimento" minOccurs="0"/>
 *         &lt;element name="propriedades-execucao" type="{http://ebo.multiplusfidelidade.com.br/v1}PropriedadesExecucao" minOccurs="0"/>
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
    "atendimento",
    "propriedadesExecucao"
})
@XmlRootElement(name = "GerarAtendimentoInput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class GerarAtendimentoInput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Atendimento atendimento;
    @XmlElement(name = "propriedades-execucao", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected PropriedadesExecucao propriedadesExecucao;

    /**
     * Gets the value of the atendimento property.
     * 
     * @return
     *     possible object is
     *     {@link Atendimento }
     *     
     */
    public Atendimento getAtendimento() {
        return atendimento;
    }

    /**
     * Sets the value of the atendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atendimento }
     *     
     */
    public void setAtendimento(Atendimento value) {
        this.atendimento = value;
    }

    /**
     * Gets the value of the propriedadesExecucao property.
     * 
     * @return
     *     possible object is
     *     {@link PropriedadesExecucao }
     *     
     */
    public PropriedadesExecucao getPropriedadesExecucao() {
        return propriedadesExecucao;
    }

    /**
     * Sets the value of the propriedadesExecucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropriedadesExecucao }
     *     
     */
    public void setPropriedadesExecucao(PropriedadesExecucao value) {
        this.propriedadesExecucao = value;
    }

}
