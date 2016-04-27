
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CanalOptinReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanalOptinReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="MOBILE_PUSH"/>
 *     &lt;enumeration value="CHAMADA_VOZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanalOptinReferencia")
@XmlEnum
public enum CanalOptinReferencia {

    SMS,
    EMAIL,
    MOBILE_PUSH,
    CHAMADA_VOZ;

    public String value() {
        return name();
    }

    public static CanalOptinReferencia fromValue(String v) {
        return valueOf(v);
    }

}
