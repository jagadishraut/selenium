package POM_with_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteLoginTest
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file=new FileInputStream("F:\\selenium\\xl\\new.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", "F:\\setup\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		kiteLogin1page Login1=new kiteLogin1page(driver);
		String UNvalue = sh.getRow(0).getCell(0).getStringCellValue();
		Login1.setkiteLogin1pageUserName(UNvalue);
		
		String PWDvalue = sh.getRow(0).getCell(1).getStringCellValue();
		Login1.setkiteLoginpassword(PWDvalue);
		
		Login1.ClickkiteLogin1pageBtn();
		
		kiteLogin2page Login2=new kiteLogin2page(driver);
		String PIN = sh.getRow(0).getCell(2).getStringCellValue();	
		Login2.setkiteLogin2pagePIN(PIN);
		Login2.ClicksetkiteLogin2pageCntBtn();
		
		kiteHomepage  home=new 	kiteHomepage(driver);
		String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
		home.verifykiteHomepageUserID(expUserID);
		Thread.sleep(3000);
		driver.close();
		
	}

}
