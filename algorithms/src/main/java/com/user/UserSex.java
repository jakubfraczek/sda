package com.user;

public enum UserSex {
	SEX_M("Mężczyzna"),
	SEX_F("Kobieta"),
	SEX_UNDEFINED("Nie określono");
	
	private String sex;
	
	UserSex(String sex){
		this.sex = sex;
	}
	
	public String getSex() {
		return this.sex;
	}
	
}
