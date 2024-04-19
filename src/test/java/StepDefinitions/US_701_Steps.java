package StepDefinitions;

import Pages.*;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_701_Steps {
    DialogContent dc = new DialogContent();
    TopNav tn = new TopNav();

    @Given("Navigate to Magento WebSite")
    public void navigateToMagentoWebSite() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @And("Click on the Element in TopNav")
    public void clickOnTheElementInTopNav(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = tn.getWebElement(strLinkList.get(i));
            tn.myClick(linkWebElement);
        }
    }

    @And("User Sending the Keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable textBoxAndWritings) {
        List<List<String>> listTextPost = textBoxAndWritings.asLists(String.class);

        for (int i = 0; i < listTextPost.size(); i++) {
            WebElement textBoxWebElement = dc.getWebElement(listTextPost.get(i).get(0));
            dc.mySendKeys(textBoxWebElement, listTextPost.get(i).get(1));
        }
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable buttons) {
        List<String> strButtonList = buttons.asList(String.class);

        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebElement = dc.getWebElement(strButtonList.get(i));
            dc.myClick(linkWebElement);
        }
    }

    @Then("User Should Register Successfully")
    public void userShouldRegisterSuccessfully() {
        dc.verifyContainsText(dc.myAccountText, "My Account");

    }

}
