
package com.user;

import java.util.HashMap;
import java.util.Map;

public class Address {

    private String streetName;
    private String streetNumber;
    private String homeNumber;
    private String cityName;
    private String cityPostCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
