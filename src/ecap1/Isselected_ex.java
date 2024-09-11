package ecap1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected_ex {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();     
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement male=driver.findElement(By.xpath("//input[@id='gender-male']"));
		male.click();
		System.out.println(male.isSelected());

	}

}
