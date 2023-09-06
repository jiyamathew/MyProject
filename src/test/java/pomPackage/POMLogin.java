package pomPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseHRMClass;

public class POMLogin extends BaseHRMClass {

	@FindBy(id="username")
	
	WebElement Username;
	@FindBy(id= "password")
	WebElement Password;
	
	  @FindBy(id="log-in")
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
