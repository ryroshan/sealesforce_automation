package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readata {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public Readata(String path)
	{
		try {
			File f =new File(path);
			 fis = new FileInputStream(f);
			 wb = new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		
		}
		
	}

public String getdatarow(int sheetname, int row, int column) {
	
	 sheet1 = wb.getSheetAt(0);
	String data = sheet1.getRow(0).getCell(0).getStringCellValue();
	return data;
	
}

}