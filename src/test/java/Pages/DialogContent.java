package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class DialogContent extends ParentPage {
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement RegisterEMail;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement RegisterPassword;

    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//button[@class='action submit primary']")
    public WebElement createAccountButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement myAccountText;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginEmail;

    @FindBy(xpath = "//input[@name='login[password]']")
    public WebElement loginPassword;

    @FindBy(xpath = "//button[contains(@class,'action login')]")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id='email-error']")
    public WebElement requiredEmailText;

    @FindBy(xpath = "//div[@id='pass-error']")
    public WebElement requiredPasswordText;

    @FindBy(xpath = "//div[contains(@data-bind,'message.text')]")
    public WebElement incorrectText;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "firstName":
                return this.firstName;

            case "lastName":
                return this.lastName;

            case "RegisterEMail":
                return this.RegisterEMail;

            case "RegisterPassword":
                return this.RegisterPassword;

            case "confirmPassword":
                return this.confirmPassword;

            case "createAccountButton":
                return this.createAccountButton;

            case "loginEmail":
                return this.loginEmail;

            case "loginPassword":
                return this.loginPassword;

            case "signInButton":
                return this.signInButton;

        }

        return null;
    }


}
