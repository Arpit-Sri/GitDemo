package flipKartAutomate;

import java.io.File; 
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class EndToEndTestFlow {
			
	
			@Test
			
			public void supportMultipleBroserUsingPropertyFile() throws IOException, InterruptedException   //method for support multiple browser
			{
				
				//< this is the one way to centralize this browser name instead of hard code.
				Properties prop = new Properties();  //1 to get this browser name from the properties file we have to create an object for the Properties file
				File file = new File("config.properties"); //4 giving the path of the properties file i.e. "config properties"
				FileInputStream fis = new FileInputStream(file); //3
				prop.load(fis); //2 here we have to give the input stream so we simply create a file object for stream.
				
				String browserName = prop.getProperty("browser") ;              //String browserName ="chrome" it is a hard code practice.
				WebDriver driver =null;  //>
				
				
				//
				//<
				if(browserName.equals("chrome")) {  
				
					driver = new ChromeDriver();
				}
					else if(browserName.equals("firefox")) {
					
					driver = new FirefoxDriver();
				}
					else if(browserName.equals("edge")) {
					
					driver = new EdgeDriver();
				}
					else {
					System.out.println("Provided browser is not supported ");
				
				}
				//>
				
				//<
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(3000);
				driver.quit();
				//>
				
			}			
			
			
			@Test
			@Parameters("browser")
			
			public void supportMultipleBroserUsingTestNG_XML(String b) throws InterruptedException {  //2nd method to centralize this browser 
				
				String browserName = b ;              //String browserName ="chrome" it is a hard code practice.
				WebDriver driver =null;
				
				if(browserName.equals("chrome")) {  
					
					driver = new ChromeDriver();
				}
					else if(browserName.equals("firefox")) {
					
					driver = new FirefoxDriver();
				}
					else if(browserName.equals("edge")) {
					
					driver = new EdgeDriver();
				}
					else {
					System.out.println("Provided browser is not supported ");
				
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
				driver.get("https://www.flipkart.com/");
				
				Thread.sleep(3000);
				driver.quit();
				
			}
}