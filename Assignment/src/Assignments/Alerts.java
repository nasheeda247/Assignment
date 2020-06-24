package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Alert Box
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*driver.get("http://www.echoecho.com/javascript4.htm");
		driver.findElement(By.name("B1")).click();
		System.out.println("As expected");

		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//Confirm box
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(5000);
		System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss(); */
		
		//Prompt box
		//driver.findElement(By.name("B3")).click();
//		driver.switchTo().alert().sendKeys("Hello");
//		Thread.sleep(5000);
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		driver.close();
		
//		driver.get("http://naukri.com");
//		driver.findElement(By.id("file_upload")).sendKeys("C:\\MacDataBkp\\Nija\\Nasheeda_Haneef.doc");
//		Thread.sleep(5000);
//		System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[1]/span[2]")).getText());
		
		driver.get("https://www.sejda.com/pdf-editor");
		driver.findElement(By.id("file")).sendKeys("C:\\MacDataBkp\\Nija\\Nasheeda_Haneef.doc");
		Thread.sleep(5000);
		//System.out.println(driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/div/div[1]/span[2]")).getText());
		
		
		
		
	}

}
