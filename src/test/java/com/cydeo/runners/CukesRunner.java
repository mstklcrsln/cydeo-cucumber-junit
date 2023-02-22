package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

        @RunWith(Cucumber.class)
        @CucumberOptions(
                plugin = {"html:target/cucumber-reports.html",   // giving options for creating reports
                          "rerun:target/rerun.txt"},

                features = "src/test/resources/features",        // to run from features,
                glue = "com/cydeo/step_definitions",             // to run step definitions
                dryRun=false,                                    // turns on and off the running of step_definitions.  true==>do not run my step_definitions, but only check if any step is missing snippet
                tags =   "@eating"                                // this tags will write before features or scenarios


)

public class CukesRunner {
}
