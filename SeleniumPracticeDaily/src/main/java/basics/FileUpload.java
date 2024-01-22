package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234576");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		alert.getText();
		//driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\Desktop\\JAVA PROGRAMMING.pdf");
		

	}

}
