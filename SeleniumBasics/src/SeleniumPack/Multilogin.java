package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multilogin {
	static WebDriver driver;
	 static void login(String username,String paswrd) { //we use the key word static to call the method without craeting object.

	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	
	driver.findElement(By.id("login1")).sendKeys(username);
	driver.findElement(By.id("password")).sendKeys(paswrd);
    driver.findElement(By.xpath("//input[@value='Sign in']")).click();
	
    String msg=driver.findElement(By.id("div_login_error")).getText();
	System.out.println(msg);
	
	if(msg.equals("Wrong username and password combination.")) {
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		}
	 }
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		login("shoaib","123456");
		Thread.sleep(3000);
		login("rayan", "654321");
		Thread.sleep(3000);
		
		login("fayzaan,", "123489");
		Thread.sleep(3000);
		login("Aman nour", "123456");
		driver.close();
		
	
		
		
		
		
	}

}
