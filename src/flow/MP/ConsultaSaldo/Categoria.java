
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Categoria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Categoria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catalogo" type="{http://ebo.multiplusfidelidade.com.br/v1}Catalogo" minOccurs="0"/>
 *         &lt;element name="categoria-pai" type="{http://ebo.multiplusfidelidade.com.br/v1}Categoria" minOccurs="0"/>
 *         &lt;element name="categoria-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}Categoria" minOccurs="0"/>
 *         &lt;element name="prioridade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="indicador-ativa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Categoria", propOrder = {
    "idCategoria",
    "nomeCategoria",
    "descricao",
    "catalogo",
    "categoriaPai",
    "categoriaParceiro",
    "prioridade",
    "indicadorAtiva"
})
public class Categoria {

    @XmlElement(name = "id-categoria")
    protected String idCategoria;
    @XmlElement(name = "nome-categoria")
    protected String nomeCategoria;
    protected String descricao;
    protected Catalogo catalogo;
    @XmlElement(name = "categoria-pai")
    protected Categoria categoriaPai;
    @XmlElement(name = "categoria-parceiro")
    protected Categoria categoriaParceiro;
    protected Long prioridade;
    @XmlElement(name = "indicador-ativa")
    protected Boolean indicadorAtiva;

    /**
     * Gets the value of the idCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCategoria() {
        return idCategoria;
    }

    /**
     * Sets the value of the idCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCategoria(String value) {
        this.idCategoria = value;
    }

    /**
     * Gets the value of the nomeCategoria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    /**
     * Sets the value of the nomeCategoria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCategoria(String value) {
        this.nomeCategoria = value;
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
     * Gets the value of the catalogo property.
     * 
     * @return
     *     possible object is
     *     {@link Catalogo }
     *     
     */
    public Catalogo getCatalogo() {
        return catalogo;
    }

    /**
     * Sets the value of the catalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Catalogo }
     *     
     */
    public void setCatalogo(Catalogo value) {
        this.catalogo = value;
    }

    /**
     * Gets the value of the categoriaPai property.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoriaPai() {
        return categoriaPai;
    }

    /**
     * Sets the value of the categoriaPai property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoriaPai(Categoria value) {
        this.categoriaPai = value;
    }

    /**
     * Gets the value of the categoriaParceiro property.
     * 
     * @return
     *     possible object is
     *     {@link Categoria }
     *     
     */
    public Categoria getCategoriaParceiro() {
        return categoriaParceiro;
    }

    /**
     * Sets the value of the categoriaParceiro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Categoria }
     *     
     */
    public void setCategoriaParceiro(Categoria value) {
        this.categoriaParceiro = value;
    }

    /**
     * Gets the value of the prioridade property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrioridade() {
        return prioridade;
    }

    /**
     * Sets the value of the prioridade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrioridade(Long value) {
        this.prioridade = value;
    }

    /**
     * Gets the value of the indicadorAtiva property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAtiva() {
        return indicadorAtiva;
    }

    /**
     * Sets the value of the indicadorAtiva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAtiva(Boolean value) {
        this.indicadorAtiva = value;
    }

}
