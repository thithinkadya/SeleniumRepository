package com.vfislk.unqork;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Unqork {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://professionalsportal.accp.americas.intranet/portal/public ");
		driver.findElement(By.id("userlogin")).sendKeys("i722333");
		driver.findElement(By.id("password")).sendKeys("Welcome@6789");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//span[text()='My Business']")).click();
		driver.findElement(By.xpath("(//a[@class='voya-megamenu-list-item-link'])[2]")).click(); 
		
		//String win = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		
		for(String win : window) {
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println(driver.getTitle());
		}
		
		driver.findElement(By.xpath("(//span[@class='button-label ng-binding'])[4]")).click();
		//driver.close();

	}

}
