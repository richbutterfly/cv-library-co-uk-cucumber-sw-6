package uk.co.library.cv.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.cv.utilities.Utility;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location;

    @CacheLookup
    @FindBy(id="distance")
    WebElement distanceDropDown;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobsBtn;

    @CacheLookup
    @FindBy(id = "gdpr-consent-notice")
    WebElement acceptAllOnIFrame;

    @CacheLookup
    @FindBy(id = "save")
    WebElement acceptCookies;



    public void enterJobTitle(String TitleOfJob) {
        log.info("Entering job title : " + jobTitle.toString());
        sendTextToElement(jobTitle, TitleOfJob);
    }

    public void enterLocation(String locatn) {
        log.info("Entering Location : " + location.toString());
        sendTextToElement(location, locatn);
    }

    public void selectDistance(String distance) {
        log.info("Selecting Distance : " + distanceDropDown.toString());
        selectByVisibleTextFromDropDown(distanceDropDown, distance);

    }

    public void clickOnMoreSearchOptionLink() {
        log.info("Clicking on more search option : " + moreSearchOptionsLink.toString());
        clickOnElement(moreSearchOptionsLink);

    }

    public void enterMinSalary(String minSalary) {
        log.info("Entering Minimum Salary : " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);

    }

    public void enterMaxSalary(String maxSalary) {
        log.info("Entering Minimum Salary : " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);
    }

    public void selectSalaryType(String sType) {
        log.info("Selecting salary type : " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, sType);
    }

    public void selectJobType(String jobType) {
        log.info("Selecting job type : " + jobTypeDropDown.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown, jobType);
    }

    public void clickOnFindJobsButton() {
        log.info("Clicking find jobs button : " + findJobsBtn.toString());
        clickOnElement(findJobsBtn);

    }

    public void clickOnAcceptAll() {
        log.info("Clicking on Accept all option : " + acceptCookies.toString());
        driver.switchTo().frame(acceptAllOnIFrame);
        clickOnElement(acceptCookies);


    }


}
