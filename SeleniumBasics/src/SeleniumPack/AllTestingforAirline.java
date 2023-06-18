package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllTestingforAirline {
	static WebDriver driver;
	public void selectpassenger(String adultcount,String childcount,int infantcount) {
		 String passenger = driver.findElement(By.id("divpaxinfo")).getText();
	       System.out.println(passenger);
	       driver.findElement(By.id("divpaxinfo")).click();
		
		Select adult = new Select(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT")));
	       adult.selectByVisibleText(adultcount);
	       String passenger1 = driver.findElement(By.id("divpaxinfo")).getText();
	       System.out.println(passenger1);
	       
	      
	       Select child = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
	       child.selectByValue(childcount);
	       String passenger2 = driver.findElement(By.id("divpaxinfo")).getText();
	       System.out.println(passenger2);
	       
	       Select infant = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
	       infant.selectByIndex(1);
	       String passenger3 = driver.findElement(By.id("divpaxinfo")).getText();
	       System.out.println(passenger3);
	       }
	public void fromto(String from,String to) {
		
		driver.get("https://book.spicejet.com/search.aspx");
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='"+from+"']")).click();
		driver.findElement(By.xpath("(//a[@value='"+to+"'])[2]")).click();
	}
	 
	static void initbrowsing(String url) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get(url);
		
	}
	
	public static void main(String[] args) {
		
		
		AllTestingforAirline obj = new AllTestingforAirline();
		initbrowsing("https://book.spicejet.com/");
		
		obj.selectpassenger("3", "2",1);
		obj.fromto("BLR","KQH");
		
		
				

	}

}
