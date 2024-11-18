package com.example.demo.config;

import com.example.demo.exception.CheckImageServiceException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.soap.server.endpoint.SoapFaultDefinition;
import org.springframework.ws.soap.server.endpoint.SoapFaultMappingExceptionResolver;

import java.util.Properties;

@Configuration
public class SoapFaultConfig {

    @Bean
    public SoapFaultMappingExceptionResolver exceptionResolver() {
        SoapFaultMappingExceptionResolver resolver = new SoapFaultMappingExceptionResolver();

        SoapFaultDefinition faultDefinition = new SoapFaultDefinition();
        faultDefinition.setFaultCode(SoapFaultDefinition.SERVER);
        resolver.setDefaultFault(faultDefinition);

        Properties errorMappings = new Properties();
        errorMappings.setProperty(CheckImageServiceException.class.getName(),
                SoapFaultDefinition.SERVER.toString());
        resolver.setExceptionMappings(errorMappings);
        resolver.setOrder(1);

        return resolver;
    }
}