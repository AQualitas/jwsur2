
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
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrowseNodeLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}BrowseNodeLookupRequest" minOccurs="0"/>
 *         &lt;element name="ItemSearchRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}ItemSearchRequest" minOccurs="0"/>
 *         &lt;element name="ItemLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}ItemLookupRequest" minOccurs="0"/>
 *         &lt;element name="SimilarityLookupRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}SimilarityLookupRequest" minOccurs="0"/>
 *         &lt;element name="CartGetRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartGetRequest" minOccurs="0"/>
 *         &lt;element name="CartAddRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartAddRequest" minOccurs="0"/>
 *         &lt;element name="CartCreateRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartCreateRequest" minOccurs="0"/>
 *         &lt;element name="CartModifyRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartModifyRequest" minOccurs="0"/>
 *         &lt;element name="CartClearRequest" type="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}CartClearRequest" minOccurs="0"/>
 *         &lt;element ref="{http://webservices.amazon.com/AWSECommerceService/2011-08-01}Errors" minOccurs="0"/>
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
    "isValid",
    "browseNodeLookupRequest",
    "itemSearchRequest",
    "itemLookupRequest",
    "similarityLookupRequest",
    "cartGetRequest",
    "cartAddRequest",
    "cartCreateRequest",
    "cartModifyRequest",
    "cartClearRequest",
    "errors"
})
@XmlRootElement(name = "Request")
public class Request {

    @XmlElement(name = "IsValid")
    protected String isValid;
    @XmlElement(name = "BrowseNodeLookupRequest")
    protected BrowseNodeLookupRequest browseNodeLookupRequest;
    @XmlElement(name = "ItemSearchRequest")
    protected ItemSearchRequest itemSearchRequest;
    @XmlElement(name = "ItemLookupRequest")
    protected ItemLookupRequest itemLookupRequest;
    @XmlElement(name = "SimilarityLookupRequest")
    protected SimilarityLookupRequest similarityLookupRequest;
    @XmlElement(name = "CartGetRequest")
    protected CartGetRequest cartGetRequest;
    @XmlElement(name = "CartAddRequest")
    protected CartAddRequest cartAddRequest;
    @XmlElement(name = "CartCreateRequest")
    protected CartCreateRequest cartCreateRequest;
    @XmlElement(name = "CartModifyRequest")
    protected CartModifyRequest cartModifyRequest;
    @XmlElement(name = "CartClearRequest")
    protected CartClearRequest cartClearRequest;
    @XmlElement(name = "Errors")
    protected Errors errors;

    /**
     * Obtiene el valor de la propiedad isValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsValid() {
        return isValid;
    }

    /**
     * Define el valor de la propiedad isValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsValid(String value) {
        this.isValid = value;
    }

    /**
     * Obtiene el valor de la propiedad browseNodeLookupRequest.
     * 
     * @return
     *     possible object is
     *     {@link BrowseNodeLookupRequest }
     *     
     */
    public BrowseNodeLookupRequest getBrowseNodeLookupRequest() {
        return browseNodeLookupRequest;
    }

    /**
     * Define el valor de la propiedad browseNodeLookupRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link BrowseNodeLookupRequest }
     *     
     */
    public void setBrowseNodeLookupRequest(BrowseNodeLookupRequest value) {
        this.browseNodeLookupRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad itemSearchRequest.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRequest }
     *     
     */
    public ItemSearchRequest getItemSearchRequest() {
        return itemSearchRequest;
    }

    /**
     * Define el valor de la propiedad itemSearchRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRequest }
     *     
     */
    public void setItemSearchRequest(ItemSearchRequest value) {
        this.itemSearchRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad itemLookupRequest.
     * 
     * @return
     *     possible object is
     *     {@link ItemLookupRequest }
     *     
     */
    public ItemLookupRequest getItemLookupRequest() {
        return itemLookupRequest;
    }

    /**
     * Define el valor de la propiedad itemLookupRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemLookupRequest }
     *     
     */
    public void setItemLookupRequest(ItemLookupRequest value) {
        this.itemLookupRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad similarityLookupRequest.
     * 
     * @return
     *     possible object is
     *     {@link SimilarityLookupRequest }
     *     
     */
    public SimilarityLookupRequest getSimilarityLookupRequest() {
        return similarityLookupRequest;
    }

    /**
     * Define el valor de la propiedad similarityLookupRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SimilarityLookupRequest }
     *     
     */
    public void setSimilarityLookupRequest(SimilarityLookupRequest value) {
        this.similarityLookupRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad cartGetRequest.
     * 
     * @return
     *     possible object is
     *     {@link CartGetRequest }
     *     
     */
    public CartGetRequest getCartGetRequest() {
        return cartGetRequest;
    }

    /**
     * Define el valor de la propiedad cartGetRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartGetRequest }
     *     
     */
    public void setCartGetRequest(CartGetRequest value) {
        this.cartGetRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad cartAddRequest.
     * 
     * @return
     *     possible object is
     *     {@link CartAddRequest }
     *     
     */
    public CartAddRequest getCartAddRequest() {
        return cartAddRequest;
    }

    /**
     * Define el valor de la propiedad cartAddRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartAddRequest }
     *     
     */
    public void setCartAddRequest(CartAddRequest value) {
        this.cartAddRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad cartCreateRequest.
     * 
     * @return
     *     possible object is
     *     {@link CartCreateRequest }
     *     
     */
    public CartCreateRequest getCartCreateRequest() {
        return cartCreateRequest;
    }

    /**
     * Define el valor de la propiedad cartCreateRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartCreateRequest }
     *     
     */
    public void setCartCreateRequest(CartCreateRequest value) {
        this.cartCreateRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad cartModifyRequest.
     * 
     * @return
     *     possible object is
     *     {@link CartModifyRequest }
     *     
     */
    public CartModifyRequest getCartModifyRequest() {
        return cartModifyRequest;
    }

    /**
     * Define el valor de la propiedad cartModifyRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartModifyRequest }
     *     
     */
    public void setCartModifyRequest(CartModifyRequest value) {
        this.cartModifyRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad cartClearRequest.
     * 
     * @return
     *     possible object is
     *     {@link CartClearRequest }
     *     
     */
    public CartClearRequest getCartClearRequest() {
        return cartClearRequest;
    }

    /**
     * Define el valor de la propiedad cartClearRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link CartClearRequest }
     *     
     */
    public void setCartClearRequest(CartClearRequest value) {
        this.cartClearRequest = value;
    }

    /**
     * Obtiene el valor de la propiedad errors.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Define el valor de la propiedad errors.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

}
