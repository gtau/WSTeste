
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssuntoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AssuntoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="NOTIFICACAO_MOBILE"/>
 *     &lt;enumeration value="CHAMADA_VOZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AssuntoReferencia")
@XmlEnum
public enum AssuntoReferencia {

    SMS,
    EMAIL,
    NOTIFICACAO_MOBILE,
    CHAMADA_VOZ;

    public String value() {
        return name();
    }

    public static AssuntoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
