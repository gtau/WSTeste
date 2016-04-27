
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCanalOrigemReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubCanalOrigemReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SoftwareExpress"/>
 *     &lt;enumeration value="Itautec"/>
 *     &lt;enumeration value="Redecard"/>
 *     &lt;enumeration value="Cielo"/>
 *     &lt;enumeration value="Getnet"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubCanalOrigemReferencia")
@XmlEnum
public enum SubCanalOrigemReferencia {

    @XmlEnumValue("SoftwareExpress")
    SOFTWARE_EXPRESS("SoftwareExpress"),
    @XmlEnumValue("Itautec")
    ITAUTEC("Itautec"),
    @XmlEnumValue("Redecard")
    REDECARD("Redecard"),
    @XmlEnumValue("Cielo")
    CIELO("Cielo"),
    @XmlEnumValue("Getnet")
    GETNET("Getnet");
    private final String value;

    SubCanalOrigemReferencia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubCanalOrigemReferencia fromValue(String v) {
        for (SubCanalOrigemReferencia c: SubCanalOrigemReferencia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
