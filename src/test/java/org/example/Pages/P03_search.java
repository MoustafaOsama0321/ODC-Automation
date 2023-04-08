package org.example.Pages;
import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_search{
    public WebElement Search() {
        return Hooks.driver.findElement(By.name("q"));
    }

    public WebElement ClickSearch() {
        return Hooks.driver.findElement(By.className("search-box-button"));
    }
    public List<WebElement> product_found()
    {

        List<WebElement> ProductFound = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
        return ProductFound;
    }
    public WebElement Serial_NumberList() {
        WebElement SerialNumber = Hooks.driver.findElement(By.cssSelector("[class=\"sku\"]"));
        return SerialNumber;

    }
    public List<WebElement> ProductClick()
    {
        List<WebElement> ImageClick = Hooks.driver.findElements(By.cssSelector("div[class=\"picture\"]"));
        return ImageClick;
    }
}

