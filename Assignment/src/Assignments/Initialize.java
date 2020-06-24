package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Initialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver is an interface
		//ChromeDriver driver = new ChromeDriver(); //creating an instance of chrome driver
		//FirefoxDriver driver = new FirefoxDriver();
		//InternetExplorerDriver driver= new InternetExplorerDriver();
		
		//driver.getLocalStorage();
		//driver.location();
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://magento.com");//method with argument. It loads the url on your browser
		//driver.navigate().to("http://magento.com"); //get and navigate() are same to load the url
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();//capture the url on your browser to validate the url
		System.out.println(url);
		//System.out.println(driver.getCurrentUrl());
		
		if(url.startsWith("https"))
		{
			System.out.println("Secured");
		}
		if(url.equals("https://magento.com"))
		{
			System.out.println("As expected");
		}
		
		//driver.getPageSource();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("eCommerce Platforms | Best eCommerce Software for Selling Online | Magento"))
		{
			System.out.println("As expected");
		}
		
		//Manage method will give options to manage your window like maximixe, minimize, addcookies etc.
		//cookies are used to store your data temporary
		//cookie mgmt, winodw mgmt and timeout mgmt
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
		driver.quit();
	}

}
