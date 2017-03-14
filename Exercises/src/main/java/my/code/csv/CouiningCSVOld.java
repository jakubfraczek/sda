package my.code.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CouiningCSVOld {
	
	
	public static void toFile(FileWriter out) throws IOException{
		Iterable<CSVRecord> records = readInFile();

		Map<String, ArrayList<Double>> stabbrToSatAvgAll = fillMap(records);
		
		printToFile(out, stabbrToSatAvgAll);
		
		System.out.println("Koniec starego algorytmu");
	}

	private static void printToFile(FileWriter out, Map<String, ArrayList<Double>> stabbrToSatAvgAll)
			throws IOException {
		CSVPrinter printer = CSVFormat.RFC4180.withHeader("no", "Group", "Avg. Value", "Min. Value", "Max. Value").print(out);
		
		int no = 1;
		for (Entry<String, ArrayList<Double>> entry : stabbrToSatAvgAll.entrySet()) {
			String group = entry.getKey();
			ArrayList<Double> satAvgAll = entry.getValue();
			double sum = 0;
			double maxValue = satAvgAll.get(0);
			double minValue = satAvgAll.get(0);
			int size = satAvgAll.size();
			for (double d : satAvgAll) {
				if (maxValue < d ) {
					maxValue = d;
				}
				if (minValue > d) {
					minValue = d;
				}
				sum += d;
			}
			double avgValue = sum / size;
//			double avgValue = satAvgAll.stream().mapToDouble(d -> d.doubleValue()).sum() / size;
//			double minValue = satAvgAll.stream().mapToDouble(d -> d.doubleValue()).min().orElseThrow(IllegalArgumentException::new);
//			double maxValue = satAvgAll.stream().mapToDouble(d -> d.doubleValue()).max().orElseThrow(IllegalArgumentException::new);
//			System.out.println(group + ' ' + size + ' ' + avgValue + ' ' + minValue + ' ' + maxValue);
			printer.printRecord(no, group, size, avgValue, minValue, maxValue);
			no++;
		}
		printer.close();
	}

	private static Map<String, ArrayList<Double>> fillMap(Iterable<CSVRecord> records) {
		Map<String, ArrayList<Double>> stabbrToSatAvgAll = new HashMap<>();

		for (CSVRecord r : records) {
			String current = r.get("STABBR");
			String satAvgAllString = r.get("SAT_AVG_ALL");
			Double satAvgAllDouble;
			if (satAvgAllString.equalsIgnoreCase("null")) {
				continue;
			} else {
				satAvgAllDouble = Double.parseDouble(satAvgAllString);
				ArrayList<Double> temp = stabbrToSatAvgAll.getOrDefault(current, new ArrayList<>());
				temp.add(satAvgAllDouble);
				stabbrToSatAvgAll.put(current, temp);
			}
		}
		return stabbrToSatAvgAll;
	}

	private static Iterable<CSVRecord> readInFile() throws FileNotFoundException, IOException {
		File source = Paths.get(System.getProperty("user.home"), "Desktop", "MERGED2012_PP.csv").toFile();
		Reader in = new FileReader(source);
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader().parse(in);
		return records;
	}

}
