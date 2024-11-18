package com.example.demo.endpoint;


import com.example.demo.domain.AccountDataType;
import com.example.demo.domain.GetCheckImageRequest;
import com.example.demo.domain.GetCheckImageResponse;
import com.example.demo.domain.RequestHeaderType;
import com.example.demo.exception.CheckImageServiceException;
import org.springframework.util.StringUtils;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.ArrayList;
import java.util.List;

@Endpoint
public class CheckImageEndpoint {
    private static final String NAMESPACE_URI = "http://localhost/ws";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCheckImageRequest")
    @ResponsePayload
    public GetCheckImageResponse handleRequest(@RequestPayload GetCheckImageRequest request) {
        // Validate request
        //validateRequest(request);

        // Create response
        GetCheckImageResponse response = new GetCheckImageResponse();

        // Log the incoming request details
        System.out.println("Received request for account: " +
                request.getAccountData().getAccountNumber());

        // Set response values
        response.setImageUrl("http://example.com/images/" +
                request.getDocumentImageNumber());
        response.setImageFormat("PDF");

        return response;
    }

    /*private void validateRequest(GetCheckImageRequest request) {
        List<String> errors = new ArrayList<>();

        if (request == null) {
            throw new CheckImageServiceException("Request cannot be null");
        }

        // Validate AccountData
        if (request.getAccountData() == null) {
            throw new CheckImageServiceException("AccountData cannot be null");
        }

        AccountDataType accountData = request.getAccountData();
        if (StringUtils.hasLength(accountData.getAccountNumber())) {
            errors.add("Account number is required");
        }
        if (StringUtils.hasLength(accountData.getBankCode())) {
            errors.add("Bank code is required");
        }

        // Validate RequestHeader
        if (request.getRequestHeader() == null) {
            throw new CheckImageServiceException("RequestHeader cannot be null");
        }

        RequestHeaderType header = request.getRequestHeader();
        if (StringUtils.hasLength(header.getRequestId())) {
            errors.add("Request ID is required");
        }

        // Validate other required fields
        if (StringUtils.hasLength(request.getDocumentImageNumber())) {
            errors.add("Document image number is required");
        }
        if (request.getCheckIssueDate() == null) {
            errors.add("Check issue date is required");
        }

        // If there are any validation errors, throw an exception
        if (!errors.isEmpty()) {
            throw new CheckImageServiceException("Validation failed: " + String.join(", ", errors));
        }
    }*/
}
