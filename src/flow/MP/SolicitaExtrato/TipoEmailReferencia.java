
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEmailReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEmailReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PESSOAL"/>
 *     &lt;enumeration value="COMERCIAL"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEmailReferencia")
@XmlEnum
public enum TipoEmailReferencia {

    PESSOAL,
    COMERCIAL,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static TipoEmailReferencia fromValue(String v) {
        return valueOf(v);
    }

}
