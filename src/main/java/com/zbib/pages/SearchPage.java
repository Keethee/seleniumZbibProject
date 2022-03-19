package com.zbib.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SearchPage {

	@FindBy(xpath = "//*[contains(text(),'More…')]")
	public static WebElement moreSearch;	
	@FindBy(xpath = "//*[@class='results']/li")
	public static List<WebElement> selectSearch;
	//	@FindBy(xpath = "//*[contains(@class, 'select-multi-value-wrapper')]")
	@FindBy(xpath = "//*[@id='zotero-bib']/div/div[1]/section[3]/div/div/div/div/div[1]")
	public static WebElement selectCiteStyleToClick;
	@FindBy(xpath = "//*[contains(@class, 'select-menu-outer')]")
	public static WebElement changeCiteStyle;
	@FindBy(xpath = "//*[@class = 'citation']")
	public static WebElement editBook;
	@FindBy(id = "abstractNote")
	public static WebElement updateAbstractDetails;
	@FindBy(xpath = "//*[contains(text(),'Done')]")
	public static WebElement clickDone;

}


