package com.zbib.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath = "//input[@type='text']")
	public static WebElement searchBar;
	@FindBy(xpath = "//button[starts-with(text(),'Cite')]")
	public static WebElement citeButton;
	@FindBy(xpath = "//*[contains(text(),'Manual Entry')]")
	public static WebElement newEntry;
	
	


}

