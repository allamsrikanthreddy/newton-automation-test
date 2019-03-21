package com.mckinsey.lime.pages;

import org.openqa.selenium.WebDriver;

public class DesktopPageObjects {
    public static GetAQuotePage getAQuotePage;
    public static CommonPage commonPage;
    public static PlanDetailsPage planDetailsPage;
    public static RetrieveApplicationPage retrieveApplicationPage;
    public static LandingPage landingPage;
    public static WantARiderPage wantARiderPage;
    public static SelectedRiderPage selectedRiderPage;
    public static ProductTogglerSummaryPage productTogglerSummaryPage;


    //TODO: Need to improve the singleTon login=c to support Parallel execution
    public static GetAQuotePage getAQuotePage(WebDriver driver) {
        /*if (getAQuotePage == null) {
            synchronized (DesktopPageObjects.class) {
                if (getAQuotePage == null) {
                    getAQuotePage = new GetAQuotePage(driver);
                }
            }
        }
        return getAQuotePage;*/
        return new GetAQuotePage(driver);
    }

    public static CommonPage commonPage(WebDriver driver) {
        /*if (commonPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (commonPage == null) {
                    commonPage = new CommonPage(driver);
                }
            }
        }
        return commonPage;*/
        return new CommonPage(driver);
    }

    public static PlanDetailsPage planDetailsPage(WebDriver driver) {
        /*if (planDetailsPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (planDetailsPage == null) {
                    planDetailsPage = new PlanDetailsPage(driver);
                }
            }
        }
        return planDetailsPage;*/
        return new PlanDetailsPage(driver);
    }

    public static RetrieveApplicationPage retrieveApplicationPage(WebDriver driver) {
        /*if (retrieveApplicationPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (retrieveApplicationPage == null) {
                    retrieveApplicationPage = new RetrieveApplicationPage(driver);
                }
            }
        }
        return retrieveApplicationPage;*/
        return new RetrieveApplicationPage(driver);
    }

    public static LandingPage landingPage(WebDriver driver) {
        /*if (landingPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (landingPage == null) {
                    landingPage = new LandingPage(driver);
                }
            }
        }
        return landingPage;*/
        return new LandingPage(driver);
    }

    public static WantARiderPage wantARiderPage(WebDriver driver) {
        /*if (ourPlansPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (ourPlansPage == null) {
                    ourPlansPage = new OurPlansPage(driver);
                }
            }
        }
        return ourPlansPage;*/
        return new WantARiderPage(driver);
    }

    public static SelectedRiderPage selectedRiderPage(WebDriver driver) {
        /*if (ourPlansPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (ourPlansPage == null) {
                    ourPlansPage = new OurPlansPage(driver);
                }
            }
        }
        return ourPlansPage;*/
        return new SelectedRiderPage(driver);
    }

    public static ProductTogglerSummaryPage productTogglerSummaryPage(WebDriver driver) {
        /*if (ourPlansPage == null) {
            synchronized (DesktopPageObjects.class) {
                if (ourPlansPage == null) {
                    ourPlansPage = new OurPlansPage(driver);
                }
            }
        }
        return ourPlansPage;*/
        return new ProductTogglerSummaryPage(driver);
    }
    
    public static WelcomePage WelcomePage(WebDriver driver) {
    	return new WelcomePage(driver);
    }
    
    public static NamePage NamePage(WebDriver driver) {
    	return new NamePage(driver);
    }
    
    public static GenderAgePage GenderAgePage(WebDriver driver) {
    	return new GenderAgePage(driver);
    }
    public static DependentsPage DependentsPage(WebDriver driver) {
    	return new DependentsPage(driver);
    }
    public static SmokingHabitsPage SmokingHabitsPage(WebDriver driver) {
    	return new SmokingHabitsPage(driver);
    }
    
    public static PrioritiesPage PrioritiesPage(WebDriver driver) {
		// TODO Auto-generated method stub
		return new PrioritiesPage(driver);
	}
    
    public static void killPageObjects() {
        commonPage = null;
        getAQuotePage = null;
        landingPage = null;
        planDetailsPage = null;
        retrieveApplicationPage = null;
        wantARiderPage = null;
        selectedRiderPage = null;
        productTogglerSummaryPage = null;
    }

	

}
