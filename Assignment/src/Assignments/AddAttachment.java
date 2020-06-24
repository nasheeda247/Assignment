package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddAttachment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.freefileconvert.com/");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			driver.findElement(By.xpath("//div[@id='tabs_container']/ul/li[1]/a/em")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("input_file")).sendKeys("C:\\SDET\\test.txt");
			Thread.sleep(4000);
			driver.close();
			
		}

	}


