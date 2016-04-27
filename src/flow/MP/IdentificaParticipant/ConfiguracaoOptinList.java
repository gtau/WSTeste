
package flow.MP.IdentificaParticipant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfiguracaoOptinList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfiguracaoOptinList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="configuracao-optin" type="{http://ebo.multiplusfidelidade.com.br/v1}ConfiguracaoOptin" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfiguracaoOptinList", propOrder = {
    "configuracaoOptin"
})
public class ConfiguracaoOptinList {

    @XmlElement(name = "configuracao-optin")
    protected List<ConfiguracaoOptin> configuracaoOptin;

    /**
     * Gets the value of the configuracaoOptin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the configuracaoOptin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfiguracaoOptin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfiguracaoOptin }
     * 
     * 
     */
    public List<ConfiguracaoOptin> getConfiguracaoOptin() {
        if (configuracaoOptin == null) {
            configuracaoOptin = new ArrayList<ConfiguracaoOptin>();
        }
        return this.configuracaoOptin;
    }

}
