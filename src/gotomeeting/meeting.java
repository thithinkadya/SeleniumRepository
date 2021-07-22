package gotomeeting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class meeting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gotomeeting.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("truste-consent-button")).click();
		driver.findElement(By.linkText("Start for Free")).click();
		driver.findElement(By.id("first-name")).sendKeys("aaa");
		driver.findElement(By.id("last-name")).sendKeys("aaac");
		driver.findElement(By.name("Email")).sendKeys("aaa@test.com");
		driver.findElement(By.id("contact-number")).sendKeys("9164188816");
		
		Select sel = new Select(driver.findElement(By.id("JobTitle")));
		sel.selectByValue("Help Desk");
		driver.findElement(By.xpath("//input[@value='10 - 99']")).click();
		
	}

}
