
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPeriodoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPeriodoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIAS"/>
 *     &lt;enumeration value="HORAS"/>
 *     &lt;enumeration value="MINUTOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPeriodoReferencia")
@XmlEnum
public enum TipoPeriodoReferencia {

    DIAS,
    HORAS,
    MINUTOS;

    public String value() {
        return name();
    }

    public static TipoPeriodoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
