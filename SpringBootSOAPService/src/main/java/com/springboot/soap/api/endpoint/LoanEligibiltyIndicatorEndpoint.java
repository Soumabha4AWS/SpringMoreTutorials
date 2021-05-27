package com.springboot.soap.api.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.springboot.soap.api.loaneligibility.CustomerRequest;
import com.springboot.soap.api.loaneligibility.CustomerResponse;
import com.springboot.soap.api.service.LoanEligibiltyService;

@Endpoint
public class LoanEligibiltyIndicatorEndpoint {
	
	private static final String NAMESPACE = "http://www.springboot.com/soap/api/loanEligibility";
	
	@Autowired
	private LoanEligibiltyService service;

	@PayloadRoot(namespace = NAMESPACE, localPart = "CustomerRequest")
	@ResponsePayload
	public CustomerResponse getLoanStatus(@RequestPayload CustomerRequest request) {
		return service.checkLoanEligibility(request);
	}

}
