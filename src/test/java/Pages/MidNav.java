package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import java.util.List;

public class MidNav extends ParentPage {
    public MidNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//strong[contains(@class,'product-item-name')]/a")
    public List<WebElement> productNameList;

    @FindBy(xpath = "(//span[contains(@id,'product-price')])[1]/span")
    public WebElement productPrice;

    @FindBy(xpath = "//div[contains(@id,'143-')]")
    public List<WebElement> productSizeList;

    @FindBy(xpath = "//div[contains(@id,'-93-')]")
    public List<WebElement> productColorList;

    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//strong[contains(text(),'Erin Renny')]")
    public WebElement handSelectedByErin;

    @FindBy(xpath = "(//select[@id='limiter'])[2]")
    public WebElement limiterSelect;

    @FindBy(xpath = "//a[@class='block-promo sale-main']")
    public WebElement shopWomensDeals;

    @FindBy(xpath = "(//div[@class='amount price-container']//span)[2]")
    public WebElement cartSubTotal;

    @FindBy(xpath = "//span[@class='minicart-price']/span")
    public List<WebElement> productsPriceInBasket;

    @FindBy(xpath = "//a[@class='product-item-link']")
    public WebElement productItemText;

    @FindBy(xpath = "//div[@itemprop='sku']")
    public WebElement skuText;

    @FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
    public WebElement proceedToCheckOut;

    @FindBy(xpath = "//div[@class='new-address-popup']//span")
    public WebElement addNewAddress;

    @FindBy(xpath = "//input[@class='radio']")
    public List<WebElement> shippingMethodsRadio;

    @FindBy(xpath = "//button[@class='button action continue primary']")
    public WebElement shippingNextButton;

    @FindBy(xpath = "(//div[@class='shipping-address-item selected-item']/br)[1]")
    public WebElement shippingAddressText;

    @FindBy(xpath = "((//div[@class='shipping-information-content'])[1]/br)[1]")
    public WebElement paymentAddressText;

    @FindBy(xpath = "(//span[text()='Place Order']/..")
    //div[@class='actions-toolbar'])[4]//button
    public WebElement placeHolderButton;

    @FindBy(xpath = "//h1[@class='page-title']/span")
    public WebElement successOrderMessage;

    @FindBy(xpath = "//a[@class='order-number']/strong")
    public WebElement orderNumberText;


    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "proceedToCheckOut":
                return this.proceedToCheckOut;
        }

        return null;
    }


}
