
package flow.MP.ConsultaParticipante;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Preco complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preco">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pontos" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="valor-monetario" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="fator-de-conversao" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="custo-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="faixa-inicial" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *         &lt;element name="faixa-final" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preco", propOrder = {
    "pontos",
    "valorMonetario",
    "fatorDeConversao",
    "custoPontos",
    "faixaInicial",
    "faixaFinal"
})
public class Preco {

    protected Long pontos;
    @XmlElement(name = "valor-monetario")
    protected ValorMonetario valorMonetario;
    @XmlElement(name = "fator-de-conversao")
    protected BigDecimal fatorDeConversao;
    @XmlElement(name = "custo-pontos")
    protected ValorMonetario custoPontos;
    @XmlElement(name = "faixa-inicial")
    protected ValorMonetario faixaInicial;
    @XmlElement(name = "faixa-final")
    protected ValorMonetario faixaFinal;

    /**
     * Gets the value of the pontos property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPontos() {
        return pontos;
    }

    /**
     * Sets the value of the pontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPontos(Long value) {
        this.pontos = value;
    }

    /**
     * Gets the value of the valorMonetario property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorMonetario() {
        return valorMonetario;
    }

    /**
     * Sets the value of the valorMonetario property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorMonetario(ValorMonetario value) {
        this.valorMonetario = value;
    }

    /**
     * Gets the value of the fatorDeConversao property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatorDeConversao() {
        return fatorDeConversao;
    }

    /**
     * Sets the value of the fatorDeConversao property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatorDeConversao(BigDecimal value) {
        this.fatorDeConversao = value;
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
     * Gets the value of the faixaInicial property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getFaixaInicial() {
        return faixaInicial;
    }

    /**
     * Sets the value of the faixaInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setFaixaInicial(ValorMonetario value) {
        this.faixaInicial = value;
    }

    /**
     * Gets the value of the faixaFinal property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getFaixaFinal() {
        return faixaFinal;
    }

    /**
     * Sets the value of the faixaFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setFaixaFinal(ValorMonetario value) {
        this.faixaFinal = value;
    }

}
