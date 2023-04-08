package org.example.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepDefinitions.Hooks.driver;

public class P00_Register{
        public WebElement registerBtn(){
    return driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
   }
   public WebElement Firstname(){
        return driver.findElement(By.cssSelector("#FirstName"));
    }
    public WebElement Lastname(){
        return driver.findElement(By.cssSelector("#LastName"));
    }
    public WebElement Email(){
            return driver.findElement(By.cssSelector("#Email"));
    }
    public WebElement Password(){
            return driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement ConfirmPassword(){
            return driver.findElement(By.cssSelector("input#ConfirmPassword"));
        }
    public WebElement registerButton(){
            return driver.findElement(By.cssSelector("#register-button"));
    }
    public WebElement successMessage(){
            return driver.findElement(  By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.result"));
    }

}