package com.zbib.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import com.zbib.pages.OtherFunctionsInHomePage;;

public class CommonFunctions {

	public static WebDriver driver =null;
	public static Properties prop = null;

	Logger logger = Logger.getLogger(CommonFunctions.class);
	
	public Properties loadPropFile() throws IOException {

		FileInputStream fileInput = new FileInputStream("config.properties");
		prop = new Properties();
		prop.load(fileInput);
		return prop;

	}
	
	public void switchWindows() {
		logger.info("Switching the Window");

		String BookSelected = driver.getWindowHandle();
		Set<String> editPage = driver.getWindowHandles();
		for (String edWindow : editPage) {
			driver.switchTo().window(edWindow);
		}
	}

	
	public void launchBrowser() throws IOException, Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Loading Prop File");
		loadPropFile();
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		String driverLocation = prop.getProperty("driverLocation");
		
		browser.equalsIgnoreCase("chrome");
			System.setProperty("webdriver.chrome.driver", driverLocation);
			logger.info("Launching Browser");
			driver = new ChromeDriver();

		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);

	}

	public void deleteAllBookList() {
		logger.info("Deleting all listed books");
		OtherFunctionsInHomePage.deleteAll.click();
		OtherFunctionsInHomePage.clickDeleteAll.click();
	}

	@AfterSuite
	public void closeBrowser() {
		logger.info("Closing Browser");
	//	deleteAllBookList();
	//	driver.quit();
	}

}
