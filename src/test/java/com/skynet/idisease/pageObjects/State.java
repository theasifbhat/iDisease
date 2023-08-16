package com.skynet.idisease.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class State extends BasePage{

    WebDriver mDriver;
    public State(WebDriver mDriver) {
        super(mDriver);
        this.mDriver= mDriver;
        PageFactory.initElements(mDriver,this);
    }

    @FindBy(xpath = "//iframe[contains(@id,'map')]")
    WebElement iFrame;

    @FindBy(css = "ul.breadcrumb>li>span")
    WebElement currentStatePage;


    public String getCurrentStateName(){
        waitTillElementIsVisible(iFrame);
        mDriver.switchTo().frame(iFrame);
        waitTillElementIsVisible(currentStatePage);
        return currentStatePage.getText();
    }

}
