
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoTransacaoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoTransacaoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PROCESSADA"/>
 *     &lt;enumeration value="CANCELADA"/>
 *     &lt;enumeration value="REJEITADA"/>
 *     &lt;enumeration value="EM_ANDAMENTO"/>
 *     &lt;enumeration value="NAO_INFORMADA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoTransacaoReferencia")
@XmlEnum
public enum SituacaoTransacaoReferencia {

    PROCESSADA,
    CANCELADA,
    REJEITADA,
    EM_ANDAMENTO,
    NAO_INFORMADA;

    public String value() {
        return name();
    }

    public static SituacaoTransacaoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
