import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String args[]) {
	@BeforeTest
	public void setUp() {
		
		WebDriver driver = new ChromeDriver();
		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",project_path+ "/src/test/resources/Drivers/chromedriver.exe");
		driver.manage().window().maximize();
		GoogleSearch gc = new GoogleSearch(driver);
	}
	
	@Test
	public void verifySteps() {	
		driver.get("https://www.google.com");
		
		
	}
	
	@AfterTest
	public void tearDown() {
		gc.closeBrowser();
		System.out.println("Closing the Browser");
	}
}}
