
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um assunto na Multiplus. Inicialmente utilizado no contexto "Notificações". alertas poderão ser enviadas com base nesse assunto, 
 * 			exemplo para o assunto "ACUMULO", alerta referente ao acumulo de pontos podem ser enviadas á um determinado contato.
 * 
 * <p>Java class for AssuntoComunicacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssuntoComunicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-assunto-comunicacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="nome-curto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-longa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssuntoComunicacao", propOrder = {
    "idAssuntoComunicacao",
    "nomeCurto",
    "descricaoLonga"
})
public class AssuntoComunicacao {

    @XmlElement(name = "id-assunto-comunicacao")
    protected TipoReferencia idAssuntoComunicacao;
    @XmlElement(name = "nome-curto")
    protected String nomeCurto;
    @XmlElement(name = "descricao-longa")
    protected String descricaoLonga;

    /**
     * Gets the value of the idAssuntoComunicacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getIdAssuntoComunicacao() {
        return idAssuntoComunicacao;
    }

    /**
     * Sets the value of the idAssuntoComunicacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setIdAssuntoComunicacao(TipoReferencia value) {
        this.idAssuntoComunicacao = value;
    }

    /**
     * Gets the value of the nomeCurto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCurto() {
        return nomeCurto;
    }

    /**
     * Sets the value of the nomeCurto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCurto(String value) {
        this.nomeCurto = value;
    }

    /**
     * Gets the value of the descricaoLonga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoLonga() {
        return descricaoLonga;
    }

    /**
     * Sets the value of the descricaoLonga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoLonga(String value) {
        this.descricaoLonga = value;
    }

}
