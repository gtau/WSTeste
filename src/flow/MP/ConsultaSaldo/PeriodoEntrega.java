
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodoEntrega.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodoEntrega">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TURNO_MANHA"/>
 *     &lt;enumeration value="TURNO_TARDE"/>
 *     &lt;enumeration value="TURNO_NOITE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodoEntrega")
@XmlEnum
public enum PeriodoEntrega {

    TURNO_MANHA,
    TURNO_TARDE,
    TURNO_NOITE;

    public String value() {
        return name();
    }

    public static PeriodoEntrega fromValue(String v) {
        return valueOf(v);
    }

}
