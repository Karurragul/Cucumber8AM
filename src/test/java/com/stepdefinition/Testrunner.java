package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\ragul\\cucumber8AM\\src\\test\\resources\\feature",
                          glue="com.stepdefinition",plugin="html:target")
public class Testrunner {

}
