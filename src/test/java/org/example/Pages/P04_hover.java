package org.example.Pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P04_hover {
    public List<WebElement> SubCategories()
    {
        List<WebElement> Object1 = Hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return Object1;

    }
    public List<WebElement> Click_SubCategories()
    {
        List<WebElement> Object2 = Hooks.driver.findElements(By.cssSelector("[class=\"sublist first-level\"]"));
        return Object2;

    }
    public WebElement Check_SubCategories()
    {
        WebElement Object3 = Hooks.driver.findElement(By.cssSelector("div[class=\"page category-page\"]>div>h1"));
        return Object3;
    }
}
