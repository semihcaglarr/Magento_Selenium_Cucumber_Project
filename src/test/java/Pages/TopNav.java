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

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement womenTabMenu;

    @FindBy(xpath = "//a[@id='ui-id-4']/..//li[contains(@class,'parent')]")
    public List<WebElement> womenProducts;

    @FindBy(xpath = "//span[text()='Tops']")
    public WebElement womenTops;

    @FindBy(xpath = "//a[contains(@id,'ui-id-9')]/..//li[contains(@class,'level2')]//span")
    public List<WebElement> womenTopsProducts;

    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement womenBottoms;

    @FindBy(xpath = "//a[contains(@id,'ui-id-10')]/..//li[contains(@class,'level2')]//span")
    public List<WebElement> womenBottomsProducts;

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menTabMenu;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement menTops;

    @FindBy(xpath = "//a[contains(@id,'ui-id-17')]/..//li[contains(@class,'level2')]//span")
    public List<WebElement> menTopsProducts;

    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement menBottoms;

    @FindBy(xpath = "//a[contains(@id,'ui-id-18')]/..//li[contains(@class,'level2')]//span")
    public List<WebElement> menBottomsProducts;

    @FindBy(xpath = "//span[text()='Gear']")
    public WebElement gearTabMenu;

    @FindBy(xpath = "//a[contains(@id,'ui-id-6')]/..//li[contains(@class,'level')]//span")
    public List<WebElement> gearProducts;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement trainingTabMenu;

    @FindBy(xpath = "//a[contains(@id,'ui-id-7')]/..//li[contains(@class,'level')]//span")
    public List<WebElement> trainingProducts;

    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsTabMenu;

    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsTabMenu;

    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement shoppingCartGreen;

    @FindBy(xpath = "//a[@class='logo']")
    public WebElement lumaLogo;

    @FindBy(xpath = "//strong[@class='subtitle empty']")
    public WebElement subtitleEmptyText;

    @FindBy(xpath = "(//a[contains(text(),'Sign Out')])[1]")
    public WebElement signOut;

    @FindBy(xpath = "//*[contains(text(),'signed')]")
    public WebElement signedOutText;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "createAccount":
                return this.createAccount;

            case "signIn":
                return this.signIn;

            case "actionSwitch"://span[text()='Women']/../..//li[contains(@class,'level1')]//span
                return this.actionSwitch;

            case "myAccount":
                return this.myAccount;

            case "searchInput":
                return this.searchInput;

            case "searchButton":
                return this.searchButton;

            case "shoppingCartGreen":
                return this.shoppingCartGreen;

            case "signOut":
                return this.signOut;

        }

        return null;
    }


}
