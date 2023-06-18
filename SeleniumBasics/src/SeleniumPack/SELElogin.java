package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SELElogin {

	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
	//Locator with ID...
	//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	/*driver.findElement(By.id("login1")).sendKeys("firsttest");
	driver.findElement(By.id("password")).sendKeys("123456");*/
	
	//Locator with Name...
		
	/*driver.findElement(By.name("login")).sendKeys("FirstTest");	
	driver.findElement(By.name("passwd")).sendKeys("78910");*/
	
	//Locator with X.path...
	
	/*driver.get("https://mail.rediff.com");
	driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
	driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Entename");
	driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("112233");
	driver.findElement(By.xpath("//input[@value='Sign in']")).click();*/
		
	//Locator with css-method.
		
		driver.get("https://mail.rediff.com");
		driver.findElement(By.cssSelector("a[class=signin]")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("ENTERNAME");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("11223");
		
		
		
			
	

	
	
	
	
	
	}

}
