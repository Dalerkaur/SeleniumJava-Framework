import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilityDemo {

	public static void main(String[] args) {
		WebDriver driver;
		String project_path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",project_path+ "/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setBrowserName("Chrome");
		driver.manage().window().maximize();
	}

}
