package com.autotrader.step_definitions;

import com.autotrader.pages.BasePage;
import com.autotrader.pages.AdvancePage;
import com.autotrader.pages.BasePage;
import com.autotrader.utilities.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class MyStepDefinition {
    //Logger objecti olusturuyoruz.
    Logger logger = LoggerFactory.getLogger(MyStepDefinition.class);
    AdvancePage advancePage = new AdvancePage();

    @Given("User is in landing page")
    public void userIsInLandingPage() {

        String actual = MyDriver.get().getTitle();
        String expected = "Used and New Car Sales, Review - Autotrader";
        Assert.assertEquals(expected, actual);
        // object i kullanarak log olusturuluyor.
        logger.info("Landing page Assertion Successful");


        /**
         * TODO To use logger in your project. add 2 dependency
         * slf4j-api and logback-classic dependencies
         * you can see the type of log details below
         */

	/*	logger.info("loggg");
		String title = "This is the title for home page";
		slf4jlogger.info("We landed- {} -to Homepage ",title);
		slf4jlogger.info("Another way of log  " +title + " fsdfsdfsd");
		slf4jlogger.info("This is without parameter.");
		slf4jlogger.warn("We are warning");
		slf4jlogger.error("This is error");
		System.out.println("This is error");*/

    }

    BasePage basePage;

    @Then("Verify that {string} is present")
    public void verifyThatIsPresent(String browser) {

        // Verify that "Browse By Make" is present

        advancePage.verification(browser);
        //base.waitForElement(3000L);


    }

    @And("Verify that search Button is present")
    public void verifyThatSearchButtonIsPresent() {
        advancePage.verifySearchButton();

    }

    @Then("Verify that {string} and {string}")
    public void verifyThatAnd(String make, String model) {
        advancePage.verifyMakeAndModel(make,model);

    }
}
