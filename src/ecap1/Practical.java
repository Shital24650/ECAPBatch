package ecap1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practical {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();     //webDriver=interface
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		//driver.findElement(By.cssSelector(".oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button.oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button")));
		loginButton.click();
		
    }
}
