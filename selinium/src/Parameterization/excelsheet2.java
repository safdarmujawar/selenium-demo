package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
String path= "D:\\test data\\Worksheet.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		String data = WorkbookFactory.create(File).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);

	}

}
