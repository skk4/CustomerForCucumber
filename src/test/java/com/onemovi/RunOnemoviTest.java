package com.onemovi;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/"},
        format = {"pretty", "html:target/cucumber", "json:target/cucumber.json"},
        glue = {"com.onemovi"}, tags={"@Class"}
)

public class RunOnemoviTest {

}
