
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Representa uma cotação de categorias de veículo para locação.
 * 
 * <p>Java class for CotacaoCategoriaVeiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CotacaoCategoriaVeiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo-local-retirada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-local-retirada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-hora-retirada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="codigo-local-devolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nome-local-devolucao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="data-hora-devolucao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="codigo-tarifa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="categoria-veiculo" type="{http://ebo.multiplusfidelidade.com.br/v1}CategoriaVeiculo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CotacaoCategoriaVeiculo", propOrder = {
    "codigoLocalRetirada",
    "nomeLocalRetirada",
    "dataHoraRetirada",
    "codigoLocalDevolucao",
    "nomeLocalDevolucao",
    "dataHoraDevolucao",
    "codigoTarifa",
    "categoriaVeiculo"
})
public class CotacaoCategoriaVeiculo {

    @XmlElement(name = "codigo-local-retirada")
    protected String codigoLocalRetirada;
    @XmlElement(name = "nome-local-retirada")
    protected String nomeLocalRetirada;
    @XmlElement(name = "data-hora-retirada")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraRetirada;
    @XmlElement(name = "codigo-local-devolucao")
    protected String codigoLocalDevolucao;
    @XmlElement(name = "nome-local-devolucao")
    protected String nomeLocalDevolucao;
    @XmlElement(name = "data-hora-devolucao")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataHoraDevolucao;
    @XmlElement(name = "codigo-tarifa")
    protected String codigoTarifa;
    @XmlElement(name = "categoria-veiculo")
    protected CategoriaVeiculo categoriaVeiculo;

    /**
     * Gets the value of the codigoLocalRetirada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocalRetirada() {
        return codigoLocalRetirada;
    }

    /**
     * Sets the value of the codigoLocalRetirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocalRetirada(String value) {
        this.codigoLocalRetirada = value;
    }

    /**
     * Gets the value of the nomeLocalRetirada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLocalRetirada() {
        return nomeLocalRetirada;
    }

    /**
     * Sets the value of the nomeLocalRetirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLocalRetirada(String value) {
        this.nomeLocalRetirada = value;
    }

    /**
     * Gets the value of the dataHoraRetirada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraRetirada() {
        return dataHoraRetirada;
    }

    /**
     * Sets the value of the dataHoraRetirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraRetirada(XMLGregorianCalendar value) {
        this.dataHoraRetirada = value;
    }

    /**
     * Gets the value of the codigoLocalDevolucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoLocalDevolucao() {
        return codigoLocalDevolucao;
    }

    /**
     * Sets the value of the codigoLocalDevolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoLocalDevolucao(String value) {
        this.codigoLocalDevolucao = value;
    }

    /**
     * Gets the value of the nomeLocalDevolucao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeLocalDevolucao() {
        return nomeLocalDevolucao;
    }

    /**
     * Sets the value of the nomeLocalDevolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeLocalDevolucao(String value) {
        this.nomeLocalDevolucao = value;
    }

    /**
     * Gets the value of the dataHoraDevolucao property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataHoraDevolucao() {
        return dataHoraDevolucao;
    }

    /**
     * Sets the value of the dataHoraDevolucao property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataHoraDevolucao(XMLGregorianCalendar value) {
        this.dataHoraDevolucao = value;
    }

    /**
     * Gets the value of the codigoTarifa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoTarifa() {
        return codigoTarifa;
    }

    /**
     * Sets the value of the codigoTarifa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoTarifa(String value) {
        this.codigoTarifa = value;
    }

    /**
     * Gets the value of the categoriaVeiculo property.
     * 
     * @return
     *     possible object is
     *     {@link CategoriaVeiculo }
     *     
     */
    public CategoriaVeiculo getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    /**
     * Sets the value of the categoriaVeiculo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CategoriaVeiculo }
     *     
     */
    public void setCategoriaVeiculo(CategoriaVeiculo value) {
        this.categoriaVeiculo = value;
    }

}
