package Datadrivenclasswork;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Maven\\excel\\Data.xlsx");

		FileInputStream fin =new FileInputStream(f);
		
		Workbook w= new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(1);
		
		Cell c = r.getCell(1);
		
		System.out.println(c);
		
		System.out.println("done");
		
		
	}

}
