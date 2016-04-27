
package flow.MP.VerificaPermissao;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeolocalizacaoList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeolocalizacaoList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="endereco" type="{http://ebo.multiplusfidelidade.com.br/v1}Geolocalizacao" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeolocalizacaoList", propOrder = {
    "endereco"
})
public class GeolocalizacaoList {

    protected List<Geolocalizacao> endereco;

    /**
     * Gets the value of the endereco property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endereco property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndereco().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Geolocalizacao }
     * 
     * 
     */
    public List<Geolocalizacao> getEndereco() {
        if (endereco == null) {
            endereco = new ArrayList<Geolocalizacao>();
        }
        return this.endereco;
    }

}
