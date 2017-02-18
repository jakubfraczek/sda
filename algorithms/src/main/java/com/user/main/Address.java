
package com.user.main;

public class Address {

	private String streetName;
	private int streetNumber;
	private int homeNumber;
	private String cityName;
	private String cityPostCode;

	public Address(String streetName, int streetNumber, int homeNumber, String cityName, String cityPostCode) {
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

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public int getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(int homeNumber) {
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
		return streetName + " " + streetNumber + " m. " + homeNumber + "\n" + cityPostCode + ", " + cityName;
	}

}
