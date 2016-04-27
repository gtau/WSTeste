
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeioPagamento complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeioPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-meio-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forma-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="nome-meio-pagamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bandeira" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="imagens" type="{http://ebo.multiplusfidelidade.com.br/v1}ImagemList" minOccurs="0"/>
 *         &lt;element name="condicoes-pagamento" type="{http://ebo.multiplusfidelidade.com.br/v1}CondicaoPagamentoList" minOccurs="0"/>
 *         &lt;element name="cartoes-um-clique" type="{http://ebo.multiplusfidelidade.com.br/v1}CartaoImpressoList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeioPagamento", propOrder = {
    "idMeioPagamento",
    "formaPagamento",
    "nomeMeioPagamento",
    "bandeira",
    "descricao",
    "imagens",
    "condicoesPagamento",
    "cartoesUmClique"
})
public class MeioPagamento {

    @XmlElement(name = "id-meio-pagamento")
    protected String idMeioPagamento;
    @XmlElement(name = "forma-pagamento")
    protected TipoReferencia formaPagamento;
    @XmlElement(name = "nome-meio-pagamento")
    protected String nomeMeioPagamento;
    protected TipoReferencia bandeira;
    protected String descricao;
    protected ImagemList imagens;
    @XmlElement(name = "condicoes-pagamento")
    protected CondicaoPagamentoList condicoesPagamento;
    @XmlElement(name = "cartoes-um-clique")
    protected CartaoImpressoList cartoesUmClique;

    /**
     * Gets the value of the idMeioPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMeioPagamento() {
        return idMeioPagamento;
    }

    /**
     * Sets the value of the idMeioPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMeioPagamento(String value) {
        this.idMeioPagamento = value;
    }

    /**
     * Gets the value of the formaPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * Sets the value of the formaPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setFormaPagamento(TipoReferencia value) {
        this.formaPagamento = value;
    }

    /**
     * Gets the value of the nomeMeioPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeMeioPagamento() {
        return nomeMeioPagamento;
    }

    /**
     * Sets the value of the nomeMeioPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeMeioPagamento(String value) {
        this.nomeMeioPagamento = value;
    }

    /**
     * Gets the value of the bandeira property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getBandeira() {
        return bandeira;
    }

    /**
     * Sets the value of the bandeira property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setBandeira(TipoReferencia value) {
        this.bandeira = value;
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
     * Gets the value of the imagens property.
     * 
     * @return
     *     possible object is
     *     {@link ImagemList }
     *     
     */
    public ImagemList getImagens() {
        return imagens;
    }

    /**
     * Sets the value of the imagens property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImagemList }
     *     
     */
    public void setImagens(ImagemList value) {
        this.imagens = value;
    }

    /**
     * Gets the value of the condicoesPagamento property.
     * 
     * @return
     *     possible object is
     *     {@link CondicaoPagamentoList }
     *     
     */
    public CondicaoPagamentoList getCondicoesPagamento() {
        return condicoesPagamento;
    }

    /**
     * Sets the value of the condicoesPagamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link CondicaoPagamentoList }
     *     
     */
    public void setCondicoesPagamento(CondicaoPagamentoList value) {
        this.condicoesPagamento = value;
    }

    /**
     * Gets the value of the cartoesUmClique property.
     * 
     * @return
     *     possible object is
     *     {@link CartaoImpressoList }
     *     
     */
    public CartaoImpressoList getCartoesUmClique() {
        return cartoesUmClique;
    }

    /**
     * Sets the value of the cartoesUmClique property.
     * 
     * @param value
     *     allowed object is
     *     {@link CartaoImpressoList }
     *     
     */
    public void setCartoesUmClique(CartaoImpressoList value) {
        this.cartoesUmClique = value;
    }

}
