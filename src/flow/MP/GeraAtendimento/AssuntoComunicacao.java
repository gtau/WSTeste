
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um assunto na Multiplus. Inicialmente utilizado no contexto "Notificações". Alertas poderão ser
 * 			enviados com base nesse assunto; por exemplo para o assunto "ACUMULO", alerta referente ao acúmulo de pontos
 * 			pode ser enviado a um determinado participante no canal em que estiver ativado.
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
 *         &lt;element name="indicador-aceite" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "indicadorAceite",
    "nomeCurto",
    "descricaoLonga"
})
public class AssuntoComunicacao {

    @XmlElement(name = "id-assunto-comunicacao")
    protected TipoReferencia idAssuntoComunicacao;
    @XmlElement(name = "indicador-aceite")
    protected Boolean indicadorAceite;
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
     * Gets the value of the indicadorAceite property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAceite() {
        return indicadorAceite;
    }

    /**
     * Sets the value of the indicadorAceite property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAceite(Boolean value) {
        this.indicadorAceite = value;
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
