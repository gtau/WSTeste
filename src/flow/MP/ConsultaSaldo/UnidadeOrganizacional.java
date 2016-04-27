
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa das estruturas hierárquicas relacionadas a uma empresa, como por exemplo, 
 * 				matriz/filiais, empresa/departamentos.  
 * 				Por exemplo, é utilizada no contexto do Parceiro para representar as unidades de um 
 * 				parceiro, e em que unidade um produto do tipo serviço pode ser utilizado.
 * 
 * <p>Java class for UnidadeOrganizacional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnidadeOrganizacional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-unidade-organizacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dados-cadastrais-pj" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPJ" minOccurs="0"/>
 *         &lt;element name="enderecos" type="{http://ebo.multiplusfidelidade.com.br/v1}EnderecoList" minOccurs="0"/>
 *         &lt;element name="sub-unidades" type="{http://ebo.multiplusfidelidade.com.br/v1}UnidadeOrganizacionalList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnidadeOrganizacional", propOrder = {
    "idUnidadeOrganizacional",
    "descricao",
    "dadosCadastraisPj",
    "enderecos",
    "subUnidades"
})
public class UnidadeOrganizacional {

    @XmlElement(name = "id-unidade-organizacional")
    protected String idUnidadeOrganizacional;
    protected String descricao;
    @XmlElement(name = "dados-cadastrais-pj")
    protected DadosCadastraisPJ dadosCadastraisPj;
    protected EnderecoList enderecos;
    @XmlElement(name = "sub-unidades")
    protected UnidadeOrganizacionalList subUnidades;

    /**
     * Gets the value of the idUnidadeOrganizacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidadeOrganizacional() {
        return idUnidadeOrganizacional;
    }

    /**
     * Sets the value of the idUnidadeOrganizacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidadeOrganizacional(String value) {
        this.idUnidadeOrganizacional = value;
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
     * Gets the value of the dadosCadastraisPj property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPJ }
     *     
     */
    public DadosCadastraisPJ getDadosCadastraisPj() {
        return dadosCadastraisPj;
    }

    /**
     * Sets the value of the dadosCadastraisPj property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPJ }
     *     
     */
    public void setDadosCadastraisPj(DadosCadastraisPJ value) {
        this.dadosCadastraisPj = value;
    }

    /**
     * Gets the value of the enderecos property.
     * 
     * @return
     *     possible object is
     *     {@link EnderecoList }
     *     
     */
    public EnderecoList getEnderecos() {
        return enderecos;
    }

    /**
     * Sets the value of the enderecos property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnderecoList }
     *     
     */
    public void setEnderecos(EnderecoList value) {
        this.enderecos = value;
    }

    /**
     * Gets the value of the subUnidades property.
     * 
     * @return
     *     possible object is
     *     {@link UnidadeOrganizacionalList }
     *     
     */
    public UnidadeOrganizacionalList getSubUnidades() {
        return subUnidades;
    }

    /**
     * Sets the value of the subUnidades property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnidadeOrganizacionalList }
     *     
     */
    public void setSubUnidades(UnidadeOrganizacionalList value) {
        this.subUnidades = value;
    }

}
