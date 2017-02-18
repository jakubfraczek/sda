package com.user.main;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserGenerator {

	private User u = new User();
	private String path = "src\\main\\java\\com\\user\\sources\\";

	public User getUser() {
		return u;
	}

	public UserGenerator() {
		u.setSex(generateRandomSex());
		u.setFirstName(generateName());
		u.setLastName(generateLastName());
		u.setBirthDate(generateBirthday());
		u.setPesel(generatePesel());
		u.setAddress(generateAddress());
		u.setPhoneNumber(generatePhoneNumber());
		u.setCreditCard(generateCreditCard());
	}

	public UserGenerator(UserSex sex) {
		u.setSex(sex);
		u.setFirstName(generateName());
		u.setLastName(generateLastName());
		u.setBirthDate(generateBirthday());
		u.setPesel(generatePesel());
		u.setAddress(generateAddress());
		u.setPhoneNumber(generatePhoneNumber());
		u.setCreditCard(generateCreditCard());
	}

	public String generateBirthday() {
		StringBuilder date = new StringBuilder();
		int year = generateRandomNumber(1900, 1999);
		int month = generateRandomNumber(1, 12);
		int day;
		if (month == 2) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = generateRandomNumber(1, 29);
			} else {
				day = generateRandomNumber(1, 28);
			}

		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = generateRandomNumber(1, 31);
		} else {
			day = generateRandomNumber(1, 30);
		}

		if (day < 10) {
			date.append("0").append(day);
		} else {
			date.append(day);
		}
		date.append(".");
		if (month < 10) {
			date.append("0").append(month);
		} else {
			date.append(month);
		}
		date.append(".").append(year).append(" r.");
		
		return date.toString();
	}

	public String generatePesel() {
		StringBuilder pesel = new StringBuilder();
		String date = u.getBirthDate();
		String[] dateArr = date.split("\\.");

		pesel.append(dateArr[2].substring(2, 4));
		pesel.append(dateArr[1]);
		pesel.append(dateArr[0]);

		for (int i = 0; i < 3; i++) {
			pesel.append(generateRandomNumber(0, 9));
		}

		int sex = u.getSex().getId();
		if (sex == 1) {
			pesel.append((generateRandomNumber(0, 9) / 2) * 2);
		} else {
			pesel.append(((generateRandomNumber(1, 9) / 2) * 2) - 1);
		}

		String str = pesel.toString();
		String key = "9731973191";
		int sum = 0;
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.charAt(i) + "") * Integer.parseInt(key.charAt(i) + "");
		}
		pesel.append(sum % 10);

		return pesel.toString();
	}

	public String generateName() {
		ArrayList<String> names;
		if (u.getSex() == UserSex.SEX_F) {
			names = fileInput("im_f.txt");
		} else {
			names = fileInput("im_m.txt");
		}
		return names.get(generateRandomNumber(0, names.size() - 1));
	}

	public String generateLastName() {
		ArrayList<String> lastNames = fileInput("nazwiska.txt");
		String lastName = lastNames.get(generateRandomNumber(0, lastNames.size() - 1));
		if (u.getSex() == UserSex.SEX_F && lastName.endsWith("i")) {
			lastName.replace(lastName.substring(lastName.length() - 1), "a");
		}
		return lastName;
	}

	public Address generateAddress() {
		ArrayList<String> streets = fileInput("ulice.txt");
		ArrayList<String> cities = fileInput("miasta.txt");

		StringBuilder postalCode = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			postalCode.append(generateRandomNumber(0, 9));
		}
		postalCode.append("-");
		for (int i = 0; i < 2; i++) {
			postalCode.append(generateRandomNumber(0, 9));
		}

		Address address = new Address(streets.get(generateRandomNumber(0, streets.size() - 1)),
				generateRandomNumber(1, 200), generateRandomNumber(1, 50),
				cities.get(generateRandomNumber(0, cities.size() - 1)), postalCode.toString());
		return address;
	}

	public String generatePhoneNumber() {
		StringBuilder phone = new StringBuilder();
		phone.append("+48.");

		for (int i = 0; i < 9; i++) {
			phone.append(generateRandomNumber(0, 9));
		}

		return phone.toString();
	}

	public String generateCreditCard() {
		StringBuilder cnn = new StringBuilder();

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				cnn.append(generateRandomNumber(0, 9));
			}
			if (i != 3)
				cnn.append(" ");
		}

		return cnn.toString();
	}

	private UserSex generateRandomSex() {
		UserSex sex;
		int id = generateRandomNumber(0, 2);
		System.out.println(id);
		if (id == 1) {
			sex = UserSex.SEX_M;
		} else {
			sex = UserSex.SEX_F;
		}
		return sex;
	}

	private ArrayList<String> fileInput(String file) {
		ArrayList<String> input = new ArrayList<>();
		try (Scanner sc = new Scanner(Paths.get(path, file))) {
			while (sc.hasNext()) {
				input.add(sc.nextLine());
			}
		} catch (IOException e) {
			System.err.println("File not found");
		}
		return input;
	}

	private int generateRandomNumber(int from, int to) {
		Random rn = new Random();
		return rn.nextInt(to - from) + from;
	}
}
