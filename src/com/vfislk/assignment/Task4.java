package com.vfislk.assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.openemr.io/b/openemr/interface/login/login.php?site=default");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		Select selectlanguage = new Select(driver.findElement(By.name("languageChoice")));
		selectlanguage.selectByVisibleText("Default - English (Standard)");;
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Patient/Client']"))).perform();
		driver.findElement(By.xpath("//div[text()='Patients']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'dynamic_finder')]")));
		driver.findElement(By.xpath("//button[@id='create_patient_btn1']")).click();
		driver.switchTo().defaultContent();
		
	
		driver.switchTo().frame("pat");
		//Select gender = new Select(driver.findElement(By.xpath("//select[@name='form_sex']")));
		//gender.selectByVisibleText("Female");
		driver.findElement(By.id("form_fname")).sendKeys("Balaji");
		driver.findElement(By.id("form_lname")).sendKeys("Dinakaran");
		
		driver.findElement(By.id("form_DOB")).sendKeys("2021-07-21");
		
		Select selectGender=new Select(driver.findElement(By.id("form_sex")));
		selectGender.selectByVisibleText("Male");
		
		driver.findElement(By.id("create")).click();
		
		
		
	}

}
