package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends AllTestingforAirline {

	public static void main(String[] args) {
		initbrowsing("https://book.spicejet.com/");
		
		List<WebElement> radiobutton = driver.findElements(By.xpath("//div[@id='travelOptions']/div/label"));
		for(WebElement radiotext: radiobutton)	
		{
		System.out.println(radiotext.getText());	
		}
	
		
	}

}
