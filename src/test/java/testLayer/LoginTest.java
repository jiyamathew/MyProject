package testLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseHRMClass;
import pomPackage.POMLogin;
import testdata.Excelsheet;

public class LoginTest extends BaseHRMClass {
	POMLogin Log;
	public LoginTest() {
	
	super(); 
    }
	
	@BeforeMethod
public void initsetup() throws InterruptedException {
		initiate();
		screenshots("Login");
		 Log=new POMLogin();
	
	}
	
	@Test(priority=1)
	public void Title(){
		String actual = Log.verify();
		System.out.println(actual);
		Assert.assertEquals(actual,"ACME Demo App by Applitools");
		}
	@DataProvider
	public Object[][] Details(){
		Object result[][]=Excelsheet.readdata("Sheet1");
		return result;
		
		
	}
	@Test(priority=2,dataProvider="Details")
	public void Login(String name, String password) {
		Log.typeusername(name);
		Log.typepassowrd(password);
		Log.clickbtn();
				
	}
	
	
	@AfterMethod
	public void Close() throws InterruptedException {
		driver.close();
	}
	 
	
	
	
}

