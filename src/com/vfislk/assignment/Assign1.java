package com.vfislk.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assign1 {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		System.out.println(driver.getCurrentUrl());  
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(By.id("btnAddContact")).click();
		driver.findElement(By.name("emgcontacts[name]")).sendKeys("Thithin");
		driver.findElement(By.name("emgcontacts[relationship]")).sendKeys("CRM");
		driver.findElement(By.id("emgcontacts_homePhone")).sendKeys("123456");
		driver.findElement(By.id("btnSaveEContact")).click();

	}

}
