package qspTest;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class PrintPriceAndText {
	
	public static String browser= "Edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome")) {
			 driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
			 driver= new FirefoxDriver();
		}
		else if(browser.equals("Edge")) {
			 driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.flipkart.com/");
         driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iphone12"+ Keys.ENTER);
         
         List<WebElement> proName=driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
         List<WebElement> price= driver.findElements(By.xpath("//div[@class=\"_30jeq3 _1_WHN1\"]"));
         
         int countprosize= proName.size();
         System.out.println(countprosize);
         
         for(int i=0;i<=countprosize-1;i++) {
        	 String text=proName.get(i).getText();
        	 String priccee=price.get(i).getText();
        	 System.out.println(text+": "+priccee);
         }
         driver.close();
	}
	

}
