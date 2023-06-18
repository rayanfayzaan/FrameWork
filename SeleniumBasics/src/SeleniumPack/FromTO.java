package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FromTO {
	static WebDriver driver;
	
	public void fromtoo(String from,String to)
	{
		driver.get("https://book.spicejet.com/search.aspx");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='"+from+"']")).click();
		driver.findElement(By.xpath("(//a[@value='"+to+"'])[2]")).click();
		
		//driver.findElement(By.xpath("(//a[@text='Nashik (ISK)'])[2]")).click();
	}
	
	

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 FromTO obj = new FromTO();
		 obj.fromtoo("BLR","KQH");
		 
	//	 obj.fromtoo("BHO","BOM");
	//	 driver.close();
		 
		 
		
		
		
		
		
		
		
		
		
			
		
	}

}
