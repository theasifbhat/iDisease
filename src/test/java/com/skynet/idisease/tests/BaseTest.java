package com.skynet.idisease.tests;

import com.skynet.idisease.pageObjects.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver mDriver;
    MainPage mainPage;



    @BeforeMethod
    public void initialize(){
        mDriver = new ChromeDriver();
        mainPage = new MainPage(mDriver);
        mDriver.manage().window().maximize();
        mDriver.get("https://petdiseasealerts.org/forecast-map/");
    }

    @AfterMethod
    public void terminate(){
        mDriver.quit();
    }

}
