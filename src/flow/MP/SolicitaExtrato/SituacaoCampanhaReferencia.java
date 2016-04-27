
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoCampanhaReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoCampanhaReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISPONIVEL"/>
 *     &lt;enumeration value="BLOQUEADA"/>
 *     &lt;enumeration value="EXPIRADA"/>
 *     &lt;enumeration value="NAO_INFORMADA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoCampanhaReferencia")
@XmlEnum
public enum SituacaoCampanhaReferencia {

    DISPONIVEL,
    BLOQUEADA,
    EXPIRADA,
    NAO_INFORMADA;

    public String value() {
        return name();
    }

    public static SituacaoCampanhaReferencia fromValue(String v) {
        return valueOf(v);
    }

}
