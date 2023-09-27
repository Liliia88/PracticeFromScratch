package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        dryRun = true,
        tags = "@sprint1",
        monochrome = true,
        //pretty keywords prints the steps in the console to increase readability
        //to generate the reports we need plugin of runner class
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                //this failed.txt file holds all the scenarios which are failed during execution
                "rerun:target/failed.txt"}
)

public class SmokeRunner {

}
//smoke test - means you execute all scenarios that cover all kea functionality of application
//regression -all testes will be executed (end to end)
//dependecies - give u all arg files
//plugins give you all functionality


