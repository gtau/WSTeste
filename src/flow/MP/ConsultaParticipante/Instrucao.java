
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Instrucao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Instrucao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-instrucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url-imagem-instrucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url-link-instrucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ordem-exibicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Instrucao", propOrder = {
    "idInstrucao",
    "descricao",
    "urlImagemInstrucao",
    "urlLinkInstrucao",
    "ordemExibicao"
})
public class Instrucao {

    @XmlElement(name = "id-instrucao")
    protected String idInstrucao;
    protected String descricao;
    @XmlElement(name = "url-imagem-instrucao")
    protected String urlImagemInstrucao;
    @XmlElement(name = "url-link-instrucao")
    protected String urlLinkInstrucao;
    @XmlElement(name = "ordem-exibicao")
    protected Integer ordemExibicao;

    /**
     * Gets the value of the idInstrucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdInstrucao() {
        return idInstrucao;
    }

    /**
     * Sets the value of the idInstrucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdInstrucao(String value) {
        this.idInstrucao = value;
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
     * Gets the value of the urlImagemInstrucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagemInstrucao() {
        return urlImagemInstrucao;
    }

    /**
     * Sets the value of the urlImagemInstrucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagemInstrucao(String value) {
        this.urlImagemInstrucao = value;
    }

    /**
     * Gets the value of the urlLinkInstrucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlLinkInstrucao() {
        return urlLinkInstrucao;
    }

    /**
     * Sets the value of the urlLinkInstrucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlLinkInstrucao(String value) {
        this.urlLinkInstrucao = value;
    }

    /**
     * Gets the value of the ordemExibicao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdemExibicao() {
        return ordemExibicao;
    }

    /**
     * Sets the value of the ordemExibicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdemExibicao(Integer value) {
        this.ordemExibicao = value;
    }

}
