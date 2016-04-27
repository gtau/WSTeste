
package flow.MP.VerificaPermissao;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EstadoCivil.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EstadoCivil">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SOLTEIRO"/>
 *     &lt;enumeration value="CASADO"/>
 *     &lt;enumeration value="SEPARADO"/>
 *     &lt;enumeration value="DIVORCIADO"/>
 *     &lt;enumeration value="VIUVO"/>
 *     &lt;enumeration value="UNIAO_ESTAVEL"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EstadoCivil")
@XmlEnum
public enum EstadoCivil {

    SOLTEIRO,
    CASADO,
    SEPARADO,
    DIVORCIADO,
    VIUVO,
    UNIAO_ESTAVEL,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static EstadoCivil fromValue(String v) {
        return valueOf(v);
    }

}
