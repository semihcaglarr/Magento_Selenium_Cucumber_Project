package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LeftNav extends ParentPage {
    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//a[text()='Address Book']")
    public WebElement addressBook;

    @FindBy(xpath = "//h1[@id='page-title-heading']/span")
    public WebElement pageTitleText;

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "addressBook":
                return this.addressBook;
        }

        return null;
    }

}
