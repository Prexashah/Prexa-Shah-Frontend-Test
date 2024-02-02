package uk.co.heartbingo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import uk.co.heartbingo.browserfactory.ManageBrowser;
import uk.co.heartbingo.pages.HomePage;

public class SignUpSteps {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);


    @Given("User is on the Home page of Heart Bingo")
    public void userIsOnTheHomePageOfHeartBingo() {

    }

    @When("user clicks on signUp button")
    public void userClicksOnSignUpButton() {

        new HomePage().clickOnCaptcha();
        new HomePage().clickOnSignUpButton();

    }

    @Then("user should see the text and verify {string}")
    public void userShouldSeeTheTextAndVerify(String text) {
        Assert.assertEquals(new HomePage().verifySignUpText(),text,"user is not on correct page");

    }
}
