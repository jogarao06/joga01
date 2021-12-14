package com.VtigerGenric;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * author G JogaRao Description : create ExcelFile Data
 * 
 */

public class excelfileutile {

	public int exceldetailsfatch(String sheet2) throws EncryptedDocumentException, IOException {

		// String dripath1 = System.getProperty("user.dir");
		// String path1 = dripath1 + "/New Microsoft Excel Worksheet.xlsx";
		FileInputStream fis1 = new FileInputStream(Iautofile.excelpth);
		Workbook book = WorkbookFactory.create(fis1);
		Sheet sh = book.getSheet(sheet2);
		return sh.getLastRowNum();
	}

	public String selectvaluefromdropdowdd(String sheetname, int cell,String DDvalue) throws IOException {
		FileInputStream fis = new FileInputStream(Iautofile.excelpth);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		int Lastrow = exceldetailsfatch(sheetname);
		String value = "Null";

		for (int i = 0; i < Lastrow; i++) {
			value = sheet.getRow(i).getCell(cell).getStringCellValue();
			if (value.equalsIgnoreCase(DDvalue)) {
				break;
			}
		}
		return value;
	}
	
}
