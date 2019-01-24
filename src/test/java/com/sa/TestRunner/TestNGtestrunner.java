package com.sa.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"Features"},
		glue     = {"com.sa.steps"}
)

public class TestNGtestrunner extends AbstractTestNGCucumberTests {
	
	
}
