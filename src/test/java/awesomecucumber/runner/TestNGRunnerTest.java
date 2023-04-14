package awesomecucumber.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions( 
		plugin = {"html:target/cucumber/cucumber.html"},
		glue = {"awesomecucumber"}, 
		features ="src/test/resources/awesomecucumber",
		monochrome = true
		)

public class TestNGRunnerTest  extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
//    mvn exec:java -Dexec.classpathScope-test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="src/test/resources/awesomecucumber --glue awesomecucumber"

}
