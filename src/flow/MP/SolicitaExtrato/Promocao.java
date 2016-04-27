
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de uma promocao de marketing na Multiplus; utilizado para representar
 * 				as promocaos disponíveis para adesão dos participantes; criado inicialmente para
 *             relacionar um CupomSorteio a uma promoção, que descreve mecanica, parceiro envolvido,
 *             regulamento, etc.
 * 
 * <p>Java class for Promocao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Promocao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-promocao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-promocao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-curta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url-regulamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-inicio-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-termino-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="situacao-promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="percentual-desconto" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="url-imagem-promocao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instrucoes" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferenciaList" minOccurs="0"/>
 *         &lt;element name="atividades" type="{http://ebo.multiplusfidelidade.com.br/v1}AtividadeList" minOccurs="0"/>
 *         &lt;element name="tipo-promocao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-fim-inscricao-promocao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ordem-exibicao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Promocao", propOrder = {
    "idPromocao",
    "nomePromocao",
    "descricao",
    "descricaoCurta",
    "urlRegulamento",
    "dataInicioValidade",
    "dataTerminoValidade",
    "situacaoPromocao",
    "percentualDesconto",
    "preco",
    "urlImagemPromocao",
    "instrucoes",
    "atividades",
    "tipoPromocao",
    "dataFimInscricaoPromocao",
    "ordemExibicao"
})
public class Promocao {

    @XmlElement(name = "id-promocao")
    protected String idPromocao;
    @XmlElement(name = "nome-promocao")
    protected String nomePromocao;
    protected String descricao;
    @XmlElement(name = "descricao-curta")
    protected String descricaoCurta;
    @XmlElement(name = "url-regulamento")
    protected String urlRegulamento;
    @XmlElement(name = "data-inicio-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicioValidade;
    @XmlElement(name = "data-termino-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataTerminoValidade;
    @XmlElement(name = "situacao-promocao")
    protected TipoReferencia situacaoPromocao;
    @XmlElement(name = "percentual-desconto")
    protected Double percentualDesconto;
    protected Preco preco;
    @XmlElement(name = "url-imagem-promocao")
    protected String urlImagemPromocao;
    protected TipoReferenciaList instrucoes;
    protected AtividadeList atividades;
    @XmlElement(name = "tipo-promocao")
    protected TipoReferencia tipoPromocao;
    @XmlElement(name = "data-fim-inscricao-promocao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataFimInscricaoPromocao;
    @XmlElement(name = "ordem-exibicao")
    protected Long ordemExibicao;

    /**
     * Gets the value of the idPromocao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPromocao() {
        return idPromocao;
    }

    /**
     * Sets the value of the idPromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPromocao(String value) {
        this.idPromocao = value;
    }

    /**
     * Gets the value of the nomePromocao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePromocao() {
        return nomePromocao;
    }

    /**
     * Sets the value of the nomePromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePromocao(String value) {
        this.nomePromocao = value;
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
     * Gets the value of the descricaoCurta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    /**
     * Sets the value of the descricaoCurta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoCurta(String value) {
        this.descricaoCurta = value;
    }

    /**
     * Gets the value of the urlRegulamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlRegulamento() {
        return urlRegulamento;
    }

    /**
     * Sets the value of the urlRegulamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlRegulamento(String value) {
        this.urlRegulamento = value;
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
     * Gets the value of the situacaoPromocao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoPromocao() {
        return situacaoPromocao;
    }

    /**
     * Sets the value of the situacaoPromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoPromocao(TipoReferencia value) {
        this.situacaoPromocao = value;
    }

    /**
     * Gets the value of the percentualDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPercentualDesconto() {
        return percentualDesconto;
    }

    /**
     * Sets the value of the percentualDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPercentualDesconto(Double value) {
        this.percentualDesconto = value;
    }

    /**
     * Gets the value of the preco property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPreco() {
        return preco;
    }

    /**
     * Sets the value of the preco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPreco(Preco value) {
        this.preco = value;
    }

    /**
     * Gets the value of the urlImagemPromocao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagemPromocao() {
        return urlImagemPromocao;
    }

    /**
     * Sets the value of the urlImagemPromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagemPromocao(String value) {
        this.urlImagemPromocao = value;
    }

    /**
     * Gets the value of the instrucoes property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferenciaList }
     *     
     */
    public TipoReferenciaList getInstrucoes() {
        return instrucoes;
    }

    /**
     * Sets the value of the instrucoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferenciaList }
     *     
     */
    public void setInstrucoes(TipoReferenciaList value) {
        this.instrucoes = value;
    }

    /**
     * Gets the value of the atividades property.
     * 
     * @return
     *     possible object is
     *     {@link AtividadeList }
     *     
     */
    public AtividadeList getAtividades() {
        return atividades;
    }

    /**
     * Sets the value of the atividades property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtividadeList }
     *     
     */
    public void setAtividades(AtividadeList value) {
        this.atividades = value;
    }

    /**
     * Gets the value of the tipoPromocao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoPromocao() {
        return tipoPromocao;
    }

    /**
     * Sets the value of the tipoPromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoPromocao(TipoReferencia value) {
        this.tipoPromocao = value;
    }

    /**
     * Gets the value of the dataFimInscricaoPromocao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFimInscricaoPromocao() {
        return dataFimInscricaoPromocao;
    }

    /**
     * Sets the value of the dataFimInscricaoPromocao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFimInscricaoPromocao(XMLGregorianCalendar value) {
        this.dataFimInscricaoPromocao = value;
    }

    /**
     * Gets the value of the ordemExibicao property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrdemExibicao() {
        return ordemExibicao;
    }

    /**
     * Sets the value of the ordemExibicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrdemExibicao(Long value) {
        this.ordemExibicao = value;
    }

}
