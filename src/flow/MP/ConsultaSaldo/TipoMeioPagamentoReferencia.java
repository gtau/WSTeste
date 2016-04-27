
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoMeioPagamentoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoMeioPagamentoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CREDITO"/>
 *     &lt;enumeration value="DEBITO"/>
 *     &lt;enumeration value="BOLETO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoMeioPagamentoReferencia")
@XmlEnum
public enum TipoMeioPagamentoReferencia {

    CREDITO,
    DEBITO,
    BOLETO;

    public String value() {
        return name();
    }

    public static TipoMeioPagamentoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
