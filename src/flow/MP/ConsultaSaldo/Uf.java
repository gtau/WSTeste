
package flow.MP.ConsultaSaldo;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Uf.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Uf">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AL"/>
 *     &lt;enumeration value="AP"/>
 *     &lt;enumeration value="AM"/>
 *     &lt;enumeration value="BA"/>
 *     &lt;enumeration value="CE"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="GO"/>
 *     &lt;enumeration value="MA"/>
 *     &lt;enumeration value="MT"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MG"/>
 *     &lt;enumeration value="PA"/>
 *     &lt;enumeration value="PB"/>
 *     &lt;enumeration value="PR"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PI"/>
 *     &lt;enumeration value="RJ"/>
 *     &lt;enumeration value="RN"/>
 *     &lt;enumeration value="RS"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RR"/>
 *     &lt;enumeration value="SC"/>
 *     &lt;enumeration value="SP"/>
 *     &lt;enumeration value="SE"/>
 *     &lt;enumeration value="TO"/>
 *     &lt;enumeration value="DF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Uf")
@XmlEnum
public enum Uf {

    AC,
    AL,
    AP,
    AM,
    BA,
    CE,
    ES,
    GO,
    MA,
    MT,
    MS,
    MG,
    PA,
    PB,
    PR,
    PE,
    PI,
    RJ,
    RN,
    RS,
    RO,
    RR,
    SC,
    SP,
    SE,
    TO,
    DF;

    public String value() {
        return name();
    }

    public static Uf fromValue(String v) {
        return valueOf(v);
    }

}
