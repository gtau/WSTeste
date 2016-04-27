
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contato complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contato">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-contato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-contato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefones" type="{http://ebo.multiplusfidelidade.com.br/v1}TelefoneList" minOccurs="0"/>
 *         &lt;element name="telefone-principal" type="{http://ebo.multiplusfidelidade.com.br/v1}Telefone" minOccurs="0"/>
 *         &lt;element name="emails" type="{http://ebo.multiplusfidelidade.com.br/v1}EmailList" minOccurs="0"/>
 *         &lt;element name="email-principal" type="{http://ebo.multiplusfidelidade.com.br/v1}Email" minOccurs="0"/>
 *         &lt;element name="enderecos" type="{http://ebo.multiplusfidelidade.com.br/v1}EnderecoList" minOccurs="0"/>
 *         &lt;element name="endereco-principal" type="{http://ebo.multiplusfidelidade.com.br/v1}Endereco" minOccurs="0"/>
 *         &lt;element name="papel-contato" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="lista-configuracoes-optin" type="{http://ebo.multiplusfidelidade.com.br/v1}ConfiguracaoOptinList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contato", propOrder = {
    "idContato",
    "nomeContato",
    "telefones",
    "telefonePrincipal",
    "emails",
    "emailPrincipal",
    "enderecos",
    "enderecoPrincipal",
    "papelContato",
    "listaConfiguracoesOptin"
})
public class Contato {

    @XmlElement(name = "id-contato")
    protected String idContato;
    @XmlElement(name = "nome-contato")
    protected String nomeContato;
    protected TelefoneList telefones;
    @XmlElement(name = "telefone-principal")
    protected Telefone telefonePrincipal;
    protected EmailList emails;
    @XmlElement(name = "email-principal")
    protected Email emailPrincipal;
    protected EnderecoList enderecos;
    @XmlElement(name = "endereco-principal")
    protected Endereco enderecoPrincipal;
    @XmlElement(name = "papel-contato")
    protected TipoReferencia papelContato;
    @XmlElement(name = "lista-configuracoes-optin")
    protected ConfiguracaoOptinList listaConfiguracoesOptin;

    /**
     * Gets the value of the idContato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContato() {
        return idContato;
    }

    /**
     * Sets the value of the idContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContato(String value) {
        this.idContato = value;
    }

    /**
     * Gets the value of the nomeContato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContato() {
        return nomeContato;
    }

    /**
     * Sets the value of the nomeContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContato(String value) {
        this.nomeContato = value;
    }

    /**
     * Gets the value of the telefones property.
     * 
     * @return
     *     possible object is
     *     {@link TelefoneList }
     *     
     */
    public TelefoneList getTelefones() {
        return telefones;
    }

    /**
     * Sets the value of the telefones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelefoneList }
     *     
     */
    public void setTelefones(TelefoneList value) {
        this.telefones = value;
    }

    /**
     * Gets the value of the telefonePrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Telefone }
     *     
     */
    public Telefone getTelefonePrincipal() {
        return telefonePrincipal;
    }

    /**
     * Sets the value of the telefonePrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Telefone }
     *     
     */
    public void setTelefonePrincipal(Telefone value) {
        this.telefonePrincipal = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * @return
     *     possible object is
     *     {@link EmailList }
     *     
     */
    public EmailList getEmails() {
        return emails;
    }

    /**
     * Sets the value of the emails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailList }
     *     
     */
    public void setEmails(EmailList value) {
        this.emails = value;
    }

    /**
     * Gets the value of the emailPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmailPrincipal() {
        return emailPrincipal;
    }

    /**
     * Sets the value of the emailPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmailPrincipal(Email value) {
        this.emailPrincipal = value;
    }

    /**
     * Gets the value of the enderecos property.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoList }
     *     
     */
    public EnderecoList getEnderecos() {
        return enderecos;
    }

    /**
     * Sets the value of the enderecos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoList }
     *     
     */
    public void setEnderecos(EnderecoList value) {
        this.enderecos = value;
    }

    /**
     * Gets the value of the enderecoPrincipal property.
     * 
     * @return
     *     possible object is
     *     {@link Endereco }
     *     
     */
    public Endereco getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

    /**
     * Sets the value of the enderecoPrincipal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endereco }
     *     
     */
    public void setEnderecoPrincipal(Endereco value) {
        this.enderecoPrincipal = value;
    }

    /**
     * Gets the value of the papelContato property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getPapelContato() {
        return papelContato;
    }

    /**
     * Sets the value of the papelContato property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setPapelContato(TipoReferencia value) {
        this.papelContato = value;
    }

    /**
     * Gets the value of the listaConfiguracoesOptin property.
     * 
     * @return
     *     possible object is
     *     {@link ConfiguracaoOptinList }
     *     
     */
    public ConfiguracaoOptinList getListaConfiguracoesOptin() {
        return listaConfiguracoesOptin;
    }

    /**
     * Sets the value of the listaConfiguracoesOptin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfiguracaoOptinList }
     *     
     */
    public void setListaConfiguracoesOptin(ConfiguracaoOptinList value) {
        this.listaConfiguracoesOptin = value;
    }

}
