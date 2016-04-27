
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ListaDePrecos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListaDePrecos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data-efetivacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="moeda" type="{http://ebo.multiplusfidelidade.com.br/v1}Moeda" minOccurs="0"/>
 *         &lt;element name="tipo-calculo-frete" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="frete" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="precos" type="{http://ebo.multiplusfidelidade.com.br/v1}PrecoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListaDePrecos", propOrder = {
    "dataEfetivacao",
    "moeda",
    "tipoCalculoFrete",
    "frete",
    "precos"
})
public class ListaDePrecos {

    @XmlElement(name = "data-efetivacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEfetivacao;
    protected Moeda moeda;
    @XmlElement(name = "tipo-calculo-frete")
    protected TipoReferencia tipoCalculoFrete;
    protected ValorMonetario frete;
    protected PrecoList precos;

    /**
     * Gets the value of the dataEfetivacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEfetivacao() {
        return dataEfetivacao;
    }

    /**
     * Sets the value of the dataEfetivacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEfetivacao(XMLGregorianCalendar value) {
        this.dataEfetivacao = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the tipoCalculoFrete property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoCalculoFrete() {
        return tipoCalculoFrete;
    }

    /**
     * Sets the value of the tipoCalculoFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoCalculoFrete(TipoReferencia value) {
        this.tipoCalculoFrete = value;
    }

    /**
     * Gets the value of the frete property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getFrete() {
        return frete;
    }

    /**
     * Sets the value of the frete property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setFrete(ValorMonetario value) {
        this.frete = value;
    }

    /**
     * Gets the value of the precos property.
     * 
     * @return
     *     possible object is
     *     {@link PrecoList }
     *     
     */
    public PrecoList getPrecos() {
        return precos;
    }

    /**
     * Sets the value of the precos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecoList }
     *     
     */
    public void setPrecos(PrecoList value) {
        this.precos = value;
    }

}
