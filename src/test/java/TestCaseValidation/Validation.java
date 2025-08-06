package TestCaseValidation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import BaseClass.setUp;
import ObjctsWrld.googleHomePage;
import ObjctsWrld.googleResultPage;
import genericUtility.genericUtility;

public class Validation  extends setUp {
	
	googleResultPage googleRsltVldtn ;
	googleHomePage  googlePageVldtn;
	genericUtility gutility;
	
	
	@Test
	public void googglepageValidation() throws InterruptedException
	{
		googlePageVldtn=new googleHomePage(driver);
		if(googlePageVldtn.pageload())
		{
			googlePageVldtn.enterText("Facebook");
			WebElement e=googlePageVldtn.entr();
			Actions act=new Actions(driver);
			act.sendKeys(Keys.ENTER).click().build().perform();
		}
		
	}

}
