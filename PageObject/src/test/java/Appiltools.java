import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.selenium.Eyes;

public class Appiltools {
	WebDriver driver = new ChromeDriver();
	 
    Eyes eyes = new Eyes();{
  //  Eyes ey = new Eyes();
    // This is your api key, make sure you use it in all your tests.
   eyes.setApiKey("sFTKZzrKMtFYSil3fn86VJEXkr1088x5lElmLkAtzwhNA110");

    try {
        // Start visual testing with browser viewport set to 1024x768.
        // Make sure to use the returned driver from this point on.
        driver = eyes.open(driver, "Applitools", "Test Web Page", new RectangleSize(1024, 768));

        driver.get("http://applitools.com");

        // Visual validation point #1
        eyes.checkWindow("Main Page");

        driver.findElement(By.cssSelector(".features>a")).click();

        // Visual validation point #2
        eyes.checkWindow("Features page");

        // End visual testing. Validate visual correctness.
        eyes.close();
    } finally {
        // Abort test in case of an unexpected error.
        eyes.abortIfNotClosed();
        driver.close();
    }
}
}
