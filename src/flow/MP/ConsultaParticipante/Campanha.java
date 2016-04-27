
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de uma campanha de marketing na Multiplus; utilizado para representar
 * 				as campanhas disponíveis para adesão dos participantes; para representar uma campanha
 * 				no contexto de um participante, utilizar CampanhaParticipante
 * 
 * <p>Java class for Campanha complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Campanha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-campanha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-campanha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-campanha" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-inicio-vigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-fim-vigencia" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="oferta-disponivel" type="{http://ebo.multiplusfidelidade.com.br/v1}Oferta" minOccurs="0"/>
 *         &lt;element name="data-inicio-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-termino-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="situacao-campanha" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="propriedades-adesao" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="campanha-informativa" type="{http://ebo.multiplusfidelidade.com.br/v1}CampanhaInformativa" minOccurs="0"/>
 *         &lt;element name="contexto-campanha" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="url-imagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prioridade" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Campanha", propOrder = {
    "idCampanha",
    "nomeCampanha",
    "descricao",
    "tipoCampanha",
    "dataInicioVigencia",
    "dataFimVigencia",
    "ofertaDisponivel",
    "dataInicioValidade",
    "dataTerminoValidade",
    "situacaoCampanha",
    "propriedadesAdesao",
    "campanhaInformativa",
    "contextoCampanha",
    "urlImagem",
    "prioridade"
})
public class Campanha {

    @XmlElement(name = "id-campanha")
    protected String idCampanha;
    @XmlElement(name = "nome-campanha")
    protected String nomeCampanha;
    protected String descricao;
    @XmlElement(name = "tipo-campanha")
    protected TipoReferencia tipoCampanha;
    @XmlElement(name = "data-inicio-vigencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataInicioVigencia;
    @XmlElement(name = "data-fim-vigencia")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFimVigencia;
    @XmlElement(name = "oferta-disponivel")
    protected Oferta ofertaDisponivel;
    @XmlElement(name = "data-inicio-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicioValidade;
    @XmlElement(name = "data-termino-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTerminoValidade;
    @XmlElement(name = "situacao-campanha")
    protected TipoReferencia situacaoCampanha;
    @XmlElement(name = "propriedades-adesao")
    protected AtributoList propriedadesAdesao;
    @XmlElement(name = "campanha-informativa")
    protected CampanhaInformativa campanhaInformativa;
    @XmlElement(name = "contexto-campanha")
    protected AtributoList contextoCampanha;
    @XmlElement(name = "url-imagem")
    protected String urlImagem;
    protected Integer prioridade;

    /**
     * Gets the value of the idCampanha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCampanha() {
        return idCampanha;
    }

    /**
     * Sets the value of the idCampanha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCampanha(String value) {
        this.idCampanha = value;
    }

    /**
     * Gets the value of the nomeCampanha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCampanha() {
        return nomeCampanha;
    }

    /**
     * Sets the value of the nomeCampanha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCampanha(String value) {
        this.nomeCampanha = value;
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
     * Gets the value of the tipoCampanha property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoCampanha() {
        return tipoCampanha;
    }

    /**
     * Sets the value of the tipoCampanha property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoCampanha(TipoReferencia value) {
        this.tipoCampanha = value;
    }

    /**
     * Gets the value of the dataInicioVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioVigencia() {
        return dataInicioVigencia;
    }

    /**
     * Sets the value of the dataInicioVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioVigencia(XMLGregorianCalendar value) {
        this.dataInicioVigencia = value;
    }

    /**
     * Gets the value of the dataFimVigencia property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFimVigencia() {
        return dataFimVigencia;
    }

    /**
     * Sets the value of the dataFimVigencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFimVigencia(XMLGregorianCalendar value) {
        this.dataFimVigencia = value;
    }

    /**
     * Gets the value of the ofertaDisponivel property.
     * 
     * @return
     *     possible object is
     *     {@link Oferta }
     *     
     */
    public Oferta getOfertaDisponivel() {
        return ofertaDisponivel;
    }

    /**
     * Sets the value of the ofertaDisponivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oferta }
     *     
     */
    public void setOfertaDisponivel(Oferta value) {
        this.ofertaDisponivel = value;
    }

    /**
     * Gets the value of the dataInicioValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioValidade() {
        return dataInicioValidade;
    }

    /**
     * Sets the value of the dataInicioValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioValidade(XMLGregorianCalendar value) {
        this.dataInicioValidade = value;
    }

    /**
     * Gets the value of the dataTerminoValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataTerminoValidade() {
        return dataTerminoValidade;
    }

    /**
     * Sets the value of the dataTerminoValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataTerminoValidade(XMLGregorianCalendar value) {
        this.dataTerminoValidade = value;
    }

    /**
     * Gets the value of the situacaoCampanha property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoCampanha() {
        return situacaoCampanha;
    }

    /**
     * Sets the value of the situacaoCampanha property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoCampanha(TipoReferencia value) {
        this.situacaoCampanha = value;
    }

    /**
     * Gets the value of the propriedadesAdesao property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getPropriedadesAdesao() {
        return propriedadesAdesao;
    }

    /**
     * Sets the value of the propriedadesAdesao property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setPropriedadesAdesao(AtributoList value) {
        this.propriedadesAdesao = value;
    }

    /**
     * Gets the value of the campanhaInformativa property.
     * 
     * @return
     *     possible object is
     *     {@link CampanhaInformativa }
     *     
     */
    public CampanhaInformativa getCampanhaInformativa() {
        return campanhaInformativa;
    }

    /**
     * Sets the value of the campanhaInformativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampanhaInformativa }
     *     
     */
    public void setCampanhaInformativa(CampanhaInformativa value) {
        this.campanhaInformativa = value;
    }

    /**
     * Gets the value of the contextoCampanha property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getContextoCampanha() {
        return contextoCampanha;
    }

    /**
     * Sets the value of the contextoCampanha property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setContextoCampanha(AtributoList value) {
        this.contextoCampanha = value;
    }

    /**
     * Gets the value of the urlImagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Sets the value of the urlImagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

    /**
     * Gets the value of the prioridade property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrioridade() {
        return prioridade;
    }

    /**
     * Sets the value of the prioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrioridade(Integer value) {
        this.prioridade = value;
    }

}
