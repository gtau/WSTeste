
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemPedidoLocacaoVeiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemPedidoLocacaoVeiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cotacao-veiculo" type="{http://ebo.multiplusfidelidade.com.br/v1}CotacaoCategoriaVeiculo" minOccurs="0"/>
 *         &lt;element name="dados-cadastrais-condutor" type="{http://ebo.multiplusfidelidade.com.br/v1}DadosCadastraisPF" minOccurs="0"/>
 *         &lt;element name="contato-principal-condutor" type="{http://ebo.multiplusfidelidade.com.br/v1}Contato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemPedidoLocacaoVeiculo", propOrder = {
    "cotacaoVeiculo",
    "dadosCadastraisCondutor",
    "contatoPrincipalCondutor"
})
public class ItemPedidoLocacaoVeiculo {

    @XmlElement(name = "cotacao-veiculo")
    protected CotacaoCategoriaVeiculo cotacaoVeiculo;
    @XmlElement(name = "dados-cadastrais-condutor")
    protected DadosCadastraisPF dadosCadastraisCondutor;
    @XmlElement(name = "contato-principal-condutor")
    protected Contato contatoPrincipalCondutor;

    /**
     * Gets the value of the cotacaoVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link CotacaoCategoriaVeiculo }
     *     
     */
    public CotacaoCategoriaVeiculo getCotacaoVeiculo() {
        return cotacaoVeiculo;
    }

    /**
     * Sets the value of the cotacaoVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CotacaoCategoriaVeiculo }
     *     
     */
    public void setCotacaoVeiculo(CotacaoCategoriaVeiculo value) {
        this.cotacaoVeiculo = value;
    }

    /**
     * Gets the value of the dadosCadastraisCondutor property.
     * 
     * @return
     *     possible object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public DadosCadastraisPF getDadosCadastraisCondutor() {
        return dadosCadastraisCondutor;
    }

    /**
     * Sets the value of the dadosCadastraisCondutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link DadosCadastraisPF }
     *     
     */
    public void setDadosCadastraisCondutor(DadosCadastraisPF value) {
        this.dadosCadastraisCondutor = value;
    }

    /**
     * Gets the value of the contatoPrincipalCondutor property.
     * 
     * @return
     *     possible object is
     *     {@link Contato }
     *     
     */
    public Contato getContatoPrincipalCondutor() {
        return contatoPrincipalCondutor;
    }

    /**
     * Sets the value of the contatoPrincipalCondutor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contato }
     *     
     */
    public void setContatoPrincipalCondutor(Contato value) {
        this.contatoPrincipalCondutor = value;
    }

}
