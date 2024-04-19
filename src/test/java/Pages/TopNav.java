package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class TopNav extends ParentPage {

    public TopNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createAccount;

    @FindBy(partialLinkText = "Sign In")
    public WebElement signIn;

    @FindBy(xpath = "(//span[@class='logged-in'])[1]")
    public WebElement welcomeText;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "createAccount":
                return this.createAccount;
            case "signIn":
                return this.signIn;

        }

        return null;
    }


}
