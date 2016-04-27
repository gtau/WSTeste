
package flow.MP.SolicitaExtrato;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoCampanhaParticipanteReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoCampanhaParticipanteReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="ATIVA"/>
 *     &lt;enumeration value="EXPIRADA"/>
 *     &lt;enumeration value="NAO_INFORMADA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoCampanhaParticipanteReferencia")
@XmlEnum
public enum SituacaoCampanhaParticipanteReferencia {

    PENDENTE,
    ATIVA,
    EXPIRADA,
    NAO_INFORMADA;

    public String value() {
        return name();
    }

    public static SituacaoCampanhaParticipanteReferencia fromValue(String v) {
        return valueOf(v);
    }

}
