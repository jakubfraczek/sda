package additionalExecises;

public class HousesAddresses {

	public void addressMail(String streetName, int houseNumber) {
		if (houseNumber <= 0) {
			throw new IllegalArgumentException("Liczba musi być dodatnia");
		}

		for (int i = 1; i <= houseNumber; i += 2) {
			for (int j = 1; j <= 12; j++) {
				System.out.println("ul. " + streetName + " " + i + " m. " + j);
			}
		}

	}

	public void getPostalCodes(String fisrtPostalCode, String secondPostalCode) {

		String[] fisrtPostalCodeSplit = fisrtPostalCode.split("-");
		String[] secondPostalCodeSplit = secondPostalCode.split("-");

		int startCode1 = Integer.parseInt(fisrtPostalCodeSplit[0]);
		int startCode2 = Integer.parseInt(secondPostalCodeSplit[0]);

		int endCode1 = Integer.parseInt(fisrtPostalCodeSplit[1]);
		int endCode2 = Integer.parseInt(secondPostalCodeSplit[1]);

		for (int i = startCode1; i <= startCode2; i++) {
			if (i == startCode1) {
				writePostal(i, endCode1, 999);
			}

			if (i != startCode1 && i != startCode2) {
				writePostal(i, 0, 999);
			}

			if (i == startCode2) {
				writePostal(i, 0, endCode2);
			}
		}

	}

	private void writePostal(int i, int start, int end) {
		for (int j = start; j <= end; j++) {
			if (j < 10) {
				System.out.println(i + "-" + "00" + j);
			} else if (j < 100) {
				System.out.println(i + "-" + "0" + j);
			} else {
				System.out.println(i + "-" + j);
			}
		}
	}

}
