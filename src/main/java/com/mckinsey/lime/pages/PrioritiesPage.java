package com.mckinsey.lime.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.mckinsey.lime.utils.LocatorUtils;

public class PrioritiesPage extends DesktopBasePage {	

	

	public final static String PAGE_NAME;

    static {
        PAGE_NAME = "PrioritiesPage";
    }

    private final By yes = LocatorUtils.getLocator(PAGE_NAME, "yes");
    
    public PrioritiesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

}
