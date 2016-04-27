
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Criado para atender as necessidades de negocio geradas pelo projeto MGM - Member Get Member
 * 
 * <p>Java class for Atividade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Atividade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-atividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-atividade" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="status-atividade" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="url-video-atividade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Atividade", propOrder = {
    "idAtividade",
    "tipoAtividade",
    "statusAtividade",
    "urlVideoAtividade"
})
public class Atividade {

    @XmlElement(name = "id-atividade")
    protected String idAtividade;
    @XmlElement(name = "tipo-atividade")
    protected TipoReferencia tipoAtividade;
    @XmlElement(name = "status-atividade")
    protected TipoReferencia statusAtividade;
    @XmlElement(name = "url-video-atividade")
    protected String urlVideoAtividade;

    /**
     * Gets the value of the idAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAtividade() {
        return idAtividade;
    }

    /**
     * Sets the value of the idAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAtividade(String value) {
        this.idAtividade = value;
    }

    /**
     * Gets the value of the tipoAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoAtividade() {
        return tipoAtividade;
    }

    /**
     * Sets the value of the tipoAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoAtividade(TipoReferencia value) {
        this.tipoAtividade = value;
    }

    /**
     * Gets the value of the statusAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getStatusAtividade() {
        return statusAtividade;
    }

    /**
     * Sets the value of the statusAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setStatusAtividade(TipoReferencia value) {
        this.statusAtividade = value;
    }

    /**
     * Gets the value of the urlVideoAtividade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlVideoAtividade() {
        return urlVideoAtividade;
    }

    /**
     * Sets the value of the urlVideoAtividade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlVideoAtividade(String value) {
        this.urlVideoAtividade = value;
    }

}
