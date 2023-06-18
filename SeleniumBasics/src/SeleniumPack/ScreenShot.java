package SeleniumPack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;

public class ScreenShot extends AllTestingforAirline  {

	public static void main(String[] args) {
		
		//how to take the screen shot.
		initbrowsing("https://www.amazon.in/");
		
		
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			Files.copy(screenshot, new File("C:\\Users\\rayan\\Desktop\\shoaib\\amazon.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
