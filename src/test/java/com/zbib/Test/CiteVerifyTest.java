package com.zbib.Test;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.zbib.utils.CommonFunctions;
import com.zbib.utils.ExploreHomePage;
import com.zbib.pages.HomePage;
import com.zbib.pages.SearchPage;

public class CiteVerifyTest extends CommonFunctions{

	CommonFunctions fn = new CommonFunctions();
	static Logger logger = Logger.getLogger(ManualEntryVerify.class);
	public final static String sendSotedName = "Petrarca, Quillen – 2003";

	@Test
	public void searchBookEntry() throws Exception  {

		PageFactory.initElements(driver, HomePage.class);
		PageFactory.initElements(driver, SearchPage.class);
		findBook();
		editBook();
		ExploreHomePage newHomePage = new ExploreHomePage();
		newHomePage.functionalitiesOfHomePage();

	}

	public void findBook() throws Exception {
		logger.info("Searching the Book");
		fn.loadPropFile();
		String sendBookName = loadPropFile().getProperty("sendBookName");
		HomePage.searchBar.sendKeys(sendBookName);
		HomePage.citeButton.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		fn.switchWindows();

		SearchPage.moreSearch.click();

		Thread.sleep(20000);
		for (WebElement elements :SearchPage.selectSearch) {

			if(elements.getText().contains(sendSotedName)) {
				elements.click();
				break;
			}
		} 


	}
	

	public void editBook() throws Exception {
		logger.info("Editing the selected Book");
		PageFactory.initElements(driver, SearchPage.class);
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		SearchPage.editBook.click();

		fn.switchWindows();

		fn.loadPropFile();

		String abstractDetails = loadPropFile().getProperty("abstractDetails");
		SearchPage.updateAbstractDetails.sendKeys(abstractDetails);

		SearchPage.clickDone.click();
	}
	@BeforeMethod
	public void openBrower() throws Exception {
		fn.launchBrowser();
	}

}
