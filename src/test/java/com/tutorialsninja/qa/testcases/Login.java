package com.tutorialsninja.qa.testcases;

import java.time.Duration;  
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login {
	
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		
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
		 
		
	}
	
	
	@Test(priority = 2)
	public void verifyLogInWithInvalidCredentials()   {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		
		
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("input-email")).sendKeys("wdhwidhiwh"+generateTimeStamp()+"@gmail.com");
		 driver.findElement(By.id("input-password")).sendKeys("1234547");
		 
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 String actualWarnigMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		 String expectedWarningMessgae = "Warning: No match for E-Mail Address and/or Password.";
		 Assert.assertTrue(actualWarnigMessage.contains(expectedWarningMessgae), "Expected warning message is not displayed");
		 
		
		 driver.quit();
	}
	
	@Test(priority = 3)
	public void logInWithValidEmailAndInvalidPassword()  {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("input-email")).sendKeys("theundefined04@gmail.com");
		 
		 driver.findElement(By.id("input-password")).sendKeys("123455447");
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 String actualWarnigMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		 String expectedWarningMessgae = "Warning: No match for E-Mail Address and/or Password.";
		 Assert.assertTrue(actualWarnigMessage.contains(expectedWarningMessgae), "Expected warning message is not displayed");
		 
		 driver.quit();
		
	}
	
	@Test(priority = 4)
	public void logInWithInvalidEmailAndValidPassword()  {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("input-email")).sendKeys("theundefined0445"+generateTimeStamp()+"@gmail.com");
		 driver.findElement(By.id("input-password")).sendKeys("12345");
		 
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 String actualWarnigMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		 String expectedWarningMessgae = "Warning: No match for E-Mail Address and/or Password.";
		 Assert.assertTrue(actualWarnigMessage.contains(expectedWarningMessgae), "Expected warning message is not displayed");
		 
		 driver.quit();
	}
	
	@Test(priority = 5)
	public void logInWithoutProvidingCredential()  {
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		 driver.get("https://tutorialsninja.com/demo/");
		 driver.findElement(By.xpath("//span[text()='My Account']")).click();
		 driver.findElement(By.linkText("Login")).click();
		 driver.findElement(By.id("input-email")).sendKeys("");
		 driver.findElement(By.id("input-password")).sendKeys("");
		 
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 String actualWarnigMessage = driver.findElement(By.xpath("//div[contains(@class,'alert-dismissible')]")).getText();
		 String expectedWarningMessgae = "Warning: No match for E-Mail Address and/or Password.";
		 Assert.assertTrue(actualWarnigMessage.contains(expectedWarningMessgae), "Expected warning message is not displayed");
		 
		 driver.quit();
	}
	
	//to overcome the issue of having a no. of logIn exceeded we use Time stamp method in below

		public String generateTimeStamp(){
			
			Date date = new Date();
			return date.toString().replace(" ", "_").replace(":", "_");
		}
}
