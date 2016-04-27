
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma moeda ISO-4217
 * 
 * <p>Java class for Moeda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Moeda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-alfabetico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-numerico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="casas-decimais" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Moeda", propOrder = {
    "entidade",
    "nome",
    "codigoAlfabetico",
    "codigoNumerico",
    "casasDecimais"
})
public class Moeda {

    protected String entidade;
    protected String nome;
    @XmlElement(name = "codigo-alfabetico")
    protected String codigoAlfabetico;
    @XmlElement(name = "codigo-numerico")
    protected String codigoNumerico;
    @XmlElement(name = "casas-decimais")
    protected Long casasDecimais;

    /**
     * Gets the value of the entidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidade() {
        return entidade;
    }

    /**
     * Sets the value of the entidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidade(String value) {
        this.entidade = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the codigoAlfabetico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoAlfabetico() {
        return codigoAlfabetico;
    }

    /**
     * Sets the value of the codigoAlfabetico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoAlfabetico(String value) {
        this.codigoAlfabetico = value;
    }

    /**
     * Gets the value of the codigoNumerico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoNumerico() {
        return codigoNumerico;
    }

    /**
     * Sets the value of the codigoNumerico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoNumerico(String value) {
        this.codigoNumerico = value;
    }

    /**
     * Gets the value of the casasDecimais property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCasasDecimais() {
        return casasDecimais;
    }

    /**
     * Sets the value of the casasDecimais property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCasasDecimais(Long value) {
        this.casasDecimais = value;
    }

}
