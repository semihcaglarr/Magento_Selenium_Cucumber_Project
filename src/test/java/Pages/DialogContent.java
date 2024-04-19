package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement eMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement myAccountText;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "firstName":
                return this.firstName;

            case "lastName":
                return this.lastName;

            case "eMail":
                return this.eMail;

            case "password":
                return this.password;

            case "confirmPassword":
                return this.confirmPassword;

            case "createAccountButton":
                return this.createAccountButton;

        }

        return null;
    }


}
