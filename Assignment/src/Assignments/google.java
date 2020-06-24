package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		driver.findElement(By.id("gb_70")).click();
		WebElement email = driver.findElement(By.id("identifierId"));
		email.clear();
		email.sendKeys("nashida.haneef@gmail.com");
		
		WebElement pass = driver.findElement(By.id("identifierId"));
		email.clear();
		email.sendKeys("nashida.haneef@gmail.com");
		
		
		
		
	}

}
