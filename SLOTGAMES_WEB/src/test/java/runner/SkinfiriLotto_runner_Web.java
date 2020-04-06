package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sw176\\git\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\SkinfiriLotto_AllUsecases_Web.feature", glue={"stepDefinition_SkinfiriLotto"})
public class SkinfiriLotto_runner_Web {
	
}