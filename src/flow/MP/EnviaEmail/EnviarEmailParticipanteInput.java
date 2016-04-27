
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="notificacao-email" type="{http://ebo.multiplusfidelidade.com.br/v1}NotificacaoEmail" minOccurs="0"/>
 *         &lt;element name="indicador-envio-assincrono" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="propriedades-execucao" type="{http://ebo.multiplusfidelidade.com.br/v1}PropriedadesExecucao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "notificacaoEmail",
    "indicadorEnvioAssincrono",
    "propriedadesExecucao"
})
@XmlRootElement(name = "EnviarEmailParticipanteInput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class EnviarEmailParticipanteInput {

    @XmlElement(name = "notificacao-email", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected NotificacaoEmail notificacaoEmail;
    @XmlElement(name = "indicador-envio-assincrono", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Boolean indicadorEnvioAssincrono;
    @XmlElement(name = "propriedades-execucao", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected PropriedadesExecucao propriedadesExecucao;

    /**
     * Gets the value of the notificacaoEmail property.
     * 
     * @return
     *     possible object is
     *     {@link NotificacaoEmail }
     *     
     */
    public NotificacaoEmail getNotificacaoEmail() {
        return notificacaoEmail;
    }

    /**
     * Sets the value of the notificacaoEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificacaoEmail }
     *     
     */
    public void setNotificacaoEmail(NotificacaoEmail value) {
        this.notificacaoEmail = value;
    }

    /**
     * Gets the value of the indicadorEnvioAssincrono property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorEnvioAssincrono() {
        return indicadorEnvioAssincrono;
    }

    /**
     * Sets the value of the indicadorEnvioAssincrono property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorEnvioAssincrono(Boolean value) {
        this.indicadorEnvioAssincrono = value;
    }

    /**
     * Gets the value of the propriedadesExecucao property.
     * 
     * @return
     *     possible object is
     *     {@link PropriedadesExecucao }
     *     
     */
    public PropriedadesExecucao getPropriedadesExecucao() {
        return propriedadesExecucao;
    }

    /**
     * Sets the value of the propriedadesExecucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropriedadesExecucao }
     *     
     */
    public void setPropriedadesExecucao(PropriedadesExecucao value) {
        this.propriedadesExecucao = value;
    }

}
