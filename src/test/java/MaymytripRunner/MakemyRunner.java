package MaymytripRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features = "src/test/resources/makemytrip/Trip.feature",glue = "Steps")
public class MakemyRunner extends AbstractTestNGCucumberTests {

}
