
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetalhesSituacaoPedidoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DetalhesSituacaoPedidoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ESTOQUE_INDISPONIVEL"/>
 *     &lt;enumeration value="ENTREGA_RECUSADA_DESTINATARIO"/>
 *     &lt;enumeration value="ENDERECO_ENTREGA_INCORRETO"/>
 *     &lt;enumeration value="DESTINATARIO_AUSENTE"/>
 *     &lt;enumeration value="SLA_COMPROMETIDO"/>
 *     &lt;enumeration value="SUSPEITA_FRAUDE"/>
 *     &lt;enumeration value="PARCEIRO_DESCREDENCIADO"/>
 *     &lt;enumeration value="SOLICITACAO_PARTICIPANTE"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DetalhesSituacaoPedidoReferencia")
@XmlEnum
public enum DetalhesSituacaoPedidoReferencia {

    ESTOQUE_INDISPONIVEL,
    ENTREGA_RECUSADA_DESTINATARIO,
    ENDERECO_ENTREGA_INCORRETO,
    DESTINATARIO_AUSENTE,
    SLA_COMPROMETIDO,
    SUSPEITA_FRAUDE,
    PARCEIRO_DESCREDENCIADO,
    SOLICITACAO_PARTICIPANTE,
    NAO_INFORMADO;

    public String value() {
        return name();
    }

    public static DetalhesSituacaoPedidoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
