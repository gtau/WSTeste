
package flow.MP.RedefineSenha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de informações relacionadas a cache; 
 * 			numa requisição, pode ser utilizado para indicar se a requisição suporta cache, 
 * 			e o tempo máximo de cache tolerado pelo consumidor da informação;
 * 			numa resposta, pode indicar se a informação retornada é quente (lida do sistema de origem),
 * 			ou se é cacheada, além da data/hora em que a informação foi lida da origem;
 * 
 * <p>Java class for Cache complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Cache">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador-suporte-cache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="tempo-maximo-segundos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="indicador-cache" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-hora-cache" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cache", propOrder = {
    "indicadorSuporteCache",
    "tempoMaximoSegundos",
    "indicadorCache",
    "dataHoraCache"
})
public class Cache {

    @XmlElement(name = "indicador-suporte-cache")
    protected Boolean indicadorSuporteCache;
    @XmlElement(name = "tempo-maximo-segundos")
    protected Long tempoMaximoSegundos;
    @XmlElement(name = "indicador-cache")
    protected Boolean indicadorCache;
    @XmlElement(name = "data-hora-cache")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraCache;

    /**
     * Gets the value of the indicadorSuporteCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorSuporteCache() {
        return indicadorSuporteCache;
    }

    /**
     * Sets the value of the indicadorSuporteCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorSuporteCache(Boolean value) {
        this.indicadorSuporteCache = value;
    }

    /**
     * Gets the value of the tempoMaximoSegundos property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTempoMaximoSegundos() {
        return tempoMaximoSegundos;
    }

    /**
     * Sets the value of the tempoMaximoSegundos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTempoMaximoSegundos(Long value) {
        this.tempoMaximoSegundos = value;
    }

    /**
     * Gets the value of the indicadorCache property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorCache() {
        return indicadorCache;
    }

    /**
     * Sets the value of the indicadorCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorCache(Boolean value) {
        this.indicadorCache = value;
    }

    /**
     * Gets the value of the dataHoraCache property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraCache() {
        return dataHoraCache;
    }

    /**
     * Sets the value of the dataHoraCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraCache(XMLGregorianCalendar value) {
        this.dataHoraCache = value;
    }

}
