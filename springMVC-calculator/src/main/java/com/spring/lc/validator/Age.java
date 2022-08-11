package com.spring.lc.validator;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Retention(RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = AgevaliDator.class)
public @interface Age {
	
	//String message() default "age should be between {lower}-{upper}";
	
	String message() default "{invalidAgeMessage}";
	int lower() default 18;
	
	int upper() default 60;
	

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
