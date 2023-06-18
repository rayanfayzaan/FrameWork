package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumbasics {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
 	
	driver.get("http://www.hdfcbank.com");
	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("HDFC Bank – Personal Banking & Netbanking Services"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	//driver.close();
	}
	
	

}
