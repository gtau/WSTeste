
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoBonus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoBonus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACUMULO_RECORRENTE"/>
 *     &lt;enumeration value="BONUS_RECORRENTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoBonus")
@XmlEnum
public enum TipoBonus {

    ACUMULO_RECORRENTE,
    BONUS_RECORRENTE;

    public String value() {
        return name();
    }

    public static TipoBonus fromValue(String v) {
        return valueOf(v);
    }

}
