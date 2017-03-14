package my.code.book;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Couintingapp {

	public static void main(String[] args) {
		File source = Paths.get(System.getProperty("user.home"), "Desktop", "Szekspir.txt").toFile();
		Scanner input = null;
		try {
			input = new Scanner(source);
			input.useDelimiter("\\W+");
		} catch (FileNotFoundException e) {
			System.out.println("Pliku nie odnaleziono");
			return;
		}
		Map<String, Integer> wordToNumber = new HashMap<>();

		while (input.hasNext()) {
			String current = input.next().toLowerCase();
			Integer temp = wordToNumber.getOrDefault(current, 0);
			wordToNumber.put(current, ++temp);
		}
		wordToNumber.entrySet()
					.stream()
					.sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
					.limit(20)
					.forEach(x -> System.out.println(x.getKey() + " = " + x.getValue()));
		input.close();
	}
}
