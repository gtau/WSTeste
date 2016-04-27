
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SituacaoPedidoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SituacaoPedidoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTORIZADO"/>
 *     &lt;enumeration value="PENDENTE"/>
 *     &lt;enumeration value="PROCESSAMENTO"/>
 *     &lt;enumeration value="ENTREGA"/>
 *     &lt;enumeration value="CONCLUIDO"/>
 *     &lt;enumeration value="REJEITADO"/>
 *     &lt;enumeration value="CANCELADO"/>
 *     &lt;enumeration value="FALHA_ENTREGA"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
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
@XmlType(name = "SituacaoPedidoReferencia")
@XmlEnum
public enum SituacaoPedidoReferencia {

    AUTORIZADO,
    PENDENTE,
    PROCESSAMENTO,
    ENTREGA,
    CONCLUIDO,
    REJEITADO,
    CANCELADO,
    FALHA_ENTREGA,
    NAO_INFORMADO,
    CRIADO,
    EM_ANDAMENTO,
    CANCELADO_PARCEIRO,
    CANCELADO_MULTIPLUS,
    ENTREGUE,
    ENTREGUE_TRANSPORTADORA;

    public String value() {
        return name();
    }

    public static SituacaoPedidoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
