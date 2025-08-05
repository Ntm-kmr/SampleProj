package ObjctsWrld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebookHomePage {
	public WebDriver driver;
	
	public facebookHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[contains(@src,'fbcdn')]") private WebElement facebookLogo;
	@FindBy(xpath="//input[@id=\"email\"]") private WebElement emailTextBox;
	@FindBy(xpath="//input[@id=\"pass\"]") private WebElement passwordTextBox;
	@FindBy(xpath="//button[@type='submit']") private WebElement sbmtBtn;
	
	
	public boolean facebookLogoisPresent()
	{
		return facebookLogo.isDisplayed();
	}
	public void enterEmail (String email)
	{
		emailTextBox.sendKeys(email);
	}
	public void enterPassword (String password)
	{
		passwordTextBox.sendKeys(password);
	}
	public void sbmitBtn ()
	{
		sbmtBtn.click();;
	}
	

}
