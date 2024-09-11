package ecap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_class {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		WebElement books=driver.findElement(By.linkText("BOOKS"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.moveToElement(books).build().perform();
		Thread.sleep(3000);
		

	}

}
