
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CotaPontos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotaPontos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-reserva-cota" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="parceiro-restricao" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="tipo-cota" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="periodo-validade" type="{http://ebo.multiplusfidelidade.com.br/v1}Periodo" minOccurs="0"/>
 *         &lt;element name="qtd-pontos-total" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="qtd-pontos-disponivel" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotaPontos", propOrder = {
    "idReservaCota",
    "participante",
    "parceiroRestricao",
    "tipoCota",
    "periodoValidade",
    "qtdPontosTotal",
    "qtdPontosDisponivel"
})
public class CotaPontos {

    @XmlElement(name = "id-reserva-cota")
    protected String idReservaCota;
    protected Participante participante;
    @XmlElement(name = "parceiro-restricao")
    protected Parceiro parceiroRestricao;
    @XmlElement(name = "tipo-cota")
    protected TipoReferencia tipoCota;
    @XmlElement(name = "periodo-validade")
    protected Periodo periodoValidade;
    @XmlElement(name = "qtd-pontos-total")
    protected Long qtdPontosTotal;
    @XmlElement(name = "qtd-pontos-disponivel")
    protected Long qtdPontosDisponivel;

    /**
     * Gets the value of the idReservaCota property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdReservaCota() {
        return idReservaCota;
    }

    /**
     * Sets the value of the idReservaCota property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdReservaCota(String value) {
        this.idReservaCota = value;
    }

    /**
     * Gets the value of the participante property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipante() {
        return participante;
    }

    /**
     * Sets the value of the participante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipante(Participante value) {
        this.participante = value;
    }

    /**
     * Gets the value of the parceiroRestricao property.
     * 
     * @return
     *     possible object is
     *     {@link Parceiro }
     *     
     */
    public Parceiro getParceiroRestricao() {
        return parceiroRestricao;
    }

    /**
     * Sets the value of the parceiroRestricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parceiro }
     *     
     */
    public void setParceiroRestricao(Parceiro value) {
        this.parceiroRestricao = value;
    }

    /**
     * Gets the value of the tipoCota property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoCota() {
        return tipoCota;
    }

    /**
     * Sets the value of the tipoCota property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoCota(TipoReferencia value) {
        this.tipoCota = value;
    }

    /**
     * Gets the value of the periodoValidade property.
     * 
     * @return
     *     possible object is
     *     {@link Periodo }
     *     
     */
    public Periodo getPeriodoValidade() {
        return periodoValidade;
    }

    /**
     * Sets the value of the periodoValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Periodo }
     *     
     */
    public void setPeriodoValidade(Periodo value) {
        this.periodoValidade = value;
    }

    /**
     * Gets the value of the qtdPontosTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdPontosTotal() {
        return qtdPontosTotal;
    }

    /**
     * Sets the value of the qtdPontosTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdPontosTotal(Long value) {
        this.qtdPontosTotal = value;
    }

    /**
     * Gets the value of the qtdPontosDisponivel property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdPontosDisponivel() {
        return qtdPontosDisponivel;
    }

    /**
     * Sets the value of the qtdPontosDisponivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdPontosDisponivel(Long value) {
        this.qtdPontosDisponivel = value;
    }

}
