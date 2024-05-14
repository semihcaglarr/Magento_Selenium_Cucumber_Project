package StepDefinitions;

import Pages.*;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_707 {
    TopNav tn = new TopNav();
    MidNav mn = new MidNav();

    @And("User Sending the Keys in TopNav")
    public void userSendingTheKeysInTopNav(DataTable textBoxAndWritings) {
        List<List<String>> listTextPost = textBoxAndWritings.asLists(String.class);

        for (int i = 0; i < listTextPost.size(); i++) {
            WebElement textBoxWebElement = tn.getWebElement(listTextPost.get(i).get(0));
            tn.mySendKeys(textBoxWebElement, listTextPost.get(i).get(1));
        }
    }

    @And("Sees the Lando Gym Jacket product listed in the search results")
    public void seesTheLandoGymJacketProductListedInTheSearchResults() {
        mn.verifyContainsText(mn.productItemText, "Lando Gym Jacket");
    }


    @And("Clicks on the Lando Gym Jacket product by following the Home > Men > Tops > Jackets link.")
    public void clicksOnTheLandoGymJacketProductByFollowingTheHomeMenTopsJacketsLink() {
        tn.ActionHover(tn.menTabMenu);
        tn.ActionHover(tn.topsTabMenu);
        tn.myClick(tn.jacketsTabMenu);
    }

    @And("Confirms that the SKU number on the product page is correct")
    public void confirmsThatTheSKUNumberOnTheProductPageIsCorrect() {

        for (int i = 0; i < mn.productNameList.size(); i++) {

            if (mn.productNameList.get(i).getText().contains("Lando Gym Jacket")) {
                mn.myClick(mn.productNameList.get(i));
            }
        }

        mn.verifyContainsText(mn.skuText, "MJ08");
    }
}
