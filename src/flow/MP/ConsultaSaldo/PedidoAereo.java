
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PedidoAereo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PedidoAereo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo-reserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao-reserva" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="voos" type="{http://ebo.multiplusfidelidade.com.br/v1}VooList" minOccurs="0"/>
 *         &lt;element name="taxa-embarque" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="taxa-emissao" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="tier-level-participante-emissao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="companhia-aerea-emissora" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="tipo-voo" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PedidoAereo", propOrder = {
    "codigoReserva",
    "situacaoReserva",
    "voos",
    "taxaEmbarque",
    "taxaEmissao",
    "tierLevelParticipanteEmissao",
    "companhiaAereaEmissora",
    "tipoVoo"
})
public class PedidoAereo {

    @XmlElement(name = "codigo-reserva")
    protected String codigoReserva;
    @XmlElement(name = "situacao-reserva")
    protected Situacao situacaoReserva;
    protected VooList voos;
    @XmlElement(name = "taxa-embarque")
    protected ValorMonetario taxaEmbarque;
    @XmlElement(name = "taxa-emissao")
    protected ValorMonetario taxaEmissao;
    @XmlElement(name = "tier-level-participante-emissao")
    protected String tierLevelParticipanteEmissao;
    @XmlElement(name = "companhia-aerea-emissora")
    protected TipoReferencia companhiaAereaEmissora;
    @XmlElement(name = "tipo-voo")
    protected TipoReferencia tipoVoo;

    /**
     * Gets the value of the codigoReserva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoReserva() {
        return codigoReserva;
    }

    /**
     * Sets the value of the codigoReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoReserva(String value) {
        this.codigoReserva = value;
    }

    /**
     * Gets the value of the situacaoReserva property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoReserva() {
        return situacaoReserva;
    }

    /**
     * Sets the value of the situacaoReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoReserva(Situacao value) {
        this.situacaoReserva = value;
    }

    /**
     * Gets the value of the voos property.
     * 
     * @return
     *     possible object is
     *     {@link VooList }
     *     
     */
    public VooList getVoos() {
        return voos;
    }

    /**
     * Sets the value of the voos property.
     * 
     * @param value
     *     allowed object is
     *     {@link VooList }
     *     
     */
    public void setVoos(VooList value) {
        this.voos = value;
    }

    /**
     * Gets the value of the taxaEmbarque property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getTaxaEmbarque() {
        return taxaEmbarque;
    }

    /**
     * Sets the value of the taxaEmbarque property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setTaxaEmbarque(ValorMonetario value) {
        this.taxaEmbarque = value;
    }

    /**
     * Gets the value of the taxaEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getTaxaEmissao() {
        return taxaEmissao;
    }

    /**
     * Sets the value of the taxaEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setTaxaEmissao(ValorMonetario value) {
        this.taxaEmissao = value;
    }

    /**
     * Gets the value of the tierLevelParticipanteEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevelParticipanteEmissao() {
        return tierLevelParticipanteEmissao;
    }

    /**
     * Sets the value of the tierLevelParticipanteEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevelParticipanteEmissao(String value) {
        this.tierLevelParticipanteEmissao = value;
    }

    /**
     * Gets the value of the companhiaAereaEmissora property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCompanhiaAereaEmissora() {
        return companhiaAereaEmissora;
    }

    /**
     * Sets the value of the companhiaAereaEmissora property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCompanhiaAereaEmissora(TipoReferencia value) {
        this.companhiaAereaEmissora = value;
    }

    /**
     * Gets the value of the tipoVoo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoVoo() {
        return tipoVoo;
    }

    /**
     * Sets the value of the tipoVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoVoo(TipoReferencia value) {
        this.tipoVoo = value;
    }

}
