package main;

import myList.MyList;

public class Main {

	public static void main(String[] args) {
		UserInput input = new UserInput();
		
		int dupa = input.userIntInput();
		
		MyList kupa = new MyList();
		
		for(int i = 0; i <= dupa; i++) {
			kupa.add(input.userIntInput());
		}
		
		kupa.wypisz();
		
	}
}
