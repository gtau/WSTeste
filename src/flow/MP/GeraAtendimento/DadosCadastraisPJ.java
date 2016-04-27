
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DadosCadastraisPJ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCadastraisPJ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cnpj" type="{http://ebo.multiplusfidelidade.com.br/v1}Cnpj" minOccurs="0"/>
 *         &lt;element name="razao-social" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-fantasia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="segmento" type="{http://ebo.multiplusfidelidade.com.br/v1}SegmentoIBGE" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCadastraisPJ", propOrder = {
    "cnpj",
    "razaoSocial",
    "nomeFantasia",
    "segmento"
})
public class DadosCadastraisPJ {

    protected String cnpj;
    @XmlElement(name = "razao-social")
    protected String razaoSocial;
    @XmlElement(name = "nome-fantasia")
    protected String nomeFantasia;
    protected SegmentoIBGE segmento;

    /**
     * Gets the value of the cnpj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Sets the value of the cnpj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpj(String value) {
        this.cnpj = value;
    }

    /**
     * Gets the value of the razaoSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazaoSocial() {
        return razaoSocial;
    }

    /**
     * Sets the value of the razaoSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazaoSocial(String value) {
        this.razaoSocial = value;
    }

    /**
     * Gets the value of the nomeFantasia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFantasia() {
        return nomeFantasia;
    }

    /**
     * Sets the value of the nomeFantasia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFantasia(String value) {
        this.nomeFantasia = value;
    }

    /**
     * Gets the value of the segmento property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentoIBGE }
     *     
     */
    public SegmentoIBGE getSegmento() {
        return segmento;
    }

    /**
     * Sets the value of the segmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentoIBGE }
     *     
     */
    public void setSegmento(SegmentoIBGE value) {
        this.segmento = value;
    }

}
