package com.tutorialsninja.qa.testcases;

import java.time.Duration;  

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogIn1withAfterMethod {
		
		@Test
		public void logInWithValidCred()  {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			
			driver.get("https://tutorialsninja.com/demo/");
			driver.findElement(By.xpath("//span[text()='My Account']")).click();
			driver.findElement(By.linkText("Login")).click();
		
			driver.findElement(By.id("input-email")).sendKeys("thej5454undlmefined04dttgu1@gmail.com");
			driver.findElement(By.id("input-password")).sendKeys("12345555nkhhh");
			
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			
			String actualWarnigMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
			String expectedWarningMessgae = "Warning: No match for E-Mail Address and/or Password.";
			Assert.assertTrue(actualWarnigMessage.contains(expectedWarningMessgae), "Expected warning message is not displayed");
			
			 driver.quit();
			 
		}
		
		@Test
		public void logWithValidCred() throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			 
			 driver.get("https://tutorialsninja.com/demo/");
			 driver.findElement(By.xpath("//span[text()='My Account']")).click();
			 driver.findElement(By.linkText("Login")).click();
			 driver.findElement(By.id("input-email")).sendKeys("theundefined04@gmail.com");
			 driver.findElement(By.id("input-password")).sendKeys("12345");
			 driver.findElement(By.xpath("//input[@value='Login']")).click();
			 
			 Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
			 
			 driver.quit();
			
			 
			 driver.get("https://demoqa.com/select-menu");
				
				//now what we do is find an element. Why?  Because of the requirement as we have to select the multiple drop-down.
				//1st we will find locators of particular Drop-down.
				
				WebElement carDropDown = driver.findElement(By.id("cars"));
				
				//now we have to select any option from the drop-down by Using "Select()" or SELECT class It is  non-Static object.
				
				Select select = new Select(carDropDown); 
				
				// By using reference variable eg.(select is a reference variable from above syntax) we can get particular name or WebElement from the list with the help of few method from SELECT class.
				
				Thread.sleep(2000);
				select.selectByVisibleText("Saab");
				Thread.sleep(2000);
				select.selectByVisibleText("Audi");
				Thread.sleep(2000);
				select.selectByVisibleText("Opel");
			
		}

			
		
}
