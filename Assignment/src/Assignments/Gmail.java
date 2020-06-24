package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver  = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		
		//main window id
		String parent = driver.getWindowHandle();
		
		//All available window ids
		Set <String> winids = driver.getWindowHandles();
		System.out.println(winids);
		
		driver.switchTo().window((String) winids.toArray()[1]);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("identifierId")).sendKeys("nashida.haneef@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("pass");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
		WebElement user_icon = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img"));
//		Actions act = new Actions(driver);
//		act.moveToElement(user_icon).perform();
		user_icon.click();
		String expectedTooltip = "nashida.haneef@gmail.com";
		String actualTooltip = user_icon.getAttribute("title");
		System.out.println("Actual Title" +actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			
			System.out.println("Title matches");
		}
		
		
		
		
		
	}

}
