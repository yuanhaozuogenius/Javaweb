package com.spring.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.ci.api.UserRegistrationDTO;

public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.
		rejectIfEmptyOrWhitespace(errors, "comunicationDTO.email", "email.empty","Email cannot be blank");
		
		//emails ending with seleniumexprees.com
		
		String email=((UserRegistrationDTO)target).getComunicationDTO().getEmail();
		
		if(!email.endsWith("seleniumexpress.com")) {
			
			errors.rejectValue("comunicationDTO.email", "email.InvalidDomain","Email is ending with seleniumexpress.com");
		}

	}

}
