
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoCivilReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoCivilReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOLTEIRO"/>
 *     &lt;enumeration value="DIVORCIADO"/>
 *     &lt;enumeration value="CASADO"/>
 *     &lt;enumeration value="UNIAO_ESTAVEL"/>
 *     &lt;enumeration value="SEPARADO"/>
 *     &lt;enumeration value="VIUVO"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoCivilReferencia")
@XmlEnum
public enum EstadoCivilReferencia {

    SOLTEIRO,
    DIVORCIADO,
    CASADO,
    UNIAO_ESTAVEL,
    SEPARADO,
    VIUVO,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static EstadoCivilReferencia fromValue(String v) {
        return valueOf(v);
    }

}
