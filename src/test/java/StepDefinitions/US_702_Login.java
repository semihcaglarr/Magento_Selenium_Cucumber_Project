package StepDefinitions;

import Pages.TopNav;
import io.cucumber.java.en.And;

public class US_702_Login {
    TopNav tn = new TopNav();

    @And("Welcome message should be displayed")
    public void welcomeMessageShouldBeDisplayed() {
        tn.verifyContainsText(tn.welcomeText, "Welcome");
    }
}
