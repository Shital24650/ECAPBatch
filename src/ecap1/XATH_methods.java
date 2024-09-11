package ecap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XATH_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();     //webDriver=interface
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);  
		//driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5_')]")).click(); //start-with
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("Shital@123"); //contains method
       // driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click(); //contain text()
		//driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("shital@gmail.com"); //and
		driver.findElement(By.xpath("//input[@id='email' or @name='Email']")).sendKeys("shital@gmail.com");  //or
	}

}
