
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa uma opção em receber ou não notificações em um determinado canal.
 * 			Exemplo: Receber notificações no canal SMS, EMAIL ou NOTIFICAO_MOBILE
 * 
 * <p>Java class for ConfiguracaoOptin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfiguracaoOptin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Parceiro" minOccurs="0"/>
 *         &lt;element name="canal-optin" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-aceite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indicador-suporta-assuntos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lista-assuntos" type="{http://ebo.multiplusfidelidade.com.br/v1}AssuntoComunicacaoList" minOccurs="0"/>
 *         &lt;element name="data-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="canal-origem-atualizacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
 *         &lt;element name="campanha-originadora-optout" type="{http://ebo.multiplusfidelidade.com.br/v1}Campanha" minOccurs="0"/>
 *         &lt;element name="motivo-optout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfiguracaoOptin", propOrder = {
    "parceiro",
    "canalOptin",
    "descricao",
    "indicadorAceite",
    "indicadorSuportaAssuntos",
    "listaAssuntos",
    "dataUltimaAtualizacao",
    "canalOrigemAtualizacao",
    "campanhaOriginadoraOptout",
    "motivoOptout"
})
public class ConfiguracaoOptin {

    protected Parceiro parceiro;
    @XmlElement(name = "canal-optin")
    protected TipoReferencia canalOptin;
    protected String descricao;
    @XmlElement(name = "indicador-aceite")
    protected Boolean indicadorAceite;
    @XmlElement(name = "indicador-suporta-assuntos")
    protected Boolean indicadorSuportaAssuntos;
    @XmlElement(name = "lista-assuntos")
    protected AssuntoComunicacaoList listaAssuntos;
    @XmlElement(name = "data-ultima-atualizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataUltimaAtualizacao;
    @XmlElement(name = "canal-origem-atualizacao")
    protected Canal canalOrigemAtualizacao;
    @XmlElement(name = "campanha-originadora-optout")
    protected Campanha campanhaOriginadoraOptout;
    @XmlElement(name = "motivo-optout")
    protected String motivoOptout;

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
     * Gets the value of the canalOptin property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCanalOptin() {
        return canalOptin;
    }

    /**
     * Sets the value of the canalOptin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCanalOptin(TipoReferencia value) {
        this.canalOptin = value;
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
     * Gets the value of the indicadorAceite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAceite() {
        return indicadorAceite;
    }

    /**
     * Sets the value of the indicadorAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAceite(Boolean value) {
        this.indicadorAceite = value;
    }

    /**
     * Gets the value of the indicadorSuportaAssuntos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorSuportaAssuntos() {
        return indicadorSuportaAssuntos;
    }

    /**
     * Sets the value of the indicadorSuportaAssuntos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorSuportaAssuntos(Boolean value) {
        this.indicadorSuportaAssuntos = value;
    }

    /**
     * Gets the value of the listaAssuntos property.
     * 
     * @return
     *     possible object is
     *     {@link AssuntoComunicacaoList }
     *     
     */
    public AssuntoComunicacaoList getListaAssuntos() {
        return listaAssuntos;
    }

    /**
     * Sets the value of the listaAssuntos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssuntoComunicacaoList }
     *     
     */
    public void setListaAssuntos(AssuntoComunicacaoList value) {
        this.listaAssuntos = value;
    }

    /**
     * Gets the value of the dataUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * Sets the value of the dataUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaAtualizacao(XMLGregorianCalendar value) {
        this.dataUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the canalOrigemAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalOrigemAtualizacao() {
        return canalOrigemAtualizacao;
    }

    /**
     * Sets the value of the canalOrigemAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalOrigemAtualizacao(Canal value) {
        this.canalOrigemAtualizacao = value;
    }

    /**
     * Gets the value of the campanhaOriginadoraOptout property.
     * 
     * @return
     *     possible object is
     *     {@link Campanha }
     *     
     */
    public Campanha getCampanhaOriginadoraOptout() {
        return campanhaOriginadoraOptout;
    }

    /**
     * Sets the value of the campanhaOriginadoraOptout property.
     * 
     * @param value
     *     allowed object is
     *     {@link Campanha }
     *     
     */
    public void setCampanhaOriginadoraOptout(Campanha value) {
        this.campanhaOriginadoraOptout = value;
    }

    /**
     * Gets the value of the motivoOptout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivoOptout() {
        return motivoOptout;
    }

    /**
     * Sets the value of the motivoOptout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivoOptout(String value) {
        this.motivoOptout = value;
    }

}
