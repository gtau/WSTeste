
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AnaliseAntiFraude complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AnaliseAntiFraude">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-analise-antifraude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id-analise-antifraude-provedor" type="{http://ebo.multiplusfidelidade.com.br/v1}Identificador" minOccurs="0"/>
 *         &lt;element name="situacao-analise" type="{http://ebo.multiplusfidelidade.com.br/v1}Situacao" minOccurs="0"/>
 *         &lt;element name="pagamento-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Pagamento" minOccurs="0"/>
 *         &lt;element name="device-fingerprint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dados-adicionais" type="{http://ebo.multiplusfidelidade.com.br/v1}AtributoList" minOccurs="0"/>
 *         &lt;element name="url-callback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnaliseAntiFraude", propOrder = {
    "idAnaliseAntifraude",
    "idAnaliseAntifraudeProvedor",
    "situacaoAnalise",
    "pagamentoReferencia",
    "deviceFingerprint",
    "dadosAdicionais",
    "urlCallback"
})
public class AnaliseAntiFraude {

    @XmlElement(name = "id-analise-antifraude")
    protected String idAnaliseAntifraude;
    @XmlElement(name = "id-analise-antifraude-provedor")
    protected Identificador idAnaliseAntifraudeProvedor;
    @XmlElement(name = "situacao-analise")
    protected Situacao situacaoAnalise;
    @XmlElement(name = "pagamento-referencia")
    protected Pagamento pagamentoReferencia;
    @XmlElement(name = "device-fingerprint")
    protected String deviceFingerprint;
    @XmlElement(name = "dados-adicionais")
    protected AtributoList dadosAdicionais;
    @XmlElement(name = "url-callback")
    protected String urlCallback;

    /**
     * Gets the value of the idAnaliseAntifraude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdAnaliseAntifraude() {
        return idAnaliseAntifraude;
    }

    /**
     * Sets the value of the idAnaliseAntifraude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdAnaliseAntifraude(String value) {
        this.idAnaliseAntifraude = value;
    }

    /**
     * Gets the value of the idAnaliseAntifraudeProvedor property.
     * 
     * @return
     *     possible object is
     *     {@link Identificador }
     *     
     */
    public Identificador getIdAnaliseAntifraudeProvedor() {
        return idAnaliseAntifraudeProvedor;
    }

    /**
     * Sets the value of the idAnaliseAntifraudeProvedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identificador }
     *     
     */
    public void setIdAnaliseAntifraudeProvedor(Identificador value) {
        this.idAnaliseAntifraudeProvedor = value;
    }

    /**
     * Gets the value of the situacaoAnalise property.
     * 
     * @return
     *     possible object is
     *     {@link Situacao }
     *     
     */
    public Situacao getSituacaoAnalise() {
        return situacaoAnalise;
    }

    /**
     * Sets the value of the situacaoAnalise property.
     * 
     * @param value
     *     allowed object is
     *     {@link Situacao }
     *     
     */
    public void setSituacaoAnalise(Situacao value) {
        this.situacaoAnalise = value;
    }

    /**
     * Gets the value of the pagamentoReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Pagamento }
     *     
     */
    public Pagamento getPagamentoReferencia() {
        return pagamentoReferencia;
    }

    /**
     * Sets the value of the pagamentoReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pagamento }
     *     
     */
    public void setPagamentoReferencia(Pagamento value) {
        this.pagamentoReferencia = value;
    }

    /**
     * Gets the value of the deviceFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceFingerprint() {
        return deviceFingerprint;
    }

    /**
     * Sets the value of the deviceFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceFingerprint(String value) {
        this.deviceFingerprint = value;
    }

    /**
     * Gets the value of the dadosAdicionais property.
     * 
     * @return
     *     possible object is
     *     {@link AtributoList }
     *     
     */
    public AtributoList getDadosAdicionais() {
        return dadosAdicionais;
    }

    /**
     * Sets the value of the dadosAdicionais property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtributoList }
     *     
     */
    public void setDadosAdicionais(AtributoList value) {
        this.dadosAdicionais = value;
    }

    /**
     * Gets the value of the urlCallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlCallback() {
        return urlCallback;
    }

    /**
     * Sets the value of the urlCallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlCallback(String value) {
        this.urlCallback = value;
    }

}
