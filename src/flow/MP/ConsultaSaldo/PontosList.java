
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma lista de lote de pontos.
 * 
 * <p>Java class for PontosList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PontosList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pontos" type="{http://ebo.multiplusfidelidade.com.br/v1}Pontos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PontosList", propOrder = {
    "pontos"
})
public class PontosList {

    protected List<Pontos> pontos;

    /**
     * Gets the value of the pontos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pontos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPontos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pontos }
     * 
     * 
     */
    public List<Pontos> getPontos() {
        if (pontos == null) {
            pontos = new ArrayList<Pontos>();
        }
        return this.pontos;
    }

}
