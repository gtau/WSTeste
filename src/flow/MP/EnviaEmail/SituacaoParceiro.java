
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SituacaoParceiro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SituacaoParceiro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="situacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="detalhes-situacao" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="data-hora-situacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario-responsavel" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SituacaoParceiro", propOrder = {
    "situacao",
    "detalhesSituacao",
    "dataHoraSituacao",
    "descricao",
    "motivo",
    "usuarioResponsavel"
})
public class SituacaoParceiro {

    protected TipoReferencia situacao;
    @XmlElement(name = "detalhes-situacao")
    protected TipoReferencia detalhesSituacao;
    @XmlElement(name = "data-hora-situacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraSituacao;
    protected String descricao;
    protected String motivo;
    @XmlElement(name = "usuario-responsavel")
    protected Usuario usuarioResponsavel;

    /**
     * Gets the value of the situacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacao() {
        return situacao;
    }

    /**
     * Sets the value of the situacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacao(TipoReferencia value) {
        this.situacao = value;
    }

    /**
     * Gets the value of the detalhesSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getDetalhesSituacao() {
        return detalhesSituacao;
    }

    /**
     * Sets the value of the detalhesSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setDetalhesSituacao(TipoReferencia value) {
        this.detalhesSituacao = value;
    }

    /**
     * Gets the value of the dataHoraSituacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraSituacao() {
        return dataHoraSituacao;
    }

    /**
     * Sets the value of the dataHoraSituacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraSituacao(XMLGregorianCalendar value) {
        this.dataHoraSituacao = value;
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
     * Gets the value of the motivo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Sets the value of the motivo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Gets the value of the usuarioResponsavel property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuarioResponsavel() {
        return usuarioResponsavel;
    }

    /**
     * Sets the value of the usuarioResponsavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuarioResponsavel(Usuario value) {
        this.usuarioResponsavel = value;
    }

}
