package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("singleframe");//singleframe is the frame name where we pass the data.
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Testing Frames");
	   
		 //if the frame have no name and ID we  can also use  framesBYindex.here driver have the focus on current frame
	    //than we use the command to come it out from the current frames that is DefaultContent();
	    
		 driver.switchTo().defaultContent();
	     driver.findElement(By.linkText("Iframe with in an Iframe")).click();//whenever a with href is there we can use linktext.
	    
	    
	
	
	
	
	
	}

}
