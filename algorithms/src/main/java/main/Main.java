package main;

import myList.MyList;

public class Main {

	public static void main(String[] args) {
		UserInput input = new UserInput();
		
		int inputNumber = input.userIntInput();
		
		MyList myList = new MyList();
		
		for(int i = 0; i < inputNumber; i++) {
			myList.add(input.userIntInput());
		}
		
		myList.remove(input.userIntInput());
		
		myList.wypisz();
		
	}
}
