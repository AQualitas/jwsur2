
package com.jwsur2.ch4.amazon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IFrameURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HasReviews" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "iFrameURL",
    "hasReviews"
})
@XmlRootElement(name = "CustomerReviews")
public class CustomerReviews {

    @XmlElement(name = "IFrameURL")
    protected String iFrameURL;
    @XmlElement(name = "HasReviews")
    protected Boolean hasReviews;

    /**
     * Obtiene el valor de la propiedad iFrameURL.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIFrameURL() {
        return iFrameURL;
    }

    /**
     * Define el valor de la propiedad iFrameURL.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIFrameURL(String value) {
        this.iFrameURL = value;
    }

    /**
     * Obtiene el valor de la propiedad hasReviews.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasReviews() {
        return hasReviews;
    }

    /**
     * Define el valor de la propiedad hasReviews.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasReviews(Boolean value) {
        this.hasReviews = value;
    }

}
