package com.zbib.Test;


import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zbib.utils.CommonFunctions;
import com.zbib.utils.ExploreHomePage;
import com.zbib.pages.HomePage;
import com.zbib.pages.MannualEntryPage;


public class ManualEntryVerify extends CommonFunctions{
	CommonFunctions fn = new CommonFunctions();
	
	static Logger logger = Logger.getLogger(ManualEntryVerify.class);
	
	@Test
	public void manualBookEntry() throws Exception  {
		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, MannualEntryPage.class);
		
		clickNewEntry();
		enterDetailsManually();
		logger.info("Exploring the HomePage functionalities after manually entered the book details");
		ExploreHomePage newHomePage = new ExploreHomePage();
		newHomePage.functionalitiesOfHomePage();
		
	}
	
	public void clickNewEntry() {
		logger.info("Adding New Entry Manually");
		HomePage.newEntry.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		fn.switchWindows();
	}
	
	public void enterDetailsManually() throws Exception {
		
		Thread.sleep(3000);
		fn.loadPropFile();
		String sendtitle = loadPropFile().getProperty("sendtitle");
		MannualEntryPage.title.sendKeys(sendtitle);
		String sendAuthorLastName = loadPropFile().getProperty("sendAuthorLastName");
		MannualEntryPage.authorLastName.sendKeys(sendAuthorLastName);
		String sendAuthorFirstName = loadPropFile().getProperty("sendAuthorFirstName");
		MannualEntryPage.authorFirstName.sendKeys(sendAuthorFirstName);
		String sendSerialNumber = loadPropFile().getProperty("sendSerialNumber");
		MannualEntryPage.serialNumber.sendKeys(sendSerialNumber);
		String sendNoOfPages = loadPropFile().getProperty("sendNoOfPages");
		MannualEntryPage.noOfPages.sendKeys(sendNoOfPages);
		String sendlanguage = loadPropFile().getProperty("sendlanguage");
		MannualEntryPage.language.sendKeys(sendlanguage);
		MannualEntryPage.button.click();
	}
	@BeforeMethod
	public void openBrower() throws Exception {
		fn.launchBrowser();
	}
}
