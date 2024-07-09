package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		


		features="C:\\Users\\Asus\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\facebookLoginCucumber\\src\\test\\resources\\features\\login.feature",
		
		glue="steps" //package name
		)
public class runLogin {
	
	
	

}
