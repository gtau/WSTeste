
package flow.MP.RedefineSenha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Entidade utilizada para representar estruturas de dados genéricas (similar a um Map/Hashtable);
 * 			recomenda-se utilizá-la nos cenários em que se deseja representar uma entidade no canônico 
 * 			sem que seja necessário definir todos os elementos da entidade de forma explícita, como 
 * 			por exemplo:
 * 			
 * 			EntidadeX
 * 				id-entidade
 * 				nome-entidade
 * 				caracteristicas-entidade
 * 					chave1
 * 					valor1
 * 					chave2
 * 					valor2
 * 					chave3
 * 					valor3
 * 
 * <p>Java class for Atributo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Atributo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valor-numerico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Atributo", propOrder = {
    "chave",
    "valor",
    "descricao",
    "valorNumerico"
})
public class Atributo {

    protected String chave;
    protected String valor;
    protected String descricao;
    @XmlElement(name = "valor-numerico")
    protected Integer valorNumerico;

    /**
     * Gets the value of the chave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChave() {
        return chave;
    }

    /**
     * Sets the value of the chave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChave(String value) {
        this.chave = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValor(String value) {
        this.valor = value;
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
     * Gets the value of the valorNumerico property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValorNumerico() {
        return valorNumerico;
    }

    /**
     * Sets the value of the valorNumerico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValorNumerico(Integer value) {
        this.valorNumerico = value;
    }

}
