package StepDefinitions;

import Pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class US_706 {
    TopNav tn = new TopNav();
    MidNav mn = new MidNav();
    LeftNav ln = new LeftNav();

    @Given("Add a Randomly Selected Product to The Shopping Cart")
    public void addARandomlySelectedProductToTheShoppingCart() {

        int random = tn.randomGenerator(tn.topMenuList.size());
        tn.myClick(tn.topMenuList.get(random));

        if (ln.pageTitleText.getText().equalsIgnoreCase("What's New")) {
            int random16 = mn.randomGenerator(mn.productNameList.size());
            //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.myClick(mn.productNameList.get(random16));

            //String strProductPriceNew = mn.productPrice.getText();

            int random1 = mn.randomGenerator(mn.productSizeList.size());
            mn.myClick(mn.productSizeList.get(random1));

            int random2 = mn.randomGenerator(mn.productColorList.size());
            mn.myClick(mn.productColorList.get(random2));

            mn.myClick(mn.addToCartButton);

        } else if (ln.pageTitleText.getText().equalsIgnoreCase("Women")) {
            int random3 = mn.randomGenerator(mn.productNameList.size());
            // mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.myClick(mn.productNameList.get(random3));

            //String strProductPriceWomen = mn.productPrice.getText();

            int random4 = mn.randomGenerator(mn.productSizeList.size());
            mn.myClick(mn.productSizeList.get(random4));

            int random5 = mn.randomGenerator(mn.productColorList.size());
            mn.myClick(mn.productColorList.get(random5));

            mn.myClick(mn.addToCartButton);

        } else if (ln.pageTitleText.getText().equalsIgnoreCase("Men")) {
            int random6 = mn.randomGenerator(mn.productNameList.size());
            // mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.myClick(mn.productNameList.get(random6));

            //String strProductPriceMan = mn.productPrice.getText();

            int random7 = mn.randomGenerator(mn.productSizeList.size());
            mn.myClick(mn.productSizeList.get(random7));

            int random8 = mn.randomGenerator(mn.productColorList.size());
            mn.myClick(mn.productColorList.get(random8));

            mn.myClick(mn.addToCartButton);

        } else if (ln.pageTitleText.getText().equalsIgnoreCase("Gear")) {
            int random9 = mn.randomGenerator(mn.productNameList.size());
            // mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.myClick(mn.productNameList.get(random9));

            //String strProductPriceGear = mn.productPrice.getText();

            mn.myClick(mn.addToCartButton);

        } else if (ln.pageTitleText.getText().equalsIgnoreCase("Training")) {
            mn.myClick(mn.handSelectedByErin);
            mn.SelectMenuByValue(mn.limiterSelect, "36");

            int random10 = mn.randomGenerator(mn.productNameList.size());
            //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.wait.until(ExpectedConditions.visibilityOf(ln.pageTitleText));
            mn.myClick(mn.productNameList.get(random10));

            //String strProductPriceTraining = mn.productPrice.getText();

            int random11 = mn.randomGenerator(mn.productSizeList.size());
            mn.myClick(mn.productSizeList.get(random11));

            int random12 = mn.randomGenerator(mn.productColorList.size());
            mn.myClick(mn.productColorList.get(random12));

            mn.myClick(mn.addToCartButton);

        } else if (ln.pageTitleText.getText().equalsIgnoreCase("Sale")) {

            mn.myClick(mn.shopWomensDeals);
            mn.SelectMenuByValue(mn.limiterSelect, "36");

            int random13 = mn.randomGenerator(mn.productNameList.size());
            //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.wait.until(ExpectedConditions.visibilityOf(ln.pageTitleText));
            mn.myClick(mn.productNameList.get(random13));

            //String strProductPriceGear = mn.productPrice.getText();

            int random14 = mn.randomGenerator(mn.productSizeList.size());
            mn.myClick(mn.productSizeList.get(random14));

            int random15 = mn.randomGenerator(mn.productColorList.size());
            mn.myClick(mn.productColorList.get(random15));

            mn.myClick(mn.addToCartButton);
        }
    }

    @When("Click on the Element in MidNav")
    public void clickOnTheElementInMidNav(DataTable links) {
        List<String> strLinkList = links.asList(String.class);

        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = mn.getWebElement(strLinkList.get(i));
            mn.myClick(linkWebElement);
        }
    }

    @When("Enter and Confirm Shipping Address and Payment Details")
    public void enterAndConfirmShippingAddressAndPaymentDetails() {
//        mn.wait.until(ExpectedConditions.visibilityOf(mn.shippingAddressText));
//        String shippingAddress = mn.shippingAddressText.getText();
//        System.out.println(shippingAddress);

        mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.shippingMethodsRadio));
        int random = mn.randomGenerator(mn.shippingMethodsRadio.size());
        mn.myClick(mn.shippingMethodsRadio.get(random));

        mn.myClick(mn.shippingNextButton);

//        mn.wait.until(ExpectedConditions.visibilityOf(mn.paymentAddressText));
//        String paymentAddress = mn.paymentAddressText.getText();

//        Assert.assertEquals(shippingAddress,paymentAddress,"Shipping and Payment addresses do not match");
        mn.wait.until(ExpectedConditions.elementToBeClickable(mn.placeHolderButton));
        mn.ActionClick(mn.placeHolderButton);

    }

    @Then("Successful order message should be displayed")
    public void successfulOrderMessageShouldBeDisplayed() {
        mn.verifyContainsText(mn.successOrderMessage, "purchase");
    }
}
