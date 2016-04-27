
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma configuração, inicialmente projetado para atender os atributos de configuração de produto e 
 *             os atributos que definem um SKU
 * 
 * <p>Java class for Configuracao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Configuracao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-configuracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-configuracao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-configuracao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="dominio-valores" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="valor-padrao" type="{http://ebo.multiplusfidelidade.com.br/v1}Atributo" minOccurs="0"/>
 *         &lt;element name="valor-configurado" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Configuracao", propOrder = {
    "idConfiguracao",
    "nomeConfiguracao",
    "descricao",
    "tipoConfiguracao",
    "dominioValores",
    "valorPadrao",
    "valorConfigurado"
})
public class Configuracao {

    @XmlElement(name = "id-configuracao")
    protected String idConfiguracao;
    @XmlElement(name = "nome-configuracao")
    protected String nomeConfiguracao;
    protected String descricao;
    @XmlElement(name = "tipo-configuracao")
    protected TipoReferencia tipoConfiguracao;
    @XmlElement(name = "dominio-valores")
    protected AtributoList dominioValores;
    @XmlElement(name = "valor-padrao")
    protected Atributo valorPadrao;
    @XmlElement(name = "valor-configurado")
    protected AtributoList valorConfigurado;

    /**
     * Gets the value of the idConfiguracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdConfiguracao() {
        return idConfiguracao;
    }

    /**
     * Sets the value of the idConfiguracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdConfiguracao(String value) {
        this.idConfiguracao = value;
    }

    /**
     * Gets the value of the nomeConfiguracao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeConfiguracao() {
        return nomeConfiguracao;
    }

    /**
     * Sets the value of the nomeConfiguracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeConfiguracao(String value) {
        this.nomeConfiguracao = value;
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
     * Gets the value of the tipoConfiguracao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoConfiguracao() {
        return tipoConfiguracao;
    }

    /**
     * Sets the value of the tipoConfiguracao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoConfiguracao(TipoReferencia value) {
        this.tipoConfiguracao = value;
    }

    /**
     * Gets the value of the dominioValores property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getDominioValores() {
        return dominioValores;
    }

    /**
     * Sets the value of the dominioValores property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setDominioValores(AtributoList value) {
        this.dominioValores = value;
    }

    /**
     * Gets the value of the valorPadrao property.
     * 
     * @return
     *     possible object is
     *     {@link Atributo }
     *     
     */
    public Atributo getValorPadrao() {
        return valorPadrao;
    }

    /**
     * Sets the value of the valorPadrao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Atributo }
     *     
     */
    public void setValorPadrao(Atributo value) {
        this.valorPadrao = value;
    }

    /**
     * Gets the value of the valorConfigurado property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getValorConfigurado() {
        return valorConfigurado;
    }

    /**
     * Sets the value of the valorConfigurado property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setValorConfigurado(AtributoList value) {
        this.valorConfigurado = value;
    }

}
