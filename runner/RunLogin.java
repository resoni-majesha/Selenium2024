package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/DLogin.feature", glue = "steps")
public class RunLogin extends AbstractTestNGCucumberTests {

	public static void main(String[] args) {
		

	}

}

/*
* Once LeafTapsLogin is done, then come to runner class called RunLogin
* Now yu have to run the code
* Right click on the runner package, create a class named RunLogin
* RunLogin should extends the AbstractTestNGCucumberTests -> RunLogin extends AbstractTestNGCucumberTests
* AbstractTestNGCucumberTests class have all the necessary annotations to execute your scenarios
* When yu right click and run the program, TestNG will be enabled, as the AbstractTestNGCucumberTests class has TestNG runner
* 
* What scenario AbstractTestNGCucumberTests class need to execute?
* On top of the class, add the annotation called @CucumberOptions()
* @CucumberOptions() - This annotation will give which is the feature file yu want to execute
* Within @CucumberOptions(), add the attribute called features -> @CucumberOptions(features)
* Yu have to assign which file need to be executed in features -> @CucumberOptions(features = "src/test/java/features/Login.feature")
* src/test/java/features/Login.feature - Same as in package explorer
* 
* We need to give information about step definition also
* Add comma after features in @CucumberOptions() annotation and add the attribute called glue and yu have to give the package name
* glue = "steps" -> @CucumberOptions(features = "src/test/java/features/Login.feature", glue = "steps")
*/