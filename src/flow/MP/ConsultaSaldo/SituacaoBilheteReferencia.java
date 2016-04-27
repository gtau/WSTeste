
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoBilheteReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoBilheteReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISPONIVEL"/>
 *     &lt;enumeration value="UTILIZADO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *     &lt;enumeration value="REEMITIDO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoBilheteReferencia")
@XmlEnum
public enum SituacaoBilheteReferencia {

    DISPONIVEL,
    UTILIZADO,
    CANCELADO,
    REEMITIDO;

    public String value() {
        return name();
    }

    public static SituacaoBilheteReferencia fromValue(String v) {
        return valueOf(v);
    }

}
