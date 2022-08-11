

package com.springmvc.lc.Controllers;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.ci.api.CommunicationDTO;
import com.spring.ci.api.Phone;
import com.spring.ci.api.UserRegistrationDTO;
import com.spring.lc.validator.EmailValidator;
import com.spring.lc.validator.UserNameValidator;

@Controller
public class RegistrationController {

	@RequestMapping("/Register")
	public String showRegistrationpage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

		// UserRegistrationDTO dto=new UserRegistrationDTO();
		//dto.setName("vamshi");
		//dto.setUsername("vamshi123");
  
		System.out.println("inside showregistration page");
		
		//load the saved the user data from the data base
		Phone phone=new Phone();
		phone.setCountrycode("+1");
		phone.setUsernumber("914914914");
		
		CommunicationDTO comdto=new CommunicationDTO();
		comdto.setPhone(phone);
		
		dto.setComunicationDTO(comdto);
		// model.addAttribute("Regval",dto );

		return "user-registration-page";

	}
// what ever user enter i want show them all
	@RequestMapping("/registreation-success")
	public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto,BindingResult result) {
		
		
		System.out.println("user name value enterd by user is" + " |"+dto.getUsername()+"|");
		if(result.hasErrors()) {
			
			System.out.println("My page has errors");
			
			List<ObjectError> allerrors = result.getAllErrors();
			
			for(ObjectError error:allerrors) {
				
				System.out.println(error);
			}
			return "user-registration-page";
		}
		
		System.out.println("inside processreg page method"+dto.getAge());
		
		//saved the dto object in the data base
		
	return "registreation-success";

	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		
		System.out.println("inside init method");
		//binder.setDisallowedFields("username");
		
		StringTrimmerEditor editor=new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,"username", editor);
		
		UserNameValidator validator=new UserNameValidator();
		binder.addValidators(validator);
		
		EmailValidator validator2=new EmailValidator();
		binder.addValidators(validator2);
		
		
	}

}
