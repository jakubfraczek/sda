package main;

import java.util.Scanner;

public class UserInput {
	Scanner sc = new Scanner(System.in);

	public int userIntInput() {
		System.out.println("Podaj liczbę całkowitą");
		return Integer.parseInt(sc.nextLine());
	}

	public String userStringInput() {
		System.out.println("Podaj tekst");
		return sc.nextLine();
	}

}
