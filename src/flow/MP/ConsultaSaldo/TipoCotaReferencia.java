
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCotaReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoCotaReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMPRA_PONTOS"/>
 *     &lt;enumeration value="REVALIDACAO_PONTOS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoCotaReferencia")
@XmlEnum
public enum TipoCotaReferencia {

    COMPRA_PONTOS,
    REVALIDACAO_PONTOS;

    public String value() {
        return name();
    }

    public static TipoCotaReferencia fromValue(String v) {
        return valueOf(v);
    }

}
