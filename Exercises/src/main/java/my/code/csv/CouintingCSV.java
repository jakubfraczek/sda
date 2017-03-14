package my.code.csv;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

public class CouintingCSV {

	public static void main(String[] args) throws IOException {
		
		FileWriter out1 = new FileWriter(Paths.get(System.getProperty("user.home"), "Desktop", "MERGED2012_PP_final1.csv").toFile());
		CouiningCSVOld.toFile(out1);
		
		FileWriter out2 = new FileWriter(Paths.get(System.getProperty("user.home"), "Desktop", "MERGED2012_PP_final2.csv").toFile());
		CouiningCSVNew.toFile(out2);

	}

}