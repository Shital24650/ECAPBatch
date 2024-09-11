package ecap1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dismiss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
        /*driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        Alert al=driver.switchTo().alert();
        al.dismiss();*/
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        Alert ale=driver.switchTo().alert();
        ale.sendKeys("shital");
        Thread.sleep(3000);
        ale.accept();

	}

}
