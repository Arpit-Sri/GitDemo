package paf;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class End_To_End {
	
	
		@Test
		
		public void logIN() throws InterruptedException {
			
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://acharyaprashant.org/");
			
			driver.findElement(By.id("main-website-right-menu-btn")).click();
			driver.findElement(By.xpath("//*[@id=\"main-nav-bar\"]/div/div/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/a/div/span")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div[1]/div[1]")).click();
			
			driver.close();
			
			
			
			
		}
	
}
