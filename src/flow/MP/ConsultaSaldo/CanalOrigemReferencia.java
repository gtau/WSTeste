
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalOrigemReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanalOrigemReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEF"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="B2B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanalOrigemReferencia")
@XmlEnum
public enum CanalOrigemReferencia {

    TEF("TEF"),
    POS("POS"),
    @XmlEnumValue("B2B")
    B_2_B("B2B");
    private final String value;

    CanalOrigemReferencia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CanalOrigemReferencia fromValue(String v) {
        for (CanalOrigemReferencia c: CanalOrigemReferencia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
