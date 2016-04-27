
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma notificação via email.
 * 
 * <p>Java class for NotificacaoEmail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificacaoEmail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="participante" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="email-alternativo" type="{http://ebo.multiplusfidelidade.com.br/v1}Email" minOccurs="0"/>
 *         &lt;element name="template" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="atributos" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="remetente" type="{http://ebo.multiplusfidelidade.com.br/v1}Email" minOccurs="0"/>
 *         &lt;element name="destinatarios" type="{http://ebo.multiplusfidelidade.com.br/v1}EmailList" minOccurs="0"/>
 *         &lt;element name="assunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="em-copia" type="{http://ebo.multiplusfidelidade.com.br/v1}EmailList" minOccurs="0"/>
 *         &lt;element name="em-copia-oculta" type="{http://ebo.multiplusfidelidade.com.br/v1}EmailList" minOccurs="0"/>
 *         &lt;element name="template-conteudo" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificacaoEmail", propOrder = {
    "participante",
    "emailAlternativo",
    "template",
    "atributos",
    "remetente",
    "destinatarios",
    "assunto",
    "emCopia",
    "emCopiaOculta",
    "templateConteudo"
})
public class NotificacaoEmail {

    protected Participante participante;
    @XmlElement(name = "email-alternativo")
    protected Email emailAlternativo;
    protected TipoReferencia template;
    protected AtributoList atributos;
    protected Email remetente;
    protected EmailList destinatarios;
    protected String assunto;
    @XmlElement(name = "em-copia")
    protected EmailList emCopia;
    @XmlElement(name = "em-copia-oculta")
    protected EmailList emCopiaOculta;
    @XmlElement(name = "template-conteudo")
    protected Object templateConteudo;

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
     * Gets the value of the emailAlternativo property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getEmailAlternativo() {
        return emailAlternativo;
    }

    /**
     * Sets the value of the emailAlternativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setEmailAlternativo(Email value) {
        this.emailAlternativo = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTemplate() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTemplate(TipoReferencia value) {
        this.template = value;
    }

    /**
     * Gets the value of the atributos property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getAtributos() {
        return atributos;
    }

    /**
     * Sets the value of the atributos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setAtributos(AtributoList value) {
        this.atributos = value;
    }

    /**
     * Gets the value of the remetente property.
     * 
     * @return
     *     possible object is
     *     {@link Email }
     *     
     */
    public Email getRemetente() {
        return remetente;
    }

    /**
     * Sets the value of the remetente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Email }
     *     
     */
    public void setRemetente(Email value) {
        this.remetente = value;
    }

    /**
     * Gets the value of the destinatarios property.
     * 
     * @return
     *     possible object is
     *     {@link EmailList }
     *     
     */
    public EmailList getDestinatarios() {
        return destinatarios;
    }

    /**
     * Sets the value of the destinatarios property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailList }
     *     
     */
    public void setDestinatarios(EmailList value) {
        this.destinatarios = value;
    }

    /**
     * Gets the value of the assunto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssunto() {
        return assunto;
    }

    /**
     * Sets the value of the assunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssunto(String value) {
        this.assunto = value;
    }

    /**
     * Gets the value of the emCopia property.
     * 
     * @return
     *     possible object is
     *     {@link EmailList }
     *     
     */
    public EmailList getEmCopia() {
        return emCopia;
    }

    /**
     * Sets the value of the emCopia property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailList }
     *     
     */
    public void setEmCopia(EmailList value) {
        this.emCopia = value;
    }

    /**
     * Gets the value of the emCopiaOculta property.
     * 
     * @return
     *     possible object is
     *     {@link EmailList }
     *     
     */
    public EmailList getEmCopiaOculta() {
        return emCopiaOculta;
    }

    /**
     * Sets the value of the emCopiaOculta property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailList }
     *     
     */
    public void setEmCopiaOculta(EmailList value) {
        this.emCopiaOculta = value;
    }

    /**
     * Gets the value of the templateConteudo property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTemplateConteudo() {
        return templateConteudo;
    }

    /**
     * Sets the value of the templateConteudo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTemplateConteudo(Object value) {
        this.templateConteudo = value;
    }

}
