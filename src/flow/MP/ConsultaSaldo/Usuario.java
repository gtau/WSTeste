
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um usuário de um sistema de TI.
 * 
 * <p>Java class for Usuario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Usuario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://ebo.multiplusfidelidade.com.br/v1}Senha" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-usuario" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="tipo-credencial" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="primeiro-nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sobrenome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://ebo.multiplusfidelidade.com.br/v1}Email" minOccurs="0"/>
 *         &lt;element name="permissoes" type="{http://ebo.multiplusfidelidade.com.br/v1}PermissaoList" minOccurs="0"/>
 *         &lt;element name="situacao-usuario" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="idioma-preferencial" type="{http://ebo.multiplusfidelidade.com.br/v1}Idioma" minOccurs="0"/>
 *         &lt;element name="grupos" type="{http://ebo.multiplusfidelidade.com.br/v1}GrupoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Usuario", propOrder = {
    "idUsuario",
    "senha",
    "token",
    "tipoUsuario",
    "tipoCredencial",
    "primeiroNome",
    "sobrenome",
    "email",
    "permissoes",
    "situacaoUsuario",
    "idiomaPreferencial",
    "grupos"
})
public class Usuario {

    @XmlElement(name = "id-usuario")
    protected String idUsuario;
    protected String senha;
    protected String token;
    @XmlElement(name = "tipo-usuario")
    protected TipoReferencia tipoUsuario;
    @XmlElement(name = "tipo-credencial")
    protected TipoReferencia tipoCredencial;
    @XmlElement(name = "primeiro-nome")
    protected String primeiroNome;
    protected String sobrenome;
    protected Email email;
    protected PermissaoList permissoes;
    @XmlElement(name = "situacao-usuario")
    protected TipoReferencia situacaoUsuario;
    @XmlElement(name = "idioma-preferencial")
    protected Idioma idiomaPreferencial;
    protected GrupoList grupos;

    /**
     * Gets the value of the idUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUsuario(String value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the senha property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Sets the value of the senha property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the tipoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * Sets the value of the tipoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoUsuario(TipoReferencia value) {
        this.tipoUsuario = value;
    }

    /**
     * Gets the value of the tipoCredencial property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoCredencial() {
        return tipoCredencial;
    }

    /**
     * Sets the value of the tipoCredencial property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoCredencial(TipoReferencia value) {
        this.tipoCredencial = value;
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
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmail(Email value) {
        this.email = value;
    }

    /**
     * Gets the value of the permissoes property.
     * 
     * @return
     *     possible object is
     *     {@link PermissaoList }
     *     
     */
    public PermissaoList getPermissoes() {
        return permissoes;
    }

    /**
     * Sets the value of the permissoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissaoList }
     *     
     */
    public void setPermissoes(PermissaoList value) {
        this.permissoes = value;
    }

    /**
     * Gets the value of the situacaoUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoUsuario() {
        return situacaoUsuario;
    }

    /**
     * Sets the value of the situacaoUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoUsuario(TipoReferencia value) {
        this.situacaoUsuario = value;
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
     * Gets the value of the grupos property.
     * 
     * @return
     *     possible object is
     *     {@link GrupoList }
     *     
     */
    public GrupoList getGrupos() {
        return grupos;
    }

    /**
     * Sets the value of the grupos property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoList }
     *     
     */
    public void setGrupos(GrupoList value) {
        this.grupos = value;
    }

}
