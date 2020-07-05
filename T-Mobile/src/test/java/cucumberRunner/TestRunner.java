package cucumberRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        features = {"src/test/java/features"},
//        glue = "step_definitions",
//        plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-reports"},
//        strict = true,
//        monochrome = true,
//        dryRun = false,
////        tags = " (@SmokeTest or @Regression) and not @pending"
////        tags = "(@SmokeTest or @Regression) and (not @pending)"
////        tags = {"@SmokeTest or @Regression and not @pending"}
//        tags = {}
        features = {"src/test/java/features"},
        glue = "step_definitions",
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json","html:target/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml"},
        strict = true,
        monochrome = true,
        dryRun = false,
//        tags = " (@SmokeTest or @Regression) and not @pending"
//        tags = "(@SmokeTest or @Regression) and (not @pending)"
//        tags = {"@SmokeTest or @Regression and not @pending"}
        tags = {}

)

public class TestRunner extends AbstractTestNGCucumberTests {






}
