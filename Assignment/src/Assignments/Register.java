package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://magento.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")).click();
		//Register
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("register")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("register")));
		driver.findElement(By.id("register")).click();
		WebElement fname = driver.findElement(By.id("firstname"));
		fname.clear();
		fname.sendKeys("Nasheeda");
		WebElement lname = driver.findElement(By.id("lastname"));
		lname.clear();
		lname.sendKeys("Haneef");
		WebElement email_address = driver.findElement(By.id("email_address"));
		email_address.clear();
		email_address.sendKeys("nashida.haneef@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"company_type\"]")).click();
		
		Select primary = new Select(driver.findElement(By.id("company_type")));
		primary.selectByValue("development");

		Select role = new Select(driver.findElement(By.id("individual_role")));
		role.selectByVisibleText("Technical/developer");
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByIndex(3);
		
		WebElement register_pwd = driver.findElement(By.id("password"));
		register_pwd.clear();
		register_pwd.sendKeys("testpassword3");
		
		WebElement pwd_confirm = driver.findElement(By.id("password-confirmation"));
		pwd_confirm.clear();
		pwd_confirm.sendKeys("testpassword3");
		
		if(!driver.findElement(By.id("agree_terms")).isSelected())
		 {
		
			driver.findElement(By.id("agree_terms")).click();
				
		 }
		
		driver.findElement(By.partialLinkText("Back")).click();
		
		
		
	}

}
