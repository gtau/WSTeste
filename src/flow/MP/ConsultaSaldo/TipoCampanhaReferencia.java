
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCampanhaReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCampanhaReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFORMATIVA"/>
 *     &lt;enumeration value="BONUS"/>
 *     &lt;enumeration value="DESCONTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoCampanhaReferencia")
@XmlEnum
public enum TipoCampanhaReferencia {

    INFORMATIVA,
    BONUS,
    DESCONTO;

    public String value() {
        return name();
    }

    public static TipoCampanhaReferencia fromValue(String v) {
        return valueOf(v);
    }

}
