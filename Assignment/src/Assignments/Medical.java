package Assignments;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Medical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.openemr.io/a/openemr");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		driver.findElement(By.xpath("//button")).click();
		
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
		driver.findElement(By.xpath("//div[text()='New/Search']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("pat");
		Select title = new Select(driver.findElement(By.id("form_title")));
		title.selectByValue("Mr.");
		driver.findElement(By.id("form_fname")).sendKeys("First");
		driver.findElement(By.id("form_lname")).sendKeys("Last");
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(dt));
		driver.findElement(By.id("form_DOB")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("xdsoft_today")).click();
		Select gender = new Select(driver.findElement(By.id("form_sex")));
		gender.selectByVisibleText("Male");
		driver.findElement(By.id("create")).click();
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("modalframe");
		driver.findElement(By.xpath("//input[@value='Confirm Create New Patient']")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.className("closeDlgIframe")).click();
		act.moveToElement(driver.findElement(By.className("userSection"))).perform();
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		
	}

}
