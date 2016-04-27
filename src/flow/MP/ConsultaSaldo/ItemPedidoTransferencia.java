
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPedidoTransferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPedidoTransferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-participante-parceiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="qtd-pontos-transferencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPedidoTransferencia", propOrder = {
    "idParticipanteParceiro",
    "qtdPontosTransferencia"
})
public class ItemPedidoTransferencia {

    @XmlElement(name = "id-participante-parceiro")
    protected String idParticipanteParceiro;
    @XmlElement(name = "qtd-pontos-transferencia")
    protected Long qtdPontosTransferencia;

    /**
     * Gets the value of the idParticipanteParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdParticipanteParceiro() {
        return idParticipanteParceiro;
    }

    /**
     * Sets the value of the idParticipanteParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdParticipanteParceiro(String value) {
        this.idParticipanteParceiro = value;
    }

    /**
     * Gets the value of the qtdPontosTransferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdPontosTransferencia() {
        return qtdPontosTransferencia;
    }

    /**
     * Sets the value of the qtdPontosTransferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdPontosTransferencia(Long value) {
        this.qtdPontosTransferencia = value;
    }

}
