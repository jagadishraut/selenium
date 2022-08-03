package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteHomepage 
{
	@FindBy(xpath="//span[@class=\"user-id\"]")private WebElement UserID;
	
	public kiteHomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifykiteHomepageUserID(String expUserID) 
	{
		String actUser=UserID.getText();
		
		if(actUser.equals(expUserID))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
	}

}
