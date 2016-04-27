
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representação de um segmento de atuação de uma empresa.
 * 
 * <p>Java class for SegmentoIBGE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentoIBGE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detalhe-segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-segmento-site" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subsegmento" type="{http://ebo.multiplusfidelidade.com.br/v1}SegmentoIBGE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentoIBGE", propOrder = {
    "idSegmento",
    "nomeSegmento",
    "detalheSegmento",
    "nomeSegmentoSite",
    "subsegmento"
})
public class SegmentoIBGE {

    @XmlElement(name = "id-segmento")
    protected String idSegmento;
    @XmlElement(name = "nome-segmento")
    protected String nomeSegmento;
    @XmlElement(name = "detalhe-segmento")
    protected String detalheSegmento;
    @XmlElement(name = "nome-segmento-site")
    protected String nomeSegmentoSite;
    protected SegmentoIBGE subsegmento;

    /**
     * Gets the value of the idSegmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSegmento() {
        return idSegmento;
    }

    /**
     * Sets the value of the idSegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSegmento(String value) {
        this.idSegmento = value;
    }

    /**
     * Gets the value of the nomeSegmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSegmento() {
        return nomeSegmento;
    }

    /**
     * Sets the value of the nomeSegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSegmento(String value) {
        this.nomeSegmento = value;
    }

    /**
     * Gets the value of the detalheSegmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetalheSegmento() {
        return detalheSegmento;
    }

    /**
     * Sets the value of the detalheSegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetalheSegmento(String value) {
        this.detalheSegmento = value;
    }

    /**
     * Gets the value of the nomeSegmentoSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeSegmentoSite() {
        return nomeSegmentoSite;
    }

    /**
     * Sets the value of the nomeSegmentoSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeSegmentoSite(String value) {
        this.nomeSegmentoSite = value;
    }

    /**
     * Gets the value of the subsegmento property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoIBGE }
     *     
     */
    public SegmentoIBGE getSubsegmento() {
        return subsegmento;
    }

    /**
     * Sets the value of the subsegmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoIBGE }
     *     
     */
    public void setSubsegmento(SegmentoIBGE value) {
        this.subsegmento = value;
    }

}
