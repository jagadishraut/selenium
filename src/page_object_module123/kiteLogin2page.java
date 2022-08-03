package page_object_module123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class2
public class kiteLogin2page
{
	//step:1 declaration
	@FindBy(xpath="//input[@id=\"pin\"]")WebElement pin;
	@FindBy(xpath="//button[@type='submit']")WebElement CntBtn;
	
	//step:2 Initialization
	public kiteLogin2page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//step:3 Usage
	public void enterpin() 
	{
		pin.sendKeys("706665");
	}
	public void ClickoncontinueBtn() 
	{
		CntBtn.click();
	}
	
}   
