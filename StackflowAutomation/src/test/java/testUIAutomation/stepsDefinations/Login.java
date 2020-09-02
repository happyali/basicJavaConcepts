package testUIAutomation.stepsDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {

	WebDriver driver;
	
//	@Before
//	public void setup_chrome() {
//		System.setProperty("webdriver.chrome.driver" , "D:/Users/207146/mohammedDocs/workSpaces/basicJavaAutomation/StackflowAutomation/src/test/java/testUIAutomation/resources/chromedriver.exe");
//		this.driver = new ChromeDriver();
//		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
//	}
	
	@Before
	public void setup_firefox() {
		System.setProperty("webdriver.gecko.driver" , "D:/Users/207146/mohammedDocs/workSpaces/basicJavaAutomation/StackflowAutomation/src/test/java/testUIAutomation/resources/geckodriver.exe");
//		FirefoxOptions firefoxOptions = new FirefoxOptions();
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette",true);
		this.driver = new FirefoxDriver(capabilities);
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
	}
	
	@After
	public void turndown() throws InterruptedException {
		Thread.sleep(1000);
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	@Given("^User visit to stackflow homepage$")
	public void user_visit_to_stackflow_homepage() throws Throwable { 
		System.out.println("first line");
		driver.get("https://www.stackoverflow.com");
	}

	@And("^User clicks on login button on homepage$")
	public void user_clicks_on_login_button_on_homepage() throws Throwable {
		driver.findElement(By.linkText("Log in")).click();		
	}

	@And("^User enter a username$")
	public void user_enter_a_username() throws Throwable { 
		driver.findElement(By.id("email")).sendKeys("ali.mir10v@gmail.com");
	}

	@And("^User enter a password$")
	public void user_enter_a_password() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("Newstack@19");
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		driver.findElement(By.id("submit-button")).click();
	}

	@Then("^User should be taken successfully to the login page$")
	public void user_should_be_taken_successfully_to_the_login_page() throws Throwable {
		Thread.sleep(2000);
		WebElement askQuestionButton = driver.findElement(By.xpath("//a[contains(text(),'Ask Question')]"));
		System.out.println(askQuestionButton);
		Assert.assertEquals(true, askQuestionButton.isDisplayed());
	}
}
