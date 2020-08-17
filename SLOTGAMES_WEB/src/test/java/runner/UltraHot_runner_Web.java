package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features/UltraHot_AllUsecases_Web.feature", glue={"stepDefinition_UltraHot"}, plugin ={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"})
public class UltraHot_runner_Web {

}
