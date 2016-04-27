
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Estoque complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Estoque">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador-disponivel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="quantidade-atual" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantidade-inicial" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="quantidade-minima" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="data-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="data-hora-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="usuario-ultima-atualizacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Estoque", propOrder = {
    "indicadorDisponivel",
    "quantidadeAtual",
    "quantidadeInicial",
    "quantidadeMinima",
    "dataUltimaAtualizacao",
    "dataHoraUltimaAtualizacao",
    "usuarioUltimaAtualizacao"
})
public class Estoque {

    @XmlElement(name = "indicador-disponivel")
    protected Boolean indicadorDisponivel;
    @XmlElement(name = "quantidade-atual")
    protected Long quantidadeAtual;
    @XmlElement(name = "quantidade-inicial")
    protected Long quantidadeInicial;
    @XmlElement(name = "quantidade-minima")
    protected Long quantidadeMinima;
    @XmlElement(name = "data-ultima-atualizacao")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataUltimaAtualizacao;
    @XmlElement(name = "data-hora-ultima-atualizacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraUltimaAtualizacao;
    @XmlElement(name = "usuario-ultima-atualizacao")
    protected String usuarioUltimaAtualizacao;

    /**
     * Gets the value of the indicadorDisponivel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorDisponivel() {
        return indicadorDisponivel;
    }

    /**
     * Sets the value of the indicadorDisponivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorDisponivel(Boolean value) {
        this.indicadorDisponivel = value;
    }

    /**
     * Gets the value of the quantidadeAtual property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidadeAtual() {
        return quantidadeAtual;
    }

    /**
     * Sets the value of the quantidadeAtual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidadeAtual(Long value) {
        this.quantidadeAtual = value;
    }

    /**
     * Gets the value of the quantidadeInicial property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidadeInicial() {
        return quantidadeInicial;
    }

    /**
     * Sets the value of the quantidadeInicial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidadeInicial(Long value) {
        this.quantidadeInicial = value;
    }

    /**
     * Gets the value of the quantidadeMinima property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQuantidadeMinima() {
        return quantidadeMinima;
    }

    /**
     * Sets the value of the quantidadeMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQuantidadeMinima(Long value) {
        this.quantidadeMinima = value;
    }

    /**
     * Gets the value of the dataUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataUltimaAtualizacao() {
        return dataUltimaAtualizacao;
    }

    /**
     * Sets the value of the dataUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataUltimaAtualizacao(XMLGregorianCalendar value) {
        this.dataUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the dataHoraUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraUltimaAtualizacao() {
        return dataHoraUltimaAtualizacao;
    }

    /**
     * Sets the value of the dataHoraUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraUltimaAtualizacao(XMLGregorianCalendar value) {
        this.dataHoraUltimaAtualizacao = value;
    }

    /**
     * Gets the value of the usuarioUltimaAtualizacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioUltimaAtualizacao() {
        return usuarioUltimaAtualizacao;
    }

    /**
     * Sets the value of the usuarioUltimaAtualizacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioUltimaAtualizacao(String value) {
        this.usuarioUltimaAtualizacao = value;
    }

}
