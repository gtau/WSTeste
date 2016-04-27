
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoItemPedidoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoItemPedidoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTORIZADO"/>
 *     &lt;enumeration value="REJEITADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoItemPedidoReferencia")
@XmlEnum
public enum SituacaoItemPedidoReferencia {

    AUTORIZADO,
    REJEITADO;

    public String value() {
        return name();
    }

    public static SituacaoItemPedidoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
