package com.skynet.idisease.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;


public class MainPage extends BasePage {

    WebDriver mDriver;

    //constructor
    public MainPage(WebDriver mDriver) {
        super(mDriver);
        this.mDriver=mDriver;
        PageFactory.initElements(mDriver,this);
    }

    //webelements

    @FindBy(css = "iframe[id*='map-instance']")
    WebElement iFrame;

    @FindBy(id = "regions")
    WebElement statesContainer;

    @FindBy(css = "svg#map-svg>g>g>g>g>path")
    List<WebElement> stateContainer;


    //methods

    public List<String> getAllStatesByName(){
        waitTillElementIsVisible(iFrame);
        mDriver.switchTo().frame(iFrame);
        waitTillElementsAreVisible(stateContainer);
        List<String> stateNames = new ArrayList<>();
        stateContainer.forEach(it->{
           stateNames.add( it.getAttribute("name"));
        });
        return stateNames;
    }

    public void clickOnState(String state){
        waitTillElementIsVisible(iFrame);
        mDriver.switchTo().frame(iFrame);
        waitTillElementsAreVisible(stateContainer);
        stateContainer.forEach(stateWebElement->{

        if (stateWebElement.getAttribute("name").equalsIgnoreCase(state)){
            stateWebElement.click();
        }
            //can be further optimized to stop immediately when the element is found
        });
    }



}
