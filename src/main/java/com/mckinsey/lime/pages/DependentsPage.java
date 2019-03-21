package com.mckinsey.lime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mckinsey.lime.utils.ElementUtils;
import com.mckinsey.lime.utils.LocatorUtils;

public class DependentsPage extends DesktopBasePage {
    

	public final static String PAGE_NAME;

    static {
        PAGE_NAME = "DependentsPage";
    }

    private final By JustMySelf = LocatorUtils.getLocator(PAGE_NAME, "JustMySelf");
    private final By JustMySelfimg = LocatorUtils.getLocator(PAGE_NAME, "JustMySelfimg");
    private final By Spouse = LocatorUtils.getLocator(PAGE_NAME, "Spouse");
    private final By Spouseimg = LocatorUtils.getLocator(PAGE_NAME, "Spouseimg");
    private final By Children = LocatorUtils.getLocator(PAGE_NAME, "Children");
    private final By Childrenimg = LocatorUtils.getLocator(PAGE_NAME, "Childrenimg");
    private final By Parents = LocatorUtils.getLocator(PAGE_NAME, "Parents");
    private final By ParentsImg = LocatorUtils.getLocator(PAGE_NAME, "ParentsImg");
    private final By Next = LocatorUtils.getLocator(PAGE_NAME, "Next");
    
    
    public DependentsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
    
    public void clickNext() {
    	ElementUtils.clickObject(driver, Next);
    }
    
    public void clickJustMySelf() {
    	ElementUtils.clickObject(driver, JustMySelf);
    }
    
    public void clickSpouse() {
    	ElementUtils.clickObject(driver, Spouse);
    }
    
    public void clickParents() {
    	ElementUtils.clickObject(driver, Parents);
    }
    
    public void clickChildren() {
    	ElementUtils.clickObject(driver, Children);
    }
    
    public boolean isJustMySelfGreyedout() {
    	return ElementUtils.isElementDisplayed(driver, JustMySelfimg);
    }
    
    public boolean isSpouseGreyedout() {
    	return ElementUtils.isElementDisplayed(driver, Spouseimg);
    }
    
    public boolean isChildrenGreyedout() {
    	return ElementUtils.isElementDisplayed(driver, Childrenimg);
    }
    
    public boolean isParentsGreyedout() {
    	return ElementUtils.isElementDisplayed(driver, ParentsImg);
    }  
    
    public boolean isDependentsPageDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, JustMySelf);
    }
    
    public boolean isJustMySelfDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, JustMySelf);
    }
    
    public boolean isSpouseDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, Spouse);
    }
    
    public boolean isParentsDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, Parents);
    }
    
    public boolean isChildrenDisplayed() {
    	return ElementUtils.isElementDisplayed(driver, Children);
    }
    
    public boolean isNextEnabled() {
    	return ElementUtils.isElementEnabled(driver, Next);
    }

}
