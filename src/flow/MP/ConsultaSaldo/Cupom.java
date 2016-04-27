
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Cupom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cupom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao-cupom" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="numeros-cupom" type="{http://ebo.multiplusfidelidade.com.br/v1}NumeroCupomList" minOccurs="0"/>
 *         &lt;element name="data-hora-emissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}Promocao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cupom", propOrder = {
    "situacaoCupom",
    "numerosCupom",
    "dataHoraEmissao",
    "dataValidade",
    "promocao"
})
public class Cupom {

    @XmlElement(name = "situacao-cupom")
    protected Situacao situacaoCupom;
    @XmlElement(name = "numeros-cupom")
    protected NumeroCupomList numerosCupom;
    @XmlElement(name = "data-hora-emissao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraEmissao;
    @XmlElement(name = "data-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataValidade;
    protected Promocao promocao;

    /**
     * Gets the value of the situacaoCupom property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoCupom() {
        return situacaoCupom;
    }

    /**
     * Sets the value of the situacaoCupom property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoCupom(Situacao value) {
        this.situacaoCupom = value;
    }

    /**
     * Gets the value of the numerosCupom property.
     * 
     * @return
     *     possible object is
     *     {@link NumeroCupomList }
     *     
     */
    public NumeroCupomList getNumerosCupom() {
        return numerosCupom;
    }

    /**
     * Sets the value of the numerosCupom property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumeroCupomList }
     *     
     */
    public void setNumerosCupom(NumeroCupomList value) {
        this.numerosCupom = value;
    }

    /**
     * Gets the value of the dataHoraEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    /**
     * Sets the value of the dataHoraEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraEmissao(XMLGregorianCalendar value) {
        this.dataHoraEmissao = value;
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidade(XMLGregorianCalendar value) {
        this.dataValidade = value;
    }

    /**
     * Gets the value of the promocao property.
     * 
     * @return
     *     possible object is
     *     {@link Promocao }
     *     
     */
    public Promocao getPromocao() {
        return promocao;
    }

    /**
     * Sets the value of the promocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Promocao }
     *     
     */
    public void setPromocao(Promocao value) {
        this.promocao = value;
    }

}
