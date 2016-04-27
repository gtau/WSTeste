
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representação de uma oferta relacionada a uma campanha de marketing na Multiplus.
 * 
 * <p>Java class for Oferta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Oferta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-oferta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-oferta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-oferta" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Oferta", propOrder = {
    "idOferta",
    "nomeOferta",
    "descricao",
    "codigoOferta"
})
public class Oferta {

    @XmlElement(name = "id-oferta")
    protected String idOferta;
    @XmlElement(name = "nome-oferta")
    protected String nomeOferta;
    protected String descricao;
    @XmlElement(name = "codigo-oferta")
    protected Identificador codigoOferta;

    /**
     * Gets the value of the idOferta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdOferta() {
        return idOferta;
    }

    /**
     * Sets the value of the idOferta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdOferta(String value) {
        this.idOferta = value;
    }

    /**
     * Gets the value of the nomeOferta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOferta() {
        return nomeOferta;
    }

    /**
     * Sets the value of the nomeOferta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOferta(String value) {
        this.nomeOferta = value;
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
     * Gets the value of the codigoOferta property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getCodigoOferta() {
        return codigoOferta;
    }

    /**
     * Sets the value of the codigoOferta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setCodigoOferta(Identificador value) {
        this.codigoOferta = value;
    }

}
