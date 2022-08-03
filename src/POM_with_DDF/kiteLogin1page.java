package POM_with_DDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kiteLogin1page 
{ 
	//step:1 : Declaration
	@FindBy(xpath="//input[@id=\"userid\"]") private WebElement UN;
	@FindBy(xpath="//input[@type=\"password\"]") private WebElement PWD;
	@FindBy(xpath="//button[@type=\"submit\"]") private WebElement LoginBtn;
	
	//Step:2: Initialization
	public kiteLogin1page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//step:3: Usage
	public void setkiteLogin1pageUserName(String UserName) 
	{
		UN.sendKeys(UserName);
	}
	public void setkiteLoginpassword(String password) 
	{
		PWD.sendKeys("password");
	}
	public void ClickkiteLogin1pageBtn()
	{
		LoginBtn.click();
	}

}
