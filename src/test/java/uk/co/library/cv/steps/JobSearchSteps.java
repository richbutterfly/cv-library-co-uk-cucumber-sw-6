package uk.co.library.cv.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.library.cv.pages.HomePage;
import uk.co.library.cv.pages.ResultPage;

public class JobSearchSteps {
    @Given("I am on Homepage")
    public void iAmOnHomepage() {

    }

    @When("I accept all cookies")
    public void iAcceptAllCookies() {
        new HomePage().clickOnAcceptAll();
    }

    @And("I enter title of job {string}")
    public void iEnterTitleOfJob(String jonTitle) {
        new HomePage().enterJobTitle(jonTitle);
    }

    @And("I enter location {string}")
    public void iEnterLocation(String locations) {
        new HomePage().enterLocation(locations);
    }

    @And("I select distance {string}")
    public void iSelectDistance(String distance) {
        new HomePage().selectDistance(distance);
    }

    @And("I click on More Search option link")
    public void iClickOnMoreSearchOptionLink() {
        new HomePage().clickOnMoreSearchOptionLink();
    }

    @And("I enter minimum salary {string}")
    public void iEnterMinimumSalary(String salaryMin) {
        new HomePage().enterMinSalary(salaryMin);
    }

    @And("I select maximum salary {string}")
    public void iSelectMaximumSalary(String salaryMax) {
        new HomePage().enterMaxSalary(salaryMax);
    }

    @And("I select salary type {string}")
    public void iSelectSalaryType(String salaryType) {
        new HomePage().selectSalaryType(salaryType);
    }

    @And("I select job type {string}")
    public void iSelectJobType(String jobType) {
        new HomePage().selectJobType(jobType);
    }

    @And("I click on Find Jobs Button")
    public void iClickOnFindJobsButton() {
        new HomePage().clickOnFindJobsButton();
    }

    @Then("I should see the message in result {string}")
    public void iShouldSeeTheMessageInResult(String result) throws InterruptedException{
        Thread.sleep(2000);
        Assert.assertEquals(new ResultPage().verifyTheResults(),result,"Result does not match");

    }
}
