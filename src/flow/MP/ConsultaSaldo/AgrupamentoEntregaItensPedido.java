
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgrupamentoEntregaItensPedido complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgrupamentoEntregaItensPedido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-agrupamento-entrega" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-fulfillment" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="itens-pedido" type="{http://ebo.multiplusfidelidade.com.br/v1}ItemPedidoList" minOccurs="0"/>
 *         &lt;element name="catalogo" type="{http://ebo.multiplusfidelidade.com.br/v1}Catalogo" minOccurs="0"/>
 *         &lt;element name="contato-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="rastreamento-entrega" type="{http://ebo.multiplusfidelidade.com.br/v1}RastreamentoEntrega" minOccurs="0"/>
 *         &lt;element name="inconsistencias" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgrupamentoEntregaItensPedido", propOrder = {
    "idAgrupamentoEntrega",
    "tipoFulfillment",
    "itensPedido",
    "catalogo",
    "contatoEntrega",
    "rastreamentoEntrega",
    "inconsistencias"
})
public class AgrupamentoEntregaItensPedido {

    @XmlElement(name = "id-agrupamento-entrega")
    protected String idAgrupamentoEntrega;
    @XmlElement(name = "tipo-fulfillment")
    protected TipoReferencia tipoFulfillment;
    @XmlElement(name = "itens-pedido")
    protected ItemPedidoList itensPedido;
    protected Catalogo catalogo;
    @XmlElement(name = "contato-entrega")
    protected Contato contatoEntrega;
    @XmlElement(name = "rastreamento-entrega")
    protected RastreamentoEntrega rastreamentoEntrega;
    protected TipoReferenciaList inconsistencias;

    /**
     * Gets the value of the idAgrupamentoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAgrupamentoEntrega() {
        return idAgrupamentoEntrega;
    }

    /**
     * Sets the value of the idAgrupamentoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAgrupamentoEntrega(String value) {
        this.idAgrupamentoEntrega = value;
    }

    /**
     * Gets the value of the tipoFulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoFulfillment() {
        return tipoFulfillment;
    }

    /**
     * Sets the value of the tipoFulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoFulfillment(TipoReferencia value) {
        this.tipoFulfillment = value;
    }

    /**
     * Gets the value of the itensPedido property.
     * 
     * @return
     *     possible object is
     *     {@link ItemPedidoList }
     *     
     */
    public ItemPedidoList getItensPedido() {
        return itensPedido;
    }

    /**
     * Sets the value of the itensPedido property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemPedidoList }
     *     
     */
    public void setItensPedido(ItemPedidoList value) {
        this.itensPedido = value;
    }

    /**
     * Gets the value of the catalogo property.
     * 
     * @return
     *     possible object is
     *     {@link Catalogo }
     *     
     */
    public Catalogo getCatalogo() {
        return catalogo;
    }

    /**
     * Sets the value of the catalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogo }
     *     
     */
    public void setCatalogo(Catalogo value) {
        this.catalogo = value;
    }

    /**
     * Gets the value of the contatoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContatoEntrega() {
        return contatoEntrega;
    }

    /**
     * Sets the value of the contatoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContatoEntrega(Contato value) {
        this.contatoEntrega = value;
    }

    /**
     * Gets the value of the rastreamentoEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link RastreamentoEntrega }
     *     
     */
    public RastreamentoEntrega getRastreamentoEntrega() {
        return rastreamentoEntrega;
    }

    /**
     * Sets the value of the rastreamentoEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link RastreamentoEntrega }
     *     
     */
    public void setRastreamentoEntrega(RastreamentoEntrega value) {
        this.rastreamentoEntrega = value;
    }

    /**
     * Gets the value of the inconsistencias property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferenciaList }
     *     
     */
    public TipoReferenciaList getInconsistencias() {
        return inconsistencias;
    }

    /**
     * Sets the value of the inconsistencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferenciaList }
     *     
     */
    public void setInconsistencias(TipoReferenciaList value) {
        this.inconsistencias = value;
    }

}
