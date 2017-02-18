package com.user.main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserGenerator {

	private User u;
	private String path = "src\\main\\java\\com\\user\\sources\\";

	public UserGenerator() {

	}

	public UserGenerator(UserSex sex) {
		u.setSex(sex);
	}

	public String generateBirthday() {
		int year = generateRandomNumber(1900, 1999);
		int month = generateRandomNumber(1, 12);
		int day;
		if (month == 2) {
			if (year % 4 == 0) {
				day = generateRandomNumber(1, 29);
			} else {
				day = generateRandomNumber(1, 28);
			}

		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = generateRandomNumber(1, 31);
		} else {
			day = generateRandomNumber(1, 30);
		}
		String date = day + "." + month + "." + year;
		return date;
	}

	private ArrayList<String> fileInput(String file) {
		ArrayList<String> input = new ArrayList<>();
		try (Scanner sc = new Scanner(path + file)) {
			while (sc.hasNext()) {
				input.add(sc.nextLine());
			}
		}
		return input;
	}

	private int generateRandomNumber(int from, int to) {
		Random rn = new Random();
		return rn.nextInt(to - from) + from;
	}
}
