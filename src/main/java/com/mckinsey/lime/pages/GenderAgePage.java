package com.mckinsey.lime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mckinsey.lime.utils.ElementUtils;
import com.mckinsey.lime.utils.LocatorUtils;

public class GenderAgePage extends DesktopBasePage {
    
	public final static String PAGE_NAME;

    static {
        PAGE_NAME = "GenderAgePage";
    }

    private final By Date = LocatorUtils.getLocator(PAGE_NAME, "Date");
    private final By Month = LocatorUtils.getLocator(PAGE_NAME, "Month");
    private final By Year = LocatorUtils.getLocator(PAGE_NAME, "Year");
    private final By FemaleImg = LocatorUtils.getLocator(PAGE_NAME, "FemaleImg");
    private final By MaleImg = LocatorUtils.getLocator(PAGE_NAME, "MaleImg");
    private final By Next = LocatorUtils.getLocator(PAGE_NAME, "Next");
    private final By ErrorMsg = LocatorUtils.getLocator(PAGE_NAME, "ErrorMsg");
    private final By Errorpopup = LocatorUtils.getLocator(PAGE_NAME, "Errorpopup");
    private final By getinContactButton = LocatorUtils.getLocator(PAGE_NAME, "getinContactButton");
    private final By closeErrorpopup = LocatorUtils.getLocator(PAGE_NAME, "closeErrorpopup");
    
    public GenderAgePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
    public void enterDate(String strDate) {
    	ElementUtils.sendKeys(driver, Date, strDate);
    }
    
    public void enterMonth(String strMonth) {
    	ElementUtils.sendKeys(driver, Month, strMonth);
    }
    
    public void enterYear(String strYear) {
    	ElementUtils.sendKeys(driver, Year, strYear);
    }
    
    public void clickFemale() {
    	ElementUtils.clickObject(driver, FemaleImg);
    }
    
    public void clickMale() {
    	ElementUtils.clickObject(driver, MaleImg);
    }
    
    public void clickNext() {
    	ElementUtils.clickObject(driver, Next);
    }
    
    public boolean isErrorMessageDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, ErrorMsg);
    }
    
    public boolean isErrorpopupDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, Errorpopup);
    }
    
    public void closeErrorpopup() {
    	ElementUtils.clickObject(driver, closeErrorpopup);
    }
    
    public String clickgetinContactButton() {
    	ElementUtils.clickObject(driver, getinContactButton);
    	return ElementUtils.closeCurrentWindow(driver);
    }
}
