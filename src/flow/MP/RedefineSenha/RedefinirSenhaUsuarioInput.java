
package flow.MP.RedefineSenha;

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
 *         &lt;element name="usuario" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="usuario-modificado" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="criptografia" type="{http://ebo.multiplusfidelidade.com.br/v1}Criptografia" minOccurs="0"/>
 *         &lt;element name="canal-origem" type="{http://ebo.multiplusfidelidade.com.br/v1}Canal" minOccurs="0"/>
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
    "usuario",
    "usuarioModificado",
    "criptografia",
    "canalOrigem",
    "propriedadesExecucao"
})
@XmlRootElement(name = "RedefinirSenhaUsuarioInput", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
public class RedefinirSenhaUsuarioInput {

    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Usuario usuario;
    @XmlElement(name = "usuario-modificado", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Usuario usuarioModificado;
    @XmlElement(namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Criptografia criptografia;
    @XmlElement(name = "canal-origem", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected Canal canalOrigem;
    @XmlElement(name = "propriedades-execucao", namespace = "http://ebs.multiplusfidelidade.com.br/v1")
    protected PropriedadesExecucao propriedadesExecucao;

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
     * Gets the value of the usuarioModificado property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuarioModificado() {
        return usuarioModificado;
    }

    /**
     * Sets the value of the usuarioModificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuarioModificado(Usuario value) {
        this.usuarioModificado = value;
    }

    /**
     * Gets the value of the criptografia property.
     * 
     * @return
     *     possible object is
     *     {@link Criptografia }
     *     
     */
    public Criptografia getCriptografia() {
        return criptografia;
    }

    /**
     * Sets the value of the criptografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Criptografia }
     *     
     */
    public void setCriptografia(Criptografia value) {
        this.criptografia = value;
    }

    /**
     * Gets the value of the canalOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link Canal }
     *     
     */
    public Canal getCanalOrigem() {
        return canalOrigem;
    }

    /**
     * Sets the value of the canalOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Canal }
     *     
     */
    public void setCanalOrigem(Canal value) {
        this.canalOrigem = value;
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
