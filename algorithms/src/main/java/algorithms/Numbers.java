package algorithms;

public class Numbers {

	public boolean isEven(int i) {
		return (i % 2 == 0 ? true : false);
	}

	public Double absoluteNumber(Double d) {
		return (d >= 0 ? d : -d);
	}

	public int biggestCommonDivider(int i, int j) {
		while (i != j) {
			if (i > j) {
				i -= j;
			} else {
				j -= i;
			}
		}
		return i;
	}

}
