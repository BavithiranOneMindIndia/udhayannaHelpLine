package com.cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/features", glue = "com.stepDefinitions", tags = "@AnnaHelpLine", plugin = {
        "pretty" }, monochrome = true, stepNotifications = true)

public class TestRunner {


}
