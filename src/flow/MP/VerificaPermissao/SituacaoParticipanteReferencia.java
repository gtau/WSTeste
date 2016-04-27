
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoParticipanteReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoParticipanteReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATIVO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *     &lt;enumeration value="PRE_CADASTRO"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoParticipanteReferencia")
@XmlEnum
public enum SituacaoParticipanteReferencia {

    ATIVO,
    CANCELADO,
    PRE_CADASTRO,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static SituacaoParticipanteReferencia fromValue(String v) {
        return valueOf(v);
    }

}
