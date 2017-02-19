
package com.user.main;

public class User {

    private String firstName;
    private String lastName;
    private UserSex sex;
    private String birthDate;
    private Address address;
    private String phoneNumber;
    private String creditCard;
    private String pesel;

    public User() {
		
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserSex getSex() {
        return sex;
    }

    public void setSex(UserSex sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("");
		builder.append(firstName);
		builder.append(" ");
		builder.append(lastName);
		builder.append(", ");
		builder.append(sex.getSex());
		builder.append(", ur. ");
		builder.append(birthDate);
		builder.append("\naddress:\n");
		builder.append(address);
		builder.append("\nnumer: ");
		builder.append(phoneNumber);
		builder.append(", creditCard: ");
		builder.append(creditCard);
		builder.append(", pesel: ");
		builder.append(pesel);
		builder.append("");
		return builder.toString();
	}


}
