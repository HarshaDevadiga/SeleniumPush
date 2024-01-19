package learningSelenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonwebsite {
	
	//public static String browser="edge";
	
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter browser name");
		String browser = sc.nextLine();
			
		if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		else if (browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		
		  driver.manage().window().maximize();
		  driver.get("https://www.saucedemo.com/");
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  
		  Thread.sleep(1000);
		 
		  driver.close();
		  
		  

	}

}
