
package flow.MP.EnviaEmail;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Representa uma localização geográfica de um determinado objecto através da atribuição de coordenadas.
 * 
 * <p>Java class for Geolocalizacao complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Geolocalizacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="longitude" type="{http://ebo.multiplusfidelidade.com.br/v1}CoordenadaGeografica" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://ebo.multiplusfidelidade.com.br/v1}CoordenadaGeografica" minOccurs="0"/>
 *         &lt;element name="distancia-referencia" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="unidade-medida" type="{http://ebo.multiplusfidelidade.com.br/v1}TipoReferencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Geolocalizacao", propOrder = {
    "longitude",
    "latitude",
    "distanciaReferencia",
    "unidadeMedida"
})
public class Geolocalizacao {

    protected Double longitude;
    protected Double latitude;
    @XmlElement(name = "distancia-referencia")
    protected BigDecimal distanciaReferencia;
    @XmlElement(name = "unidade-medida")
    protected TipoReferencia unidadeMedida;

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitude(Double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitude(Double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the distanciaReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistanciaReferencia() {
        return distanciaReferencia;
    }

    /**
     * Sets the value of the distanciaReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistanciaReferencia(BigDecimal value) {
        this.distanciaReferencia = value;
    }

    /**
     * Gets the value of the unidadeMedida property.
     * 
     * @return
     *     possible object is
     *     {@link TipoReferencia }
     *     
     */
    public TipoReferencia getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Sets the value of the unidadeMedida property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoReferencia }
     *     
     */
    public void setUnidadeMedida(TipoReferencia value) {
        this.unidadeMedida = value;
    }

}
