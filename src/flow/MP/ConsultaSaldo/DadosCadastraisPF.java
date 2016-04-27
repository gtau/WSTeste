
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DadosCadastraisPF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DadosCadastraisPF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tratamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-completo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primeiro-nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sobrenome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-nascimento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sexo" type="{http://ebo.multiplusfidelidade.com.br/v1}Sexo" minOccurs="0"/>
 *         &lt;element name="nacionalidade" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="cpf" type="{http://ebo.multiplusfidelidade.com.br/v1}Cpf" minOccurs="0"/>
 *         &lt;element name="indicador-cpf-proprio" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indicador-validado-bureau" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ocupacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="estado-civil" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="idioma-preferencial" type="{http://ebo.multiplusfidelidade.com.br/v1}Idioma" minOccurs="0"/>
 *         &lt;element name="rg" type="{http://ebo.multiplusfidelidade.com.br/v1}Rg" minOccurs="0"/>
 *         &lt;element name="numero-documento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-documento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DadosCadastraisPF", propOrder = {
    "tratamento",
    "nomeCompleto",
    "primeiroNome",
    "sobrenome",
    "dataNascimento",
    "sexo",
    "nacionalidade",
    "cpf",
    "indicadorCpfProprio",
    "indicadorValidadoBureau",
    "ocupacao",
    "estadoCivil",
    "idiomaPreferencial",
    "rg",
    "numeroDocumento",
    "tipoDocumento"
})
public class DadosCadastraisPF {

    protected String tratamento;
    @XmlElement(name = "nome-completo")
    protected String nomeCompleto;
    @XmlElement(name = "primeiro-nome")
    protected String primeiroNome;
    protected String sobrenome;
    @XmlElement(name = "data-nascimento")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataNascimento;
    protected Sexo sexo;
    protected TipoReferencia nacionalidade;
    protected String cpf;
    @XmlElement(name = "indicador-cpf-proprio")
    protected Boolean indicadorCpfProprio;
    @XmlElement(name = "indicador-validado-bureau")
    protected Boolean indicadorValidadoBureau;
    protected TipoReferencia ocupacao;
    @XmlElement(name = "estado-civil")
    protected TipoReferencia estadoCivil;
    @XmlElement(name = "idioma-preferencial")
    protected Idioma idiomaPreferencial;
    protected Rg rg;
    @XmlElement(name = "numero-documento")
    protected String numeroDocumento;
    @XmlElement(name = "tipo-documento")
    protected TipoReferencia tipoDocumento;

    /**
     * Gets the value of the tratamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTratamento() {
        return tratamento;
    }

    /**
     * Sets the value of the tratamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTratamento(String value) {
        this.tratamento = value;
    }

    /**
     * Gets the value of the nomeCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * Sets the value of the nomeCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCompleto(String value) {
        this.nomeCompleto = value;
    }

    /**
     * Gets the value of the primeiroNome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * Sets the value of the primeiroNome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeiroNome(String value) {
        this.primeiroNome = value;
    }

    /**
     * Gets the value of the sobrenome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Sets the value of the sobrenome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSobrenome(String value) {
        this.sobrenome = value;
    }

    /**
     * Gets the value of the dataNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataNascimento() {
        return dataNascimento;
    }

    /**
     * Sets the value of the dataNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataNascimento(XMLGregorianCalendar value) {
        this.dataNascimento = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link Sexo }
     *     
     */
    public Sexo getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sexo }
     *     
     */
    public void setSexo(Sexo value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the nacionalidade property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getNacionalidade() {
        return nacionalidade;
    }

    /**
     * Sets the value of the nacionalidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setNacionalidade(TipoReferencia value) {
        this.nacionalidade = value;
    }

    /**
     * Gets the value of the cpf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Sets the value of the cpf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpf(String value) {
        this.cpf = value;
    }

    /**
     * Gets the value of the indicadorCpfProprio property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorCpfProprio() {
        return indicadorCpfProprio;
    }

    /**
     * Sets the value of the indicadorCpfProprio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorCpfProprio(Boolean value) {
        this.indicadorCpfProprio = value;
    }

    /**
     * Gets the value of the indicadorValidadoBureau property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorValidadoBureau() {
        return indicadorValidadoBureau;
    }

    /**
     * Sets the value of the indicadorValidadoBureau property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorValidadoBureau(Boolean value) {
        this.indicadorValidadoBureau = value;
    }

    /**
     * Gets the value of the ocupacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getOcupacao() {
        return ocupacao;
    }

    /**
     * Sets the value of the ocupacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setOcupacao(TipoReferencia value) {
        this.ocupacao = value;
    }

    /**
     * Gets the value of the estadoCivil property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Sets the value of the estadoCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setEstadoCivil(TipoReferencia value) {
        this.estadoCivil = value;
    }

    /**
     * Gets the value of the idiomaPreferencial property.
     * 
     * @return
     *     possible object is
     *     {@link Idioma }
     *     
     */
    public Idioma getIdiomaPreferencial() {
        return idiomaPreferencial;
    }

    /**
     * Sets the value of the idiomaPreferencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Idioma }
     *     
     */
    public void setIdiomaPreferencial(Idioma value) {
        this.idiomaPreferencial = value;
    }

    /**
     * Gets the value of the rg property.
     * 
     * @return
     *     possible object is
     *     {@link Rg }
     *     
     */
    public Rg getRg() {
        return rg;
    }

    /**
     * Sets the value of the rg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Rg }
     *     
     */
    public void setRg(Rg value) {
        this.rg = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoDocumento(TipoReferencia value) {
        this.tipoDocumento = value;
    }

}
