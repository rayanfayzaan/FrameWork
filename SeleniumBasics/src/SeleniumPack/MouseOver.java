package SeleniumPack;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver extends AllTestingforAirline {

	public static void main(String[] args) {
	
		
		initbrowsing("https://www.amazon.in/");
		
		//Script to move your mouse to Primevideo and click.
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		driver.findElement(By.xpath("//span[text()='Your Prime Video']")).click();
		
		driver.getCurrentUrl();
		String videolink = driver.getCurrentUrl();
		
		if(videolink.equals("https://www.primevideo.com/?ref_=_apv"))
		{
			System.out.println("Video link Displayed");
		}
		else
		{
			System.out.println("Your prime video is not displayed");
		}
		//Script to Right Click with mouse*/
		
		//Actions mouse = new Actions(driver);
		//mouse.moveToElement(driver.findElement(By.id("nav-link-accountList"))).perform();
		//mouse.moveToElement(driver.findElement(By.xpath("//span[text()='Your Prime Video']"))).contextClick().perform();
		
		//Script to enter Capital letter in search Box of Amazon.
		//mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").perform();
		
		//Script to Double click after entering television.	
		
		/*mouse.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("television").doubleClick().perform();
		driver.close();*/
	
	}

}
