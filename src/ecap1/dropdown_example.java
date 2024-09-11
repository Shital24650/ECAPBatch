package ecap1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class dropdown_example {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(4000);
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select se=new Select(month);
		Thread.sleep(4000);
		se.selectByVisibleText("May");
		Thread.sleep(4000);
	}
}