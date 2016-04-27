
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoFulfillmentReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoFulfillmentReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VAREJO_PADRAO"/>
 *     &lt;enumeration value="EXPRESS"/>
 *     &lt;enumeration value="TRANSFERENCIA_PADRAO"/>
 *     &lt;enumeration value="TRANSFERENCIA_CADASTRO"/>
 *     &lt;enumeration value="BATCH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoFulfillmentReferencia")
@XmlEnum
public enum TipoFulfillmentReferencia {

    VAREJO_PADRAO,
    EXPRESS,
    TRANSFERENCIA_PADRAO,
    TRANSFERENCIA_CADASTRO,
    BATCH;

    public String value() {
        return name();
    }

    public static TipoFulfillmentReferencia fromValue(String v) {
        return valueOf(v);
    }

}
