
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProgramaFidelidadeParticipante complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramaFidelidadeParticipante">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="programa-fidelidade" type="{http://ebo.multiplusfidelidade.com.br/v1}ProgramaFidelidade" minOccurs="0"/>
 *         &lt;element name="codigo-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="indicador-aceite-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="data-aceite-programa-fidelidade" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tier" type="{http://ebo.multiplusfidelidade.com.br/v1}Tier" minOccurs="0"/>
 *         &lt;element name="participante-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}Participante" minOccurs="0"/>
 *         &lt;element name="indicador-cadastro-sincronizado" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramaFidelidadeParticipante", propOrder = {
    "programaFidelidade",
    "codigoProgramaFidelidade",
    "indicadorAceiteProgramaFidelidade",
    "dataAceiteProgramaFidelidade",
    "tier",
    "participanteReferencia",
    "indicadorCadastroSincronizado"
})
public class ProgramaFidelidadeParticipante {

    @XmlElement(name = "programa-fidelidade")
    protected ProgramaFidelidade programaFidelidade;
    @XmlElement(name = "codigo-programa-fidelidade")
    protected String codigoProgramaFidelidade;
    @XmlElement(name = "indicador-aceite-programa-fidelidade")
    protected Boolean indicadorAceiteProgramaFidelidade;
    @XmlElement(name = "data-aceite-programa-fidelidade")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataAceiteProgramaFidelidade;
    protected Tier tier;
    @XmlElement(name = "participante-referencia")
    protected Participante participanteReferencia;
    @XmlElement(name = "indicador-cadastro-sincronizado")
    protected Boolean indicadorCadastroSincronizado;

    /**
     * Gets the value of the programaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramaFidelidade }
     *     
     */
    public ProgramaFidelidade getProgramaFidelidade() {
        return programaFidelidade;
    }

    /**
     * Sets the value of the programaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramaFidelidade }
     *     
     */
    public void setProgramaFidelidade(ProgramaFidelidade value) {
        this.programaFidelidade = value;
    }

    /**
     * Gets the value of the codigoProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoProgramaFidelidade() {
        return codigoProgramaFidelidade;
    }

    /**
     * Sets the value of the codigoProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoProgramaFidelidade(String value) {
        this.codigoProgramaFidelidade = value;
    }

    /**
     * Gets the value of the indicadorAceiteProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorAceiteProgramaFidelidade() {
        return indicadorAceiteProgramaFidelidade;
    }

    /**
     * Sets the value of the indicadorAceiteProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorAceiteProgramaFidelidade(Boolean value) {
        this.indicadorAceiteProgramaFidelidade = value;
    }

    /**
     * Gets the value of the dataAceiteProgramaFidelidade property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAceiteProgramaFidelidade() {
        return dataAceiteProgramaFidelidade;
    }

    /**
     * Sets the value of the dataAceiteProgramaFidelidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAceiteProgramaFidelidade(XMLGregorianCalendar value) {
        this.dataAceiteProgramaFidelidade = value;
    }

    /**
     * Gets the value of the tier property.
     * 
     * @return
     *     possible object is
     *     {@link Tier }
     *     
     */
    public Tier getTier() {
        return tier;
    }

    /**
     * Sets the value of the tier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tier }
     *     
     */
    public void setTier(Tier value) {
        this.tier = value;
    }

    /**
     * Gets the value of the participanteReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link Participante }
     *     
     */
    public Participante getParticipanteReferencia() {
        return participanteReferencia;
    }

    /**
     * Sets the value of the participanteReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Participante }
     *     
     */
    public void setParticipanteReferencia(Participante value) {
        this.participanteReferencia = value;
    }

    /**
     * Gets the value of the indicadorCadastroSincronizado property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIndicadorCadastroSincronizado() {
        return indicadorCadastroSincronizado;
    }

    /**
     * Sets the value of the indicadorCadastroSincronizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIndicadorCadastroSincronizado(Boolean value) {
        this.indicadorCadastroSincronizado = value;
    }

}
