
package flow.MP.ConsultaSaldo;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParametrosCatalogoFidelidade complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParametrosCatalogoFidelidade">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moeda-catalogo" type="{http://ebo.multiplusfidelidade.com.br/v1}Moeda" minOccurs="0"/>
 *         &lt;element name="tipo-calculo-frete" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="frete" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="custo-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="taxa-conversao" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParametrosCatalogoFidelidade", propOrder = {
    "moedaCatalogo",
    "tipoCalculoFrete",
    "frete",
    "custoPontos",
    "taxaConversao"
})
public class ParametrosCatalogoFidelidade {

    @XmlElement(name = "moeda-catalogo")
    protected Moeda moedaCatalogo;
    @XmlElement(name = "tipo-calculo-frete")
    protected TipoReferencia tipoCalculoFrete;
    protected ValorMonetario frete;
    @XmlElement(name = "custo-pontos")
    protected ValorMonetario custoPontos;
    @XmlElement(name = "taxa-conversao")
    protected BigDecimal taxaConversao;

    /**
     * Gets the value of the moedaCatalogo property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoedaCatalogo() {
        return moedaCatalogo;
    }

    /**
     * Sets the value of the moedaCatalogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoedaCatalogo(Moeda value) {
        this.moedaCatalogo = value;
    }

    /**
     * Gets the value of the tipoCalculoFrete property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getTipoCalculoFrete() {
        return tipoCalculoFrete;
    }

    /**
     * Sets the value of the tipoCalculoFrete property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setTipoCalculoFrete(TipoReferencia value) {
        this.tipoCalculoFrete = value;
    }

    /**
     * Gets the value of the frete property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getFrete() {
        return frete;
    }

    /**
     * Sets the value of the frete property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setFrete(ValorMonetario value) {
        this.frete = value;
    }

    /**
     * Gets the value of the custoPontos property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getCustoPontos() {
        return custoPontos;
    }

    /**
     * Sets the value of the custoPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setCustoPontos(ValorMonetario value) {
        this.custoPontos = value;
    }

    /**
     * Gets the value of the taxaConversao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxaConversao() {
        return taxaConversao;
    }

    /**
     * Sets the value of the taxaConversao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxaConversao(BigDecimal value) {
        this.taxaConversao = value;
    }

}
