
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CaracteristicaCategoriaVeiculoReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CaracteristicaCategoriaVeiculoReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="QTD_PASSAGEIROS"/>
 *     &lt;enumeration value="QTD_BAGAGENS"/>
 *     &lt;enumeration value="IND_AR_CONDICIONADO"/>
 *     &lt;enumeration value="IND_DIRECAO_AUTO"/>
 *     &lt;enumeration value="IND_TRANSMISSAO_AUTO"/>
 *     &lt;enumeration value="IND_AIR_BAG"/>
 *     &lt;enumeration value="IND_FREIO_ABS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CaracteristicaCategoriaVeiculoReferencia")
@XmlEnum
public enum CaracteristicaCategoriaVeiculoReferencia {

    QTD_PASSAGEIROS,
    QTD_BAGAGENS,
    IND_AR_CONDICIONADO,
    IND_DIRECAO_AUTO,
    IND_TRANSMISSAO_AUTO,
    IND_AIR_BAG,
    IND_FREIO_ABS;

    public String value() {
        return name();
    }

    public static CaracteristicaCategoriaVeiculoReferencia fromValue(String v) {
        return valueOf(v);
    }

}
