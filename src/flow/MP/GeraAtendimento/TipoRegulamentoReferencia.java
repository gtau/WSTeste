
package flow.MP.GeraAtendimento;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoRegulamentoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoRegulamentoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PRINCIPAL"/>
 *     &lt;enumeration value="PROMOCAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoRegulamentoReferencia")
@XmlEnum
public enum TipoRegulamentoReferencia {

    PRINCIPAL,
    PROMOCAO;

    public String value() {
        return name();
    }

    public static TipoRegulamentoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
