package page_object_module123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteLoginTest 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "F:\\setup\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		kiteLogin1page login1=new kiteLogin1page(driver);
		
		login1.enterUn();
		login1.enterPWD();
		login1.clickonloginBtn();
		
		kiteLogin2page login2=new kiteLogin2page(driver);
		
		login2.enterpin();
		login2.ClickoncontinueBtn();
		
		kiteHomepage home3=new kiteHomepage(driver);
		
		home3.verifyUserID();
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
