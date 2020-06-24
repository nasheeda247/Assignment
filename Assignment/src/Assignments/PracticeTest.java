package Assignments;

import java.sql.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PracticeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.openemr.io/a/openemr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement user_name = driver.findElement(By.id("authUser"));
		user_name.clear();
		user_name.sendKeys("admin");
		
		WebElement user_pwd = driver.findElement(By.id("clearPass"));
		user_pwd.clear();
		user_pwd.sendKeys("pass");
		
		WebElement login_btn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button"));
		login_btn.click();
		//OR
		//driver.findElement(By.id("clearPass")).submit();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/div"))).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[2]/div")).click();
		System.out.println("Clicked on ");
		Thread.sleep(5000);
		driver.switchTo().frame("pat");
		WebElement fname = driver.findElement(By.id("form_fname"));
		fname.clear();
		fname.sendKeys("AutoTest1");
		driver.findElement(By.id("form_lname")).sendKeys("Latest1");
		//Date dt = new Date();
		//System.out.println(dt.toString());
		//driver.findElement(By.className("xdsoft_date xdsoft_day_of_week5 xdsoft_date xdsoft_current xdsoft_today"))
		driver.findElement(By.id("form_DOB")).sendKeys("2020-06-12");
		Select gender = new Select(driver.findElement(By.id("form_sex")));
		gender.selectByValue("Female");
		driver.findElement(By.id("create")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.switchTo().frame("modalframe");
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//Thread.sleep(5000);
		
		driver.findElement(By.className("closeDlgIframe")).click();
		act.moveToElement(driver.findElement(By.className("userSection"))).perform();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
		
		
		
		
		act.moveToElement(driver.findElement(By.id("username"))).perform();
		driver.findElement(By.xpath("//*[@id=\"username\"]/div/ul/li[4]")).click();
		
		
		
		

	}

}
