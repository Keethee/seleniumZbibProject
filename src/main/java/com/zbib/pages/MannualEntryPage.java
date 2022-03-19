package com.zbib.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MannualEntryPage {
	
	
	@FindBy(xpath = "//*[@id='title']")
	public static WebElement title;
	@FindBy(xpath = "//*[@id='zotero-bib']/div/div[5]/div/div/div/div[2]/div/ol/li[3]/div[2]/div[1]/input")
	public static WebElement authorLastName;
	@FindBy(xpath = "//*[@id='zotero-bib']/div/div[5]/div/div/div/div[2]/div/ol/li[3]/div[2]/div[2]/input")
	public static WebElement authorFirstName;
	@FindBy(xpath = "//*[@id='seriesNumber']")
	public static WebElement serialNumber;
	@FindBy(id = "numPages")
	public static WebElement noOfPages;
	@FindBy(id = "language")
	public static WebElement language;
	@FindBy(xpath = "//*[contains(text(),'Done')]")
	public static WebElement button;
	
}
