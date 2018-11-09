package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty","json:reports/json_repot.json"},
        features = "src/test/resources/features",
        glue="stepDef"
		)
@Test
public class Runner  extends AbstractTestNGCucumberTests{

}

