package com.mckinsey.lime.pages;

import com.mckinsey.lime.utils.ElementUtils;
import com.mckinsey.lime.utils.LocatorUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends DesktopBasePage {
    public final static String PAGE_NAME;

    static {
        PAGE_NAME = "LandingPage";
    }

    private final By howdoesitwork = LocatorUtils.getLocator(PAGE_NAME, "HowDoesItWork");
    private final By LifeInsurance101 = LocatorUtils.getLocator(PAGE_NAME, "LifeInsurance101");
    private final By Reviews = LocatorUtils.getLocator(PAGE_NAME, "Reviews");    
    private final By OurStory = LocatorUtils.getLocator(PAGE_NAME, "OurStory");    
    private final By PersonalDetails = LocatorUtils.getLocator(PAGE_NAME, "PersonalDetails");
    private final By txtLifeInsurance = LocatorUtils.getLocator(PAGE_NAME, "txtLifeInsurance");
    private final By WhatSaying = LocatorUtils.getLocator(PAGE_NAME, "WhatSaying");
    private final By Story = LocatorUtils.getLocator(PAGE_NAME, "Story");
    private final By StartNow = LocatorUtils.getLocator(PAGE_NAME, "StartNow");
    private final By HealthInsurance = LocatorUtils.getLocator(PAGE_NAME, "HealthInsurance");
    private final By LifeInsurance = LocatorUtils.getLocator(PAGE_NAME, "LifeInsurance");
    private final By GeneralInsurance = LocatorUtils.getLocator(PAGE_NAME, "GeneralInsurance");
    private final By PrivacyPolicy = LocatorUtils.getLocator(PAGE_NAME, "PrivacyPolicy");
    private final By SecurityPolicy = LocatorUtils.getLocator(PAGE_NAME, "SecurityPolicy");
    private final By TermsConditions = LocatorUtils.getLocator(PAGE_NAME, "TermsConditions");
    private final By expand = LocatorUtils.getLocator(PAGE_NAME, "expand");
    private final By minimize = LocatorUtils.getLocator(PAGE_NAME, "minimize");
    private final By facebook = LocatorUtils.getLocator(PAGE_NAME, "facebook");
    private final By instagram = LocatorUtils.getLocator(PAGE_NAME, "instagram");
    private final By linkedin = LocatorUtils.getLocator(PAGE_NAME, "linkedin");
    private final By youtube = LocatorUtils.getLocator(PAGE_NAME, "youtube");

    LandingPage(WebDriver driver) {
        super(driver);
    }

    public boolean isLifeInsurance101visible() {
    	return ElementUtils.isElementDisplayed(driver, LifeInsurance101);
    }
    
    public boolean ishowdoesitworkvisible() {
    	return ElementUtils.isElementDisplayed(driver, howdoesitwork);
    }
    
    public boolean isPersonalDetailsvisible() {
    	return ElementUtils.isElementDisplayed(driver, PersonalDetails);
    }
    
    public void clickhowdoesitwork() {
    	ElementUtils.clickObject(driver, howdoesitwork);
    }
    
    public void clickLifeInsurance101() {
    	ElementUtils.clickObject(driver, LifeInsurance101);
    }
    
    public void clickReview() {
    	ElementUtils.clickObject(driver, Reviews);
    }
    
    public void clickOurStory() {
    	ElementUtils.clickObject(driver, OurStory);
    }
    
    public boolean isReviewVisible() {
    	return ElementUtils.isElementDisplayed(driver, Reviews);
    }

    public boolean isOurStoryVisible() {
        return ElementUtils.isElementDisplayed(driver, OurStory);
    }
    
    public boolean isLifeInsurencevisible() {
		return ElementUtils.isElementDisplayed(driver, txtLifeInsurance);
	}
    
    public boolean isWhatSayingVisible() {
    	return ElementUtils.isElementDisplayed(driver, WhatSaying);
    }
    
    public boolean isStoryNewtonVisible() {
		return ElementUtils.isElementDisplayed(driver, Story);		
	}
    
    public void clickStartNow() {
    	ElementUtils.clickObject(driver, StartNow);
    }
    
    public String HealthInsurance() {
    	ElementUtils.clickObject(driver, HealthInsurance);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String LifeInsurance() {
    	ElementUtils.clickObject(driver, LifeInsurance);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String GeneralInsurance() {
    	ElementUtils.clickObject(driver, GeneralInsurance);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String PrivacyPolicy() {
    	ElementUtils.clickObject(driver, PrivacyPolicy);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String SecurityPolicy() {
    	ElementUtils.clickObject(driver, SecurityPolicy);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String TermsConditions() {
    	ElementUtils.clickObject(driver, TermsConditions);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public void clickexpand(){
    	ElementUtils.clickObject(driver, expand);
    }
    
    public void clickminimise(){
    	ElementUtils.clickObject(driver, minimize);
    }
    
    public String facebook() {
    	ElementUtils.clickObject(driver, facebook);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String instagram() {
    	ElementUtils.clickObject(driver, instagram);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String linkedin() {
    	ElementUtils.clickObject(driver, linkedin);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
    public String youtube() {
    	ElementUtils.clickObject(driver, TermsConditions);
    	return ElementUtils.closeCurrentWindow(driver);        
    }
    
}
