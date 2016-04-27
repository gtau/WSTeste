
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma cobertura/seguro de locação de veículo, como por exemplo, LDW, ALI, etc.
 * 
 * <p>Java class for Cobertura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cobertura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-cobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-cobertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-incluida-cotacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indicador-obrigatoria" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cobertura", propOrder = {
    "idCobertura",
    "nomeCobertura",
    "descricao",
    "indicadorIncluidaCotacao",
    "indicadorObrigatoria"
})
public class Cobertura {

    @XmlElement(name = "id-cobertura")
    protected String idCobertura;
    @XmlElement(name = "nome-cobertura")
    protected String nomeCobertura;
    protected String descricao;
    @XmlElement(name = "indicador-incluida-cotacao")
    protected Boolean indicadorIncluidaCotacao;
    @XmlElement(name = "indicador-obrigatoria")
    protected Boolean indicadorObrigatoria;

    /**
     * Gets the value of the idCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCobertura() {
        return idCobertura;
    }

    /**
     * Sets the value of the idCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCobertura(String value) {
        this.idCobertura = value;
    }

    /**
     * Gets the value of the nomeCobertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCobertura() {
        return nomeCobertura;
    }

    /**
     * Sets the value of the nomeCobertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCobertura(String value) {
        this.nomeCobertura = value;
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
     * Gets the value of the indicadorIncluidaCotacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorIncluidaCotacao() {
        return indicadorIncluidaCotacao;
    }

    /**
     * Sets the value of the indicadorIncluidaCotacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorIncluidaCotacao(Boolean value) {
        this.indicadorIncluidaCotacao = value;
    }

    /**
     * Gets the value of the indicadorObrigatoria property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorObrigatoria() {
        return indicadorObrigatoria;
    }

    /**
     * Sets the value of the indicadorObrigatoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorObrigatoria(Boolean value) {
        this.indicadorObrigatoria = value;
    }

}
