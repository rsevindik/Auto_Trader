package com.autotrader.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  // has to be on the top of the class. it's the
@CucumberOptions(

        features = {"@target/rerun.txt",
                // "src/test/resources/features/fleet",
                // "src/test/resources/features/login"
        },
        glue = "com/autotrader/step_definitions", //also refer to the hooks (it's stored) and can go to any StepDefinitionClass
        dryRun = false,  // it should be false during execution but make it true while implementing new feature
        tags =  "@smoke_test, @unit_test",//"@create_car",//"@add_car",//"@with_two_columns",//"@add_car_scenario_outline",//"@negative_scenario_outline",//"@scenario_outline and @with_two_columns",//"@scenario_outline",//"@calender_events", //"@add_car",// "@scenario_1",//"@login",//"@negative_login or @parametrized_test", // to execute only this scenario but if you delete it or assign to "" empty then you can execute the whole scenarios
        //since we move @login to the top of Feature: then each scenario will run @login .!!
        publish = false, // to get the report in cloud.!!
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json",
                "timeline:target/timeline-report",
                "rerun:target/rerun.txt"
        }
)
public class FailedRunner {
}
