package basics;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Admin/Downloads/MultipleWindow.html");
		
		String parentWindow = driver.getWindowHandle(); //Parent window 
		System.out.println(driver.getCurrentUrl());
		//System.out.println(parentWindow);
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Set<String> windows = driver.getWindowHandles();
		
		for(String handle:windows) {
			
			Thread.sleep(6000);
			
			driver.switchTo().window(handle);
			Thread.sleep(6000);
			if(driver.getCurrentUrl().contains("barbeque")) {
				driver.manage().window().maximize();
				ChromeOptions options=new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver.findElement(By.xpath("(//a[text()='LOGIN'])[1]")).click();
			}
			
		}

	}

}
