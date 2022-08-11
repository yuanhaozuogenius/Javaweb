package com.spring.lc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.ci.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {
	
	//check if the username validator supports a givenobject

	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}
 //we need to write our custom validation logic
	@Override
	public void validate(Object object, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.empty", "name cannot be empty");
	

	//the string should contain _
		String name=((UserRegistrationDTO)object).getName();
		
		if(!name.contains("_")) {
			
			errors.rejectValue("name", "name.invalidstring", "string must contains _");
		}
	
}        
}
