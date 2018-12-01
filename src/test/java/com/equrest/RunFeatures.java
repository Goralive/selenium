package com.equrest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources/features", glue = "selenium.pages.com.equerest.steps")
public class RunFeatures extends AbstractTestNGCucumberTests {

}
