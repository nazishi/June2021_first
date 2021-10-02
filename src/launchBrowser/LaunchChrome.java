package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\June 2021_Selenium\\1st-Selenium_Project\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //driver is called object variable
		
		//maximize
		driver.manage().window().maximize();
		//get web site
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//identify web element and perform action
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		
		//wait
		Thread.sleep(3000);
		driver.close();
	
	}
	
}
