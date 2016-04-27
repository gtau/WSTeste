
package flow.MP.ConsultaSaldo;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Lista de entidades Imagem.
 * 
 * <p>Java class for ImagemList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagemList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="imagem" type="{http://ebo.multiplusfidelidade.com.br/v1}Imagem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagemList", propOrder = {
    "imagem"
})
public class ImagemList {

    protected List<Imagem> imagem;

    /**
     * Gets the value of the imagem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imagem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImagem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Imagem }
     * 
     * 
     */
    public List<Imagem> getImagem() {
        if (imagem == null) {
            imagem = new ArrayList<Imagem>();
        }
        return this.imagem;
    }

}
