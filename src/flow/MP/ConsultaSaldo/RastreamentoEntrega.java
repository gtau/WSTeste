
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
 * <p>Java class for RastreamentoEntrega complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RastreamentoEntrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-rastreamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provedor-entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-pedido-entregue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-entrega" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-previsao-entrega" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="descricao-previsao-entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RastreamentoEntrega", propOrder = {
    "idRastreamento",
    "provedorEntrega",
    "indicadorPedidoEntregue",
    "dataEntrega",
    "dataPrevisaoEntrega",
    "descricaoPrevisaoEntrega"
})
public class RastreamentoEntrega {

    @XmlElement(name = "id-rastreamento")
    protected String idRastreamento;
    @XmlElement(name = "provedor-entrega")
    protected String provedorEntrega;
    @XmlElement(name = "indicador-pedido-entregue")
    protected Boolean indicadorPedidoEntregue;
    @XmlElement(name = "data-entrega")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEntrega;
    @XmlElement(name = "data-previsao-entrega")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataPrevisaoEntrega;
    @XmlElement(name = "descricao-previsao-entrega")
    protected String descricaoPrevisaoEntrega;

    /**
     * Gets the value of the idRastreamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRastreamento() {
        return idRastreamento;
    }

    /**
     * Sets the value of the idRastreamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRastreamento(String value) {
        this.idRastreamento = value;
    }

    /**
     * Gets the value of the provedorEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvedorEntrega() {
        return provedorEntrega;
    }

    /**
     * Sets the value of the provedorEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvedorEntrega(String value) {
        this.provedorEntrega = value;
    }

    /**
     * Gets the value of the indicadorPedidoEntregue property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorPedidoEntregue() {
        return indicadorPedidoEntregue;
    }

    /**
     * Sets the value of the indicadorPedidoEntregue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorPedidoEntregue(Boolean value) {
        this.indicadorPedidoEntregue = value;
    }

    /**
     * Gets the value of the dataEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEntrega() {
        return dataEntrega;
    }

    /**
     * Sets the value of the dataEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEntrega(XMLGregorianCalendar value) {
        this.dataEntrega = value;
    }

    /**
     * Gets the value of the dataPrevisaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataPrevisaoEntrega() {
        return dataPrevisaoEntrega;
    }

    /**
     * Sets the value of the dataPrevisaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataPrevisaoEntrega(XMLGregorianCalendar value) {
        this.dataPrevisaoEntrega = value;
    }

    /**
     * Gets the value of the descricaoPrevisaoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPrevisaoEntrega() {
        return descricaoPrevisaoEntrega;
    }

    /**
     * Sets the value of the descricaoPrevisaoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPrevisaoEntrega(String value) {
        this.descricaoPrevisaoEntrega = value;
    }

}
