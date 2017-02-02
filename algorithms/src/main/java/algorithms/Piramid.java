package algorithms;

public class Piramid {


	public void piramidDrow(int piramidLevels) {
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



}
