package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P04_hover;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.Random;

public class TC04_hover {
    SoftAssert Assert = new SoftAssert();
    P04_hover hover = new P04_hover();
    int RandomNumber1 = new Random().nextInt(3);
    String item;
    Actions action = new Actions(Hooks.driver);

    @When("user select random one of the three main categories")
    public void threecategories() throws InterruptedException {

        action.moveToElement(hover.SubCategories().get(RandomNumber1)).perform();
        Thread.sleep(3000);
    }

    @And("user clicks on items from subcategories")
    public void userClicksOnItemsFromSubcategories() throws InterruptedException {

        item = hover.Click_SubCategories().get(RandomNumber1).getText().trim();
        hover.Click_SubCategories().get(RandomNumber1).click();
        Thread.sleep(3000);
    }

    @Then("user could hover on sub categories of the selected main category")
    public void userCouldHoverOnSubCategoriesOfTheSelectedMainCategory()
    {
        String item2 = hover.Check_SubCategories().getText();
        boolean item3 = item.contains(item2);
        Assert.assertTrue(item3);
    }
}
