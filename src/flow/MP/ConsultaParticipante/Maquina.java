
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma máquina (virtual ou física) a nível de hardware.
 * 
 * <p>Java class for Maquina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Maquina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-maquina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-maquina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco-ip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco-mac" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localizacao-maquina" type="{http://ebo.multiplusfidelidade.com.br/v1}Endereco" minOccurs="0"/>
 *         &lt;element name="sistema-operacional" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *         &lt;element name="interface-rede-movel" type="{http://ebo.multiplusfidelidade.com.br/v1}InterfaceRedeMovel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Maquina", propOrder = {
    "idMaquina",
    "nomeMaquina",
    "modelo",
    "descricao",
    "enderecoIp",
    "enderecoMac",
    "localizacaoMaquina",
    "sistemaOperacional",
    "interfaceRedeMovel"
})
public class Maquina {

    @XmlElement(name = "id-maquina")
    protected String idMaquina;
    @XmlElement(name = "nome-maquina")
    protected String nomeMaquina;
    protected String modelo;
    protected String descricao;
    @XmlElement(name = "endereco-ip")
    protected String enderecoIp;
    @XmlElement(name = "endereco-mac")
    protected String enderecoMac;
    @XmlElement(name = "localizacao-maquina")
    protected Endereco localizacaoMaquina;
    @XmlElement(name = "sistema-operacional")
    protected Sistema sistemaOperacional;
    @XmlElement(name = "interface-rede-movel")
    protected InterfaceRedeMovel interfaceRedeMovel;

    /**
     * Gets the value of the idMaquina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMaquina() {
        return idMaquina;
    }

    /**
     * Sets the value of the idMaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMaquina(String value) {
        this.idMaquina = value;
    }

    /**
     * Gets the value of the nomeMaquina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMaquina() {
        return nomeMaquina;
    }

    /**
     * Sets the value of the nomeMaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMaquina(String value) {
        this.nomeMaquina = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
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
     * Gets the value of the enderecoIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoIp() {
        return enderecoIp;
    }

    /**
     * Sets the value of the enderecoIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoIp(String value) {
        this.enderecoIp = value;
    }

    /**
     * Gets the value of the enderecoMac property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoMac() {
        return enderecoMac;
    }

    /**
     * Sets the value of the enderecoMac property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoMac(String value) {
        this.enderecoMac = value;
    }

    /**
     * Gets the value of the localizacaoMaquina property.
     * 
     * @return
     *     possible object is
     *     {@link Endereco }
     *     
     */
    public Endereco getLocalizacaoMaquina() {
        return localizacaoMaquina;
    }

    /**
     * Sets the value of the localizacaoMaquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Endereco }
     *     
     */
    public void setLocalizacaoMaquina(Endereco value) {
        this.localizacaoMaquina = value;
    }

    /**
     * Gets the value of the sistemaOperacional property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistemaOperacional() {
        return sistemaOperacional;
    }

    /**
     * Sets the value of the sistemaOperacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistemaOperacional(Sistema value) {
        this.sistemaOperacional = value;
    }

    /**
     * Gets the value of the interfaceRedeMovel property.
     * 
     * @return
     *     possible object is
     *     {@link InterfaceRedeMovel }
     *     
     */
    public InterfaceRedeMovel getInterfaceRedeMovel() {
        return interfaceRedeMovel;
    }

    /**
     * Sets the value of the interfaceRedeMovel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterfaceRedeMovel }
     *     
     */
    public void setInterfaceRedeMovel(InterfaceRedeMovel value) {
        this.interfaceRedeMovel = value;
    }

}
