package com.tutorialsninja.qa.testcases;

import java.util.Set; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlePop_up_window {

				
		@Test
		
		public void popUpHandle()  {
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://omayo.blogspot.com/");
			
			String parentWindow = driver.getWindowHandle();   //capturing the window ID of the current window or Parent Window.
			
			driver.findElement(By.linkText("Open a popup window")).click();
			
			//after clicking on this link there will be 2 windows open so we will capture too.
			
			Set<String> windows = driver.getWindowHandles();
			
			for(String win : windows) {
				
				//since we don't know, on which window we are so for that we have to switch it to the window . 
				driver.switchTo().window(win);
				
				if(driver.getTitle().equals("New Window")) {
					
					driver.manage().window().maximize();
					
					
					driver.close();
					
				}
				
			}
				driver.switchTo().window(parentWindow);
				driver.findElement(By.id("ta1")).sendKeys("Hello");
				
				
		}
		
	
		
	
}
