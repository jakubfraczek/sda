package main;

import algorithms.Palindrome;
import algorithms.Piramid;

public class Main {

	public static void main(String[] args) {
		UserInput input = new UserInput();

//		Piramid piramid = new Piramid();
//		piramid.piramidDrow(input.userIntInput());
		
		Palindrome palindrome = new Palindrome();
		palindrome.isPalindrome(input.userStringInput());
	}
}
