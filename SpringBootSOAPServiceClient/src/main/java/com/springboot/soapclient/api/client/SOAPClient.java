package com.springboot.soapclient.api.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.springboot.soapclient.api.loaneligibility.CustomerRequest;
import com.springboot.soapclient.api.loaneligibility.CustomerResponse;


@Service
public class SOAPClient {

	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;
	
	public CustomerResponse getLoanStatus(CustomerRequest request) {
		template = new WebServiceTemplate(marshaller);
		CustomerResponse customerResponse = (CustomerResponse) template.marshalSendAndReceive("http://localhost:8089/ws",
				request);
		return customerResponse;
	}
	
}
