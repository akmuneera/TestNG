package tests.testng.Assignments;


    /*
    Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver.
     */


import org.testng.annotations.Test;
import tests.testng.Tests;

@Test
public class Assignment1 extends Tests {


public void faceBook() {
    bot.navigate("https://www.facebook.com");
}

@Test(dependsOnMethods = {"faceBook"})
public void google(){
    bot.navigate("https://www.google.com");

}
    @Test(dependsOnMethods = {"google"})
    public void amazon(){
    bot.navigate("https://www.amazon.com");

    }
}
