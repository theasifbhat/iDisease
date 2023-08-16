package com.skynet.idisease.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class MainPageTest extends BaseTest {

@Test
public void testGetAllStatesName(){
    List<String> states = mainPage.getAllStatesByName();
    System.out.println("The Names of States are as follows: ");
    states.forEach(it->{
    System.out.println(""+it);
});
    Assert.assertEquals(states.size(),51);
}

@Test
    public void testClickOnCalifornia(){
    mainPage.clickOnState("California");
}

@Test
public void testClickOnNewYork(){
    mainPage.clickOnState("New York");
}

@Test
public void testClickOnMaryland(){
    mainPage.clickOnState("Maryland");
}



}
