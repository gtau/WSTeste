
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representação de um lote de pontos de fidelidade; utilizado para representar o ciclo de vida dos pontos,
 *             desde o processo de criação (crédito dos pontos) a partir de uma transação de acúmulo, até o processo de
 *             utilização numa transação de resgate ou de vencimento dos pontos.
 * 
 *             Pontos também é utilizado no contexto de uma Transacao para indicar os itens de pontos que foram creditados
 *             num acúmulo, ou que foram utilizados num resgate (para expressar a origem dos pontos resgatados).
 * 
 *             Em termos de nomenclatura, optou-se pela utilização do plural, pois em geral, os itens de pontos são
 *             composições de lotes de pontos (ex.: 100 pontos, 1000 pontos, 50 pontos), e raramente são utilizados para
 *             expressar um ponto.
 * 
 * <p>Java class for Pontos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pontos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-pontos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-criacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="data-vencimento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://ebo.multiplusfidelidade.com.br/v1}Preco" minOccurs="0"/>
 *         &lt;element name="situacao-pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *         &lt;element name="indicador-estornavel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="transacao-ref" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pontos", propOrder = {
    "idPontos",
    "dataCriacao",
    "dataVencimento",
    "valor",
    "situacaoPontos",
    "indicadorEstornavel",
    "transacaoRef"
})
public class Pontos {

    @XmlElement(name = "id-pontos")
    protected String idPontos;
    @XmlElement(name = "data-criacao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataCriacao;
    @XmlElement(name = "data-vencimento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVencimento;
    protected Preco valor;
    @XmlElement(name = "situacao-pontos")
    protected TipoReferencia situacaoPontos;
    @XmlElement(name = "indicador-estornavel")
    protected Boolean indicadorEstornavel;
    @XmlElement(name = "transacao-ref")
    protected Transacao transacaoRef;

    /**
     * Gets the value of the idPontos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPontos() {
        return idPontos;
    }

    /**
     * Sets the value of the idPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPontos(String value) {
        this.idPontos = value;
    }

    /**
     * Gets the value of the dataCriacao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataCriacao() {
        return dataCriacao;
    }

    /**
     * Sets the value of the dataCriacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataCriacao(XMLGregorianCalendar value) {
        this.dataCriacao = value;
    }

    /**
     * Gets the value of the dataVencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVencimento() {
        return dataVencimento;
    }

    /**
     * Sets the value of the dataVencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVencimento(XMLGregorianCalendar value) {
        this.dataVencimento = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Preco }
     *     
     */
    public Preco getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Preco }
     *     
     */
    public void setValor(Preco value) {
        this.valor = value;
    }

    /**
     * Gets the value of the situacaoPontos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getSituacaoPontos() {
        return situacaoPontos;
    }

    /**
     * Sets the value of the situacaoPontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setSituacaoPontos(TipoReferencia value) {
        this.situacaoPontos = value;
    }

    /**
     * Gets the value of the indicadorEstornavel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorEstornavel() {
        return indicadorEstornavel;
    }

    /**
     * Sets the value of the indicadorEstornavel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorEstornavel(Boolean value) {
        this.indicadorEstornavel = value;
    }

    /**
     * Gets the value of the transacaoRef property.
     * 
     * @return
     *     possible object is
     *     {@link Transacao }
     *     
     */
    public Transacao getTransacaoRef() {
        return transacaoRef;
    }

    /**
     * Sets the value of the transacaoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transacao }
     *     
     */
    public void setTransacaoRef(Transacao value) {
        this.transacaoRef = value;
    }

}
