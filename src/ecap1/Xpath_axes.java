package ecap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_axes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();     //webDriver=interface
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
        driver.findElement(By.xpath("//div[@class='_6ltg']//child::a")).click();
	}

}