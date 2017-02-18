
package com.user;

import java.util.HashMap;
import java.util.Map;

public class Pesel {

    private String peselNumber;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getPeselNumber() {
        return peselNumber;
    }

    public void setPeselNumber(String peselNumber) {
        this.peselNumber = peselNumber;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
