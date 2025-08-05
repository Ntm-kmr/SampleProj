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
	
	public boolean facebookLogoisPresent()
	{
		return facebookLogo.isDisplayed();
	}

}
