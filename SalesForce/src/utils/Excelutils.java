package utils;

//import org.apache.commons.math3.stat.descriptive.summary.SumOfSquares;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils { // create a class 
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public Excelutils() {  // create a Constuctor of the same class which is automatically called
		
		try {
			String projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath+"/Excel/Book1.xlsx");
			sheet = workbook.getSheet("Sheet1");
			
		}catch(Exception e) {
			e.getStackTrace();
		}

	}

	public static void main(String[] args) {     // this is the main method of the class 
		Rowcount();
		CelldataString(0, 0); // putting the both parameter
		CelldataNumber(1, 1); // putting the both parameter
	}

	public static void Rowcount() {     // this is count a row

		int countrow = sheet.getPhysicalNumberOfRows();
		System.out.println("count the number of row : " + countrow);
	}


	public static void CelldataString (int rowNum, int colNum) {   // this is for String 

		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		System.out.println(celldata);
	}

	public static void CelldataNumber(int rowNum, int colNum) {  // this is for count Number

		double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println(celldata);
	}


}
