
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoPromocaoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoPromocaoReferencia">
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
@XmlType(name = "SituacaoPromocaoReferencia")
@XmlEnum
public enum SituacaoPromocaoReferencia {

    DISPONIVEL,
    BLOQUEADA,
    EXPIRADA,
    NAO_INFORMADA;

    public String value() {
        return name();
    }

    public static SituacaoPromocaoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
