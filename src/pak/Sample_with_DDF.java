package pak;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_with_DDF
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file =new FileInputStream("F:\\selenium\\xl\\new.xlsx");
		
        	 Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
        	
		
		System.setProperty("webdriver.chrome.driver", "F:\\setup\\chrome\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		//user name
		String UN=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id=\"userid\"]")).sendKeys(UN);
		
		//password
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		
		//click on login btn
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//enter pin
	 String pin = sh.getRow(0).getCell(2).getStringCellValue();
	 driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
	 
	 //click on continue btn
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 
	 String actUserid = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
	 
	 String expuserid = sh.getRow(0).getCell(3).getStringCellValue();
	 
	 if( actUserid.equals(expuserid)) 
	 {
		 System.out.println("pass");
	 }
	 else 
	 {
		 System.out.println("fail");
	 }
	 Thread.sleep(2000);
	 driver.close();		
		
	}

}
