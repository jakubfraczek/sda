
package com.user.main;

public class Address {

	private String streetName;
	private String streetNumber;
	private String homeNumber;
	private String cityName;
	private String cityPostCode;

	public Address(String streetName, String streetNumber, String homeNumber, String cityName, String cityPostCode) {
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.homeNumber = homeNumber;
		this.cityName = cityName;
		this.cityPostCode = cityPostCode;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCityPostCode() {
		return cityPostCode;
	}

	public void setCityPostCode(String cityPostCode) {
		this.cityPostCode = cityPostCode;
	}

	@Override
	public String toString() {
		return "ul. " + streetName + " " + streetNumber + " m. " + homeNumber
				+ "\n " + cityName + ", " + cityPostCode;
	}
	
	

}
