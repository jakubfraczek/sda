package my.code.excel;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelApp {

	public static void main(String[] args) throws IOException {
		
		File spreadsheet = Paths.get(System.getProperty("user.home"), "Desktop", "spreadsheet.xls").toFile();
		try (NPOIFSFileSystem fs = new NPOIFSFileSystem(spreadsheet); Workbook wb = new HSSFWorkbook(fs)) {
			Sheet sheet = wb.getSheetAt(0);
			Row row = sheet.getRow(0);
			Cell cellG1 = row.getCell(6);
			
			System.out.println("Formu³a z G1: " + cellG1.getCellFormula());
			
			FormulaEvaluator evaluator = wb.getCreationHelper().createFormulaEvaluator();
			System.out.println("Wartoœæ z G1 bez F1: " + evaluator.evaluate(cellG1).getNumberValue());
			
			Cell cellF1 = row.createCell(5);
			cellF1.setCellValue(3.5);
			System.out.println("Wartoœæ z G1 bez F1: " + evaluator.evaluate(cellG1).getNumberValue());
			System.out.println("Wartoœæ z F1: " + evaluator.evaluate(cellF1).getNumberValue());
			
			FormulaEvaluator evaluator2 = wb.getCreationHelper().createFormulaEvaluator();
			System.out.println("Wartoœæ z G1 z F1: " + evaluator2.evaluate(cellG1).getNumberValue());
		} 

	}

}