package StepDefinitions;

import Pages.*;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

public class US_706 {
    public String productSKU;
    public String homePageID;

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
            ln.wait.until(ExpectedConditions.visibilityOf(mn.skuText));
            String part = mn.skuText.getText();
            String[] parts = part.split("-");
            productSKU = parts[0];

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
            ln.wait.until(ExpectedConditions.visibilityOf(mn.skuText));
            String part = mn.skuText.getText();
            String[] parts = part.split("-");
            productSKU = parts[0];

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
            ln.wait.until(ExpectedConditions.visibilityOf(mn.skuText));
            String part = mn.skuText.getText();
            String[] parts = part.split("-");
            productSKU = parts[0];

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
            ln.wait.until(ExpectedConditions.visibilityOf(mn.skuText));
            String part = mn.skuText.getText();
            String[] parts = part.split("-");
            productSKU = parts[0];

            mn.myClick(mn.addToCartButton);

        } else if (ln.pageTitleText.getText().equalsIgnoreCase("Training")) {
            mn.myClick(mn.handSelectedByErin);
            mn.SelectMenuByValue(mn.limiterSelect, "36");

            int random10 = mn.randomGenerator(mn.productNameList.size());
            //mn.wait.until(ExpectedConditions.visibilityOfAllElements(mn.productNameList));
            mn.wait.until(ExpectedConditions.visibilityOf(ln.pageTitleText));
            mn.myClick(mn.productNameList.get(random10));

            //String strProductPriceTraining = mn.productPrice.getText();
            ln.wait.until(ExpectedConditions.visibilityOf(mn.skuText));
            String part = mn.skuText.getText();
            String[] parts = part.split("-");
            productSKU = parts[0];

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
            ln.wait.until(ExpectedConditions.visibilityOf(mn.skuText));
            String part = mn.skuText.getText();
            String[] parts = part.split("-");
            productSKU = parts[0];

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
        mn.JavaScriptClick(mn.placeHolderButton);

    }

    @And("Successful order message should be displayed")
    public void successfulOrderMessageShouldBeDisplayed() {
        mn.verifyContainsText(mn.successOrderMessage, "purchase");
        ln.wait.until(ExpectedConditions.urlContains("success"));
        homePageID = GWD.getDriver().getWindowHandle();
    }


    @And("Necessary checks that the order has been successfully created")
    public void necessaryChecksThatTheOrderHasBeenSuccessfullyCreated() {
        ln.Wait(3);

        try {
            Robot robot = new Robot();

            robot.keyPress(KeyEvent.VK_ESCAPE);
            ln.Wait(3);
            robot.keyRelease(KeyEvent.VK_ESCAPE);

            Set<String> windowsIDler = GWD.getDriver().getWindowHandles();
            Iterator<String> indicator = windowsIDler.iterator();
            String firstPage = indicator.next().toString();
            System.out.println("firstPage = " + firstPage);
            String secondPage = indicator.next().toString();
            System.out.println("secondPage = " + secondPage);

            GWD.getDriver().switchTo().window(secondPage);

            ln.wait.until(ExpectedConditions.visibilityOf(mn.orderSKU));
            System.out.println("orderSKU : " + mn.orderSKU.getText());
            System.out.println("productSKU : " + productSKU);
            String text = mn.orderSKU.getText();
            String[] parts = text.split("-");
            String part = parts[0];
            System.out.println("part : "+part);
           Assert.assertEquals(productSKU, part, "The SKU's don't match");

            for (String id : windowsIDler) {
                if (!(id.equals(firstPage))) {
                    GWD.getDriver().switchTo().window(id);
                    GWD.getDriver().close();
                }
            }

            GWD.getDriver().switchTo().window(firstPage);





        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @And("Checking that the Product Basket is Empty")
    public void checkingThatTheProductBasketIsEmpty() {
        ln.JavaScriptClick(tn.showBasket);
        ln.wait.until(ExpectedConditions.textToBePresentInElement(tn.subtitleEmptyText,"You have no items in your shopping cart."));
        ln.verifyContainsText(tn.subtitleEmptyText, "You have no items");
    }


    @And("Checking Order Status")
    public void checkingOrderStatus() {
        ln.wait.until(ExpectedConditions.urlContains("order"));
        Assert.assertTrue(mn.orderStatus.getText().trim().toLowerCase().contains("pending"));
    }

    @Then("Successful Sign Out Control")
    public void successfulSignOutControl() {
        ln.verifyContainsText(tn.signedOutText,"signed");
    }
}

