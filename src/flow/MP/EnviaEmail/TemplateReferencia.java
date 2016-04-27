
package flow.MP.EnviaEmail;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TemplateReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TemplateReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESQUECI_MEU_NUMERO_MULTIPLUS"/>
 *     &lt;enumeration value="ACUMULO_COMPRA_PONTOS"/>
 *     &lt;enumeration value="EXTRATO_PARTICIPANTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TemplateReferencia")
@XmlEnum
public enum TemplateReferencia {

    ESQUECI_MEU_NUMERO_MULTIPLUS,
    ACUMULO_COMPRA_PONTOS,
    EXTRATO_PARTICIPANTE;

    public String value() {
        return name();
    }

    public static TemplateReferencia fromValue(String v) {
        return valueOf(v);
    }

}
