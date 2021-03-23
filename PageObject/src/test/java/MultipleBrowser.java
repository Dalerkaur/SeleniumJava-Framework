import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultipleBrowser {

	WebDriver driver = null;
	String project_path = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest(description = "This test will launch the browser")
	public void setUp(String browserName) {
		System.out.println("Browser name is"+ browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",project_path+ "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",project_path+ "/src/test/resources/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	@Test
	public void NavigateBrowser() {
		driver.get("http://google.com");
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
