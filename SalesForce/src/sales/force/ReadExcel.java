package sales.force;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File src = new File("E:\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet data1 =wb.getSheetAt(0);
		//String Edata = data1.getRow(0).getCell(0).getStringCellValue();
		//System.out.println("get data from excel sheet :"+Edata);
		int rowcount = data1.getLastRowNum();
		int rowcolomn = data1.getLeftCol();
		System.out.println("number of row in excel sheet :"+rowcount);
		System.out.println("number of row in excel sheet :"+rowcolomn);
		

		for(int i=0;i<rowcount;i++)
		{
		String	data2 = data1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("print the row sheet in the excel file :"+data2);
		}
	}

}
