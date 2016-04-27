
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SaldoParticipante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SaldoParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="saldo-pontos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="data-hora-consulta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SaldoParticipante", propOrder = {
    "saldoPontos",
    "dataHoraConsulta"
})
public class SaldoParticipante {

    @XmlElement(name = "saldo-pontos")
    protected Long saldoPontos;
    @XmlElement(name = "data-hora-consulta")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraConsulta;

    /**
     * Gets the value of the saldoPontos property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSaldoPontos() {
        return saldoPontos;
    }

    /**
     * Sets the value of the saldoPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSaldoPontos(Long value) {
        this.saldoPontos = value;
    }

    /**
     * Gets the value of the dataHoraConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraConsulta() {
        return dataHoraConsulta;
    }

    /**
     * Sets the value of the dataHoraConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraConsulta(XMLGregorianCalendar value) {
        this.dataHoraConsulta = value;
    }

}
