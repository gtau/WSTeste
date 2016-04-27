
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanalReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEF"/>
 *     &lt;enumeration value="POS"/>
 *     &lt;enumeration value="Web"/>
 *     &lt;enumeration value="B2B"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Extranet"/>
 *     &lt;enumeration value="Atendimento"/>
 *     &lt;enumeration value="URA"/>
 *     &lt;enumeration value="SYS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanalReferencia")
@XmlEnum
public enum CanalReferencia {

    TEF("TEF"),
    POS("POS"),
    @XmlEnumValue("Web")
    WEB("Web"),
    @XmlEnumValue("B2B")
    B_2_B("B2B"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Extranet")
    EXTRANET("Extranet"),
    @XmlEnumValue("Atendimento")
    ATENDIMENTO("Atendimento"),
    URA("URA"),
    SYS("SYS");
    private final String value;

    CanalReferencia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CanalReferencia fromValue(String v) {
        for (CanalReferencia c: CanalReferencia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
