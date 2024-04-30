package StepDefinitions;

import Pages.TopNav;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.*;

public class US_704 {
    TopNav tn = new TopNav();

    @Given("Accuracy check of what appears in Tab Menu")
    public void accuracyCheckOfWhatAppearsInTabMenu() {
        List<String> tabMenu = Arrays.asList("What's New", "Women", "Men", "Gear", "Training", "Sale");

        List<WebElement> tabMenuList = tn.topMenuList;

        for (int i = 0; i < tabMenu.size(); i++) {
            Assert.assertEquals(tabMenu.get(i), tabMenuList.get(i).getText().trim(),
                    "Tab Menu Not correct, could not be matched one-to-one");
        }
    }

    @When("Accuracy check of what appears in WomenTops Menu")
    public void accuracyCheckOfWhatAppearsInWomenTopsMenu() {
        List<String> womenTopsList = Arrays.asList("Jackets", "Hoodies & Sweatshirts", "Tees", "Bras & Tanks");
        tn.ActionHover(tn.womenTabMenu);
        tn.ActionHover(tn.womenTops);

        List<WebElement> womenTopsProducts = tn.womenTopsProducts;

        for (int i = 0; i < womenTopsProducts.size(); i++) {
            Assert.assertEquals(womenTopsList.get(i), womenTopsProducts.get(i).getText().trim(),
                    "Items on the Women's Tops Menu are not correct, could not be matched one-to-one");
        }
    }

    @And("Accuracy check of what appears in WomenBottoms Menu")
    public void accuracyCheckOfWhatAppearsInWomenBottomsMenu() {
        List<String> womenBottomsList = Arrays.asList("Pants", "Shorts");
        tn.ActionHover(tn.womenTabMenu);
        tn.ActionHover(tn.womenBottoms);

        List<WebElement> womenBottomsProducts = tn.womenBottomsProducts;

        for (int i = 0; i < womenBottomsProducts.size(); i++) {
            Assert.assertEquals(womenBottomsList.get(i), womenBottomsProducts.get(i).getText().trim(),
                    "The items in the Women's Bottoms Menu are not correct, could not be matched one-to-one");
        }
    }

    @And("Accuracy check of what appears in MenTops Menu")
    public void accuracyCheckOfWhatAppearsInMenTopsMenu() {
        List<String> womenTopsList = Arrays.asList("Jackets", "Hoodies & Sweatshirts", "Tees", "Tanks");
        tn.ActionHover(tn.menTabMenu);
        tn.ActionHover(tn.menTops);

        List<WebElement> menTopsProducts = tn.menTopsProducts;

        for (int i = 0; i < menTopsProducts.size(); i++) {
            Assert.assertEquals(womenTopsList.get(i), menTopsProducts.get(i).getText().trim(),
                    "The products in the Men's Tops Menu are not correct, they could not be matched one-to-one");
        }
    }

    @And("Accuracy check of what appears in MenBottoms Menu")
    public void accuracyCheckOfWhatAppearsInMenBottomsMenu() {
        List<String> womenBottomsList = Arrays.asList("Pants", "Shorts");
        tn.ActionHover(tn.menTabMenu);
        tn.ActionHover(tn.menBottoms);

        List<WebElement> menBottomsProducts = tn.menBottomsProducts;

        for (int i = 0; i < menBottomsProducts.size(); i++) {
            Assert.assertEquals(womenBottomsList.get(i), menBottomsProducts.get(i).getText().trim(),
                    "The products in the Men's Bottoms Menu are not correct, they could not be matched one-to-one");
        }
    }

    @And("Accuracy check of what appears in Gear Menu")
    public void accuracyCheckOfWhatAppearsInGearMenu() {
        List<String> gearList = Arrays.asList("Bags", "Fitness Equipment", "Watches");
        tn.ActionHover(tn.gearTabMenu);

        List<WebElement> gearProducts = tn.gearProducts;

        for (int i = 0; i < gearProducts.size(); i++) {
            Assert.assertEquals(gearList.get(i), gearProducts.get(i).getText().trim(),
                    "The products in the Gear's Menu are not correct, they could not be matched one-to-one");
        }
    }

    @And("Accuracy check of what appears in Training Menu")
    public void accuracyCheckOfWhatAppearsInTrainingMenu() {
        List<String> trainingList = Arrays.asList("Video Download");
        tn.ActionHover(tn.trainingTabMenu);

        List<WebElement> trainingProducts = tn.trainingProducts;

        for (int i = 0; i < trainingProducts.size(); i++) {
            Assert.assertEquals(trainingList.get(i), trainingProducts.get(i).getText().trim(),
                    "The products in the Training's Menu are not correct, they could not be matched one-to-one");
        }
    }



}
