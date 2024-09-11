package ecap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XPATH {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();     //webDriver=interface
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shitalparab2605@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("shital123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		driver.close();
		
	}

}
