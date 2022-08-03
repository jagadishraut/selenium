package page_object_module123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM Class1
public class kiteLogin1page
{
	//step:1 declaration             "without DDF"
	@FindBy(xpath="//input[@id=\"userid\"]")private WebElement UN;
	@FindBy(xpath="//input[@type='password']")private WebElement PWD;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginBtn;
	
	//step:2 Initialization
	public kiteLogin1page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//step:3 Usage
	public void enterUn() 
	{
		UN.sendKeys("VS6640");
	}
	public void enterPWD() 
	{
		PWD.sendKeys("7066650010");
	}
	public void clickonloginBtn() 
	{
		loginBtn.click();
	}

}
