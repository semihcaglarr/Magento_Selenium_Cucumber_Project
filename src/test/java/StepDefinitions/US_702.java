package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.*;

public class US_702 {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav();

    @And("Welcome message should be displayed")
    public void welcomeMessageShouldBeDisplayed() {
        tn.verifyContainsText(tn.welcomeText, "Welcome");
    }

    @And("Required message for E-Mail should be displayed")
    public void requiredMessageForEMailShouldBeDisplayed() {
        dc.verifyContainsText(dc.requiredEmailText, "required");
    }

    @And("Required message for Password should be displayed")
    public void requiredMessageForPasswordShouldBeDisplayed() {
        dc.verifyContainsText(dc.requiredPasswordText, "required");
    }

    @And("Sign-in was Incorrect messsage should be displayed")
    public void signInWasIncorrectMesssageShouldBeDisplayed() {
        dc.verifyContainsText(dc.incorrectText, "incorrect");
    }

}
