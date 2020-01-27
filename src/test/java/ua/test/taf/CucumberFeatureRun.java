package ua.test.taf;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"ua.test.taf.stepDefs"},
        tags = {"@debug"},
        plugin = {
                "pretty",
                "json:build/cucumber-report/cucumber.json",
                "html:build/cucumber-report/cucumber.html",
                "junit:build/cucumber-report/cucumber.xml",
                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm"},
        strict = true
)
public final class CucumberFeatureRun {

}
