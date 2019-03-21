package com.mckinesey.TestBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtilities {
	public static WebDriver openbrowser(WebDriver driver,String browserName,String URL) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		
		else if(browserName.equals("IE")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/geckodriver.exe");
			driver=new ChromeDriver();
			
			
			
			
		}
		
		
		else {
			System.out.println("unable to open the driver");
		}
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
	

}
