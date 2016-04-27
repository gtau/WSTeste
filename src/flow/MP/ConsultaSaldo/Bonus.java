
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Bonus a ser representado em uma assinatura
 * 
 * <p>Java class for Bonus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Bonus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descricao-bonus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mes-bonus-acumulo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="qtd-pontos-acumulo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="transacao-acumulo" type="{http://ebo.multiplusfidelidade.com.br/v1}Transacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bonus", propOrder = {
    "idBonus",
    "nomeBonus",
    "descricaoBonus",
    "mesBonusAcumulo",
    "qtdPontosAcumulo",
    "transacaoAcumulo"
})
public class Bonus {

    @XmlElement(name = "id-bonus")
    protected String idBonus;
    @XmlElement(name = "nome-bonus")
    protected String nomeBonus;
    @XmlElement(name = "descricao-bonus")
    protected String descricaoBonus;
    @XmlElement(name = "mes-bonus-acumulo")
    protected Long mesBonusAcumulo;
    @XmlElement(name = "qtd-pontos-acumulo")
    protected Long qtdPontosAcumulo;
    @XmlElement(name = "transacao-acumulo")
    protected Transacao transacaoAcumulo;

    /**
     * Gets the value of the idBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdBonus() {
        return idBonus;
    }

    /**
     * Sets the value of the idBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdBonus(String value) {
        this.idBonus = value;
    }

    /**
     * Gets the value of the nomeBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBonus() {
        return nomeBonus;
    }

    /**
     * Sets the value of the nomeBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBonus(String value) {
        this.nomeBonus = value;
    }

    /**
     * Gets the value of the descricaoBonus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoBonus() {
        return descricaoBonus;
    }

    /**
     * Sets the value of the descricaoBonus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoBonus(String value) {
        this.descricaoBonus = value;
    }

    /**
     * Gets the value of the mesBonusAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMesBonusAcumulo() {
        return mesBonusAcumulo;
    }

    /**
     * Sets the value of the mesBonusAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMesBonusAcumulo(Long value) {
        this.mesBonusAcumulo = value;
    }

    /**
     * Gets the value of the qtdPontosAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getQtdPontosAcumulo() {
        return qtdPontosAcumulo;
    }

    /**
     * Sets the value of the qtdPontosAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setQtdPontosAcumulo(Long value) {
        this.qtdPontosAcumulo = value;
    }

    /**
     * Gets the value of the transacaoAcumulo property.
     * 
     * @return
     *     possible object is
     *     {@link Transacao }
     *     
     */
    public Transacao getTransacaoAcumulo() {
        return transacaoAcumulo;
    }

    /**
     * Sets the value of the transacaoAcumulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transacao }
     *     
     */
    public void setTransacaoAcumulo(Transacao value) {
        this.transacaoAcumulo = value;
    }

}
