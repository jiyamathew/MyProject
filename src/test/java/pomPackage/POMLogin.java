package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class POMLogin extends BaseHRMClass {

	@FindBy(name="username")
	
	WebElement Username;
	@FindBy(name = "password")
	WebElement Password;
	
	  @FindBy(xpath=
	  "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	  WebElement loginbtn;
	 

	public POMLogin() {
		PageFactory.initElements(driver, this);
	}

	public void typeusername(String name) {
		Username.sendKeys(name);
	}

	public void typepassowrd(String pass) {
		Password.sendKeys(pass);
	}

	
	  public void clickbtn() { 
	  loginbtn.click();
	  
	  }
	 
	public String verify() {
		return driver.getTitle();
	}

}
