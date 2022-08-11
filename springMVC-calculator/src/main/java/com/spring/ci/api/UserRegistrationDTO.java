package com.spring.ci.api;

import javax.validation.constraints.NotEmpty;

import com.spring.lc.validator.Age;

public class UserRegistrationDTO {

	private String name;
	
	@NotEmpty(message = "* can not be empty")
	private String username;
	private char[] password;
	private String countryName;
	private String[] hobbies;
	private String gender;
	
	@Age(lower = 33,upper = 77)  //(lower = 30,upper = 71,message = "age between 30-71")
	private Integer age;
	
	private CommunicationDTO comunicationDTO;
	

	

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public CommunicationDTO getComunicationDTO() {
		return comunicationDTO;
	}

	public void setComunicationDTO(CommunicationDTO comunicationDTO) {
		this.comunicationDTO = comunicationDTO;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	

}
