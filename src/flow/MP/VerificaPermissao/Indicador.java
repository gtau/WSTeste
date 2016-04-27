
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um participante que esta realizando indicacoes de novos participantes, via uma promocao.
 * 			Criado para atender as necessidades de negocio geradas pelo projeto MGM - Member Get Member
 * 
 * <p>Java class for Indicador complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Indicador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}Promocao" minOccurs="0"/>
 *         &lt;element name="status-participante-na-promocao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Indicador", propOrder = {
    "participante",
    "promocao",
    "statusParticipanteNaPromocao"
})
public class Indicador {

    protected Participante participante;
    protected Promocao promocao;
    @XmlElement(name = "status-participante-na-promocao")
    protected String statusParticipanteNaPromocao;

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

    /**
     * Gets the value of the promocao property.
     * 
     * @return
     *     possible object is
     *     {@link Promocao }
     *     
     */
    public Promocao getPromocao() {
        return promocao;
    }

    /**
     * Sets the value of the promocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promocao }
     *     
     */
    public void setPromocao(Promocao value) {
        this.promocao = value;
    }

    /**
     * Gets the value of the statusParticipanteNaPromocao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusParticipanteNaPromocao() {
        return statusParticipanteNaPromocao;
    }

    /**
     * Sets the value of the statusParticipanteNaPromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusParticipanteNaPromocao(String value) {
        this.statusParticipanteNaPromocao = value;
    }

}
