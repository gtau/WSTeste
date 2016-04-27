
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma opção de resgate monetizado, utilizado quando for necessário representar
 * 			as opções de valor de desconto na compra e preço em pontos para o desconto.
 * 
 * <p>Java class for OpcaoResgateMonetizado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpcaoResgateMonetizado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="produto" type="{http://ebo.multiplusfidelidade.com.br/v1}Produto" minOccurs="0"/>
 *         &lt;element name="nome-opcao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="preco" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="valor-monetizado-desconto" type="{http://ebo.multiplusfidelidade.com.br/v1}ValorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpcaoResgateMonetizado", propOrder = {
    "produto",
    "nomeOpcao",
    "descricao",
    "preco",
    "valorMonetizadoDesconto"
})
public class OpcaoResgateMonetizado {

    protected Produto produto;
    @XmlElement(name = "nome-opcao")
    protected String nomeOpcao;
    protected String descricao;
    protected Preco preco;
    @XmlElement(name = "valor-monetizado-desconto")
    protected ValorMonetario valorMonetizadoDesconto;

    /**
     * Gets the value of the produto property.
     * 
     * @return
     *     possible object is
     *     {@link Produto }
     *     
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * Sets the value of the produto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produto }
     *     
     */
    public void setProduto(Produto value) {
        this.produto = value;
    }

    /**
     * Gets the value of the nomeOpcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOpcao() {
        return nomeOpcao;
    }

    /**
     * Sets the value of the nomeOpcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOpcao(String value) {
        this.nomeOpcao = value;
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
     * Gets the value of the preco property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getPreco() {
        return preco;
    }

    /**
     * Sets the value of the preco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setPreco(Preco value) {
        this.preco = value;
    }

    /**
     * Gets the value of the valorMonetizadoDesconto property.
     * 
     * @return
     *     possible object is
     *     {@link ValorMonetario }
     *     
     */
    public ValorMonetario getValorMonetizadoDesconto() {
        return valorMonetizadoDesconto;
    }

    /**
     * Sets the value of the valorMonetizadoDesconto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValorMonetario }
     *     
     */
    public void setValorMonetizadoDesconto(ValorMonetario value) {
        this.valorMonetizadoDesconto = value;
    }

}
