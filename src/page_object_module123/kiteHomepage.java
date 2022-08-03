package page_object_module123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class3
public class kiteHomepage
{
	//step:1 declaration
	@FindBy(xpath="//span[@class='user-id']")private WebElement UserID;
	
	//step:2 Initialization
	public kiteHomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//step:3 Usage
	public void verifyUserID() 
	{
		String actUser = UserID.getText();
		String expUserID = "VS6640";
		
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
