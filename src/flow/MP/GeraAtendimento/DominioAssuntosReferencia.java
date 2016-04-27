
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DominioAssuntosReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DominioAssuntosReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMUNICACOES_MOBILE_PUSH"/>
 *     &lt;enumeration value="COMUNICACOES_SMS"/>
 *     &lt;enumeration value="COMUNICACOES_EMAIL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DominioAssuntosReferencia")
@XmlEnum
public enum DominioAssuntosReferencia {

    COMUNICACOES_MOBILE_PUSH,
    COMUNICACOES_SMS,
    COMUNICACOES_EMAIL;

    public String value() {
        return name();
    }

    public static DominioAssuntosReferencia fromValue(String v) {
        return valueOf(v);
    }

}
