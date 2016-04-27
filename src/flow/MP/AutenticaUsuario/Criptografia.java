
package flow.MP.AutenticaUsuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Utilizado na representação de informações de criptografia e descriptografia.
 * 
 * <p>Java class for Criptografia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Criptografia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificador-chave-criptografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-chave-criptografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-algoritmo-criptografia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacao-criptografada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informacao-descriptografada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sistema" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Criptografia", propOrder = {
    "identificadorChaveCriptografia",
    "tipoChaveCriptografia",
    "tipoAlgoritmoCriptografia",
    "informacaoCriptografada",
    "informacaoDescriptografada",
    "sistema"
})
public class Criptografia {

    @XmlElement(name = "identificador-chave-criptografia")
    protected String identificadorChaveCriptografia;
    @XmlElement(name = "tipo-chave-criptografia")
    protected String tipoChaveCriptografia;
    @XmlElement(name = "tipo-algoritmo-criptografia")
    protected String tipoAlgoritmoCriptografia;
    @XmlElement(name = "informacao-criptografada")
    protected String informacaoCriptografada;
    @XmlElement(name = "informacao-descriptografada")
    protected String informacaoDescriptografada;
    protected Sistema sistema;

    /**
     * Gets the value of the identificadorChaveCriptografia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorChaveCriptografia() {
        return identificadorChaveCriptografia;
    }

    /**
     * Sets the value of the identificadorChaveCriptografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorChaveCriptografia(String value) {
        this.identificadorChaveCriptografia = value;
    }

    /**
     * Gets the value of the tipoChaveCriptografia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoChaveCriptografia() {
        return tipoChaveCriptografia;
    }

    /**
     * Sets the value of the tipoChaveCriptografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoChaveCriptografia(String value) {
        this.tipoChaveCriptografia = value;
    }

    /**
     * Gets the value of the tipoAlgoritmoCriptografia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAlgoritmoCriptografia() {
        return tipoAlgoritmoCriptografia;
    }

    /**
     * Sets the value of the tipoAlgoritmoCriptografia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAlgoritmoCriptografia(String value) {
        this.tipoAlgoritmoCriptografia = value;
    }

    /**
     * Gets the value of the informacaoCriptografada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacaoCriptografada() {
        return informacaoCriptografada;
    }

    /**
     * Sets the value of the informacaoCriptografada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacaoCriptografada(String value) {
        this.informacaoCriptografada = value;
    }

    /**
     * Gets the value of the informacaoDescriptografada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformacaoDescriptografada() {
        return informacaoDescriptografada;
    }

    /**
     * Sets the value of the informacaoDescriptografada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformacaoDescriptografada(String value) {
        this.informacaoDescriptografada = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistema(Sistema value) {
        this.sistema = value;
    }

}
