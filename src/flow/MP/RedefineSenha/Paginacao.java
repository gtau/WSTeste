
package flow.MP.RedefineSenha;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa as informações relacionadas à paginação, que são utilizadas em serviços
 * 				  de consulta que retornam grande quantidade de registros (ex.: > 50); 
 * 				  esta entidade pode ser utilizada tanto na requisição de um serviço para indicar 
 * 				  a página que deve ser retornada, quanto na resposta para indicar quantos registros
 * 				  existem no total, qual a página retornada, se há mais registros disponíveis, e assim
 * 				  por diante
 * 
 * <p>Java class for Paginacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Paginacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numero-pagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="tamanho-pagina" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="total-registros" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="indicador-paginas-disponiveis" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Paginacao", propOrder = {
    "numeroPagina",
    "tamanhoPagina",
    "totalRegistros",
    "indicadorPaginasDisponiveis"
})
public class Paginacao {

    @XmlElement(name = "numero-pagina")
    protected Integer numeroPagina;
    @XmlElement(name = "tamanho-pagina")
    protected Integer tamanhoPagina;
    @XmlElement(name = "total-registros")
    protected Integer totalRegistros;
    @XmlElement(name = "indicador-paginas-disponiveis")
    protected Boolean indicadorPaginasDisponiveis;

    /**
     * Gets the value of the numeroPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroPagina() {
        return numeroPagina;
    }

    /**
     * Sets the value of the numeroPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroPagina(Integer value) {
        this.numeroPagina = value;
    }

    /**
     * Gets the value of the tamanhoPagina property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTamanhoPagina() {
        return tamanhoPagina;
    }

    /**
     * Sets the value of the tamanhoPagina property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTamanhoPagina(Integer value) {
        this.tamanhoPagina = value;
    }

    /**
     * Gets the value of the totalRegistros property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRegistros() {
        return totalRegistros;
    }

    /**
     * Sets the value of the totalRegistros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRegistros(Integer value) {
        this.totalRegistros = value;
    }

    /**
     * Gets the value of the indicadorPaginasDisponiveis property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorPaginasDisponiveis() {
        return indicadorPaginasDisponiveis;
    }

    /**
     * Sets the value of the indicadorPaginasDisponiveis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorPaginasDisponiveis(Boolean value) {
        this.indicadorPaginasDisponiveis = value;
    }

}
