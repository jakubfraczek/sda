
package com.user;

import java.util.HashMap;
import java.util.Map;

public class User {

    private User_ user;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public User_ getUser() {
        return user;
    }

    public void setUser(User_ user) {
        this.user = user;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
