package seleniumtesting.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuptest {

	@Test
@Test

Public void 


WebDriver driver = new ChromeDriver();
 @Test
public void PopupTest() throws InterruptedException {

driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.get("http://docs.oracle.com/javase/8/docs/api/");

Thread.sleep(3000);

driver.findElement(By.LinkText("java.applet")).click();

driver.switchTo()











}
