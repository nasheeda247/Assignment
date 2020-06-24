package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestClass {
	
	@Test
	public void negativelogin()
	 {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		WebElement user_ip = driver.findElement(By.id("email"));
		user_ip.clear();
		user_ip.sendKeys("nashida.haneef@gmail.com");
		WebElement pwd_ip = driver.findElement(By.id("pass"));
		pwd_ip.clear();
		pwd_ip.sendKeys("welcome");
		driver.findElement(By.id("send2")).click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"), "Invalid login or password."));
		System.out.println("As Expected");
		driver.quit();
	}

}
