
package flow.MP.GeraAtendimento;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CadastroParticipanteParceiroList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CadastroParticipanteParceiroList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cadastro-participante-parceiro" type="{http://ebo.multiplusfidelidade.com.br/v1}CadastroParticipanteParceiro" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CadastroParticipanteParceiroList", propOrder = {
    "cadastroParticipanteParceiro"
})
public class CadastroParticipanteParceiroList {

    @XmlElement(name = "cadastro-participante-parceiro")
    protected List<CadastroParticipanteParceiro> cadastroParticipanteParceiro;

    /**
     * Gets the value of the cadastroParticipanteParceiro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cadastroParticipanteParceiro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCadastroParticipanteParceiro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CadastroParticipanteParceiro }
     * 
     * 
     */
    public List<CadastroParticipanteParceiro> getCadastroParticipanteParceiro() {
        if (cadastroParticipanteParceiro == null) {
            cadastroParticipanteParceiro = new ArrayList<CadastroParticipanteParceiro>();
        }
        return this.cadastroParticipanteParceiro;
    }

}
