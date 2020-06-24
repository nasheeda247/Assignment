package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		List <WebElement> links = driver.findElements(By.tagName("a"));
		for (int i =0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText()+"-t\t"+links.get(i).getAttribute("href"));
			
		}
			driver.quit();
	}

}
