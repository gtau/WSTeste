
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma opção em receber ou não notificações em um determinado canal. 
 * 			Exemplo: Receber notificações no canal SMS, EMAIL ou NOTIFICAO_MOBILE
 * 
 * <p>Java class for ConfiguracaoOptin complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfiguracaoOptin">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canal-optin" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-aceite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="indicador-suporta-assuntos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="lista-assuntos" type="{http://ebo.multiplusfidelidade.com.br/v1}AssuntoComunicacaoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfiguracaoOptin", propOrder = {
    "canalOptin",
    "descricao",
    "indicadorAceite",
    "indicadorSuportaAssuntos",
    "listaAssuntos"
})
public class ConfiguracaoOptin {

    @XmlElement(name = "canal-optin")
    protected TipoReferencia canalOptin;
    protected String descricao;
    @XmlElement(name = "indicador-aceite")
    protected Boolean indicadorAceite;
    @XmlElement(name = "indicador-suporta-assuntos")
    protected Boolean indicadorSuportaAssuntos;
    @XmlElement(name = "lista-assuntos")
    protected AssuntoComunicacaoList listaAssuntos;

    /**
     * Gets the value of the canalOptin property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCanalOptin() {
        return canalOptin;
    }

    /**
     * Sets the value of the canalOptin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCanalOptin(TipoReferencia value) {
        this.canalOptin = value;
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
     * Gets the value of the indicadorAceite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAceite() {
        return indicadorAceite;
    }

    /**
     * Sets the value of the indicadorAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAceite(Boolean value) {
        this.indicadorAceite = value;
    }

    /**
     * Gets the value of the indicadorSuportaAssuntos property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorSuportaAssuntos() {
        return indicadorSuportaAssuntos;
    }

    /**
     * Sets the value of the indicadorSuportaAssuntos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorSuportaAssuntos(Boolean value) {
        this.indicadorSuportaAssuntos = value;
    }

    /**
     * Gets the value of the listaAssuntos property.
     * 
     * @return
     *     possible object is
     *     {@link AssuntoComunicacaoList }
     *     
     */
    public AssuntoComunicacaoList getListaAssuntos() {
        return listaAssuntos;
    }

    /**
     * Sets the value of the listaAssuntos property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssuntoComunicacaoList }
     *     
     */
    public void setListaAssuntos(AssuntoComunicacaoList value) {
        this.listaAssuntos = value;
    }

}
