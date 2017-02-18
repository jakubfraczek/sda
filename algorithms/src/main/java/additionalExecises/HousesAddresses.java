package additionalExecises;

public class HousesAddresses {

	public void addressMail(String streetName, int houseNumber) {

		for (int i = 1; i <= houseNumber; i += 2) {
			for (int j = 1; j <= 12; j++) {
				System.out.println("ul. " + streetName + " " + i + " m. " + j);
			}
		}

	}

}
