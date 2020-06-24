package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver", "C:\\SDET\\drivers\\geckodriver");
		FirefoxOptions opt = new FirefoxOptions();
		opt.setAcceptInsecureCerts(true);
		opt.addPreference("browser.download.folderList", 2);
		opt.addPreference("browser.download.dir", System.getProperty("user.dir")+"/downloads");
		opt.setHeadless(true);
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
