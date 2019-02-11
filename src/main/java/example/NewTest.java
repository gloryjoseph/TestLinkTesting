package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	 String driverPath = "./driver/geckodriver.exe";
	private WebDriver driver;
@Test
public void f() {
	  driver.get("https://www.google.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google")); 
}

@BeforeTest
public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", driverPath);
    driver = new FirefoxDriver();
}

@AfterTest
public void afterTest() {
	  	driver.quit();
}
}
