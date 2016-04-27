
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnidadeMedidaReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UnidadeMedidaReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="km"/>
 *     &lt;enumeration value="m"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UnidadeMedidaReferencia")
@XmlEnum
public enum UnidadeMedidaReferencia {

    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("m")
    M("m");
    private final String value;

    UnidadeMedidaReferencia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UnidadeMedidaReferencia fromValue(String v) {
        for (UnidadeMedidaReferencia c: UnidadeMedidaReferencia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
