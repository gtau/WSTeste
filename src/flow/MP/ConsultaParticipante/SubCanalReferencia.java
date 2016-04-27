
package flow.MP.ConsultaParticipante;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubCanalReferencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubCanalReferencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SoftwareExpress"/>
 *     &lt;enumeration value="Itautec"/>
 *     &lt;enumeration value="Redecard"/>
 *     &lt;enumeration value="Cielo"/>
 *     &lt;enumeration value="Getnet"/>
 *     &lt;enumeration value="MinhaConta"/>
 *     &lt;enumeration value="eCommerce"/>
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="Batch"/>
 *     &lt;enumeration value="iOS"/>
 *     &lt;enumeration value="Android"/>
 *     &lt;enumeration value="PortalParceiro"/>
 *     &lt;enumeration value="Express"/>
 *     &lt;enumeration value="BPM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubCanalReferencia")
@XmlEnum
public enum SubCanalReferencia {

    @XmlEnumValue("SoftwareExpress")
    SOFTWARE_EXPRESS("SoftwareExpress"),
    @XmlEnumValue("Itautec")
    ITAUTEC("Itautec"),
    @XmlEnumValue("Redecard")
    REDECARD("Redecard"),
    @XmlEnumValue("Cielo")
    CIELO("Cielo"),
    @XmlEnumValue("Getnet")
    GETNET("Getnet"),
    @XmlEnumValue("MinhaConta")
    MINHA_CONTA("MinhaConta"),
    @XmlEnumValue("eCommerce")
    E_COMMERCE("eCommerce"),
    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("Batch")
    BATCH("Batch"),
    @XmlEnumValue("iOS")
    I_OS("iOS"),
    @XmlEnumValue("Android")
    ANDROID("Android"),
    @XmlEnumValue("PortalParceiro")
    PORTAL_PARCEIRO("PortalParceiro"),
    @XmlEnumValue("Express")
    EXPRESS("Express"),
    BPM("BPM");
    private final String value;

    SubCanalReferencia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubCanalReferencia fromValue(String v) {
        for (SubCanalReferencia c: SubCanalReferencia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
