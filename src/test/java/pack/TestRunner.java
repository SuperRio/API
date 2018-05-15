package pack;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = ("D:\\Work\\API Project\\API\\src\\test\\resources\\features\\get.feature")
,format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
glue = "pack")

public class TestRunner extends AbstractTestNGCucumberTests{

}
