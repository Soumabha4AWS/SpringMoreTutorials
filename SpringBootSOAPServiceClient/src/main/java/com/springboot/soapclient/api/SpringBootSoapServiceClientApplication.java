package com.springboot.soapclient.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.soapclient.api.client.SOAPClient;
import com.springboot.soapclient.api.loaneligibility.CustomerRequest;
import com.springboot.soapclient.api.loaneligibility.CustomerResponse;

@SpringBootApplication
@RestController
public class SpringBootSoapServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapServiceClientApplication.class, args);
	}

	@Autowired
	private SOAPClient client;
	
	@PostMapping("/getLoanStatus")
	public CustomerResponse invokeSoapClientToGetLoanStatus(@RequestBody CustomerRequest request) {
		return client.getLoanStatus(request);
	}
	
	@GetMapping("/checkStatus")
	public String invokeSoapClientToGetStatus() {
		return "Health OK";
	}
	
}
