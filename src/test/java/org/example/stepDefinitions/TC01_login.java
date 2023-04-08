package org.example.stepDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.P01_login;
import org.openqa.selenium.By;
import org.testng.Assert;
import static org.example.stepDefinitions.Hooks.driver;

public class TC01_login {
    P01_login login = new P01_login();

    @Given("navigate to url website")
    public void urlWebsite(){
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @And("Go to login page")
    public void login(){
        login.loginBtn().click();
    }
    @When("Enter valid email and password")
    public void ValidData(){
        login.email().sendKeys("moustafaosama9@gmail.com");
        login.password().sendKeys("mok1998MOK");
    }
    @And("Click on login button")
    public void loginButton(){
        login.LoginButton().click();
    }
    @Then("verify that user logged in successfully")
    public void SuccessLogin(){
        Assert.assertTrue(login.MyAccount().isDisplayed());
    }
@When("Enter invalid email and password")
    public void invalid() {
    login.email().sendKeys( "nhbgfdhjf@gmail.com");
    login.password().sendKeys("31654841");
}
@Then("verify that user didn't logged in successfully")
    public void failedSuccessfully(){
        driver.findElement(By.className("validation-summary-errors")).isDisplayed();
    }
@When("Don't enter email and password")
    public void emptyLogin(){
        login.email().sendKeys("");
        login.password().sendKeys("");
    }
    @Then("Unsuccessfully Login")
    public void UnsuccessfullyLogin(){
        driver.findElement(By.cssSelector("#Email-error")).isDisplayed();
    }
}
