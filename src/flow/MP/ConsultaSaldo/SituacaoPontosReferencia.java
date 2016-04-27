
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoPontosReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoPontosReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISPONIVEIS"/>
 *     &lt;enumeration value="INDISPONIVEIS"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoPontosReferencia")
@XmlEnum
public enum SituacaoPontosReferencia {

    DISPONIVEIS,
    INDISPONIVEIS,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static SituacaoPontosReferencia fromValue(String v) {
        return valueOf(v);
    }

}
