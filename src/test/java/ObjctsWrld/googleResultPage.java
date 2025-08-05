package ObjctsWrld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleResultPage {
	WebDriver driver;
	
	public googleResultPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='Facebook - log in or sign up']") private WebElement facebookLink;
	
	public void  clickfbLink()

	{
		facebookLink.click();
	}

}
