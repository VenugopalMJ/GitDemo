package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="classpath:features",
		features = "classpath:features",
		glue="classpath:stepDefnitions",tags="@SysTest,@UatTest",
		plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"}
				)

public class TestRunner {
	
}
