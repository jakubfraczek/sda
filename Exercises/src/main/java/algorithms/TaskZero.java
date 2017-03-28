package algorithms;

import java.util.HashMap;
import java.util.Map;

public class TaskZero {

	static Map<Integer, String> numberToMonthName;


	public void fillMonthMap() {
		numberToMonthName = new HashMap<>();
		numberToMonthName.put(1, "Styczeń");
		numberToMonthName.put(2, "Luty");
		numberToMonthName.put(3, "Marzec");
		numberToMonthName.put(4, "Kwiecień");
		numberToMonthName.put(5, "Maj");
		numberToMonthName.put(6, "Czerwiec");
		numberToMonthName.put(7, "Lipiec");
		numberToMonthName.put(8, "Sierpień");
		numberToMonthName.put(9, "Wrzesień");
		numberToMonthName.put(10, "Październik");
		numberToMonthName.put(11, "Listopad");
		numberToMonthName.put(12, "Grudzień");
	}

	public String mothConverter(int i) {
		if (i < 1 || i > 12) {
			throw new IllegalArgumentException("Niepoprawna wartość");
		} else {
			return numberToMonthName.get(i);
		}
	}

}
