package com.spring.ci.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//@Component
public class UserInfoDTO {

	// DTO STANDS FOR DATA TRANSFER OBJECT
	@NotBlank(message = "* user name cannot be blank")
	//@Min(value = 3, message = "*your name should have atleat three charecters")
	@Size(min=3,max=15,message = "*your name should have 3-15 charecters")
	private String username;

	
	@NotBlank(message = "* crushname cannot be blank")
	@Size(min=3,max=15,message = "*your crushname should have 3-15 charecters")
	private String crushname;
	

	@AssertTrue(message="* agree to use our app")
	private boolean termandCondition;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCrushname() {
		return crushname;
	}

	public void setCrushname(String crushname) {
		this.crushname = crushname;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [username=" + username + ", crushname=" + crushname + "]";
	}

	public boolean isTermandCondition() {
		return termandCondition;
	}

	public void setTermandCondition(boolean termandCondition) {
		this.termandCondition = termandCondition;
	}

}
