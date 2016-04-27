
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoConfiguracaoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoConfiguracaoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXTO_LIVRE"/>
 *     &lt;enumeration value="LISTA_TEXTO_LIVRE"/>
 *     &lt;enumeration value="ENUMERADO"/>
 *     &lt;enumeration value="LISTA_ENUMERADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoConfiguracaoReferencia")
@XmlEnum
public enum TipoConfiguracaoReferencia {

    TEXTO_LIVRE,
    LISTA_TEXTO_LIVRE,
    ENUMERADO,
    LISTA_ENUMERADO;

    public String value() {
        return name();
    }

    public static TipoConfiguracaoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
