
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoEnderecoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoEnderecoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINCIPAL"/>
 *     &lt;enumeration value="RESIDENCIAL"/>
 *     &lt;enumeration value="COMERCIAL"/>
 *     &lt;enumeration value="ENTREGA"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoEnderecoReferencia")
@XmlEnum
public enum TipoEnderecoReferencia {

    PRINCIPAL,
    RESIDENCIAL,
    COMERCIAL,
    ENTREGA,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static TipoEnderecoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
