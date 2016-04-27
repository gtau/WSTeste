
package flow.MP.AutenticaUsuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Sistema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sistema">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="modulos" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="id-sessao-login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="data-hora" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="maquina" type="{http://ebo.multiplusfidelidade.com.br/v1}Maquina" minOccurs="0"/>
 *         &lt;element name="idioma" type="{http://ebo.multiplusfidelidade.com.br/v1}Idioma" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sistema", propOrder = {
    "idSistema",
    "versao",
    "descricao",
    "endereco",
    "modulos",
    "idSessaoLogin",
    "usuario",
    "dataHora",
    "maquina",
    "idioma",
    "nome"
})
public class Sistema {

    @XmlElement(name = "id-sistema")
    protected String idSistema;
    protected String versao;
    protected String descricao;
    protected String endereco;
    protected List<String> modulos;
    @XmlElement(name = "id-sessao-login")
    protected String idSessaoLogin;
    protected Usuario usuario;
    @XmlElement(name = "data-hora")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHora;
    protected Maquina maquina;
    protected Idioma idioma;
    protected String nome;

    /**
     * Gets the value of the idSistema property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSistema() {
        return idSistema;
    }

    /**
     * Sets the value of the idSistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSistema(String value) {
        this.idSistema = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
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
     * Gets the value of the endereco property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Sets the value of the endereco property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndereco(String value) {
        this.endereco = value;
    }

    /**
     * Gets the value of the modulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getModulos() {
        if (modulos == null) {
            modulos = new ArrayList<String>();
        }
        return this.modulos;
    }

    /**
     * Gets the value of the idSessaoLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSessaoLogin() {
        return idSessaoLogin;
    }

    /**
     * Sets the value of the idSessaoLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSessaoLogin(String value) {
        this.idSessaoLogin = value;
    }

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
     * Gets the value of the dataHora property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHora() {
        return dataHora;
    }

    /**
     * Sets the value of the dataHora property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHora(XMLGregorianCalendar value) {
        this.dataHora = value;
    }

    /**
     * Gets the value of the maquina property.
     * 
     * @return
     *     possible object is
     *     {@link Maquina }
     *     
     */
    public Maquina getMaquina() {
        return maquina;
    }

    /**
     * Sets the value of the maquina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Maquina }
     *     
     */
    public void setMaquina(Maquina value) {
        this.maquina = value;
    }

    /**
     * Gets the value of the idioma property.
     * 
     * @return
     *     possible object is
     *     {@link Idioma }
     *     
     */
    public Idioma getIdioma() {
        return idioma;
    }

    /**
     * Sets the value of the idioma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Idioma }
     *     
     */
    public void setIdioma(Idioma value) {
        this.idioma = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

}
