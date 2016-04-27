
package flow.MP.AutenticaUsuario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de meta-informação.
 * 
 * <p>Java class for MetaInformacaoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetaInformacaoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meta-informacao" type="{http://ebo.multiplusfidelidade.com.br/v1}MetaInformacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetaInformacaoList", propOrder = {
    "metaInformacao"
})
public class MetaInformacaoList {

    @XmlElement(name = "meta-informacao")
    protected List<MetaInformacao> metaInformacao;

    /**
     * Gets the value of the metaInformacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaInformacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaInformacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaInformacao }
     * 
     * 
     */
    public List<MetaInformacao> getMetaInformacao() {
        if (metaInformacao == null) {
            metaInformacao = new ArrayList<MetaInformacao>();
        }
        return this.metaInformacao;
    }

}
