
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ENTIDADE DEPRECIADA EM PROL DE "RastreamentoPedido"
 * 
 * <p>Java class for SituacaoRastreamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituacaoRastreamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-hora-situacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoRastreamento", propOrder = {
    "situacao",
    "dataHoraSituacao"
})
public class SituacaoRastreamento {

    protected TipoReferencia situacao;
    @XmlElement(name = "data-hora-situacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraSituacao;

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacao(TipoReferencia value) {
        this.situacao = value;
    }

    /**
     * Gets the value of the dataHoraSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraSituacao() {
        return dataHoraSituacao;
    }

    /**
     * Sets the value of the dataHoraSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraSituacao(XMLGregorianCalendar value) {
        this.dataHoraSituacao = value;
    }

}
