package com.zbib.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OtherFunctionsInHomePage {
	
	@FindBy(xpath = "//*[@class ='editable']")
	public static WebElement editBiblio;
	@FindBy(xpath = "//*[@class ='editable editing']")
	public static WebElement enterBiblio;
	@FindBy(xpath = "//span[@class='select-arrow']")
	public static WebElement clickArrow;
	@FindBy(xpath = "//*[@class='select-value-label']")
	public static WebElement selectStyleValue;
	@FindBy(xpath = "//*[@title='Copy Citation']")
//	@FindBy(xpath = "//*[@class = 'btn d-xs-none d-md-block btn-outline-secondary btn-copy btn-icon']")
//	@FindBy(xpath = "//*[@id=\"zotero-bib\"]/div/div[1]/section[2]/div/ul/li/button[1]")
	public static WebElement copyCiteFromBiblio;
	@FindBy(name = "locator")
	public static WebElement pagesToBeCopied;
	@FindBy(xpath = "//*[@type ='checkbox']")
	public static WebElement checkOmitAuthor;
	@FindBy(xpath = "//span[contains(text(),'Copy Citation')]")
	public static WebElement submitCopiedCite;
	@FindBy(xpath = "//*[contains(text(), 'Copy to Clipboard')]")
	public static WebElement copyToClipBoad;
	@FindBy(xpath = "//*[contains(text(), 'Create')]")
	public static WebElement createVersion;
	@FindBy(xpath = "//*[contains(text(), 'View')]")
	public static WebElement viewVersion;
	@FindBy(xpath = "//*[contains(text(),'Edit Bibliography')]")
	public static WebElement EditVersion;
	@FindBy(xpath = "//*[contains(text(),'Continue')]")
	public static WebElement acceptPopUp;
	@FindBy(xpath = "//*[contains(text(), 'Awesome! Let’s start!')]")
	public static WebElement backToTop;
	@FindBy(xpath = "//button[contains(text(),'Delete All')]")
	public static WebElement deleteAll;
	@FindBy(xpath = "//*[@class = 'btn btn-secondary']")
	public static WebElement clickDeleteAll;



}
