
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representação do produto resultante do resgate; qualquer informação negociada em tempo
 * 				de resgate do produto, como local em que o produto será utilizado, URL de acesso, 
 * 				número e período para utilização do voucher, são representadas sob esta estrutura.  
 * 				Informações estáticas sobre as características do produto, que não variam entre os resgates
 * 				são representadas nas próprias estruturas de produto (Produto/Sku).
 * 
 * <p>Java class for ProdutoResgatado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProdutoResgatado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vouchers" type="{http://ebo.multiplusfidelidade.com.br/v1}VoucherList" minOccurs="0"/>
 *         &lt;element name="produtos-digitais" type="{http://ebo.multiplusfidelidade.com.br/v1}ProdutoDigitalList" minOccurs="0"/>
 *         &lt;element name="cupons" type="{http://ebo.multiplusfidelidade.com.br/v1}CupomList" minOccurs="0"/>
 *         &lt;element name="relatorio-produtos-resgatados" type="{http://ebo.multiplusfidelidade.com.br/v1}MensagemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProdutoResgatado", propOrder = {
    "vouchers",
    "produtosDigitais",
    "cupons",
    "relatorioProdutosResgatados"
})
public class ProdutoResgatado {

    protected VoucherList vouchers;
    @XmlElement(name = "produtos-digitais")
    protected ProdutoDigitalList produtosDigitais;
    protected CupomList cupons;
    @XmlElement(name = "relatorio-produtos-resgatados")
    protected MensagemList relatorioProdutosResgatados;

    /**
     * Gets the value of the vouchers property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherList }
     *     
     */
    public VoucherList getVouchers() {
        return vouchers;
    }

    /**
     * Sets the value of the vouchers property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherList }
     *     
     */
    public void setVouchers(VoucherList value) {
        this.vouchers = value;
    }

    /**
     * Gets the value of the produtosDigitais property.
     * 
     * @return
     *     possible object is
     *     {@link ProdutoDigitalList }
     *     
     */
    public ProdutoDigitalList getProdutosDigitais() {
        return produtosDigitais;
    }

    /**
     * Sets the value of the produtosDigitais property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProdutoDigitalList }
     *     
     */
    public void setProdutosDigitais(ProdutoDigitalList value) {
        this.produtosDigitais = value;
    }

    /**
     * Gets the value of the cupons property.
     * 
     * @return
     *     possible object is
     *     {@link CupomList }
     *     
     */
    public CupomList getCupons() {
        return cupons;
    }

    /**
     * Sets the value of the cupons property.
     * 
     * @param value
     *     allowed object is
     *     {@link CupomList }
     *     
     */
    public void setCupons(CupomList value) {
        this.cupons = value;
    }

    /**
     * Gets the value of the relatorioProdutosResgatados property.
     * 
     * @return
     *     possible object is
     *     {@link MensagemList }
     *     
     */
    public MensagemList getRelatorioProdutosResgatados() {
        return relatorioProdutosResgatados;
    }

    /**
     * Sets the value of the relatorioProdutosResgatados property.
     * 
     * @param value
     *     allowed object is
     *     {@link MensagemList }
     *     
     */
    public void setRelatorioProdutosResgatados(MensagemList value) {
        this.relatorioProdutosResgatados = value;
    }

}
