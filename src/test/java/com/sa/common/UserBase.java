package com.sa.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserBase {
	
	public static WebDriver driver;
	public static String baseURL = "https://opensource-demo.orangehrmlive.com/";
	public static void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}
	public void CloseBrowser() {
		driver.close();
	}
	public void tearDown() {
		driver.close();
	}


}
