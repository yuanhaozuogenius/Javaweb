package com.spring.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgevaliDator implements ConstraintValidator<Age, Integer> {
	//i can work postconstruct work here
	private int lower;  //30
	private int upper;   //71
	
	@Override
	public void initialize(Age age) {
		//i can write post construct work right here
		this.upper=age.upper();
		this.lower=age.lower();
	}
  //first initialize method then isvalid method will execute
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		
		if (age == null) {
			return false;
		}
		//i need to write logic here	
		if(age<lower || age>upper) {
			return false;  //fail
		}
		
		return true;  //pass
	}

}
