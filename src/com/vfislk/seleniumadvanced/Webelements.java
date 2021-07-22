package com.vfislk.seleniumadvanced;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/?gws_rd=ssl");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		int linkcount = elements.size();
		WebElement ele0 = elements.get(0);
		ele0.click();
		
		System.out.println(linkcount);
		
		

	}

}
