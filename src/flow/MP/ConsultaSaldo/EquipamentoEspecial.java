
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um equipamento especial incluído na locação de veículo, como por exemplo,
 * 				cadeira de bebê, GPS, etc.
 * 
 * <p>Java class for EquipamentoEspecial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipamentoEspecial">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-equipamento-especial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-equipamento-especial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-incluido-cotacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipamentoEspecial", propOrder = {
    "idEquipamentoEspecial",
    "nomeEquipamentoEspecial",
    "descricao",
    "indicadorIncluidoCotacao"
})
public class EquipamentoEspecial {

    @XmlElement(name = "id-equipamento-especial")
    protected String idEquipamentoEspecial;
    @XmlElement(name = "nome-equipamento-especial")
    protected String nomeEquipamentoEspecial;
    protected String descricao;
    @XmlElement(name = "indicador-incluido-cotacao")
    protected Boolean indicadorIncluidoCotacao;

    /**
     * Gets the value of the idEquipamentoEspecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEquipamentoEspecial() {
        return idEquipamentoEspecial;
    }

    /**
     * Sets the value of the idEquipamentoEspecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEquipamentoEspecial(String value) {
        this.idEquipamentoEspecial = value;
    }

    /**
     * Gets the value of the nomeEquipamentoEspecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeEquipamentoEspecial() {
        return nomeEquipamentoEspecial;
    }

    /**
     * Sets the value of the nomeEquipamentoEspecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeEquipamentoEspecial(String value) {
        this.nomeEquipamentoEspecial = value;
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

    /**
     * Gets the value of the indicadorIncluidoCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorIncluidoCotacao() {
        return indicadorIncluidoCotacao;
    }

    /**
     * Sets the value of the indicadorIncluidoCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorIncluidoCotacao(Boolean value) {
        this.indicadorIncluidoCotacao = value;
    }

}
