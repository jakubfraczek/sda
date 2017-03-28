package my.code.csv;

public class StatesCollegeData {

	private int size;
	private double sum;
	private double maxValue;
	private double minValue;

	public static StatesCollegeData plus(StatesCollegeData s1, StatesCollegeData s2) {
		return s2;
	}

	public void add(Double satAvgAllDouble) {
		size++;
		sum += satAvgAllDouble;
		if (maxValue < satAvgAllDouble) {
			maxValue = satAvgAllDouble;
		}
		if (minValue > satAvgAllDouble) {
			minValue = satAvgAllDouble;
		}

	}

	public StatesCollegeData(double in) {
		size = 0;
		sum = 0;
		maxValue = in;
		minValue = in;
	}

	public int getSize() {
		return size;
	}

	public double getAvgValue() {
		return sum / size;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public double getMinValue() {
		return minValue;
	}

}
