
package com.example.demo.domain;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.demo.domain package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.demo.domain
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserDataType }
     * 
     */
    public UserDataType createUserDataType() {
        return new UserDataType();
    }

    /**
     * Create an instance of {@link GetCheckImageRequest }
     * 
     */
    public GetCheckImageRequest createGetCheckImageRequest() {
        return new GetCheckImageRequest();
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link AccountDataType }
     * 
     */
    public AccountDataType createAccountDataType() {
        return new AccountDataType();
    }

    /**
     * Create an instance of {@link GetCheckImageResponse }
     * 
     */
    public GetCheckImageResponse createGetCheckImageResponse() {
        return new GetCheckImageResponse();
    }

    /**
     * Create an instance of {@link RequestUserType }
     * 
     */
    public RequestUserType createRequestUserType() {
        return new RequestUserType();
    }

    /**
     * Create an instance of {@link UserDataType.Item }
     * 
     */
    public UserDataType.Item createUserDataTypeItem() {
        return new UserDataType.Item();
    }

}
