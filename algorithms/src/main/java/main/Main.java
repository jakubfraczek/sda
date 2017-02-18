package main;

import com.user.main.UserGenerator;

public class Main {

	public static void main(String[] args) {
//		UserInput input = new UserInput();
		UserGenerator ug = new UserGenerator();
		
		System.out.println(ug.getUser().toString());
	}
}
