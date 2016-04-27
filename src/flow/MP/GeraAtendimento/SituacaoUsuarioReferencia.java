
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoUsuarioReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoUsuarioReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ATIVO"/>
 *     &lt;enumeration value="BLOQUEADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoUsuarioReferencia")
@XmlEnum
public enum SituacaoUsuarioReferencia {

    ATIVO,
    BLOQUEADO;

    public String value() {
        return name();
    }

    public static SituacaoUsuarioReferencia fromValue(String v) {
        return valueOf(v);
    }

}
