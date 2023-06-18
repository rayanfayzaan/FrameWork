package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\rayan\\\\Downloads\\\\newdriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//script to click on alerts or how to handle the Alerts.
		
	/*	driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		String alertmsg = driver.switchTo().alert().getText();
		System.out.println(alertmsg);*/
		
		//Script to Click on OK or Cancel with alerts
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		     //driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		String alertmessage = driver.findElement(By.id("demo")).getText();
		System.out.println(alertmessage);
		if(alertmessage.equals("You Pressed Cancel"))
		{
			System.out.println("Alert id Canceled");
		}
		else
		{
			System.out.println("You pressed ok");
		}
		
		
		
	
	}
	

}
