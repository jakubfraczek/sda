
package com.user.main;

public class Pesel {

    private final String peselNumber;

    Pesel(String birthDate, UserSex sex) {
    	peselNumber = generatePesel(birthDate, sex);
    }
    
    public String getPeselNumber() {
        return peselNumber;
    }

   
    private String generatePesel(String birthDate, UserSex sex) {
    	
    	
    	return peselNumber;
    }

}
