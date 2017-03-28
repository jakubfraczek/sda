package my.code.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;

public class CouiningCSVNew {
	
	public static void toFile(FileWriter out) throws IOException{
		Iterable<CSVRecord> records = readInFile();
		
		Stream<CSVRecord> stream = StreamSupport.stream(records.spliterator(), false);
		
//		stream.filter(csv -> !csv.get("STABBR").equalsIgnoreCase("null"))
//				.collect(
//						Collectors.toMap(x -> x.get("STABBR"), CouiningCSVNew::toSumaryRecord, StatesCollegeData::plus))
//				.forEach();
		
		System.out.println("Koniec nowego algorytmu");
	}

	
	private static StatesCollegeData toSumaryRecord(CSVRecord csv){
		StatesCollegeData record = new StatesCollegeData(Double.parseDouble(csv.get("SAT_AVG_ALL")));
		return record;
		
	}
	
	private static void printToFile(FileWriter out, Map<String, StatesCollegeData> stabbrToSatAvgAll)
			throws IOException {
		CSVPrinter printer = CSVFormat.RFC4180.withHeader("no", "Group", "Avg. Value", "Min. Value", "Max. Value").print(out);
		
		int no = 1;
		for (Entry<String, StatesCollegeData> entry : stabbrToSatAvgAll.entrySet()) {
			String group = entry.getKey();
			StatesCollegeData collegeData = entry.getValue();
			printer.printRecord(no, group, collegeData.getSize(), collegeData.getAvgValue(), collegeData.getMinValue(), collegeData.getMaxValue());
			no++;
		}
		printer.close();
	}

	private static Iterable<CSVRecord> readInFile() throws FileNotFoundException, IOException {
		File source = Paths.get(System.getProperty("user.home"), "Desktop", "MERGED2012_PP.csv").toFile();
		Reader in = new FileReader(source);
		Iterable<CSVRecord> records = CSVFormat.RFC4180.withHeader().parse(in);
		return records;
	}


}
