package SeleniumPack;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class HMmouseoverScreenShot {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www2.hm.com/fr_be/index.html");
		
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.xpath("//ul[@class='_b1_']/li[1]"))).perform();
		
		driver.findElement(By.xpath("//a[text()='Chaussures et accessoires']")).click();
		
		
		
		/*File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(screenshot, new File("C:\\Users\\rayan\\Desktop\\shoaib\\H&M.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}    */
		
	}

}
