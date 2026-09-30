package stepDefination;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/resources/features/LoginBdd.feature","src/test/resources/features/multipleScenario.feature"},
glue="stepDefination",
plugin= {"pretty","html:target/cucumber-report.html"})
public class TestRunner extends AbstractTestNGCucumberTests
{

}
