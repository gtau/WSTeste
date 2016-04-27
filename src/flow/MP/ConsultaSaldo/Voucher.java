
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Voucher complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Voucher">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-voucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-voucher" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-hora-emissao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-validade" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="indicador-utilizacao" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-utilizacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-hora-utilizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="localidades-utilizacao" type="{http://ebo.multiplusfidelidade.com.br/v1}UnidadeOrganizacionalList" minOccurs="0"/>
 *         &lt;element name="transacao-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Resgate" minOccurs="0"/>
 *         &lt;element name="resgate-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Resgate" minOccurs="0"/>
 *         &lt;element name="usuario-utilizacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="comentario-utilizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="situacao-voucher" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="informacoes-adicionais" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prazo-validade-dias" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voucher", propOrder = {
    "numeroVoucher",
    "nomeVoucher",
    "descricao",
    "dataHoraEmissao",
    "dataValidade",
    "indicadorUtilizacao",
    "dataUtilizacao",
    "dataHoraUtilizacao",
    "localidadesUtilizacao",
    "transacaoOrigem",
    "resgateOrigem",
    "usuarioUtilizacao",
    "comentarioUtilizacao",
    "situacaoVoucher",
    "informacoesAdicionais",
    "prazoValidadeDias"
})
public class Voucher {

    @XmlElement(name = "numero-voucher")
    protected String numeroVoucher;
    @XmlElement(name = "nome-voucher")
    protected String nomeVoucher;
    protected String descricao;
    @XmlElement(name = "data-hora-emissao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraEmissao;
    @XmlElement(name = "data-validade")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataValidade;
    @XmlElement(name = "indicador-utilizacao")
    protected Boolean indicadorUtilizacao;
    @XmlElement(name = "data-utilizacao")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataUtilizacao;
    @XmlElement(name = "data-hora-utilizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraUtilizacao;
    @XmlElement(name = "localidades-utilizacao")
    protected UnidadeOrganizacionalList localidadesUtilizacao;
    @XmlElement(name = "transacao-origem")
    protected Resgate transacaoOrigem;
    @XmlElement(name = "resgate-origem")
    protected Resgate resgateOrigem;
    @XmlElement(name = "usuario-utilizacao")
    protected Usuario usuarioUtilizacao;
    @XmlElement(name = "comentario-utilizacao")
    protected String comentarioUtilizacao;
    @XmlElement(name = "situacao-voucher")
    protected TipoReferencia situacaoVoucher;
    @XmlElement(name = "informacoes-adicionais")
    protected String informacoesAdicionais;
    @XmlElement(name = "prazo-validade-dias")
    protected Integer prazoValidadeDias;

    /**
     * Gets the value of the numeroVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroVoucher() {
        return numeroVoucher;
    }

    /**
     * Sets the value of the numeroVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroVoucher(String value) {
        this.numeroVoucher = value;
    }

    /**
     * Gets the value of the nomeVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeVoucher() {
        return nomeVoucher;
    }

    /**
     * Sets the value of the nomeVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeVoucher(String value) {
        this.nomeVoucher = value;
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
     * Gets the value of the dataHoraEmissao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraEmissao() {
        return dataHoraEmissao;
    }

    /**
     * Sets the value of the dataHoraEmissao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraEmissao(XMLGregorianCalendar value) {
        this.dataHoraEmissao = value;
    }

    /**
     * Gets the value of the dataValidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataValidade() {
        return dataValidade;
    }

    /**
     * Sets the value of the dataValidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataValidade(XMLGregorianCalendar value) {
        this.dataValidade = value;
    }

    /**
     * Gets the value of the indicadorUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorUtilizacao() {
        return indicadorUtilizacao;
    }

    /**
     * Sets the value of the indicadorUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorUtilizacao(Boolean value) {
        this.indicadorUtilizacao = value;
    }

    /**
     * Gets the value of the dataUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUtilizacao() {
        return dataUtilizacao;
    }

    /**
     * Sets the value of the dataUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUtilizacao(XMLGregorianCalendar value) {
        this.dataUtilizacao = value;
    }

    /**
     * Gets the value of the dataHoraUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraUtilizacao() {
        return dataHoraUtilizacao;
    }

    /**
     * Sets the value of the dataHoraUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraUtilizacao(XMLGregorianCalendar value) {
        this.dataHoraUtilizacao = value;
    }

    /**
     * Gets the value of the localidadesUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadeOrganizacionalList }
     *     
     */
    public UnidadeOrganizacionalList getLocalidadesUtilizacao() {
        return localidadesUtilizacao;
    }

    /**
     * Sets the value of the localidadesUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadeOrganizacionalList }
     *     
     */
    public void setLocalidadesUtilizacao(UnidadeOrganizacionalList value) {
        this.localidadesUtilizacao = value;
    }

    /**
     * Gets the value of the transacaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Resgate }
     *     
     */
    public Resgate getTransacaoOrigem() {
        return transacaoOrigem;
    }

    /**
     * Sets the value of the transacaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resgate }
     *     
     */
    public void setTransacaoOrigem(Resgate value) {
        this.transacaoOrigem = value;
    }

    /**
     * Gets the value of the resgateOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Resgate }
     *     
     */
    public Resgate getResgateOrigem() {
        return resgateOrigem;
    }

    /**
     * Sets the value of the resgateOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resgate }
     *     
     */
    public void setResgateOrigem(Resgate value) {
        this.resgateOrigem = value;
    }

    /**
     * Gets the value of the usuarioUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuarioUtilizacao() {
        return usuarioUtilizacao;
    }

    /**
     * Sets the value of the usuarioUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuarioUtilizacao(Usuario value) {
        this.usuarioUtilizacao = value;
    }

    /**
     * Gets the value of the comentarioUtilizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioUtilizacao() {
        return comentarioUtilizacao;
    }

    /**
     * Sets the value of the comentarioUtilizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioUtilizacao(String value) {
        this.comentarioUtilizacao = value;
    }

    /**
     * Gets the value of the situacaoVoucher property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoVoucher() {
        return situacaoVoucher;
    }

    /**
     * Sets the value of the situacaoVoucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoVoucher(TipoReferencia value) {
        this.situacaoVoucher = value;
    }

    /**
     * Gets the value of the informacoesAdicionais property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacoesAdicionais() {
        return informacoesAdicionais;
    }

    /**
     * Sets the value of the informacoesAdicionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacoesAdicionais(String value) {
        this.informacoesAdicionais = value;
    }

    /**
     * Gets the value of the prazoValidadeDias property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrazoValidadeDias() {
        return prazoValidadeDias;
    }

    /**
     * Sets the value of the prazoValidadeDias property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrazoValidadeDias(Integer value) {
        this.prazoValidadeDias = value;
    }

}
