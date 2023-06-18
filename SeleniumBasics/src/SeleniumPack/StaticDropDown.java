package SeleniumPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*if you find any drop down with fixed values that is called static drop down.
 *  if you find a drop down with Tag name SELECT than selenium has a class to identify the element
 *  we ll create the object to use it.and add some values in the parameters
 *  Select obj = new select( values) //select is predefined class in Selenium
 */
   public class StaticDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rayan\\Downloads\\newdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/search.aspx");
		
		Select currency = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		
      //Script to select currency from static drop down.
		String  value = currency.getFirstSelectedOption().getText();
       System.out.println("the default value is" +value);
      
       //currency.selectByValue("EUR");
       currency.selectByIndex(5);
      // currency.selectByValue("CAD").
       String  value1 = currency.getFirstSelectedOption().getText();
       System.out.println("the selected value is" +value1);
       
       //Script to select number of passenger.
       String passenger = driver.findElement(By.id("divpaxinfo")).getText();
       System.out.println(passenger);
       
       driver.findElement(By.id("divpaxinfo")).click();
      
       //Script to select number of ADULT.
       Select adult = new Select(driver.findElement(By.name("ControlGroupSearchView$AvailabilitySearchInputSearchView$DropDownListPassengerType_ADT")));
       adult.selectByVisibleText("3");
       String passenger1 = driver.findElement(By.id("divpaxinfo")).getText();
       System.out.println("Selected value " +passenger1);
       //Script to select number of child.
       
       Select child = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
       child.selectByValue("2");
       String passenger2 = driver.findElement(By.id("divpaxinfo")).getText();
       System.out.println("Selected Valvues " +passenger2);
       // Script to write infant.
       Select infant = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
       infant.selectByIndex(1);
       String passenger3 = driver.findElement(By.id("divpaxinfo")).getText();
       System.out.println("Selected Value " +passenger3);
       
       
       
       
       
       
       
       
       
     
       			
       
       
       
       
       
       
       
       
       
        
	}

}
