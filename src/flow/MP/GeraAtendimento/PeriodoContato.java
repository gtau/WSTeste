
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PeriodoContato.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PeriodoContato">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MANHA"/>
 *     &lt;enumeration value="TARDE"/>
 *     &lt;enumeration value="NOITE"/>
 *     &lt;enumeration value="HORARIO_COMERCIAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PeriodoContato")
@XmlEnum
public enum PeriodoContato {

    MANHA,
    TARDE,
    NOITE,
    HORARIO_COMERCIAL;

    public String value() {
        return name();
    }

    public static PeriodoContato fromValue(String v) {
        return valueOf(v);
    }

}
