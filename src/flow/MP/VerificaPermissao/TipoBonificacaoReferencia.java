
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoBonificacaoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoBonificacaoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PORCENTAGEM"/>
 *     &lt;enumeration value="VALOR_ABSOLUTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoBonificacaoReferencia")
@XmlEnum
public enum TipoBonificacaoReferencia {

    PORCENTAGEM,
    VALOR_ABSOLUTO;

    public String value() {
        return name();
    }

    public static TipoBonificacaoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
