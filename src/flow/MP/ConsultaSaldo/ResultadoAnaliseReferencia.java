
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResultadoAnaliseReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResultadoAnaliseReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APROVADO"/>
 *     &lt;enumeration value="REPROVADO"/>
 *     &lt;enumeration value="EM_ANALISE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResultadoAnaliseReferencia")
@XmlEnum
public enum ResultadoAnaliseReferencia {

    APROVADO,
    REPROVADO,
    EM_ANALISE;

    public String value() {
        return name();
    }

    public static ResultadoAnaliseReferencia fromValue(String v) {
        return valueOf(v);
    }

}
