package SeleniumPack;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHaldling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Windows.html");
			
			driver.manage().window().maximize();
		
			
			//	System.out.println("Before Clicking"+window);
			//		Set<String> window2 = driver.getWindowHandles();
			//		System.out.println("After Clicking" +window2);
			
			driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
			Set<String> window = driver.getWindowHandles();
			Iterator<String> it =window.iterator();
			String FirstWindow = it.next();
			String secondWindow =it.next();
			System.out.println("First  Window is-" +FirstWindow);
			System.out.println("Second Window is-" +secondWindow);
			
		
			driver.switchTo().window(secondWindow);
		    String message =	driver.findElement(By.xpath("//div[contains(@class,'mx-auto text-center')]/h1")).getText();
			System.out.println(message);
			
			//here we write the code to switch to first window...
			
			driver.switchTo().window(FirstWindow);
			//here you can write the script for first window.
			
	
	
	}
	
	

}
