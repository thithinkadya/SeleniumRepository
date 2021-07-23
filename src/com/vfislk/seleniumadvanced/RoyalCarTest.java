package com.vfislk.seleniumadvanced;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalCarTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.royalcaribbean.com/");
		
		if(driver.findElements(By.xpath("//*[@class='email-capture__close']")).size()>0) 
		{
				driver.findElement(By.xpath("//*[@class='email-capture__close']")).click();
		}
		driver.findElement(By.id("rciHeaderSignIn")).click();
		driver.findElement(By.linkText("Create an account")).click();
		
		driver.findElement(By.xpath("//input[@data-placeholder='First name/Given name']")).sendKeys("royal");
		driver.findElement(By.xpath("//input[@data-placeholder='Last name/Surname']")).sendKeys("test");
		driver.findElement(By.xpath("//span[text()='Month']")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='April']")).click();
		
		driver.findElement(By.xpath("//span[text()='Day']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='3']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Year']")).sendKeys("1983");
		driver.findElement(By.xpath("//span[text()='Country/Region of residence']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='India']")).click(); 
		driver.findElement(By.xpath("//input[@data-placeholder='Email address']")).sendKeys("thithin@gmail.com");
		driver.findElement(By.xpath("//input[@data-placeholder='Create new password']")).sendKeys("Welcome@34562");
		driver.findElement(By.xpath("//span[text()='Select one security question']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='What was the name of your first pet?']")).click();
		driver.findElement(By.xpath("//input[@data-placeholder='Answer']")).sendKeys("Puppy");
		//*[@id="mat-select-value-7"]/span/span
		
		driver.findElement(By.xpath("//input[@aria-labelledby='agreements']/..")).click();
		
		
	}

}
