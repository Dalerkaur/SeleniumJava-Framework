import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestStep {
	
	WebDriver driver;
		@BeforeTest
		public void setUp() {
			
		
			String project_path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",project_path+ "/src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		
		@Test
		public void verifySteps() {	
			driver.get("https://www.google.com");
			
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
			System.out.println("Closing the Browser");
		}
}
