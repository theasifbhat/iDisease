package com.skynet.idisease.tests;

import com.skynet.idisease.pageObjects.State;
import org.testng.Assert;
import org.testng.annotations.*;
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
    String stateName = "California";
    State state = mainPage.clickOnState(stateName);
    Assert.assertEquals(state.getCurrentStateName().toLowerCase(),stateName.toLowerCase());
}

@Test
public void testClickOnNewYork(){
   String stateName = "New York";
   State state= mainPage.clickOnState(stateName);
   Assert.assertEquals(state.getCurrentStateName().toLowerCase(),stateName.toLowerCase());
}

@Test
public void testClickOnMaryland(){
  String stateName = "Maryland";
  State state=  mainPage.clickOnState(stateName);
  Assert.assertEquals(state.getCurrentStateName().toLowerCase(),stateName.toLowerCase());
}



}
