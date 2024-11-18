package com.example.demo.exception;

import org.springframework.stereotype.Component;
import org.springframework.ws.soap.SoapFault;
import org.springframework.ws.soap.SoapFaultDetail;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import javax.xml.namespace.QName;

@Component
public class DetailSoapFaultDefinitionExceptionResolver extends SoapFaultMappingExceptionResolver {

    @Override
    protected void customizeFault(Object endpoint, Exception ex, SoapFault fault) {
        if (ex instanceof CheckImageServiceException) {
            SoapFaultDetail detail = fault.addFaultDetail();
            detail.addFaultDetailElement(new QName("http://localhost/ws", "CheckImageFault"))
                    .addText(ex.getMessage());
        }
    }
}