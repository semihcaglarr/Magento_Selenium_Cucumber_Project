package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class US_705_AddingRemovingProductsToBasket {
    TopNav tn = new TopNav();
    MidNav mn = new MidNav();
    LeftNav ln = new LeftNav();

    @Given("Add a Randomly Selected Product to The Basket")
    public void addARandomlySelectedProductToTheBasket() {

        for (int i = 0; i < 2; i++) {
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

        // Hooks after kapalı onu açarsın
        // burada da sepete git bölümü var view and edit cart oraya tıklatıp doğrulama işlemlerini Assert daha kolay yapabilirsin

        tn.wait.until(ExpectedConditions.elementToBeClickable(tn.showBasket));
        tn.myClick(tn.showBasket);
        mn.wait.until(ExpectedConditions.visibilityOf(mn.cartSubTotal));

        String strTotalPrice = mn.cartSubTotal.getText();
        String subsTotalPrice = strTotalPrice.replaceAll("[^0-9.]", "");
        double totalPrice = Double.parseDouble(subsTotalPrice);

        double total = 0;

        for (int i = 0; i < mn.productsPriceInBasket.size(); i++) {
            String subs = mn.productsPriceInBasket.get(i).getText().replaceAll("[^0-9.]", "");
            double parse = Double.parseDouble(subs);

            total = total + parse;
        }

        Assert.assertEquals(totalPrice, total, "Product price and total amounts are unequal");
        System.out.println("total = " + total);
        System.out.println("totalPrice = " + totalPrice);


    }


}

