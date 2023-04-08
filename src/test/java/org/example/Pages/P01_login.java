package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepDefinitions.Hooks.driver;

public class P01_login {
    public WebElement loginBtn(){
        return driver.findElement(By.className("ico-login"));
    }
public WebElement email(){
        return driver.findElement(By.cssSelector("#Email"));

    }
    public WebElement password(){
        return driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement MyAccount(){
        return driver.findElement(By.className("ico-account"));
    }
    public WebElement LoginButton(){
        return driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button"));
    }
}
