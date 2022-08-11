package com.spring.io.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.ci.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		
		System.out.println("inside the print method of a formatter");
		return phone.getCountrycode()+ " - "+phone.getUsernumber();
	}
  //locale is used for trasalation feature like convert geographical to local ex:french into local
	@Override
	public Phone parse(String completePhonenumber, Locale locale) throws ParseException {
		
		System.out.println("inside parse method of phonenumber formatter");
		
		
		Phone phone=new Phone();
		//split the string received from the user
				String[] phoneNumberArray = completePhonenumber.split("-");
		//wheather number consist of "-"
		int index = completePhonenumber.indexOf('-');
		
		if(index == -1) {
			
		}
		
		//if the "-" is not found add 91 as a default country code
		
		//exract the country code and set it to phone class coun try code property
		phone.setCountrycode("91");
		phone.setUsernumber(phoneNumberArray[1]);
		
		
			//extract the country code and set it to phone class country code property
		
		return phone;
		
	}
		
	}
	


