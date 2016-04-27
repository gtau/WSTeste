
package flow.MP.EnviaEmail;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndicadorList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndicadorList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador" type="{http://ebo.multiplusfidelidade.com.br/v1}Indicador" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndicadorList", propOrder = {
    "indicador"
})
public class IndicadorList {

    protected List<Indicador> indicador;

    /**
     * Gets the value of the indicador property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicador property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicador().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Indicador }
     * 
     * 
     */
    public List<Indicador> getIndicador() {
        if (indicador == null) {
            indicador = new ArrayList<Indicador>();
        }
        return this.indicador;
    }

}
