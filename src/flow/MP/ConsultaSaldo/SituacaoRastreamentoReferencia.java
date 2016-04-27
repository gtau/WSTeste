
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoRastreamentoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoRastreamentoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CRIADO"/>
 *     &lt;enumeration value="EM_ANDAMENTO"/>
 *     &lt;enumeration value="CANCELADO_PARCEIRO"/>
 *     &lt;enumeration value="CANCELADO_MULTIPLUS"/>
 *     &lt;enumeration value="ENTREGUE"/>
 *     &lt;enumeration value="ENTREGUE_TRANSPORTADORA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SituacaoRastreamentoReferencia")
@XmlEnum
public enum SituacaoRastreamentoReferencia {

    CRIADO,
    EM_ANDAMENTO,
    CANCELADO_PARCEIRO,
    CANCELADO_MULTIPLUS,
    ENTREGUE,
    ENTREGUE_TRANSPORTADORA;

    public String value() {
        return name();
    }

    public static SituacaoRastreamentoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
