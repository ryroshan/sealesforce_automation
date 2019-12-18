package sales.force;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Marketing {
	WebDriver driver;
	/** String xlpath = "";
	 String sheet= " ";
	// ExcelApiTest eat= "null";
	
	@Test(dataProvider = "")
	public void Homepage(String username, String password, String age, String emailid, String result) {
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println("****************************");
		
	}
	
	@DataProvider(name = "username")
	public Object[][] userform() throws Exception {
		
		Object[][] data = testData(xlpath, sheet);
		return data;
	}

	public Object[][] testData(xlpath, sheet){
		
		
		
		
	}
	
	
	
	
	
	WebDriver driver;
    
	*/
	
	@BeforeMethod
	
	public void SetUp() {
		
		
		System.setProperty("webdriver.gecko.driver",   // in method first you write the set property 
                "E:\\gecko\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.demo.opencart.com/");
		
	}
	
	
	
    
		
		
	
	
	
	
	@AfterMethod
	public void Teardown() {
		
		
		driver.quit();
		
	
}
	//@DataProvider(name="Amazonprime")
	//public Object[][] Readdata(){
		
	//	Object[][] data= new Object[0][1];
	//	data[0][0]="abhinavnayar3090595@gmail.com";
	//	data[0][1]="Garmin@1988";
	//	return data;
	}
	

//}
