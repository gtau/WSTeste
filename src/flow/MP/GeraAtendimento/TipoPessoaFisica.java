
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoPessoaFisica.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoPessoaFisica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PESSOA_FISICA"/>
 *     &lt;enumeration value="INDIO"/>
 *     &lt;enumeration value="PRODUTOR_RURAL"/>
 *     &lt;enumeration value="MEMBRO_EMBAIXADA"/>
 *     &lt;enumeration value="ESTRANGEIRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoPessoaFisica")
@XmlEnum
public enum TipoPessoaFisica {

    PESSOA_FISICA,
    INDIO,
    PRODUTOR_RURAL,
    MEMBRO_EMBAIXADA,
    ESTRANGEIRO;

    public String value() {
        return name();
    }

    public static TipoPessoaFisica fromValue(String v) {
        return valueOf(v);
    }

}
