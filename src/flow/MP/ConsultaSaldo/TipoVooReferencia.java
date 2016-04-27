
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoVooReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoVooReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOMESTICO"/>
 *     &lt;enumeration value="INTERNACIONAL"/>
 *     &lt;enumeration value="REGIONAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoVooReferencia")
@XmlEnum
public enum TipoVooReferencia {

    DOMESTICO,
    INTERNACIONAL,
    REGIONAL;

    public String value() {
        return name();
    }

    public static TipoVooReferencia fromValue(String v) {
        return valueOf(v);
    }

}
