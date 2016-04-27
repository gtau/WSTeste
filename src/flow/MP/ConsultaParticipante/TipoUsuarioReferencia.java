
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoUsuarioReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoUsuarioReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PARTICIPANTE"/>
 *     &lt;enumeration value="PARCEIRO"/>
 *     &lt;enumeration value="OPERADOR_PARCEIRO"/>
 *     &lt;enumeration value="BACKOFFICE_MULTIPLUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoUsuarioReferencia")
@XmlEnum
public enum TipoUsuarioReferencia {

    PARTICIPANTE,
    PARCEIRO,
    OPERADOR_PARCEIRO,
    BACKOFFICE_MULTIPLUS;

    public String value() {
        return name();
    }

    public static TipoUsuarioReferencia fromValue(String v) {
        return valueOf(v);
    }

}
