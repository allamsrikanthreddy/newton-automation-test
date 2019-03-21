package com.mckinsey.lime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mckinsey.lime.utils.ElementUtils;
import com.mckinsey.lime.utils.LocatorUtils;

public class WelcomePage extends DesktopBasePage{
	
	public final static String PAGE_NAME;

    static {
        PAGE_NAME = "WelcomePage";
    }
      
    private final By Confirm = LocatorUtils.getLocator(PAGE_NAME, "Confirm");
    private final By LetsGo = LocatorUtils.getLocator(PAGE_NAME, "LetsGo");
    
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	public void clickConfirm() {
		ElementUtils.clickObject(driver, Confirm);
	}
	
	public void clickLetsGo() {
		ElementUtils.clickObject(driver, LetsGo);
	}
	
	public boolean verifyConfirm() {
		return driver.findElement(Confirm).isEnabled();
	}
	
	public boolean isLetsGoVisible() {
		return ElementUtils.isElementDisplayed(driver, LetsGo);
	}
	
	public boolean isConfirmVisible() {
		return ElementUtils.isElementDisplayed(driver, Confirm);
	}

}
