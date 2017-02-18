
package com.user;

import java.util.HashMap;
import java.util.Map;

public class CreditCard {

    private String creditCardNumber;
    private String creditCardBank;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardBank() {
        return creditCardBank;
    }

    public void setCreditCardBank(String creditCardBank) {
        this.creditCardBank = creditCardBank;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
