
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPedidoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPedidoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESGATE_ECOMMERCE"/>
 *     &lt;enumeration value="COMPRA_PONTOS"/>
 *     &lt;enumeration value="REVALIDACAO_PONTOS"/>
 *     &lt;enumeration value="TRANSFERENCIA_PONTOS"/>
 *     &lt;enumeration value="AEREO_TRAVEL_GO"/>
 *     &lt;enumeration value="AEREO_TAM_AMADEUS"/>
 *     &lt;enumeration value="RESGATE_ECOMMERCE_ATG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPedidoReferencia")
@XmlEnum
public enum TipoPedidoReferencia {

    RESGATE_ECOMMERCE,
    COMPRA_PONTOS,
    REVALIDACAO_PONTOS,
    TRANSFERENCIA_PONTOS,
    AEREO_TRAVEL_GO,
    AEREO_TAM_AMADEUS,
    RESGATE_ECOMMERCE_ATG;

    public String value() {
        return name();
    }

    public static TipoPedidoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
