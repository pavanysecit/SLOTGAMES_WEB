package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:/SLOTGAMES_AUTOMATION/SLOTGAMES_WEB/features/SoccerMania_AllUsecases_Web.feature", glue={"stepDefinition_SoccerMania"})
public class SoccerMania_runner_Web {

}