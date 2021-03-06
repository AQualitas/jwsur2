
package com.jwsur2.ch4.amazon;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="MarketplaceDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AWSAccessKeyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AssociateTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Validate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XMLEscaping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shared" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartClearRequest" minOccurs="0"/>
 *         &lt;element name="Request" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartClearRequest" maxOccurs="unbounded" minOccurs="0"/>
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
    "marketplaceDomain",
    "awsAccessKeyId",
    "associateTag",
    "validate",
    "xmlEscaping",
    "shared",
    "request"
})
@XmlRootElement(name = "CartClear")
public class CartClear {

    @XmlElement(name = "MarketplaceDomain")
    protected String marketplaceDomain;
    @XmlElement(name = "AWSAccessKeyId")
    protected String awsAccessKeyId;
    @XmlElement(name = "AssociateTag")
    protected String associateTag;
    @XmlElement(name = "Validate")
    protected String validate;
    @XmlElement(name = "XMLEscaping")
    protected String xmlEscaping;
    @XmlElement(name = "Shared")
    protected CartClearRequest shared;
    @XmlElement(name = "Request")
    protected List<CartClearRequest> request;

    /**
     * Obtiene el valor de la propiedad marketplaceDomain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketplaceDomain() {
        return marketplaceDomain;
    }

    /**
     * Define el valor de la propiedad marketplaceDomain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketplaceDomain(String value) {
        this.marketplaceDomain = value;
    }

    /**
     * Obtiene el valor de la propiedad awsAccessKeyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAWSAccessKeyId() {
        return awsAccessKeyId;
    }

    /**
     * Define el valor de la propiedad awsAccessKeyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAWSAccessKeyId(String value) {
        this.awsAccessKeyId = value;
    }

    /**
     * Obtiene el valor de la propiedad associateTag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociateTag() {
        return associateTag;
    }

    /**
     * Define el valor de la propiedad associateTag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociateTag(String value) {
        this.associateTag = value;
    }

    /**
     * Obtiene el valor de la propiedad validate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidate() {
        return validate;
    }

    /**
     * Define el valor de la propiedad validate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidate(String value) {
        this.validate = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlEscaping.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLEscaping() {
        return xmlEscaping;
    }

    /**
     * Define el valor de la propiedad xmlEscaping.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLEscaping(String value) {
        this.xmlEscaping = value;
    }

    /**
     * Obtiene el valor de la propiedad shared.
     * 
     * @return
     *     possible object is
     *     {@link CartClearRequest }
     *     
     */
    public CartClearRequest getShared() {
        return shared;
    }

    /**
     * Define el valor de la propiedad shared.
     * 
     * @param value
     *     allowed object is
     *     {@link CartClearRequest }
     *     
     */
    public void setShared(CartClearRequest value) {
        this.shared = value;
    }

    /**
     * Gets the value of the request property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the request property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CartClearRequest }
     * 
     * 
     */
    public List<CartClearRequest> getRequest() {
        if (request == null) {
            request = new ArrayList<CartClearRequest>();
        }
        return this.request;
    }

}
