
package com.jwsur2.ch4.amazon;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="OfferListingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="SalePrice" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="AmountSaved" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Price" minOccurs="0"/>
 *         &lt;element name="PercentageSaved" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AvailabilityAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *                   &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                   &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IsEligibleForSuperSaverShipping" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsEligibleForPrime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "offerListingId",
    "price",
    "salePrice",
    "amountSaved",
    "percentageSaved",
    "availability",
    "availabilityAttributes",
    "isEligibleForSuperSaverShipping",
    "isEligibleForPrime"
})
@XmlRootElement(name = "OfferListing")
public class OfferListing {

    @XmlElement(name = "OfferListingId")
    protected String offerListingId;
    @XmlElement(name = "Price")
    protected Price price;
    @XmlElement(name = "SalePrice")
    protected Price salePrice;
    @XmlElement(name = "AmountSaved")
    protected Price amountSaved;
    @XmlElement(name = "PercentageSaved")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger percentageSaved;
    @XmlElement(name = "Availability")
    protected String availability;
    @XmlElement(name = "AvailabilityAttributes")
    protected OfferListing.AvailabilityAttributes availabilityAttributes;
    @XmlElement(name = "IsEligibleForSuperSaverShipping")
    protected Boolean isEligibleForSuperSaverShipping;
    @XmlElement(name = "IsEligibleForPrime")
    protected Boolean isEligibleForPrime;

    /**
     * Obtiene el valor de la propiedad offerListingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferListingId() {
        return offerListingId;
    }

    /**
     * Define el valor de la propiedad offerListingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferListingId(String value) {
        this.offerListingId = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setPrice(Price value) {
        this.price = value;
    }

    /**
     * Obtiene el valor de la propiedad salePrice.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getSalePrice() {
        return salePrice;
    }

    /**
     * Define el valor de la propiedad salePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setSalePrice(Price value) {
        this.salePrice = value;
    }

    /**
     * Obtiene el valor de la propiedad amountSaved.
     * 
     * @return
     *     possible object is
     *     {@link Price }
     *     
     */
    public Price getAmountSaved() {
        return amountSaved;
    }

    /**
     * Define el valor de la propiedad amountSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link Price }
     *     
     */
    public void setAmountSaved(Price value) {
        this.amountSaved = value;
    }

    /**
     * Obtiene el valor de la propiedad percentageSaved.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentageSaved() {
        return percentageSaved;
    }

    /**
     * Define el valor de la propiedad percentageSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentageSaved(BigInteger value) {
        this.percentageSaved = value;
    }

    /**
     * Obtiene el valor de la propiedad availability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * Define el valor de la propiedad availability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(String value) {
        this.availability = value;
    }

    /**
     * Obtiene el valor de la propiedad availabilityAttributes.
     * 
     * @return
     *     possible object is
     *     {@link OfferListing.AvailabilityAttributes }
     *     
     */
    public OfferListing.AvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }

    /**
     * Define el valor de la propiedad availabilityAttributes.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferListing.AvailabilityAttributes }
     *     
     */
    public void setAvailabilityAttributes(OfferListing.AvailabilityAttributes value) {
        this.availabilityAttributes = value;
    }

    /**
     * Obtiene el valor de la propiedad isEligibleForSuperSaverShipping.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }

    /**
     * Define el valor de la propiedad isEligibleForSuperSaverShipping.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForSuperSaverShipping(Boolean value) {
        this.isEligibleForSuperSaverShipping = value;
    }

    /**
     * Obtiene el valor de la propiedad isEligibleForPrime.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEligibleForPrime() {
        return isEligibleForPrime;
    }

    /**
     * Define el valor de la propiedad isEligibleForPrime.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEligibleForPrime(Boolean value) {
        this.isEligibleForPrime = value;
    }


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
     *         &lt;element name="AvailabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="IsPreorder" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
     *         &lt;element name="MinimumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *         &lt;element name="MaximumHours" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
        "availabilityType",
        "isPreorder",
        "minimumHours",
        "maximumHours"
    })
    public static class AvailabilityAttributes {

        @XmlElement(name = "AvailabilityType")
        protected String availabilityType;
        @XmlElement(name = "IsPreorder")
        protected Boolean isPreorder;
        @XmlElement(name = "MinimumHours")
        protected BigInteger minimumHours;
        @XmlElement(name = "MaximumHours")
        protected BigInteger maximumHours;

        /**
         * Obtiene el valor de la propiedad availabilityType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailabilityType() {
            return availabilityType;
        }

        /**
         * Define el valor de la propiedad availabilityType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailabilityType(String value) {
            this.availabilityType = value;
        }

        /**
         * Obtiene el valor de la propiedad isPreorder.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsPreorder() {
            return isPreorder;
        }

        /**
         * Define el valor de la propiedad isPreorder.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsPreorder(Boolean value) {
            this.isPreorder = value;
        }

        /**
         * Obtiene el valor de la propiedad minimumHours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumHours() {
            return minimumHours;
        }

        /**
         * Define el valor de la propiedad minimumHours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumHours(BigInteger value) {
            this.minimumHours = value;
        }

        /**
         * Obtiene el valor de la propiedad maximumHours.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumHours() {
            return maximumHours;
        }

        /**
         * Define el valor de la propiedad maximumHours.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumHours(BigInteger value) {
            this.maximumHours = value;
        }

    }

}
