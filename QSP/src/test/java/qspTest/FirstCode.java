package qspTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCode {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.name("q")).sendKeys("JAVA");
		 Thread.sleep(2000);
		 List<WebElement> Autosuj= driver.findElements(By.xpath("//div/ul/li"));
		 int count = Autosuj.size();
		 System.out.println(count);
		 //Print Text By Using For Loop
		 for(int i=0;i<=count-1;i++) {
			 String text= Autosuj.get(i).getText();
			 System.out.println(text);
		 }
		 //using for loop
		 System.out.println("Onther Methods Prints");
		 for(WebElement sugg:Autosuj) {
			
			 System.out.println( sugg.getText());
		 }
		 //Click The First Suggestion
		 Autosuj.get(0).click();

	}

}
