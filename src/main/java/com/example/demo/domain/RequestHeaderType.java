
package com.example.demo.domain;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="requestUser" type="{http://localhost/ws}RequestUserType"/&gt;
 *         &lt;element name="originatingService" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", propOrder = {
    "requestId",
    "requestUser",
    "originatingService"
})
public class RequestHeaderType {

    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(required = true)
    protected RequestUserType requestUser;
    @XmlElement(required = true)
    protected String originatingService;

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestUser property.
     * 
     * @return
     *     possible object is
     *     {@link RequestUserType }
     *     
     */
    public RequestUserType getRequestUser() {
        return requestUser;
    }

    /**
     * Sets the value of the requestUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestUserType }
     *     
     */
    public void setRequestUser(RequestUserType value) {
        this.requestUser = value;
    }

    /**
     * Gets the value of the originatingService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatingService() {
        return originatingService;
    }

    /**
     * Sets the value of the originatingService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatingService(String value) {
        this.originatingService = value;
    }

}
