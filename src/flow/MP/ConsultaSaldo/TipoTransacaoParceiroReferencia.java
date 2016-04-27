
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTransacaoParceiroReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTransacaoParceiroReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACUMULO"/>
 *     &lt;enumeration value="RESGATE"/>
 *     &lt;enumeration value="CANCELAMENTO"/>
 *     &lt;enumeration value="ESTORNO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoTransacaoParceiroReferencia")
@XmlEnum
public enum TipoTransacaoParceiroReferencia {

    ACUMULO,
    RESGATE,
    CANCELAMENTO,
    ESTORNO;

    public String value() {
        return name();
    }

    public static TipoTransacaoParceiroReferencia fromValue(String v) {
        return valueOf(v);
    }

}
