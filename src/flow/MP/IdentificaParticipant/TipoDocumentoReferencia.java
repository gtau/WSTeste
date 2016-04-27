
package flow.MP.IdentificaParticipant;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoDocumentoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoDocumentoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CPF"/>
 *     &lt;enumeration value="RG"/>
 *     &lt;enumeration value="PASSAPORTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoDocumentoReferencia")
@XmlEnum
public enum TipoDocumentoReferencia {

    CPF,
    RG,
    PASSAPORTE;

    public String value() {
        return name();
    }

    public static TipoDocumentoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
