
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma bonificação de pontos e suas regras.
 * 
 * <p>Java class for Bonificacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bonificacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-bonificacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor-bonificacao" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tipo-bonificacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="indicador-escalonavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonificacao", propOrder = {
    "idBonificacao",
    "valorBonificacao",
    "tipoBonificacao",
    "indicadorEscalonavel"
})
public class Bonificacao {

    @XmlElement(name = "id-bonificacao")
    protected String idBonificacao;
    @XmlElement(name = "valor-bonificacao")
    protected Double valorBonificacao;
    @XmlElement(name = "tipo-bonificacao")
    protected TipoReferencia tipoBonificacao;
    @XmlElement(name = "indicador-escalonavel")
    protected Boolean indicadorEscalonavel;

    /**
     * Gets the value of the idBonificacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBonificacao() {
        return idBonificacao;
    }

    /**
     * Sets the value of the idBonificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBonificacao(String value) {
        this.idBonificacao = value;
    }

    /**
     * Gets the value of the valorBonificacao property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorBonificacao() {
        return valorBonificacao;
    }

    /**
     * Sets the value of the valorBonificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorBonificacao(Double value) {
        this.valorBonificacao = value;
    }

    /**
     * Gets the value of the tipoBonificacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoBonificacao() {
        return tipoBonificacao;
    }

    /**
     * Sets the value of the tipoBonificacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoBonificacao(TipoReferencia value) {
        this.tipoBonificacao = value;
    }

    /**
     * Gets the value of the indicadorEscalonavel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorEscalonavel() {
        return indicadorEscalonavel;
    }

    /**
     * Sets the value of the indicadorEscalonavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorEscalonavel(Boolean value) {
        this.indicadorEscalonavel = value;
    }

}
