package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//BDD is 
//using gerkin
//gerkin is written in english simple language
//ammigos means- developer, tester, business man 
//converting gerkin into actual coding
public class loginFacebook {
	WebDriver driver;
	@Given("user should open browser and open facebook login page")
	public void user_should_open_browser_and_open_facebook_login_page() {
		 driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		 driver.manage().window().maximize();
	   
	}

	@When("enter email, password")
	public void enter_email_password() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("pass@1123");
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		 Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("user should be login")
	public void user_should_be_login() throws InterruptedException {
		 String out = driver.findElement(By.xpath("//span[@class='_97w1 _50f6']")).getText();
		   org.junit.Assert.assertEquals(out, "Log in to Facebook");
		    System.out.println("Test case passed- validation complete");
		    Thread.sleep(5000);
		    driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}





}
