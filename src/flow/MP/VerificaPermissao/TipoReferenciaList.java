
package flow.MP.VerificaPermissao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoReferenciaList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoReferenciaList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipo-referencia" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoReferenciaList", propOrder = {
    "tipoReferencia"
})
public class TipoReferenciaList {

    @XmlElement(name = "tipo-referencia")
    protected List<TipoReferencia> tipoReferencia;

    /**
     * Gets the value of the tipoReferencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoReferencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoReferencia().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoReferencia }
     * 
     * 
     */
    public List<TipoReferencia> getTipoReferencia() {
        if (tipoReferencia == null) {
            tipoReferencia = new ArrayList<TipoReferencia>();
        }
        return this.tipoReferencia;
    }

}
