package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/GoldenCrown_AllUsecases_Web.feature", glue={"stepDefinition_GoldenCrown"}, plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})
public class GoldenCrown_runner_Web {

}