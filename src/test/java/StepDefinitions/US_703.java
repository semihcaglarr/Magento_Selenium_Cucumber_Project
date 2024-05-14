package StepDefinitions;

import Pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;

import java.util.List;

public class US_703 {
    DialogContent dc = new DialogContent();
    LeftNav ln = new LeftNav();

    @When("Click on the Element in LeftNav")
    public void clickOnTheElementInLeftNav(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @Then("Save Address message should be displayed")
    public void saveAddressMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.saveAddressText, "saved");
    }
}
