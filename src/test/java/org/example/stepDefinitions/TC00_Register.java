package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P00_Register;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

public class TC00_Register {
    P00_Register register =new P00_Register();
    @Given("press on register button")
    public void RegisterPage() {
        register.registerBtn().click();
    }

    @And("enter first name and last name")
    public void firstname_lastname() {
        register.Firstname().sendKeys("moustafa");
        register.Lastname().sendKeys("osama");
    }

    @And("enter email field")
    public void EmailField(){
        register.Email().sendKeys("moustafaosama9@gmail.com");
    }
    @And("enter Password fields")
    public void passwordFields() throws InterruptedException {
        register.Password().sendKeys("mok1998MOK");
    }

    @And("enter Confirm password")
    public void ConfirmPasswordField(){
        register.ConfirmPassword().sendKeys("mok1998MOK");
    }
    @And("enter click on register button")
    public void registerButton(){
        register.registerButton().click();
    }
    @Then("verify that user entered to the page successfully")
    public void successMessage() throws InterruptedException {
        register.successMessage().isDisplayed();
        Thread.sleep(10000);
    }
}
