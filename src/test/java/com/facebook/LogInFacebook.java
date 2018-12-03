package com.facebook;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features", glue = "selenium.pages.com.facebook.steps")
public class LogInFacebook extends AbstractTestNGCucumberTests {

}
