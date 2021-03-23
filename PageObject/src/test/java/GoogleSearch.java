import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class GoogleSearch {

WebDriver driver=null;	
	@FindBy(name="q")
	WebElement username;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver = driver;
	}
	@Test
	public void sendText() throws InterruptedException {
		
	username.sendKeys("Automation Testing");
	Thread.sleep(4000);
	}
	
	public void closeBrowser() {
		driver.close();
	}
}
