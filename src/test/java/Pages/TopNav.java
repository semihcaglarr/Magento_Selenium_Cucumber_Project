package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

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

    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    public WebElement actionSwitch;

    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement myAccount;

    @FindBy(xpath = "//a[contains(@class,'top ui-corner')]")
    public List<WebElement> topMenuList;

    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement showBasket;

    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='action search']")
    public WebElement searchButton;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menTabMenu;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsTabMenu;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsTabMenu;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "createAccount":
                return this.createAccount;

            case "signIn":
                return this.signIn;

            case "actionSwitch":
                return this.actionSwitch;

            case "myAccount":
                return this.myAccount;

            case "searchInput":
                return this.searchInput;

            case "searchButton":
                return this.searchButton;

        }

        return null;
    }


}
