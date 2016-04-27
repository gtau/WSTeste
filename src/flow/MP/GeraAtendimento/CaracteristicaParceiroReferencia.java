
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaracteristicaParceiroReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaracteristicaParceiroReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCILIACAO_FINANCEIRA"/>
 *     &lt;enumeration value="EXPRESS"/>
 *     &lt;enumeration value="CAPILARIDADE"/>
 *     &lt;enumeration value="RESGATE"/>
 *     &lt;enumeration value="ACUMULO"/>
 *     &lt;enumeration value="COALIZAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaracteristicaParceiroReferencia")
@XmlEnum
public enum CaracteristicaParceiroReferencia {

    CONCILIACAO_FINANCEIRA,
    EXPRESS,
    CAPILARIDADE,
    RESGATE,
    ACUMULO,
    COALIZAO;

    public String value() {
        return name();
    }

    public static CaracteristicaParceiroReferencia fromValue(String v) {
        return valueOf(v);
    }

}
