package com.mckinsey.lime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mckinsey.lime.utils.ElementUtils;
import com.mckinsey.lime.utils.LocatorUtils;

public class SmokingHabitsPage extends DesktopBasePage {	

	public final static String PAGE_NAME;

    static {
        PAGE_NAME = "SmokingHabitsPage";
    }

    private final By yes = LocatorUtils.getLocator(PAGE_NAME, "yes");
    private final By no = LocatorUtils.getLocator(PAGE_NAME, "no");
    private final By Next = LocatorUtils.getLocator(PAGE_NAME, "Next");
    private final By YesImg = LocatorUtils.getLocator(PAGE_NAME, "YesImg");
    private final By NoImg = LocatorUtils.getLocator(PAGE_NAME, "NoImg");
    
    public SmokingHabitsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
    public void clickNext() {
    	ElementUtils.clickObject(driver, Next);
    }
    
    public void clickyes() {
    	ElementUtils.clickObject(driver, yes);
    }
    
    public void clickno() {
    	ElementUtils.clickObject(driver, no);
    }
    
    public boolean isSmokingHabitsPageDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, yes);
    }
    
    public boolean isNextEnabled() {
    	return ElementUtils.isElementEnabled(driver, Next);
    }

	public boolean isNoHilighted() {
		return ElementUtils.isElementDisplayed(driver, NoImg);
		
	}
	
	public boolean isYesHilighted() {
		return ElementUtils.isElementDisplayed(driver, YesImg);
		
	}
    
}
