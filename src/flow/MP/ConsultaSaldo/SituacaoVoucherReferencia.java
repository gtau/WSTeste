
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoVoucherReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoVoucherReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISPONIVEL"/>
 *     &lt;enumeration value="UTILIZADO"/>
 *     &lt;enumeration value="EXPIRADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoVoucherReferencia")
@XmlEnum
public enum SituacaoVoucherReferencia {

    DISPONIVEL,
    UTILIZADO,
    EXPIRADO;

    public String value() {
        return name();
    }

    public static SituacaoVoucherReferencia fromValue(String v) {
        return valueOf(v);
    }

}
