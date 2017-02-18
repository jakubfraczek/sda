package com.user.main;

public enum UserSex {
	SEX_M(1, "Mężczyzna"),
	SEX_F(2, "Kobieta"),
	SEX_UNDEFINED(3, "Nie określono");
	
	private int id;
	private String sex;
	
	UserSex(int id, String sex){
		this.id = id;
		this.sex = sex;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getSex() {
		return this.sex;
	}
	
}
