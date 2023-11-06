package qspTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSearchBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Iphone");
		 Thread.sleep(2000);
		 List<WebElement> autosug= driver.findElements(By.xpath("//ul/li"));
		int count= autosug.size();
		System.out.println(count);
		for(int i=0;i<=count-1;i++) {
			String text=autosug.get(i).getText();
			System.out.println(text);
		}
		
	}

}
