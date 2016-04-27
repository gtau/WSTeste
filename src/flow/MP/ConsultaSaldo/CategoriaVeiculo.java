
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma categoria de veículo para locação, como por exemplo, ECMN, IFMR, etc.
 * 
 * <p>Java class for CategoriaVeiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategoriaVeiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-categoria-veiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-categoria-veiculo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-modelos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="url-imagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caracteristicas" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="coberturas" type="{http://ebo.multiplusfidelidade.com.br/v1}CoberturaList" minOccurs="0"/>
 *         &lt;element name="equipamentos-especiais" type="{http://ebo.multiplusfidelidade.com.br/v1}EquipamentoEspecialList" minOccurs="0"/>
 *         &lt;element name="preco-venda-monetario" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-final-monetario" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoriaVeiculo", propOrder = {
    "idCategoriaVeiculo",
    "nomeCategoriaVeiculo",
    "descricao",
    "descricaoModelos",
    "urlImagem",
    "caracteristicas",
    "coberturas",
    "equipamentosEspeciais",
    "precoVendaMonetario",
    "precoFinalMonetario"
})
public class CategoriaVeiculo {

    @XmlElement(name = "id-categoria-veiculo")
    protected String idCategoriaVeiculo;
    @XmlElement(name = "nome-categoria-veiculo")
    protected String nomeCategoriaVeiculo;
    protected String descricao;
    @XmlElement(name = "descricao-modelos")
    protected String descricaoModelos;
    @XmlElement(name = "url-imagem")
    protected String urlImagem;
    protected AtributoList caracteristicas;
    protected CoberturaList coberturas;
    @XmlElement(name = "equipamentos-especiais")
    protected EquipamentoEspecialList equipamentosEspeciais;
    @XmlElement(name = "preco-venda-monetario")
    protected Preco precoVendaMonetario;
    @XmlElement(name = "preco-final-monetario")
    protected Preco precoFinalMonetario;

    /**
     * Gets the value of the idCategoriaVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCategoriaVeiculo() {
        return idCategoriaVeiculo;
    }

    /**
     * Sets the value of the idCategoriaVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCategoriaVeiculo(String value) {
        this.idCategoriaVeiculo = value;
    }

    /**
     * Gets the value of the nomeCategoriaVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCategoriaVeiculo() {
        return nomeCategoriaVeiculo;
    }

    /**
     * Sets the value of the nomeCategoriaVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCategoriaVeiculo(String value) {
        this.nomeCategoriaVeiculo = value;
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
     * Gets the value of the descricaoModelos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoModelos() {
        return descricaoModelos;
    }

    /**
     * Sets the value of the descricaoModelos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoModelos(String value) {
        this.descricaoModelos = value;
    }

    /**
     * Gets the value of the urlImagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlImagem() {
        return urlImagem;
    }

    /**
     * Sets the value of the urlImagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlImagem(String value) {
        this.urlImagem = value;
    }

    /**
     * Gets the value of the caracteristicas property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * Sets the value of the caracteristicas property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setCaracteristicas(AtributoList value) {
        this.caracteristicas = value;
    }

    /**
     * Gets the value of the coberturas property.
     * 
     * @return
     *     possible object is
     *     {@link CoberturaList }
     *     
     */
    public CoberturaList getCoberturas() {
        return coberturas;
    }

    /**
     * Sets the value of the coberturas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoberturaList }
     *     
     */
    public void setCoberturas(CoberturaList value) {
        this.coberturas = value;
    }

    /**
     * Gets the value of the equipamentosEspeciais property.
     * 
     * @return
     *     possible object is
     *     {@link EquipamentoEspecialList }
     *     
     */
    public EquipamentoEspecialList getEquipamentosEspeciais() {
        return equipamentosEspeciais;
    }

    /**
     * Sets the value of the equipamentosEspeciais property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipamentoEspecialList }
     *     
     */
    public void setEquipamentosEspeciais(EquipamentoEspecialList value) {
        this.equipamentosEspeciais = value;
    }

    /**
     * Gets the value of the precoVendaMonetario property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoVendaMonetario() {
        return precoVendaMonetario;
    }

    /**
     * Sets the value of the precoVendaMonetario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoVendaMonetario(Preco value) {
        this.precoVendaMonetario = value;
    }

    /**
     * Gets the value of the precoFinalMonetario property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoFinalMonetario() {
        return precoFinalMonetario;
    }

    /**
     * Sets the value of the precoFinalMonetario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoFinalMonetario(Preco value) {
        this.precoFinalMonetario = value;
    }

}
