package com.springboot.soap.api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.soap.api.loaneligibility.CustomerRequest;
import com.springboot.soap.api.loaneligibility.CustomerResponse;


@Service
public class LoanEligibiltyService {

	public CustomerResponse checkLoanEligibility(CustomerRequest request) {
		CustomerResponse response = new CustomerResponse();
		List<String> mismatchCriteriaList = response.getCriteriaMismatch();

		if (!(request.getAge() > 30 && request.getAge() <= 60)) {
			mismatchCriteriaList.add("Person age should in between 30 to 60");
		}
		if (!(request.getYearlyIncome() > 200000)) {
			mismatchCriteriaList.add("minimum income should be more than 200000");
		}
		if (!(request.getCibilScore() > 500)) {
			mismatchCriteriaList.add("Low CIBIL Score please try after 6 month");
		}

		if (mismatchCriteriaList.size() > 0) {
			response.setApprovedAmount(0);
			response.setIsEligible(false);
		} else {
			response.setApprovedAmount(500000);
			response.setIsEligible(true);
			mismatchCriteriaList.clear();
		}
		return response;

	}
	
}
