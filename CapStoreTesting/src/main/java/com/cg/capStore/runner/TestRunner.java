package com.cg.capStore.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\AMAR\\eclipse-workspace\\CapStoreTesting\\src\\main\\java\\com\\cg\\capStore\\feature\\refund.feature",
		glue= {"com.cg.capStore.stepDefinition"},
		plugin= {"pretty","html:test-output/sample.html"},
		strict=true,
		dryRun=false
		)
public class TestRunner {

}
