
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PapelContatoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PapelContatoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINCIPAL"/>
 *     &lt;enumeration value="ENTREGA"/>
 *     &lt;enumeration value="COMERCIAL"/>
 *     &lt;enumeration value="COBRANCA"/>
 *     &lt;enumeration value="SUPORTE"/>
 *     &lt;enumeration value="TI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PapelContatoReferencia")
@XmlEnum
public enum PapelContatoReferencia {

    PRINCIPAL,
    ENTREGA,
    COMERCIAL,
    COBRANCA,
    SUPORTE,
    TI;

    public String value() {
        return name();
    }

    public static PapelContatoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
