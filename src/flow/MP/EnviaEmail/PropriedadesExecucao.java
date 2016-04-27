
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa as propriedades comuns a uma requisição SOA; diferente da
 * 				  MetaInformacao (que é utilizada para propósitos de rastreamento),
 * 				  estas propriedades influenciam a execução do serviço, pois
 * 				  permite indicar a inteface utilizada no serviço e as informações de
 * 				  paginação
 * 
 * <p>Java class for PropriedadesExecucao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropriedadesExecucao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-interface" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="paginacao" type="{http://ebo.multiplusfidelidade.com.br/v1}Paginacao" minOccurs="0"/>
 *         &lt;element name="cache" type="{http://ebo.multiplusfidelidade.com.br/v1}Cache" minOccurs="0"/>
 *         &lt;element name="indicador-modo-teste" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropriedadesExecucao", propOrder = {
    "idInterface",
    "paginacao",
    "cache",
    "indicadorModoTeste"
})
public class PropriedadesExecucao {

    @XmlElement(name = "id-interface")
    protected Integer idInterface;
    protected Paginacao paginacao;
    protected Cache cache;
    @XmlElement(name = "indicador-modo-teste")
    protected Boolean indicadorModoTeste;

    /**
     * Gets the value of the idInterface property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdInterface() {
        return idInterface;
    }

    /**
     * Sets the value of the idInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdInterface(Integer value) {
        this.idInterface = value;
    }

    /**
     * Gets the value of the paginacao property.
     * 
     * @return
     *     possible object is
     *     {@link Paginacao }
     *     
     */
    public Paginacao getPaginacao() {
        return paginacao;
    }

    /**
     * Sets the value of the paginacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link Paginacao }
     *     
     */
    public void setPaginacao(Paginacao value) {
        this.paginacao = value;
    }

    /**
     * Gets the value of the cache property.
     * 
     * @return
     *     possible object is
     *     {@link Cache }
     *     
     */
    public Cache getCache() {
        return cache;
    }

    /**
     * Sets the value of the cache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cache }
     *     
     */
    public void setCache(Cache value) {
        this.cache = value;
    }

    /**
     * Gets the value of the indicadorModoTeste property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorModoTeste() {
        return indicadorModoTeste;
    }

    /**
     * Sets the value of the indicadorModoTeste property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorModoTeste(Boolean value) {
        this.indicadorModoTeste = value;
    }

}
