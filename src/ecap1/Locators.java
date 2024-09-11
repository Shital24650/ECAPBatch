package ecap1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();     //webDriver=interface
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		

       Thread.sleep(4000);
        //driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.partialLinkText("Create new")).click();
        Thread.sleep(4000);
       driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("shital");
        Thread.sleep(4000);
       driver.findElement(By.cssSelector("#password_step_input")).sendKeys("shital123");
        Thread.sleep(4000);
        driver.close();
	}

}       
