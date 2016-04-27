
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BilheteEletronico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilheteEletronico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-bilhete" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao-bilhete" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="dados-passageiro" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *         &lt;element name="tipo-passageiro" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="trechos-voo" type="{http://ebo.multiplusfidelidade.com.br/v1}TrechoVooList" minOccurs="0"/>
 *         &lt;element name="data-emissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lista-fare-component" type="{http://ebo.multiplusfidelidade.com.br/v1}FareComponentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilheteEletronico", propOrder = {
    "numeroBilhete",
    "situacaoBilhete",
    "dadosPassageiro",
    "tipoPassageiro",
    "trechosVoo",
    "dataEmissao",
    "listaFareComponent"
})
public class BilheteEletronico {

    @XmlElement(name = "numero-bilhete")
    protected String numeroBilhete;
    @XmlElement(name = "situacao-bilhete")
    protected Situacao situacaoBilhete;
    @XmlElement(name = "dados-passageiro")
    protected DadosCadastraisPF dadosPassageiro;
    @XmlElement(name = "tipo-passageiro")
    protected TipoReferencia tipoPassageiro;
    @XmlElement(name = "trechos-voo")
    protected TrechoVooList trechosVoo;
    @XmlElement(name = "data-emissao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEmissao;
    @XmlElement(name = "lista-fare-component")
    protected FareComponentList listaFareComponent;

    /**
     * Gets the value of the numeroBilhete property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroBilhete() {
        return numeroBilhete;
    }

    /**
     * Sets the value of the numeroBilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroBilhete(String value) {
        this.numeroBilhete = value;
    }

    /**
     * Gets the value of the situacaoBilhete property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoBilhete() {
        return situacaoBilhete;
    }

    /**
     * Sets the value of the situacaoBilhete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoBilhete(Situacao value) {
        this.situacaoBilhete = value;
    }

    /**
     * Gets the value of the dadosPassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getDadosPassageiro() {
        return dadosPassageiro;
    }

    /**
     * Sets the value of the dadosPassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setDadosPassageiro(DadosCadastraisPF value) {
        this.dadosPassageiro = value;
    }

    /**
     * Gets the value of the tipoPassageiro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoPassageiro() {
        return tipoPassageiro;
    }

    /**
     * Sets the value of the tipoPassageiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoPassageiro(TipoReferencia value) {
        this.tipoPassageiro = value;
    }

    /**
     * Gets the value of the trechosVoo property.
     * 
     * @return
     *     possible object is
     *     {@link TrechoVooList }
     *     
     */
    public TrechoVooList getTrechosVoo() {
        return trechosVoo;
    }

    /**
     * Sets the value of the trechosVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrechoVooList }
     *     
     */
    public void setTrechosVoo(TrechoVooList value) {
        this.trechosVoo = value;
    }

    /**
     * Gets the value of the dataEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEmissao() {
        return dataEmissao;
    }

    /**
     * Sets the value of the dataEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEmissao(XMLGregorianCalendar value) {
        this.dataEmissao = value;
    }

    /**
     * Gets the value of the listaFareComponent property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentList }
     *     
     */
    public FareComponentList getListaFareComponent() {
        return listaFareComponent;
    }

    /**
     * Sets the value of the listaFareComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentList }
     *     
     */
    public void setListaFareComponent(FareComponentList value) {
        this.listaFareComponent = value;
    }

}
