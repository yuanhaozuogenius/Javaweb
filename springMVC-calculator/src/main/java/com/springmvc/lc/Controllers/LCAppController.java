package com.springmvc.lc.Controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ci.api.UserInfoDTO;

@Controller
public class LCAppController {

	//@ResponseBody
	@RequestMapping("/")
	public String showhomepage(@ModelAttribute("userInfo") UserInfoDTO userInfoDtO) {
	
	
	return "home-page";

	}
	

	//@RequestMapping("/process-homepage")
//	public String showresultpage(@RequestParam("username") String username1,
//			@RequestParam("crushname") String crushname1, Model model) {
	
  //@valid annotation is help us to trigger the validation for this bean(USERInfoDTO)
	    @RequestMapping("/process-homepage")
     public String showresultpage(@Valid @ModelAttribute("userinfo") UserInfoDTO userInfoDTO,BindingResult result) {
     
	   System.out.println(userInfoDTO.isTermandCondition()); 	
	   // 	System.out.println("use"+userInfoDTO.getUsername());
	    	
		if(result.hasErrors()) {
			//System.out.println("my form has errors");
			
			
			List<ObjectError> allerrors = result.getAllErrors();
			
			for(ObjectError temp : allerrors) {
				System.out.println(temp);
				
			}
			
			return "home-page";
		}
		
		return "result-page";
		
		
		// writing the values to the properties by fetching from the url
		//System.out.println("user name is" + userInfoDTO.getUsername());
		//System.out.println("crushname is" + userInfoDTO.getCrushname());
		// here we are bind url parameters with string parameters

		// model.addAttribute("username", username1);
		// model.addAttribute("crushname", crushname1);

		//model.addAttribute("userinfo", userInfoDTO);

		
	}
	
	

}
