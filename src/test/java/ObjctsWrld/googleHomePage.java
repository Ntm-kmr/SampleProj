package ObjctsWrld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {
	WebDriver driver;
	
	public googleHomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	@FindBy(xpath = "//textarea[@title='Search']") private WebElement googlesrchBox;
	@FindBy(xpath="(//input[@type='submit'])[3]") private WebElement googleSrchBtn;
	
	public boolean pageload()
	{
		return googleSrchBtn.isDisplayed();
	}
	
	public void enterText(String TxttoSearch)
	{
		googlesrchBox.sendKeys(TxttoSearch);
	}
	

}
