package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();
		    //Gmail Sign In Link
		    String url = "https://accounts.google.com/signin";
		    driver.get(url);
		    //Maximize window
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		    WebElement email_phone = driver.findElement(By.xpath("//input[@id='identifierId']"));
		    
		    //Enter email id
		    email_phone.sendKeys("Your_email");
		    driver.findElement(By.id("identifierNext")).click();

		    WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		    WebDriverWait wait = new WebDriverWait(driver, 20);
		    wait.until(ExpectedConditions.elementToBeClickable(password));
		    //Enter password
		    password.sendKeys("Your_Password");
		    driver.findElement(By.id("passwordNext")).click();
		    WebElement user_icon = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a/img"));
		    //Click on the image icon present in the top right navigational Bar
		    user_icon.click();
		    //verify Tool tip
		    String expectedTooltip = "Your_email";
			String actualTooltip = user_icon.getAttribute("title");
			System.out.println("Actual Title" +actualTooltip);
			if (actualTooltip.equals(expectedTooltip)) {
				
				System.out.println("Title matches");
			}
			

		

	}

}
