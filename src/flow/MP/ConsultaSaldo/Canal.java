
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa��o de um Canal de intera��o com a Multiplus para a realiza��o de opera��es de neg�cio, 
 *             como ac�mulo, resgate, pedidos, consultas, cadastro, etc.
 *             
 *             A intera��o pode partir tanto de um Participante (ex.: Participante realiza um resgate pelo canal Web), 
 *             quanto de um Parceiro (ex.: Parceiro realiza um ac�mulo a partir do canal POS).
 *             
 *             Para evitar a gera��o de produtos cartesianos na defini��o do canal, tais como WEB-LOJA-X, POS-Adquirente-Y,
 *             Mobile-Android, Extranet-PortalParceiro, B2B-Batch, etc., a informa��o de canal � estruturada numa hierarquia 
 *             de 2 n�veis (canal e subcanal).
 * 
 * <p>Java class for Canal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Canal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="canal" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="subcanal" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Canal", propOrder = {
    "canal",
    "subcanal",
    "descricao"
})
public class Canal {

    protected TipoReferencia canal;
    protected TipoReferencia subcanal;
    protected String descricao;

    /**
     * Gets the value of the canal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getCanal() {
        return canal;
    }

    /**
     * Sets the value of the canal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setCanal(TipoReferencia value) {
        this.canal = value;
    }

    /**
     * Gets the value of the subcanal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSubcanal() {
        return subcanal;
    }

    /**
     * Sets the value of the subcanal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSubcanal(TipoReferencia value) {
        this.subcanal = value;
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

}
