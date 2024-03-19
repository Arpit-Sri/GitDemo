package com.tutorialsninja.qa.testcases;

import java.time.Duration; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchasingTicket {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		
		driver.get("https://blazedemo.com/index.php");
		
		WebElement departureCity = driver.findElement(By.name("fromPort"));
		
		Select select = new Select(departureCity);
		
		select.selectByVisibleText("Mexico City");
		
		WebElement destinationCity = driver.findElement(By.name("toPort"));
		Select select2 = new Select(destinationCity);
		

		select2.selectByVisibleText("London");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		
		System.out.println("hello guys");

	}
	
	

}
