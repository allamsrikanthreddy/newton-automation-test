package com.mckinsey.lime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mckinsey.lime.utils.ElementUtils;
import com.mckinsey.lime.utils.LocatorUtils;

public class NamePage extends DesktopBasePage {
    
	public final static String PAGE_NAME;

    static {
        PAGE_NAME = "NamePage";
    }

    private final By Name = LocatorUtils.getLocator(PAGE_NAME, "Name");
    private final By Next = LocatorUtils.getLocator(PAGE_NAME, "Next");   
    
    public NamePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
    public void enterName(String strName) {
    	ElementUtils.sendKeys(driver, Name, strName);
    }
    
    public void clickNext() {
    	ElementUtils.clickObject(driver, Next);
    }
    
    public boolean isNextEnabled() {
    	return ElementUtils.isElementEnabled(driver, Next);
    }
}
