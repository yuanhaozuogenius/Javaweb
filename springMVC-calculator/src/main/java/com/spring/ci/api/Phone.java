package com.spring.ci.api;

public class Phone {

	private String countrycode;
	private String Usernumber;

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getUsernumber() {
		return Usernumber;
	}

	public void setUsernumber(String usernumber) {
		Usernumber = usernumber;
	}

	@Override
	public String toString() {
		return "Phone [countrycode=" + countrycode + ",  Usernumber=" + Usernumber + "]";
	}

}
