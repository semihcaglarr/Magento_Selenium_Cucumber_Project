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

    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='street_1']")
    public WebElement streetAddress1;

    @FindBy(xpath = "//input[@id='street_2']")
    public WebElement streetAddress2;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement city;

    @FindBy(xpath = "//select[@id='region_id']")
    public WebElement stateSelect;

    @FindBy(xpath = "//option[@value='42']")
    public WebElement value42NewMexico;

    @FindBy(xpath = "//input[@id='zip']")
    public WebElement zipCode;

    @FindBy(xpath = "//select[@id='country']")
    public WebElement countrySelect;

    @FindBy(xpath = "//button[@class='action save primary']")
    public WebElement saveAddressButton;

    @FindBy(xpath = "//div[contains(@data-bind,'message.text')]")
    public WebElement saveAddressText;

    @FindBy(xpath = "//button[@class='action primary add']")
    public WebElement addNewAddressButton;


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

            case "phoneNumber":
                return this.phoneNumber;

            case "streetAddress1":
                return this.streetAddress1;

            case "streetAddress2":
                return this.streetAddress2;

            case "city":
                return this.city;

            case "stateSelect":
                return this.stateSelect;

            case "value42NewMexico":
                return this.value42NewMexico;

            case "zipCode":
                return this.zipCode;

            case "countrySelect":
                return this.countrySelect;

            case "saveAddressButton":
                return this.saveAddressButton;

            case "addNewAddressButton":
                return this.addNewAddressButton;


        }

        return null;
    }


}
