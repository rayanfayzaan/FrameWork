package SeleniumPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSelection {
	static WebDriver driver;
	
	public void checkbox(String firstvalue,String secondvalue) {
		
		int totalchk =  driver.findElements(By.id("//input[@type='checkbox']")).size();
		System.out.println(totalchk);
		int  chkbox = driver.findElements(By.xpath("//div[contains(@class,'padding-bottom-3')]/p")).size();
		System.out.println(chkbox);
		
		List<WebElement> chk= driver.findElements(By.xpath("//div[contains(@class,'padding-bottom-3')]/p"));
		  	
			for(WebElement element:chk) {	//here we save the value in list<webelement> to pull TEXT with element.
			System.out.println(element.getText());
			
		  if(element.getText().equals(firstvalue));
			
			driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_"+secondvalue+"")).click();
			}
		}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		
		 CheckBoxSelection obj = new CheckBoxSelection();
		 obj.checkbox("Sr. Citizen","SeniorCitizen");
		
		 //obj.checkbox("Armed Forces","Defence");
		
		
		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		//driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
	
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_SeniorCitizen")).click();
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Defense")).click();
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_LTCFare")).click();
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_GovtEmp")).click();
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_Student")).click();
		//	driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_UNMR")).click();
			
}
}

