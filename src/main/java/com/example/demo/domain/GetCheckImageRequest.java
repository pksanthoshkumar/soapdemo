
package com.example.demo.domain;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="requestHeader" type="{http://localhost/ws}RequestHeaderType"/&gt;
 *         &lt;element name="accountData" type="{http://localhost/ws}AccountDataType"/&gt;
 *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="includeBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="checkIssueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="documentImageNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestHeader",
    "accountData",
    "serialNumber",
    "includeBack",
    "amount",
    "payeeName",
    "checkIssueDate",
    "documentImageNumber"
})
@XmlRootElement(name = "getCheckImageRequest")
public class GetCheckImageRequest {

    @XmlElement(required = true)
    protected RequestHeaderType requestHeader;
    @XmlElement(required = true)
    protected AccountDataType accountData;
    @XmlElement(required = true)
    protected String serialNumber;
    protected boolean includeBack;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected String payeeName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar checkIssueDate;
    @XmlElement(required = true)
    protected String documentImageNumber;

    /**
     * Gets the value of the requestHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RequestHeaderType }
     *     
     */
    public RequestHeaderType getRequestHeader() {
        return requestHeader;
    }

    /**
     * Sets the value of the requestHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestHeaderType }
     *     
     */
    public void setRequestHeader(RequestHeaderType value) {
        this.requestHeader = value;
    }

    /**
     * Gets the value of the accountData property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDataType }
     *     
     */
    public AccountDataType getAccountData() {
        return accountData;
    }

    /**
     * Sets the value of the accountData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDataType }
     *     
     */
    public void setAccountData(AccountDataType value) {
        this.accountData = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the includeBack property.
     * 
     */
    public boolean isIncludeBack() {
        return includeBack;
    }

    /**
     * Sets the value of the includeBack property.
     * 
     */
    public void setIncludeBack(boolean value) {
        this.includeBack = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the checkIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckIssueDate() {
        return checkIssueDate;
    }

    /**
     * Sets the value of the checkIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckIssueDate(XMLGregorianCalendar value) {
        this.checkIssueDate = value;
    }

    /**
     * Gets the value of the documentImageNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentImageNumber() {
        return documentImageNumber;
    }

    /**
     * Sets the value of the documentImageNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentImageNumber(String value) {
        this.documentImageNumber = value;
    }

}
