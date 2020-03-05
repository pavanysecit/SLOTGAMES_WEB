package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:/SLOTGAMES_AUTOMATION/SLOTGAMES_WEB/features/SkinfiriJungle_AllUsecases_Web.feature", glue={"stepDefinition_SkinfiriJungle"})
public class SkinfiriJungle_runner_Web {

}