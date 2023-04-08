package org.example.stepDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P02_currency;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class TC02_currency {
    P02_currency Currency = new P02_currency();
    @When("click on the currency box and choose euro")
    public void ChangeCurrency() throws InterruptedException {
        WebElement dropdown = Currency.ChangeCurrency();
        Select select = new Select(dropdown);
        select.selectByVisibleText("Euro");
        Thread.sleep(2000);
    }
    @Then("see euro on products successfully")
    public void click_on_the_currency_box_and_choose_euro()
    {
        for (int i = 0; i< Currency.CheckProducts().size();i++)
        {
            boolean Euro = Currency.CheckProducts().get(i).getText().contains("€");
            Assert.assertTrue(Euro);
        }
    }
}
