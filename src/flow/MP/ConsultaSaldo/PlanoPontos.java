
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanoPontos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanoPontos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-plano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-plano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-plano" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo-externo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco-cheio" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="preco-venda" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="qtd-pontos-acumulo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="promocoes-elegiveis" type="{http://ebo.multiplusfidelidade.com.br/v1}PromocaoList" minOccurs="0"/>
 *         &lt;element name="bonus-recorrente" type="{http://ebo.multiplusfidelidade.com.br/v1}BonusList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanoPontos", propOrder = {
    "idPlano",
    "nomePlano",
    "descricaoPlano",
    "codigoExterno",
    "precoCheio",
    "precoVenda",
    "qtdPontosAcumulo",
    "promocoesElegiveis",
    "bonusRecorrente"
})
public class PlanoPontos {

    @XmlElement(name = "id-plano")
    protected String idPlano;
    @XmlElement(name = "nome-plano")
    protected String nomePlano;
    @XmlElement(name = "descricao-plano")
    protected String descricaoPlano;
    @XmlElement(name = "codigo-externo")
    protected String codigoExterno;
    @XmlElement(name = "preco-cheio")
    protected Preco precoCheio;
    @XmlElement(name = "preco-venda")
    protected Preco precoVenda;
    @XmlElement(name = "qtd-pontos-acumulo")
    protected Long qtdPontosAcumulo;
    @XmlElement(name = "promocoes-elegiveis")
    protected PromocaoList promocoesElegiveis;
    @XmlElement(name = "bonus-recorrente")
    protected BonusList bonusRecorrente;

    /**
     * Gets the value of the idPlano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPlano() {
        return idPlano;
    }

    /**
     * Sets the value of the idPlano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPlano(String value) {
        this.idPlano = value;
    }

    /**
     * Gets the value of the nomePlano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomePlano() {
        return nomePlano;
    }

    /**
     * Sets the value of the nomePlano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomePlano(String value) {
        this.nomePlano = value;
    }

    /**
     * Gets the value of the descricaoPlano property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoPlano() {
        return descricaoPlano;
    }

    /**
     * Sets the value of the descricaoPlano property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoPlano(String value) {
        this.descricaoPlano = value;
    }

    /**
     * Gets the value of the codigoExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoExterno() {
        return codigoExterno;
    }

    /**
     * Sets the value of the codigoExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoExterno(String value) {
        this.codigoExterno = value;
    }

    /**
     * Gets the value of the precoCheio property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoCheio() {
        return precoCheio;
    }

    /**
     * Sets the value of the precoCheio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoCheio(Preco value) {
        this.precoCheio = value;
    }

    /**
     * Gets the value of the precoVenda property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPrecoVenda() {
        return precoVenda;
    }

    /**
     * Sets the value of the precoVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPrecoVenda(Preco value) {
        this.precoVenda = value;
    }

    /**
     * Gets the value of the qtdPontosAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdPontosAcumulo() {
        return qtdPontosAcumulo;
    }

    /**
     * Sets the value of the qtdPontosAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdPontosAcumulo(Long value) {
        this.qtdPontosAcumulo = value;
    }

    /**
     * Gets the value of the promocoesElegiveis property.
     * 
     * @return
     *     possible object is
     *     {@link PromocaoList }
     *     
     */
    public PromocaoList getPromocoesElegiveis() {
        return promocoesElegiveis;
    }

    /**
     * Sets the value of the promocoesElegiveis property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromocaoList }
     *     
     */
    public void setPromocoesElegiveis(PromocaoList value) {
        this.promocoesElegiveis = value;
    }

    /**
     * Gets the value of the bonusRecorrente property.
     * 
     * @return
     *     possible object is
     *     {@link BonusList }
     *     
     */
    public BonusList getBonusRecorrente() {
        return bonusRecorrente;
    }

    /**
     * Sets the value of the bonusRecorrente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BonusList }
     *     
     */
    public void setBonusRecorrente(BonusList value) {
        this.bonusRecorrente = value;
    }

}
