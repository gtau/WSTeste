
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa os dados de um aceite em um regulamento, com dados como o canal, IP, e referência para o
 * 			regulamento.
 * 
 * <p>Java class for AceiteRegulamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AceiteRegulamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data-aceite" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="canal-aceite" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="endereco-ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regulamento" type="{http://ebo.multiplusfidelidade.com.br/v1}Regulamento" minOccurs="0"/>
 *         &lt;element name="indicador-necessita-novo-aceite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AceiteRegulamento", propOrder = {
    "dataAceite",
    "canalAceite",
    "enderecoIp",
    "regulamento",
    "indicadorNecessitaNovoAceite"
})
public class AceiteRegulamento {

    @XmlElement(name = "data-aceite")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAceite;
    @XmlElement(name = "canal-aceite")
    protected Canal canalAceite;
    @XmlElement(name = "endereco-ip")
    protected String enderecoIp;
    protected Regulamento regulamento;
    @XmlElement(name = "indicador-necessita-novo-aceite")
    protected Boolean indicadorNecessitaNovoAceite;

    /**
     * Gets the value of the dataAceite property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAceite() {
        return dataAceite;
    }

    /**
     * Sets the value of the dataAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAceite(XMLGregorianCalendar value) {
        this.dataAceite = value;
    }

    /**
     * Gets the value of the canalAceite property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalAceite() {
        return canalAceite;
    }

    /**
     * Sets the value of the canalAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalAceite(Canal value) {
        this.canalAceite = value;
    }

    /**
     * Gets the value of the enderecoIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoIp() {
        return enderecoIp;
    }

    /**
     * Sets the value of the enderecoIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoIp(String value) {
        this.enderecoIp = value;
    }

    /**
     * Gets the value of the regulamento property.
     * 
     * @return
     *     possible object is
     *     {@link Regulamento }
     *     
     */
    public Regulamento getRegulamento() {
        return regulamento;
    }

    /**
     * Sets the value of the regulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Regulamento }
     *     
     */
    public void setRegulamento(Regulamento value) {
        this.regulamento = value;
    }

    /**
     * Gets the value of the indicadorNecessitaNovoAceite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorNecessitaNovoAceite() {
        return indicadorNecessitaNovoAceite;
    }

    /**
     * Sets the value of the indicadorNecessitaNovoAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorNecessitaNovoAceite(Boolean value) {
        this.indicadorNecessitaNovoAceite = value;
    }

}
