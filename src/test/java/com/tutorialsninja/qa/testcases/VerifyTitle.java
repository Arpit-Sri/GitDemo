package com.tutorialsninja.qa.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class VerifyTitle {

	public static void main(String[] args) throws InterruptedException {
		
		
	ChromeDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	driver.get("https://blazedemo.com/index.php");
	
	
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("destination of the week! The Beach!")).click();
	Thread.sleep(3000);
	driver.navigate().back();
	
	//current Title
	String i = driver.getCurrentUrl();
	System.out.println(i);
	
	//get Title
	
	String j = driver.getTitle();
	System.out.println("Your page title is :" +j);
	
	Assert.assertEquals("BlazeDemo", j);
	Assert.assertEquals("BlazeDemo", driver.getTitle());
	
	driver.close();
	
	
	
	
	
	
	
	
	
	

	
	}

}
