package seleniumtesting.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hoverover {

	WebDriver driver;
	@Before 
  public void hoverOverTest() throws InterruptedException {

	
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("http://www.dell.com/en-us");
	
	Actions action = new Actions(driver);
	String xpath = "sdfds";
	By locator = By.xpath("sdfds");
    WebElement element= driver.findElement(By.xpath("sdfds"));
	WebElement DEALS_MENU_ELEMENT= driver.findElement(By.xpath("sdfds"));
	
	
	action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
   
	Thread.sleep(2000);
	
  
  }
   
   @Test
   public void searchForXjpathInYahoo() {
	   By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");
	   By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - w3schools.com");
	   
	   driver.findElement(SEARCH_FIELD_LOCATOR).sendkeys("xpath");
	   driver.findElement(SEARCH_FIELD_LOCATOR).sendkeys(Keys.ENTER);
	   
	   WebDriverWait element=new WebDriverWait.un
	   System.out.println(driver.getWindowHandles());
	   
	   driver.findElement(W3_LINK_LOCATOR).click();
	   
	   System.out.println(driver.getWindowHandles());
	   
	   for (String windowHandle: driver.getWindowHandles()) {
		   driver.switchTo().window(windowHandle);  
	  }
	   
	   driver.fimdElement(SQL_LINK_LOCATOR).click();
	   
  }

   @After
   public void closeEverything() {
	   
   }

}
