
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de email, contém tanto o endereço de email, quanto o tipo do email
 * 
 * <p>Java class for Email complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Email">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco-email" type="{http://ebo.multiplusfidelidade.com.br/v1}EnderecoEmail" minOccurs="0"/>
 *         &lt;element name="tipo-email" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="indicador-principal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-hora-efetivacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-hora-expiracao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Email", propOrder = {
    "idEmail",
    "enderecoEmail",
    "tipoEmail",
    "indicadorPrincipal",
    "dataHoraEfetivacao",
    "dataHoraExpiracao"
})
public class Email {

    @XmlElement(name = "id-email")
    protected String idEmail;
    @XmlElement(name = "endereco-email")
    protected String enderecoEmail;
    @XmlElement(name = "tipo-email")
    protected TipoReferencia tipoEmail;
    @XmlElement(name = "indicador-principal")
    protected Boolean indicadorPrincipal;
    @XmlElement(name = "data-hora-efetivacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraEfetivacao;
    @XmlElement(name = "data-hora-expiracao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraExpiracao;

    /**
     * Gets the value of the idEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdEmail() {
        return idEmail;
    }

    /**
     * Sets the value of the idEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdEmail(String value) {
        this.idEmail = value;
    }

    /**
     * Gets the value of the enderecoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoEmail() {
        return enderecoEmail;
    }

    /**
     * Sets the value of the enderecoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoEmail(String value) {
        this.enderecoEmail = value;
    }

    /**
     * Gets the value of the tipoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoEmail() {
        return tipoEmail;
    }

    /**
     * Sets the value of the tipoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoEmail(TipoReferencia value) {
        this.tipoEmail = value;
    }

    /**
     * Gets the value of the indicadorPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorPrincipal() {
        return indicadorPrincipal;
    }

    /**
     * Sets the value of the indicadorPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorPrincipal(Boolean value) {
        this.indicadorPrincipal = value;
    }

    /**
     * Gets the value of the dataHoraEfetivacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraEfetivacao() {
        return dataHoraEfetivacao;
    }

    /**
     * Sets the value of the dataHoraEfetivacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraEfetivacao(XMLGregorianCalendar value) {
        this.dataHoraEfetivacao = value;
    }

    /**
     * Gets the value of the dataHoraExpiracao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraExpiracao() {
        return dataHoraExpiracao;
    }

    /**
     * Sets the value of the dataHoraExpiracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraExpiracao(XMLGregorianCalendar value) {
        this.dataHoraExpiracao = value;
    }

}
