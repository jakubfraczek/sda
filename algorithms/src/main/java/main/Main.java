package main;

import additionalExecises.HousesAddresses;

public class Main {

	public static void main(String[] args) {
		UserInput input = new UserInput();
		HousesAddresses house = new HousesAddresses();
		
//		house.addressMail(input.userStringInput(), input.userIntInput());
		house.getPostalCodes("91-999", "93-102");

	}
}
