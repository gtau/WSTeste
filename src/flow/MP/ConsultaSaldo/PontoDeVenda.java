
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa um Ponto de Venda (PDV) de um parceiro, caracterizado por um canal de atendimento que roda
 * 			sobre um sistema de automação comercial e é operado por um operador/atendente.
 * 
 * <p>Java class for PontoDeVenda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PontoDeVenda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id-ponto-de-venda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario-operador" type="{http://ebo.multiplusfidelidade.com.br/v1}Usuario" minOccurs="0"/>
 *         &lt;element name="sistema" type="{http://ebo.multiplusfidelidade.com.br/v1}Sistema" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PontoDeVenda", propOrder = {
    "idPontoDeVenda",
    "usuarioOperador",
    "sistema"
})
public class PontoDeVenda {

    @XmlElement(name = "id-ponto-de-venda")
    protected String idPontoDeVenda;
    @XmlElement(name = "usuario-operador")
    protected Usuario usuarioOperador;
    protected Sistema sistema;

    /**
     * Gets the value of the idPontoDeVenda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPontoDeVenda() {
        return idPontoDeVenda;
    }

    /**
     * Sets the value of the idPontoDeVenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPontoDeVenda(String value) {
        this.idPontoDeVenda = value;
    }

    /**
     * Gets the value of the usuarioOperador property.
     * 
     * @return
     *     possible object is
     *     {@link Usuario }
     *     
     */
    public Usuario getUsuarioOperador() {
        return usuarioOperador;
    }

    /**
     * Sets the value of the usuarioOperador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario }
     *     
     */
    public void setUsuarioOperador(Usuario value) {
        this.usuarioOperador = value;
    }

    /**
     * Gets the value of the sistema property.
     * 
     * @return
     *     possible object is
     *     {@link Sistema }
     *     
     */
    public Sistema getSistema() {
        return sistema;
    }

    /**
     * Sets the value of the sistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sistema }
     *     
     */
    public void setSistema(Sistema value) {
        this.sistema = value;
    }

}
