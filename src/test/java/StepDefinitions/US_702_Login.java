package StepDefinitions;

import Pages.DialogContent;
import Pages.TopNav;
import io.cucumber.java.en.And;

public class US_702_Login {
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
