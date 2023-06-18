package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");

		Actions mouse = new Actions(driver);
		driver.switchTo().frame(0);
	//	mouse.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).perform();
		
		//the Same code is down....
		WebElement source =(driver.findElement(By.id("draggable")));
		WebElement target =(driver.findElement(By.id("droppable")));
		
		mouse.dragAndDrop(source,target).perform();
		
		
	}

}
