package algorithms;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		int piramidLevels = userIntInput();

		piramidDrow(piramidLevels);
	}

	private static void piramidDrow(int piramidLevels) {
		int i = 0;
		while (i != piramidLevels) {
			for (int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}
		while (i >= 0) {
			for (int j = i; j >= 0; --j) {
				System.out.print("*");
			}
			System.out.println();
			i--;
		}

	}

	private static int userIntInput() {
		System.out.println("Podaj liczbę");
		try (Scanner sc = new Scanner(System.in)) {
			return Integer.parseInt(sc.nextLine());
		}
	}

}
