package com.vfislk.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.medibuddy.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Signup")).click();
		
		driver.findElement(By.name("username")).sendKeys("aaa");
		driver.findElement(By.name("mobile")).sendKeys("988816");
		driver.findElement(By.name("useremail")).sendKeys("aaabbbb@test.com");
		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();
		String txt = driver.findElement(By.xpath("//dev[contains(text(),'INVALID'))]")).getText();
		
		System.out.println(txt);
	
		
	}

}
