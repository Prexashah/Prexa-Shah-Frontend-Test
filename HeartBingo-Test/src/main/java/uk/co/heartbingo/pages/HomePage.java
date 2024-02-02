package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//a[text() = 'Sign Up']")
    WebElement signUpButton;

    @CacheLookup
    @FindBy(xpath = "//*[@id='onetrust-reject-all-handler']")
    WebElement captcha;

    @CacheLookup
    @FindBy (xpath = "//a[@class = 'active']")
    WebElement verifyMessage;


    //Methods

    public void clickOnSignUpButton(){
        clickOnElement(signUpButton);
    }

    public void clickOnCaptcha(){
waitUntilVisibilityOfElementLocated(captcha,10);
        log.info("Clicking on cookie button" + captcha.toString());
        clickOnElement(captcha);
    }

    public String verifySignUpText(){
        return getTextFromElement(verifyMessage);
    }



}
