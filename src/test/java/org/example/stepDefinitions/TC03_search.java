package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P03_search;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TC03_search {
    P03_search search = new P03_search();

    @Given("User searches with {string}")
    public void Search(String box) {
        search.Search().sendKeys(box);

    }

    @And("Search Show The Result For")
    public void ClickSearch() {
        search.ClickSearch().click();

    }

    @Then("User See The Products {string}")
    public void TheProducts(String search_word) {
        for (int i = 0; i < search.product_found().size(); i++) {
            SoftAssert asserta = new SoftAssert();
            asserta.assertTrue(search.product_found().get(i).getText().toLowerCase().contains(search_word));
            asserta.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
            asserta.assertAll();
        }

    }

    @When("user searches with SerialNumber {string}")
    public void Searchers(String serial) {
        search.Search().sendKeys(serial);
    }

    @Then("User See The Products For SerialNumber {string}")
    public void TheProducts2(String Serial_number) {
        search.ProductClick().get(0).click();
        boolean Serial = search.Serial_NumberList().getText().contains(Serial_number);
        Assert.assertTrue(Serial);
    }
}
