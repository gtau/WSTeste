
package flow.MP.AutenticaUsuario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MetaInformacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaInformacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-requisicao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-correlacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-hora-requisicao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sistema-origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="operacao-origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco-origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario-origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="canal-origem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versao-consumidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="versao-servico-consumido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipo-consumidor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="endereco-servico-consumido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInformacao", propOrder = {
    "idRequisicao",
    "idCorrelacao",
    "dataHoraRequisicao",
    "sistemaOrigem",
    "operacaoOrigem",
    "enderecoOrigem",
    "usuarioOrigem",
    "canalOrigem",
    "versaoConsumidor",
    "versaoServicoConsumido",
    "tipoConsumidor",
    "enderecoServicoConsumido"
})
public class MetaInformacao {

    @XmlElement(name = "id-requisicao")
    protected String idRequisicao;
    @XmlElement(name = "id-correlacao")
    protected String idCorrelacao;
    @XmlElement(name = "data-hora-requisicao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraRequisicao;
    @XmlElement(name = "sistema-origem")
    protected String sistemaOrigem;
    @XmlElement(name = "operacao-origem")
    protected String operacaoOrigem;
    @XmlElement(name = "endereco-origem")
    protected String enderecoOrigem;
    @XmlElement(name = "usuario-origem")
    protected String usuarioOrigem;
    @XmlElement(name = "canal-origem")
    protected String canalOrigem;
    @XmlElement(name = "versao-consumidor")
    protected String versaoConsumidor;
    @XmlElement(name = "versao-servico-consumido")
    protected String versaoServicoConsumido;
    @XmlElement(name = "tipo-consumidor")
    protected String tipoConsumidor;
    @XmlElement(name = "endereco-servico-consumido")
    protected String enderecoServicoConsumido;

    /**
     * Gets the value of the idRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRequisicao() {
        return idRequisicao;
    }

    /**
     * Sets the value of the idRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRequisicao(String value) {
        this.idRequisicao = value;
    }

    /**
     * Gets the value of the idCorrelacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCorrelacao() {
        return idCorrelacao;
    }

    /**
     * Sets the value of the idCorrelacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCorrelacao(String value) {
        this.idCorrelacao = value;
    }

    /**
     * Gets the value of the dataHoraRequisicao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraRequisicao() {
        return dataHoraRequisicao;
    }

    /**
     * Sets the value of the dataHoraRequisicao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraRequisicao(XMLGregorianCalendar value) {
        this.dataHoraRequisicao = value;
    }

    /**
     * Gets the value of the sistemaOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaOrigem() {
        return sistemaOrigem;
    }

    /**
     * Sets the value of the sistemaOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaOrigem(String value) {
        this.sistemaOrigem = value;
    }

    /**
     * Gets the value of the operacaoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperacaoOrigem() {
        return operacaoOrigem;
    }

    /**
     * Sets the value of the operacaoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperacaoOrigem(String value) {
        this.operacaoOrigem = value;
    }

    /**
     * Gets the value of the enderecoOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoOrigem() {
        return enderecoOrigem;
    }

    /**
     * Sets the value of the enderecoOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoOrigem(String value) {
        this.enderecoOrigem = value;
    }

    /**
     * Gets the value of the usuarioOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioOrigem() {
        return usuarioOrigem;
    }

    /**
     * Sets the value of the usuarioOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioOrigem(String value) {
        this.usuarioOrigem = value;
    }

    /**
     * Gets the value of the canalOrigem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCanalOrigem() {
        return canalOrigem;
    }

    /**
     * Sets the value of the canalOrigem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCanalOrigem(String value) {
        this.canalOrigem = value;
    }

    /**
     * Gets the value of the versaoConsumidor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoConsumidor() {
        return versaoConsumidor;
    }

    /**
     * Sets the value of the versaoConsumidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoConsumidor(String value) {
        this.versaoConsumidor = value;
    }

    /**
     * Gets the value of the versaoServicoConsumido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersaoServicoConsumido() {
        return versaoServicoConsumido;
    }

    /**
     * Sets the value of the versaoServicoConsumido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersaoServicoConsumido(String value) {
        this.versaoServicoConsumido = value;
    }

    /**
     * Gets the value of the tipoConsumidor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsumidor() {
        return tipoConsumidor;
    }

    /**
     * Sets the value of the tipoConsumidor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsumidor(String value) {
        this.tipoConsumidor = value;
    }

    /**
     * Gets the value of the enderecoServicoConsumido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnderecoServicoConsumido() {
        return enderecoServicoConsumido;
    }

    /**
     * Sets the value of the enderecoServicoConsumido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnderecoServicoConsumido(String value) {
        this.enderecoServicoConsumido = value;
    }

}
