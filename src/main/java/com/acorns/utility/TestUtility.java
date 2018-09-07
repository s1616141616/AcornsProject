package com.acorns.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestUtility {

	public static String TESTDATA_SHEET_PATH = "D:\\eclipse-workspace\\com.acorns\\src\\main\\java\\com\\acorns\\testdata\\testData.xlsx";
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;

	
	
	public static Object[][] getTestData(String sheetName) throws Exception, Exception{
		
		FileInputStream file =null;
		file = new FileInputStream(TESTDATA_SHEET_PATH);
		Workbook book = WorkbookFactory.create(file);
		Sheet sheet = book.getSheet(sheetName);
		Object [][] data =new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

		for (int i =0; i < sheet.getLastRowNum(); i ++) {
			for (int k =0; k < sheet.getRow(0).getLastCellNum(); k ++) {
				data[i][k] =sheet.getRow(i + 1).getCell(k).toString();
			}
		}return data;
		
	}
}