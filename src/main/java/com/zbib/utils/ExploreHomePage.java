package com.zbib.utils;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zbib.pages.OtherFunctionsInHomePage;;


public class ExploreHomePage extends CommonFunctions{

	public void functionalitiesOfHomePage() throws Exception {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		PageFactory.initElements(driver,OtherFunctionsInHomePage.class);

		copyCiteFromBiblio();
		editBibliography();
		changeStyle();
		copyToClipboard();
		versionView();
		goToTopPage();

	}

	public void editBibliography() throws Exception {
		Thread.sleep(8000);

		OtherFunctionsInHomePage.editBiblio.click();

		OtherFunctionsInHomePage.enterBiblio.sendKeys("My Books");
	}

	public void changeStyle() throws Exception {
		OtherFunctionsInHomePage.clickArrow.click();

		WebElement styleValue = OtherFunctionsInHomePage.selectStyleValue;
		Robot rbt = new Robot(); 
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		rbt.keyPress(KeyEvent.VK_ENTER);
		System.out.println(styleValue);
	}

	public void copyCiteFromBiblio() throws Exception {
		//	Thread.sleep(20000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@title='Copy Citation']")));
		OtherFunctionsInHomePage.copyCiteFromBiblio.click();
		CommonFunctions fn = new CommonFunctions();
		fn.switchWindows();
		OtherFunctionsInHomePage.pagesToBeCopied.sendKeys("250");
		OtherFunctionsInHomePage.checkOmitAuthor.click();
		OtherFunctionsInHomePage.submitCopiedCite.click();
	}

	public void copyToClipboard() {
		OtherFunctionsInHomePage.copyToClipBoad.click();
	}

	public void versionView() throws IOException, Exception {
		OtherFunctionsInHomePage.createVersion.click();
		OtherFunctionsInHomePage.viewVersion.click();
		OtherFunctionsInHomePage.EditVersion.click();
		CommonFunctions fn = new CommonFunctions();
		fn.switchWindows();
		OtherFunctionsInHomePage.acceptPopUp.click();
	}

	public void goToTopPage() {
		OtherFunctionsInHomePage.backToTop.click();
	}



}
