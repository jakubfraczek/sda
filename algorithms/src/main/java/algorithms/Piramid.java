package algorithms;

import java.util.Scanner;

public class Piramid {

	public static void main(String[] args) {
		int piramidLevels = userIntInput();

		piramidRise(piramidLevels);
		piramifDecrease(piramidLevels);
	}

	private static void piramifDecrease(int piramidLevels) {
		while (piramidLevels >= 0) {
			for (int j = piramidLevels; j >= 0; --j) {
				System.out.print("*");
			}
			System.out.println();
			piramidLevels--;
		}
	}

	private static void piramidRise(int piramidLevels) {
		int i = 0;
		while (i != piramidLevels) {
			for (int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
			i++;
		}

	}

	private static int userIntInput() {
		System.out.println("Podaj liczbę");
		try (Scanner sc = new Scanner(System.in)) {
			return Integer.parseInt(sc.nextLine());
		}
	}

}
