
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um regulamento, que pode ser do programa Multiplus, de promoção, e tem sua referência para a
 * 			versão, URL de onde buscar esse regulamento.
 * 
 * <p>Java class for Regulamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Regulamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo-regulamento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="codigo-regulamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-regulamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versao-regulamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url-regulamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-objeto-regulamentado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Regulamento", propOrder = {
    "tipoRegulamento",
    "codigoRegulamento",
    "nomeRegulamento",
    "versaoRegulamento",
    "urlRegulamento",
    "codigoObjetoRegulamentado"
})
public class Regulamento {

    @XmlElement(name = "tipo-regulamento")
    protected TipoReferencia tipoRegulamento;
    @XmlElement(name = "codigo-regulamento")
    protected String codigoRegulamento;
    @XmlElement(name = "nome-regulamento")
    protected String nomeRegulamento;
    @XmlElement(name = "versao-regulamento")
    protected String versaoRegulamento;
    @XmlElement(name = "url-regulamento")
    protected String urlRegulamento;
    @XmlElement(name = "codigo-objeto-regulamentado")
    protected String codigoObjetoRegulamentado;

    /**
     * Gets the value of the tipoRegulamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoRegulamento() {
        return tipoRegulamento;
    }

    /**
     * Sets the value of the tipoRegulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoRegulamento(TipoReferencia value) {
        this.tipoRegulamento = value;
    }

    /**
     * Gets the value of the codigoRegulamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoRegulamento() {
        return codigoRegulamento;
    }

    /**
     * Sets the value of the codigoRegulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoRegulamento(String value) {
        this.codigoRegulamento = value;
    }

    /**
     * Gets the value of the nomeRegulamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeRegulamento() {
        return nomeRegulamento;
    }

    /**
     * Sets the value of the nomeRegulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeRegulamento(String value) {
        this.nomeRegulamento = value;
    }

    /**
     * Gets the value of the versaoRegulamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoRegulamento() {
        return versaoRegulamento;
    }

    /**
     * Sets the value of the versaoRegulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoRegulamento(String value) {
        this.versaoRegulamento = value;
    }

    /**
     * Gets the value of the urlRegulamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlRegulamento() {
        return urlRegulamento;
    }

    /**
     * Sets the value of the urlRegulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlRegulamento(String value) {
        this.urlRegulamento = value;
    }

    /**
     * Gets the value of the codigoObjetoRegulamentado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoObjetoRegulamentado() {
        return codigoObjetoRegulamentado;
    }

    /**
     * Sets the value of the codigoObjetoRegulamentado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoObjetoRegulamentado(String value) {
        this.codigoObjetoRegulamentado = value;
    }

}
