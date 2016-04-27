
package flow.MP.RedefineSenha;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPessoa.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPessoa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PF"/>
 *     &lt;enumeration value="PJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPessoa")
@XmlEnum
public enum TipoPessoa {

    PF,
    PJ;

    public String value() {
        return name();
    }

    public static TipoPessoa fromValue(String v) {
        return valueOf(v);
    }

}
