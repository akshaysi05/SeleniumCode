package qspTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {
	
	public static  String brow= "Edge";
	public static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	if (brow.equals("Chrome")) {
		 driver= new ChromeDriver();
		
	}
	else if(brow.equals("FireBox")) {
		 driver= new FirefoxDriver();
		
	}
	else if(brow.equals("Edge")) {
		 driver= new EdgeDriver();
	}
	

	}

}
