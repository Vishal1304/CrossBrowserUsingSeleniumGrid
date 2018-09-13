package com.project.crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsertesting {

	public static WebDriver driver;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("IE")){
			//create firefox instance
				System.setProperty("webdriver.ie.driver", "G:\\java_workspace\\BrowserDriver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("Chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver","G:\\java_workspace\\BrowserDriver\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
			}}
	@Test public void login() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/");
		// Find user name
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.name("uid"));
		// Fill user name
		userName.sendKeys("Test1");
		// Find password
		WebElement password = driver.findElement(By.name("password"));
		// Fill password
		password.sendKeys("1");
		Thread.sleep(2000);

		}  
	}

