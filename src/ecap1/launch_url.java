package ecap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_url {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();     //webDriver=interface
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Thread.sleep(3000);   //3s
		
		driver.findElement(By.id("email")).sendKeys("shitalparab2605@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("shital123");
		Thread.sleep(3000);
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}
}