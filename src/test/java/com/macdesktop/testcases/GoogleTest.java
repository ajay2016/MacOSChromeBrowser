package com.macdesktop.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void googleTest() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//drivers//chromedriver");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "null");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("abc");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

}
