
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTelefoneReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoTelefoneReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CELULAR"/>
 *     &lt;enumeration value="RESIDENCIAL"/>
 *     &lt;enumeration value="COMERCIAL"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoTelefoneReferencia")
@XmlEnum
public enum TipoTelefoneReferencia {

    CELULAR,
    RESIDENCIAL,
    COMERCIAL,
    FAX,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static TipoTelefoneReferencia fromValue(String v) {
        return valueOf(v);
    }

}
