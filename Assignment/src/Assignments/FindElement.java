package Assignments;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By; //Implicitly imported
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
//		WebElement user_icon = driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div"));
//		//user_icon.click();
//		System.out.println(user_icon.getAttribute("class"));
//		System.out.println(user_icon.getAttribute("id")); //Id not present in html code so an empty string will be returned
//		System.out.println(user_icon.getCssValue("background-image"));//CssValue of the css style sheet
//	
//	byte[] ss = user_icon.getScreenshotAs(OutputType.BYTES);
//	FileOutputStream fos = new FileOutputStream("UserIcon.png");
//	fos.write(ss);
	
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
	
	
	
	
	
	}

}
