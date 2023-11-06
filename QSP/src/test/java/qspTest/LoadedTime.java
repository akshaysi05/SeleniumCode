
package qspTest;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class LoadedTime{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		int pageLoadTimeoutSeconds = 10;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pageLoadTimeoutSeconds));
        try {
            // Navigate to the web page you want to check
            driver.get("https://hrms.naapbooks.com/");
            String title=driver.getTitle();

            // Use an expected condition to wait for page load
            wait.until(ExpectedConditions.titleContains(title));

            // If the page title contains the expected title, it means the page has loaded
            System.out.println("Page loaded successfully within " + pageLoadTimeoutSeconds + " seconds.");
        } catch (TimeoutException e) {
            System.out.println("Page did not load within " + pageLoadTimeoutSeconds + " seconds.");
        } finally {
            driver.quit();
        }
	}
	
	
}