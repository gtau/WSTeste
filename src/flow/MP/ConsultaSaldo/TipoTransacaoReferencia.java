
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTransacaoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTransacaoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACUMULO"/>
 *     &lt;enumeration value="RESGATE"/>
 *     &lt;enumeration value="REEMBOLSO"/>
 *     &lt;enumeration value="ESTORNO"/>
 *     &lt;enumeration value="VENCIDO"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *     &lt;enumeration value="CANCELAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoTransacaoReferencia")
@XmlEnum
public enum TipoTransacaoReferencia {

    ACUMULO,
    RESGATE,
    REEMBOLSO,
    ESTORNO,
    VENCIDO,
    NAO_INFORMADO,
    CANCELAMENTO;

    public String value() {
        return name();
    }

    public static TipoTransacaoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
