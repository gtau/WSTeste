
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de uma atendimento (Service Request) para um participante.
 * 
 * <p>Java class for Atendimento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Atendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-atendimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numero-protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="contato" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *         &lt;element name="participante-envolvido" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="tipo-atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="area-atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="subarea-atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canal-atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="situacao-atendimento" type="{http://ebo.multiplusfidelidade.com.br/v1}SituacaoAtendimento" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="atendimento-pai" type="{http://ebo.multiplusfidelidade.com.br/v1}Atendimento" minOccurs="0"/>
 *         &lt;element name="data-hora-criacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Atendimento", propOrder = {
    "idAtendimento",
    "numeroProtocolo",
    "participante",
    "parceiro",
    "contato",
    "participanteEnvolvido",
    "tipoAtendimento",
    "areaAtendimento",
    "subareaAtendimento",
    "descricao",
    "canalAtendimento",
    "situacaoAtendimento",
    "usuario",
    "atendimentoPai",
    "dataHoraCriacao"
})
public class Atendimento {

    @XmlElement(name = "id-atendimento")
    protected String idAtendimento;
    @XmlElement(name = "numero-protocolo")
    protected String numeroProtocolo;
    protected Participante participante;
    protected Parceiro parceiro;
    protected Contato contato;
    @XmlElement(name = "participante-envolvido")
    protected Participante participanteEnvolvido;
    @XmlElement(name = "tipo-atendimento")
    protected TipoReferencia tipoAtendimento;
    @XmlElement(name = "area-atendimento")
    protected TipoReferencia areaAtendimento;
    @XmlElement(name = "subarea-atendimento")
    protected TipoReferencia subareaAtendimento;
    protected String descricao;
    @XmlElement(name = "canal-atendimento")
    protected Canal canalAtendimento;
    @XmlElement(name = "situacao-atendimento")
    protected SituacaoAtendimento situacaoAtendimento;
    protected Usuario usuario;
    @XmlElement(name = "atendimento-pai")
    protected Atendimento atendimentoPai;
    @XmlElement(name = "data-hora-criacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraCriacao;

    /**
     * Gets the value of the idAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAtendimento() {
        return idAtendimento;
    }

    /**
     * Sets the value of the idAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAtendimento(String value) {
        this.idAtendimento = value;
    }

    /**
     * Gets the value of the numeroProtocolo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Sets the value of the numeroProtocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
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
     * Gets the value of the parceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Parceiro }
     *     
     */
    public Parceiro getParceiro() {
        return parceiro;
    }

    /**
     * Sets the value of the parceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parceiro }
     *     
     */
    public void setParceiro(Parceiro value) {
        this.parceiro = value;
    }

    /**
     * Gets the value of the contato property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContato() {
        return contato;
    }

    /**
     * Sets the value of the contato property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContato(Contato value) {
        this.contato = value;
    }

    /**
     * Gets the value of the participanteEnvolvido property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipanteEnvolvido() {
        return participanteEnvolvido;
    }

    /**
     * Sets the value of the participanteEnvolvido property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipanteEnvolvido(Participante value) {
        this.participanteEnvolvido = value;
    }

    /**
     * Gets the value of the tipoAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoAtendimento() {
        return tipoAtendimento;
    }

    /**
     * Sets the value of the tipoAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoAtendimento(TipoReferencia value) {
        this.tipoAtendimento = value;
    }

    /**
     * Gets the value of the areaAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getAreaAtendimento() {
        return areaAtendimento;
    }

    /**
     * Sets the value of the areaAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setAreaAtendimento(TipoReferencia value) {
        this.areaAtendimento = value;
    }

    /**
     * Gets the value of the subareaAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSubareaAtendimento() {
        return subareaAtendimento;
    }

    /**
     * Sets the value of the subareaAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSubareaAtendimento(TipoReferencia value) {
        this.subareaAtendimento = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the canalAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalAtendimento() {
        return canalAtendimento;
    }

    /**
     * Sets the value of the canalAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalAtendimento(Canal value) {
        this.canalAtendimento = value;
    }

    /**
     * Gets the value of the situacaoAtendimento property.
     * 
     * @return
     *     possible object is
     *     {@link SituacaoAtendimento }
     *     
     */
    public SituacaoAtendimento getSituacaoAtendimento() {
        return situacaoAtendimento;
    }

    /**
     * Sets the value of the situacaoAtendimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituacaoAtendimento }
     *     
     */
    public void setSituacaoAtendimento(SituacaoAtendimento value) {
        this.situacaoAtendimento = value;
    }

    /**
     * Gets the value of the usuario property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * Sets the value of the usuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuario(Usuario value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the atendimentoPai property.
     * 
     * @return
     *     possible object is
     *     {@link Atendimento }
     *     
     */
    public Atendimento getAtendimentoPai() {
        return atendimentoPai;
    }

    /**
     * Sets the value of the atendimentoPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atendimento }
     *     
     */
    public void setAtendimentoPai(Atendimento value) {
        this.atendimentoPai = value;
    }

    /**
     * Gets the value of the dataHoraCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraCriacao() {
        return dataHoraCriacao;
    }

    /**
     * Sets the value of the dataHoraCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraCriacao(XMLGregorianCalendar value) {
        this.dataHoraCriacao = value;
    }

}
