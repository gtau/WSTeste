
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoProdutoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TipoProdutoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VOUCHER"/>
 *     &lt;enumeration value="SERVICO"/>
 *     &lt;enumeration value="FISICO"/>
 *     &lt;enumeration value="DIGITAL"/>
 *     &lt;enumeration value="MONETIZADO"/>
 *     &lt;enumeration value="CUPOM"/>
 *     &lt;enumeration value="ACUMULO"/>
 *     &lt;enumeration value="NAO_INFORMADO"/>
 *     &lt;enumeration value="PRODUTO_PADRAO"/>
 *     &lt;enumeration value="TRANSFERENCIA"/>
 *     &lt;enumeration value="DESTINO_AEREO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TipoProdutoReferencia")
@XmlEnum
public enum TipoProdutoReferencia {

    VOUCHER,
    SERVICO,
    FISICO,
    DIGITAL,
    MONETIZADO,
    CUPOM,
    ACUMULO,
    NAO_INFORMADO,
    PRODUTO_PADRAO,
    TRANSFERENCIA,
    DESTINO_AEREO;

    public String value() {
        return name();
    }

    public static TipoProdutoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
