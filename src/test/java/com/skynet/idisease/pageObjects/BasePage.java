package com.skynet.idisease.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;

public class BasePage {

    WebDriver mDriver;
    WebDriverWait webDriverWait;

    public BasePage(WebDriver mDriver){
        this.mDriver= mDriver;
        webDriverWait = new WebDriverWait(mDriver, Duration.ofSeconds(10));
    }

    public void waitTillElementsAreVisible(List<WebElement> element){
        webDriverWait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

    public void waitTillElementIsVisible(WebElement element){
        webDriverWait.until(ExpectedConditions.visibilityOf(element));
        }


}
