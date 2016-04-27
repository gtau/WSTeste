
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPessoaJuridica.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPessoaJuridica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EMPRESA_PRIVADA"/>
 *     &lt;enumeration value="GOVERNO"/>
 *     &lt;enumeration value="COOPERATIVA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPessoaJuridica")
@XmlEnum
public enum TipoPessoaJuridica {

    EMPRESA_PRIVADA,
    GOVERNO,
    COOPERATIVA;

    public String value() {
        return name();
    }

    public static TipoPessoaJuridica fromValue(String v) {
        return valueOf(v);
    }

}
