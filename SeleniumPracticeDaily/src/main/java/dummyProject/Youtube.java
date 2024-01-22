package dummyProject;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	public static String browser="Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter browser name");
//		String browser = sc.nextLine();
		
		if(browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	    driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("Kannada Music");
	 
	    driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
		
		driver.close();

	}

}
