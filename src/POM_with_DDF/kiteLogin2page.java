package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin2page
{
	@FindBy(xpath="//input[@id=\"pin\"]")private WebElement PIN;
	@FindBy(xpath="//button[@type=\"submit\"]")private WebElement CntBtn;
	
	
	public kiteLogin2page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setkiteLogin2pagePIN(String PINInfo) 
	{
		PIN.sendKeys(PINInfo);
	}
	
	public void ClicksetkiteLogin2pageCntBtn() 
	{
		CntBtn.click();
	}

}
