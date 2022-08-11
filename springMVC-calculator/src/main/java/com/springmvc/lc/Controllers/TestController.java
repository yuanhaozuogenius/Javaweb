

package com.springmvc.lc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	//@ResponseBody
	@RequestMapping("/Test")
	public String testing() {
		return "Hello-world";
		
	}

}

