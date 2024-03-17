package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sriarpit0007@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
		
		
	}

}
