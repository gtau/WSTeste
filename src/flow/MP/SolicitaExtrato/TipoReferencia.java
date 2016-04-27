
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Estrutura genérica para representar dados de referência e enumerados em geral, mas
 * 				sem limitar os valores válidos de referência; sempre que uma entidade definir um
 * 				elemento de situação (ex.: situacao-resgate), ou tipo (ex.: tipo-endereco, tipo-email, tipo-telefone),
 * 				TipoReferencia pode ser utilizado para representar os valores válidos do domínio de referência.
 * 
 * <p>Java class for TipoReferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoReferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-valor-referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-valor-referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor-referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dominio" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idioma" type="{http://ebo.multiplusfidelidade.com.br/v1}Idioma" minOccurs="0"/>
 *         &lt;element name="ordem-exibicao" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="dominio-pai" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoReferencia", propOrder = {
    "idValorReferencia",
    "codigoValorReferencia",
    "valorReferencia",
    "dominio",
    "descricao",
    "idioma",
    "ordemExibicao",
    "dominioPai"
})
public class TipoReferencia {

    @XmlElement(name = "id-valor-referencia")
    protected String idValorReferencia;
    @XmlElement(name = "codigo-valor-referencia")
    protected String codigoValorReferencia;
    @XmlElement(name = "valor-referencia")
    protected String valorReferencia;
    protected TipoReferencia dominio;
    protected String descricao;
    protected Idioma idioma;
    @XmlElement(name = "ordem-exibicao")
    protected Integer ordemExibicao;
    @XmlElement(name = "dominio-pai")
    protected TipoReferencia dominioPai;

    /**
     * Gets the value of the idValorReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdValorReferencia() {
        return idValorReferencia;
    }

    /**
     * Sets the value of the idValorReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdValorReferencia(String value) {
        this.idValorReferencia = value;
    }

    /**
     * Gets the value of the codigoValorReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoValorReferencia() {
        return codigoValorReferencia;
    }

    /**
     * Sets the value of the codigoValorReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoValorReferencia(String value) {
        this.codigoValorReferencia = value;
    }

    /**
     * Gets the value of the valorReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValorReferencia() {
        return valorReferencia;
    }

    /**
     * Sets the value of the valorReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValorReferencia(String value) {
        this.valorReferencia = value;
    }

    /**
     * Gets the value of the dominio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getDominio() {
        return dominio;
    }

    /**
     * Sets the value of the dominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setDominio(TipoReferencia value) {
        this.dominio = value;
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
     * Gets the value of the ordemExibicao property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrdemExibicao() {
        return ordemExibicao;
    }

    /**
     * Sets the value of the ordemExibicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrdemExibicao(Integer value) {
        this.ordemExibicao = value;
    }

    /**
     * Gets the value of the dominioPai property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getDominioPai() {
        return dominioPai;
    }

    /**
     * Sets the value of the dominioPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setDominioPai(TipoReferencia value) {
        this.dominioPai = value;
    }

}
