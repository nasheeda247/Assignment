package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new Firefoxdriver();
		driver.get("http://magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.partialLinkText("Products"))).perform();// When tagName a is expandable then we use partial link text and if the tag name a is not expandable is direct we use link text.
		//act.click(driver.findElement(By.linkText("Request a demo")));
		driver.findElement(By.linkText("Request a demo")).click();
		act.contextClick(driver.findElement(By.linkText("Request a demo"))).perform();
		

	}

}
