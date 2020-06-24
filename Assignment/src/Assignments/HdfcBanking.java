package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("footer");
		driver.findElement(By.partialLinkText("Terms and Conditions")).click();
		driver.switchTo().defaultContent();
		
		Set <String> winids = driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[1]);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("HDFC Ltd")).click();
		driver.close();
		
		winids = driver.getWindowHandles();
		driver.switchTo().window((String) winids.toArray()[1]);
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"HomePageModalVideo\"]/div/div/div[1]/button")).click();
		
		driver.quit();
		

	}

}
