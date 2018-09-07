package com.acorns.utility;

import java.util.ArrayList;

public class DataDriven {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {

		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader(
					"D:\\eclipse-workspace\\com.acorns\\src\\main\\java\\com\\acorns\\testdata\\testData.xlsx");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("Sheet1"); rowNum++) {
			String fname = reader.getCellData("Sheet1", "fname", rowNum);
			String  lname= reader.getCellData("Sheet1", "lname", rowNum);
			String  email= reader.getCellData("Sheet1", "email", rowNum);
			String  phone= reader.getCellData("Sheet1", "phone", rowNum);
			String  address1= reader.getCellData("Sheet1", "address1", rowNum);
			String  address2= reader.getCellData("Sheet1", "address2", rowNum);
			String  dob= reader.getCellData("Sheet1", "dob", rowNum);
			String  state= reader.getCellData("Sheet1", "state", rowNum);
			//		Object obj[] = { email, password };
			Object obj[] = { fname, lname, email, phone, address1, address2, dob, state };
			myData.add(obj);
		}
		return myData;
	}

}