package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\sw176\\git\\SLOTGAMES_WEB\\SLOTGAMES_WEB\\features\\TreasureBonanza_AllUsecases_Web.feature", glue={"stepDefinition_TreasureBonanza"})
public class TreasureBonanza_runner_Web {

}